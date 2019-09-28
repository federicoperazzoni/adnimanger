package jena.adni.query;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

import com.hp.hpl.jena.query.Dataset;
import com.hp.hpl.jena.query.Query;
import com.hp.hpl.jena.query.QueryExecution;
import com.hp.hpl.jena.query.QueryExecutionFactory;
import com.hp.hpl.jena.query.QueryFactory;
import com.hp.hpl.jena.query.ReadWrite;
import com.hp.hpl.jena.query.ResultSet;
import com.hp.hpl.jena.query.ResultSetFormatter;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.tdb.TDBFactory;

import jena.adni.constants.ADNIExternalResource;
import jena.adni.main.LoadCsv;
import jena.adni.util.TDBUtil;

public class QueryFactoryADNI {

	public static void allItem() {

		try {
			
			LoadCsv.loadPercent = 0;

			String modelName = ADNIExternalResource.getModelname();

			LoadCsv.loadMex = "inizio export: caricamento model";

			String sparql = "CONSTRUCT { ?x ?y ?z } WHERE { ?x  ?y  ?z }";

			Dataset dataset = TDBFactory.createDataset(ADNIExternalResource.getInstance().getADNI_HOME() + File.separator + "ADNIONTOLOGYSOURCE" + File.separator + "TDBDatabase");
			dataset.begin(ReadWrite.READ);
			Model model = dataset.getNamedModel(modelName);

			LoadCsv.loadMex = "fine caricamento model -> Esecuzione query";

			LoadCsv.loadPercent = 20;

			Query qry = QueryFactory.create(sparql);
			QueryExecution qe = QueryExecutionFactory.create(qry, model);

			Model model2 = qe.execConstruct();

			//		LoadCsv.loadMex = "Fine esecuzione query -> Inizio scrittura file";
			//		
			//		LoadCsv.loadPercent = 40;
			//
			File fileExport = new File(ADNIExternalResource.getInstance().getADNI_HOME() + File.separator + "EXPORT" + File.separator + "Export_RDF_Adni.rdf");

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

			model2.write(fileWriterExport, "RDF/XML");

			fileWriterExport.close();

			LoadCsv.loadMex = "File completato";

			LoadCsv.loadPercent = 100;

			qe.close();
			TDBUtil.removeLock();

		} catch (Exception e) {

			LoadCsv.loadPercent = 100;
			LoadCsv.loadMex = "Errore nell'export all: " + e.getMessage();
			System.out.println("query errata allItem");
		}
	}

	public static void executeQuery(String sparql) throws IOException {

		try {
			
			LoadCsv.loadPercent = 0;
			
			LoadCsv.timeQuery = System.currentTimeMillis();

			String modelName = ADNIExternalResource.getModelname();

			LoadCsv.loadMex = "inizio export: caricamento model";

			Dataset dataset = TDBFactory.createDataset(ADNIExternalResource.getInstance().getADNI_HOME() + File.separator + "ADNIONTOLOGYSOURCE" + File.separator + "TDBDatabase");
			dataset.begin(ReadWrite.READ);
			Model model = dataset.getNamedModel(modelName);

			LoadCsv.loadMex = "fine caricamento model -> Esecuzione query";

			LoadCsv.loadPercent = 20;

			Query qry = QueryFactory.create(sparql);
			QueryExecution qe = QueryExecutionFactory.create(qry, model);

			Model model2 = qe.execConstruct();

			File fileExport = new File(ADNIExternalResource.getInstance().getADNI_HOME() + File.separator + "EXPORT" + File.separator + "Export_RDF_Query_Adni.rdf");

			FileWriter fileWriterExport = null;

			fileWriterExport = new FileWriter(fileExport);

			model2.write(fileWriterExport, "RDF/XML");

			fileWriterExport.close();

			LoadCsv.loadMex = "File completato";

			LoadCsv.loadPercent = 100;
			LoadCsv.timeQuery = (System.currentTimeMillis() - LoadCsv.timeQuery)/1000;
			System.out.println("Time of query: " + (System.currentTimeMillis() - LoadCsv.timeQuery)/1000);
			
			qe.close();
			TDBUtil.removeLock();
		} catch (Exception e) {

			LoadCsv.loadPercent = 100;
			LoadCsv.loadMex = "Query errata: " + e.getMessage();
			System.out.println("query errata executeQuery");
		}

	}

	public static void executeQueryWithoutConstruct(String sparql) {

		try {
			
			LoadCsv.loadPercent = 0;
			LoadCsv.timeQuery = System.currentTimeMillis();

			String modelName = ADNIExternalResource.getModelname();

			LoadCsv.loadMex = "inizio export: caricamento model";

			Dataset dataset = TDBFactory.createDataset(ADNIExternalResource.getInstance().getADNI_HOME() + File.separator + "ADNIONTOLOGYSOURCE" + File.separator + "TDBDatabase");
			dataset.begin(ReadWrite.READ);
			Model model = dataset.getNamedModel(modelName);

			LoadCsv.loadMex = "fine caricamento model -> Esecuzione query";

			LoadCsv.loadPercent = 20;

			Query qry = QueryFactory.create(sparql);
			QueryExecution qe = QueryExecutionFactory.create(qry, model);

			ResultSet rs = qe.execSelect();

			File fileExport = new File(ADNIExternalResource.getInstance().getADNI_HOME() + File.separator + "EXPORT" + File.separator + "Export_SimpleQuery_Adni.csv");

			FileOutputStream fileWriterExport = null;

			fileWriterExport = new FileOutputStream(fileExport);

			ResultSetFormatter.outputAsCSV(fileWriterExport, rs);
			fileWriterExport.close();

			ResultSetFormatter.outputAsCSV(System.out, rs);

			LoadCsv.loadPercent = 100;
			LoadCsv.loadMex = ADNIExternalResource.MEX_EXTRACTION_COMPLETED;
			LoadCsv.timeQuery = (System.currentTimeMillis() - LoadCsv.timeQuery)/1000;
			System.out.println("Time of query: " + (System.currentTimeMillis() - LoadCsv.timeQuery)/1000);

			qe.close();
			TDBUtil.removeLock();

		} catch (Exception e) {

			LoadCsv.loadPercent = 100;
			LoadCsv.loadMex = "Query errata: " + e.getMessage();
			System.out.println("query errata executeQueryWithoutCostruct");
		}
	}
}
