package jena.adni.manager;

import com.hp.hpl.jena.vocabulary.RDF;

import jena.adni.bean.NPIQBean;
import jena.adni.constants.ADNIExternalResource;
import jena.adni.util.TDBUtil;
import jena.test1.TDBConnection;

public class NPIQManager {


	public void insertInADNIOntology(NPIQBean npiqBean, int count) {

		TDBConnection tdbConnection = new TDBConnection(ADNIExternalResource.getInstance().getADNI_HOME() + "\\ADNIONTOLOGYSOURCE\\TDBDatabase");

		String prefix = ADNIExternalResource.getPrefix();
		String modelName = ADNIExternalResource.getModelname();

		try {

			tdbConnection.addStatement(modelName, prefix + "NPIQ_" + count, RDF.type.getURI(), prefix + "NPIQ");
			tdbConnection.addStatement(modelName, prefix + npiqBean.getSubjectDataBean().getRID(), RDF.type.getURI(), prefix + "Subject");
			tdbConnection.addStatement(modelName, prefix + npiqBean.getSubjectDataBean().getRID(), RDF.type.getURI(), "http://www.w3.org/2002/07/owl#NamedIndividual");
			tdbConnection.addStatement(modelName, prefix + npiqBean.getSubjectDataBean().getRID(), prefix + "hasStandardizedAssesment", prefix + "NPI_" + count);
			

		} catch (Exception e) {

			e.printStackTrace();
		}

		tdbConnection.close();
		TDBUtil.removeLock();
	}
}
