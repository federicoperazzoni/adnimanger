package jena.adni.manager.ontology;

import java.io.File;

import jena.adni.constants.ADNIExternalResource;
import jena.test1.TDBConnection;

public class ADNIOntologyLoader {

	public void loadADNIOntology() {
		
		TDBConnection tdbConnection = new TDBConnection(ADNIExternalResource.getInstance().getADNI_HOME() + "\\ADNIONTOLOGYSOURCE\\TDBDatabase");
		
		tdbConnection.loadModel(ADNIExternalResource.getModelname(), ADNIExternalResource.getInstance().getADNI_HOME() + "\\ADNIONTOLOGYSOURCE\\ADNI.owl");
		
		tdbConnection.close();	
	}

	public void resetADNIOntologyTDB() {
		
		File file = new File(ADNIExternalResource.getInstance().getADNI_HOME() + "\\ADNIONTOLOGYSOURCE\\TDBDatabase");
		
		if (file.isDirectory()) {
			
			for (String nomeFile : file.list()) {
				
				File fileToRemove = new File(ADNIExternalResource.getInstance().getADNI_HOME() + "\\ADNIONTOLOGYSOURCE\\TDBDatabase\\" + nomeFile);
				fileToRemove.delete();
			}
		}
	}
}
