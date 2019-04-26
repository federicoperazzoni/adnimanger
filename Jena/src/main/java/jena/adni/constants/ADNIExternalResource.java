package jena.adni.constants;

public class ADNIExternalResource {
	
	private static ADNIExternalResource adniExternalResource;
	
	private final static String prefix = "http://www.modiag.it#";
	private final static String prefixProp = "http://modiag#";
	private final static String modelName = "ADNIOntology";
	
	public final static String MEX_EXTRACTION_COMPLETED = "Estrazione completata";
	
	public static String getPrefix() {
		return prefix;
	}

	private String ADNI_HOME = "C:\\Users\\Federico Perazzoni\\ADNI_HOME";

	public static ADNIExternalResource getInstance() {
		
		if (adniExternalResource == null) {
			
			adniExternalResource = new ADNIExternalResource();
		}
		
		return adniExternalResource;
	}

	public String getADNI_HOME() {
		return ADNI_HOME;
	}

	public void setADNI_HOME(String aDNI_HOME) {
		ADNI_HOME = aDNI_HOME;
	}

	public static String getPrefixProp() {
		
		return prefixProp;
	}

	public static String getModelname() {
		return modelName;
	}
}
