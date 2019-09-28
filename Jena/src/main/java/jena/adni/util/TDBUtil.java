package jena.adni.util;

import java.io.File;

import jena.adni.constants.ADNIExternalResource;

public class TDBUtil {

	public static void removeLock() {
		
		File fileToRemove = new File(ADNIExternalResource.getInstance().getADNI_HOME() + File.separator + "ADNIONTOLOGYSOURCE" + File.separator + "TDBDatabase" + File.separator + "tdb.lock");
		
		if(fileToRemove.exists())
			fileToRemove.delete();
	}
}
