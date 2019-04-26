package jena.adni.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.hp.hpl.jena.query.Dataset;
import com.hp.hpl.jena.query.Query;
import com.hp.hpl.jena.query.QueryExecution;
import com.hp.hpl.jena.query.QueryExecutionFactory;
import com.hp.hpl.jena.query.QueryFactory;
import com.hp.hpl.jena.query.QuerySolution;
import com.hp.hpl.jena.query.ReadWrite;
import com.hp.hpl.jena.query.ResultSet;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.Property;
import com.hp.hpl.jena.rdf.model.RDFNode;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.rdf.model.ResourceFactory;
import com.hp.hpl.jena.rdf.model.Statement;
import com.hp.hpl.jena.tdb.TDBFactory;

import jena.adni.constants.ADNIExternalResource;
import jena.adni.util.TDBUtil;

public class QueryFactoryADNI {

	public static void allItem() throws IOException {
		
		LoadCsv.loadMex = "inizio export: caricamento model";

		String sparql = "CONSTRUCT { ?x ?y ?z } WHERE { ?x  ?y  ?z }";

		Dataset dataset = TDBFactory.createDataset(ADNIExternalResource.getInstance().getADNI_HOME() + "\\ADNIONTOLOGYSOURCE\\TDBDatabase");
		dataset.begin(ReadWrite.READ);
		Model model = dataset.getNamedModel("ADNIOntology");
		
		LoadCsv.loadMex = "fine caricamento model -> Esecuzione query";
		
		LoadCsv.loadPercent = 20;

		Query qry = QueryFactory.create(sparql);
		QueryExecution qe = QueryExecutionFactory.create(qry, model);
		
		Model model2 = qe.execConstruct();
		
//		LoadCsv.loadMex = "Fine esecuzione query -> Inizio scrittura file";
//		
//		LoadCsv.loadPercent = 40;
//
		File fileExport = new File(ADNIExternalResource.getInstance().getADNI_HOME() + "\\EXPORT\\Export_" + System.currentTimeMillis() + ".rdf");

		FileWriter fileWriterExport = null;

		fileWriterExport = new FileWriter(fileExport);
//
//		while(rs.hasNext())
//		{
//			
//			QuerySolution sol = rs.nextSolution();
//			
//		    Resource  subject   =  sol.getResource("s");   // get the subject
//		    Property  predicate =  sol.getProperty("p");   // <-- THIS FUNCTION DOESN'T EXIST
//		    RDFNode   object    =  sol.get("o");           // get the object
//
//		    Statement stmt = ResourceFactory.createStatement(subject, predicate, object);
//
//		    model.add(stmt);
//		}
//		
//		

		model2.write(fileWriterExport, "RDF/XML-ABBREV");
		
		fileWriterExport.close();

		LoadCsv.loadMex = "File completato";
		
		LoadCsv.loadPercent = 100;
		
		qe.close();
		TDBUtil.removeLock();
	}
}
