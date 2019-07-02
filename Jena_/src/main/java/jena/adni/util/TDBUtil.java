package jena.adni.util;

import java.io.File;

import jena.adni.constants.ADNIExternalResource;

public class TDBUtil {

	public static void removeLock() {
		
		File fileToRemove = new File(ADNIExternalResource.getInstance().getADNI_HOME() + "\\ADNIONTOLOGYSOURCE\\TDBDatabase\\tdb.lock");
		
		if(fileToRemove.exists())
			fileToRemove.delete();
	}
}
