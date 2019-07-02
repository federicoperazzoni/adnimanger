package jena.adni.main;

import java.util.ArrayList;

import jena.adni.bean.CDRBean;
import jena.adni.bean.FAQBean;
import jena.adni.constants.ADNIExternalResource;
import jena.adni.loader.LoaderCDRCsvToBeanArray;
import jena.adni.loader.LoaderFAQCsvToBeanArray;
import jena.adni.manager.CDRManager;
import jena.adni.manager.FAQManager;
import jena.adni.manager.ontology.ADNIOntologyLoader;

public class LoadCsv {
	
	public static int loadPercent;
	public static String loadMex;
	public static int status;

	public static void loadCsvWithReset() {
		
		status = 0;
		loadMex = "Caricamento ontologia ADNI";
		//Carica l'ontologia
		ADNIOntologyLoader adniOntologyLoader = new ADNIOntologyLoader();
		adniOntologyLoader.resetADNIOntologyTDB();
		adniOntologyLoader.loadADNIOntology();
		loadMex = "Fine caricamento ontologia ADNI";
		loadPercent = 10;
		
		status = 2;
		loadMex = "Caricamento CSV";
		
		//Carica i CSV in un Array list
		LoaderCDRCsvToBeanArray cdrCsvToBeanArray = new LoaderCDRCsvToBeanArray();
		ArrayList<CDRBean> cdrTestList = cdrCsvToBeanArray.load(ADNIExternalResource.getInstance().getADNI_HOME() + "\\ADNICSV\\CDR.csv");
		
		LoaderFAQCsvToBeanArray faqCsvToBeanArray = new LoaderFAQCsvToBeanArray();
		ArrayList<FAQBean> faqTestList = faqCsvToBeanArray.load(ADNIExternalResource.getInstance().getADNI_HOME() + "\\ADNICSV\\FAQ.csv");
		loadMex = "Fine caricamento CSV";
		loadPercent = 10;
		
		status = 3;
		loadMex = "Caricamento CSV nell'ontologia";
		//Carica i dati (individui) nel TDB
		CDRManager cdrManager = new CDRManager();
		cdrManager.insertInADNIOntology(cdrTestList);
		
		FAQManager faqManager = new FAQManager();
		faqManager.insertInADNIOntology(faqTestList);
		loadMex = "Fine caricamento CSV nell'ontologia";
	}

	public static void loadCsvNoReset() {
		
		status = 2;
		loadMex = "Caricamento CSV";
		
		//Carica i CSV in un Array list
		LoaderCDRCsvToBeanArray cdrCsvToBeanArray = new LoaderCDRCsvToBeanArray();
		ArrayList<CDRBean> cdrTestList = cdrCsvToBeanArray.load(ADNIExternalResource.getInstance().getADNI_HOME() + "\\ADNICSV\\CDR.csv");
		
		LoaderFAQCsvToBeanArray faqCsvToBeanArray = new LoaderFAQCsvToBeanArray();
		ArrayList<FAQBean> faqTestList = faqCsvToBeanArray.load(ADNIExternalResource.getInstance().getADNI_HOME() + "\\ADNICSV\\FAQ.csv");
		loadMex = "Fine caricamento CSV";
		loadPercent = 20;
		
		status = 3;
		loadMex = "Caricamento CSV nell'ontologia";
		
		//Carica i dati (individui) nel TDB
		CDRManager cdrManager = new CDRManager();
		cdrManager.insertInADNIOntology(cdrTestList);
		
		FAQManager faqManager = new FAQManager();
		faqManager.insertInADNIOntology(faqTestList);
		loadMex = "Fine caricamento CSV nell'ontologia";
	}
}
