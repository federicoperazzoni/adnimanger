package jena.adni.main;

import java.util.ArrayList;

import jena.adni.bean.CDRBean;
import jena.adni.bean.FAQBean;
import jena.adni.bean.GDSBean;
import jena.adni.bean.MMSEBean;
import jena.adni.bean.NeuroBatteryBean;
import jena.adni.constants.ADNIExternalResource;
import jena.adni.loader.LoaderCDRCsvToBeanArray;
import jena.adni.loader.LoaderFAQCsvToBeanArray;
import jena.adni.loader.LoaderGDSCsvToBeanArray;
import jena.adni.loader.LoaderMMSECsvToBeanArray;
import jena.adni.loader.LoaderNPICsvToBeanArray;
import jena.adni.loader.LoaderNPIQCsvToBeanArray;
import jena.adni.loader.LoaderNeuroBatteryCsvToBeanArray;
import jena.adni.main.application.util.LoadCSVForm;
import jena.adni.manager.CDRManager;
import jena.adni.manager.FAQManager;
import jena.adni.manager.MMSEManager;
import jena.adni.manager.NeuroBatteryManager;
import jena.adni.manager.ontology.ADNIOntologyLoader;

public class LoadCsv {

	public static int loadPercent;
	public static int loadPast;
	public static Long timeQuery;
	public static String loadMex;
	public static int status;

	public static final int PERCENT_PRE = 2;
	public static final int PERCENT_CDR = 4;
	public static final int PERCENT_FAQ = 4;
	public static final int PERCENT_MMSE = 15;
	public static final int PERCENT_NPIQ = 15;
	public static final int PERCENT_NPI = 25;
	public static final int PERCENT_GDS = 20;
	public static final int PERCENT_NEUROBAT = 20;

	public static void loadCsvWithReset() {

		status = 0;
		loadMex = "Caricamento ontologia ADNI";
		//Carica l'ontologia
		ADNIOntologyLoader adniOntologyLoader = new ADNIOntologyLoader();
		adniOntologyLoader.resetADNIOntologyTDB();
		adniOntologyLoader.loadADNIOntology();
		loadMex = "Fine caricamento ontologia ADNI";
		status = 1;
		loadMex = "Caricamento CSV";

		//Carica i CSV in un Array list
		if (LoadCSVForm.fieldsCB[0].isSelected()) {
			loadPast += PERCENT_PRE;
			LoaderCDRCsvToBeanArray cdrCsvToBeanArray = new LoaderCDRCsvToBeanArray();
			if (LoadCSVForm.files[0] != null && LoadCSVForm.files[0].exists())
				cdrCsvToBeanArray.load(LoadCSVForm.files[2].getAbsolutePath());
			else
				cdrCsvToBeanArray.load(ADNIExternalResource.getInstance().getADNI_HOME() + "\\ADNICSV\\CDR.csv");
		} else {
			loadPercent += PERCENT_CDR;
		}

		if (LoadCSVForm.fieldsCB[1].isSelected()) {
			loadPast += PERCENT_CDR; 
			LoaderFAQCsvToBeanArray faqCsvToBeanArray = new LoaderFAQCsvToBeanArray();
			if (LoadCSVForm.files[1] != null && LoadCSVForm.files[1].exists())
				faqCsvToBeanArray.load(LoadCSVForm.files[2].getAbsolutePath());
			else
				faqCsvToBeanArray.load(ADNIExternalResource.getInstance().getADNI_HOME() + "\\ADNICSV\\FAQ.csv");
		} else {
			loadPercent += PERCENT_FAQ;
		}	

		if (LoadCSVForm.fieldsCB[2].isSelected()) {
			loadPast += PERCENT_FAQ; 
			LoaderMMSECsvToBeanArray mmseCsvToBeanArray = new LoaderMMSECsvToBeanArray();
			if (LoadCSVForm.files[2] != null && LoadCSVForm.files[2].exists())
				mmseCsvToBeanArray.load(LoadCSVForm.files[2].getAbsolutePath());
			else
				mmseCsvToBeanArray.load(ADNIExternalResource.getInstance().getADNI_HOME() + "\\ADNICSV\\MMSE.csv");
		} else {
			loadPercent += PERCENT_MMSE;
		}

		if (LoadCSVForm.fieldsCB[3].isSelected()) {
			loadPast += PERCENT_MMSE; 
			LoaderNeuroBatteryCsvToBeanArray mmseCsvToBeanArray = new LoaderNeuroBatteryCsvToBeanArray();
			if (LoadCSVForm.files[3] != null && LoadCSVForm.files[3].exists())
				mmseCsvToBeanArray.load(LoadCSVForm.files[3].getAbsolutePath());
			else
				mmseCsvToBeanArray.load(ADNIExternalResource.getInstance().getADNI_HOME() + "\\ADNICSV\\NEUROBAT.csv");
		} else {
			loadPercent += PERCENT_NEUROBAT;
		}

		if (LoadCSVForm.fieldsCB[4].isSelected()) {
			loadPast += PERCENT_NEUROBAT; 
			LoaderGDSCsvToBeanArray gdsCsvToBeanArray = new LoaderGDSCsvToBeanArray();
			if (LoadCSVForm.files[4] != null && LoadCSVForm.files[4].exists())
				gdsCsvToBeanArray.load(LoadCSVForm.files[4].getAbsolutePath());
			else
				gdsCsvToBeanArray.load(ADNIExternalResource.getInstance().getADNI_HOME() + "\\ADNICSV\\GDSCALE.csv");
		} else {
			loadPercent += PERCENT_GDS;
		}

		if (LoadCSVForm.fieldsCB[5].isSelected()) {
			loadPast += PERCENT_GDS; 
			LoaderNPICsvToBeanArray npiCsvToBeanArray = new LoaderNPICsvToBeanArray();
			if (LoadCSVForm.files[5] != null && LoadCSVForm.files[5].exists())
				npiCsvToBeanArray.load(LoadCSVForm.files[5].getAbsolutePath());
			else
				npiCsvToBeanArray.load(ADNIExternalResource.getInstance().getADNI_HOME() + "\\ADNICSV\\NPI.csv");
		} else {
			loadPercent += PERCENT_NPI;
		}

		if (LoadCSVForm.fieldsCB[6].isSelected()) {
			loadPast += PERCENT_NPI; 
			LoaderNPIQCsvToBeanArray npiqCsvToBeanArray = new LoaderNPIQCsvToBeanArray();
			if (LoadCSVForm.files[6] != null && LoadCSVForm.files[6].exists())
				npiqCsvToBeanArray.load(LoadCSVForm.files[5].getAbsolutePath());
			else
				npiqCsvToBeanArray.load(ADNIExternalResource.getInstance().getADNI_HOME() + "\\ADNICSV\\NPIQ.csv");
		} else {
			loadPercent += PERCENT_NPIQ;
		}

		loadMex = "Fine caricamento CSV";
		status = 100;

		status = 2;

		loadMex = "Fine caricamento CSV nell'ontologia";
	}

	public static void loadCsvNoReset() {

		//		status = 2;
		//		loadMex = "Caricamento CSV";
		//
		//		//Carica i CSV in un Array list
		//		LoaderCDRCsvToBeanArray cdrCsvToBeanArray = new LoaderCDRCsvToBeanArray();
		//		ArrayList<CDRBean> cdrTestList = cdrCsvToBeanArray.load(ADNIExternalResource.getInstance().getADNI_HOME() + "\\ADNICSV\\CDR.csv");
		//
		//		LoaderFAQCsvToBeanArray faqCsvToBeanArray = new LoaderFAQCsvToBeanArray();
		//		ArrayList<FAQBean> faqTestList = faqCsvToBeanArray.load(ADNIExternalResource.getInstance().getADNI_HOME() + "\\ADNICSV\\FAQ.csv");
		//
		//		LoaderMMSECsvToBeanArray mmseCsvToBeanArray = new LoaderMMSECsvToBeanArray();
		//		ArrayList<MMSEBean> mmseTestList = mmseCsvToBeanArray.load(ADNIExternalResource.getInstance().getADNI_HOME() + "\\ADNICSV\\MMSE.csv");
		//		loadMex = "Fine caricamento CSV";
		//		loadPercent = 20;
		//
		//		status = 3;
		//		loadMex = "Caricamento CSV nell'ontologia";
		//
		//		//Carica i dati (individui) nel TDB
		//		CDRManager cdrManager = new CDRManager();
		//		cdrManager.insertInADNIOntology(cdrTestList);
		//
		//		FAQManager faqManager = new FAQManager();
		//		faqManager.insertInADNIOntology(faqTestList);
		//
		//		MMSEManager mmseManager = new MMSEManager();
		//		mmseManager.insertInADNIOntology(mmseTestList);
		//		loadMex = "Fine caricamento CSV nell'ontologia";
	}
}
