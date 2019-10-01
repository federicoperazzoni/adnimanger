package jena.adni.main;

import java.io.File;
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
	public static int statusQuery;

	public static final int PERCENT_PRE = 2;
	public static final int PERCENT_CDR = 4;
	public static final int PERCENT_FAQ = 4;
	public static final int PERCENT_MMSE = 15;
	public static final int PERCENT_NPIQ = 15;
	public static final int PERCENT_NPI = 20;
	public static final int PERCENT_GDS = 20;
	public static final int PERCENT_NEUROBAT = 19;

	public static void loadCsvWithReset() {

		status = 0;
		loadMex = "Load ADNI ontology";
		loadPercent = 0;
		loadPast=0;
		//Carica l'ontologia
		ADNIOntologyLoader adniOntologyLoader = new ADNIOntologyLoader();
		adniOntologyLoader.resetADNIOntologyTDB();
		adniOntologyLoader.loadADNIOntology();
		loadMex = "End load ADNI ontology";
		status = 1;
		loadMex = "Load CSV";
		
		loadPast += PERCENT_PRE;

		//Carica i CSV in un Array list
		if (LoadCSVForm.fieldsCB[0].isSelected()) {
			LoaderCDRCsvToBeanArray cdrCsvToBeanArray = new LoaderCDRCsvToBeanArray();
			if (LoadCSVForm.files[0] != null && LoadCSVForm.files[0].exists())
				cdrCsvToBeanArray.load(LoadCSVForm.files[2].getAbsolutePath());
			else
				cdrCsvToBeanArray.load(ADNIExternalResource.getInstance().getADNI_HOME() + File.separator + "ADNICSV" + File.separator + "CDR.csv");
			loadMex = "CDR loaded";
		} else {
			loadPercent += PERCENT_CDR;
		}
		
		loadPast += PERCENT_CDR; 
		
		if (LoadCSVForm.fieldsCB[1].isSelected()) {
			LoaderFAQCsvToBeanArray faqCsvToBeanArray = new LoaderFAQCsvToBeanArray();
			if (LoadCSVForm.files[1] != null && LoadCSVForm.files[1].exists())
				faqCsvToBeanArray.load(LoadCSVForm.files[2].getAbsolutePath());
			else
				faqCsvToBeanArray.load(ADNIExternalResource.getInstance().getADNI_HOME() + File.separator + "ADNICSV" + File.separator + "FAQ.csv");
			loadMex = "FAQ loaded";
		} else {
			loadPercent += PERCENT_FAQ;
		}	
		
		loadPast += PERCENT_FAQ; 

		if (LoadCSVForm.fieldsCB[2].isSelected()) {
			LoaderMMSECsvToBeanArray mmseCsvToBeanArray = new LoaderMMSECsvToBeanArray();
			if (LoadCSVForm.files[2] != null && LoadCSVForm.files[2].exists())
				mmseCsvToBeanArray.load(LoadCSVForm.files[2].getAbsolutePath());
			else
				mmseCsvToBeanArray.load(ADNIExternalResource.getInstance().getADNI_HOME() + File.separator + "ADNICSV" + File.separator + "MMSE.csv");
			loadMex = "MMSE loaded";
		} else {
			loadPercent += PERCENT_MMSE;
		}
		
		loadPast += PERCENT_MMSE; 

		if (LoadCSVForm.fieldsCB[3].isSelected()) {
			LoaderNeuroBatteryCsvToBeanArray mmseCsvToBeanArray = new LoaderNeuroBatteryCsvToBeanArray();
			if (LoadCSVForm.files[3] != null && LoadCSVForm.files[3].exists())
				mmseCsvToBeanArray.load(LoadCSVForm.files[3].getAbsolutePath());
			else
				mmseCsvToBeanArray.load(ADNIExternalResource.getInstance().getADNI_HOME() + File.separator + "ADNICSV" + File.separator + "NEUROBAT.csv");
			loadMex = "NEUROBATTERY loaded";
		} else {
			loadPercent += PERCENT_NEUROBAT;
		}
		
		loadPast += PERCENT_NEUROBAT; 

		if (LoadCSVForm.fieldsCB[4].isSelected()) {
			LoaderGDSCsvToBeanArray gdsCsvToBeanArray = new LoaderGDSCsvToBeanArray();
			if (LoadCSVForm.files[4] != null && LoadCSVForm.files[4].exists())
				gdsCsvToBeanArray.load(LoadCSVForm.files[4].getAbsolutePath());
			else
				gdsCsvToBeanArray.load(ADNIExternalResource.getInstance().getADNI_HOME() + File.separator + "ADNICSV" + File.separator + "GDSCALE.csv");
			loadMex = "GDS loaded";
		} else {
			loadPercent += PERCENT_GDS;
		}
		
		loadPast += PERCENT_GDS;

		if (LoadCSVForm.fieldsCB[5].isSelected()) { 
			LoaderNPICsvToBeanArray npiCsvToBeanArray = new LoaderNPICsvToBeanArray();
			if (LoadCSVForm.files[5] != null && LoadCSVForm.files[5].exists())
				npiCsvToBeanArray.load(LoadCSVForm.files[5].getAbsolutePath());
			else
				npiCsvToBeanArray.load(ADNIExternalResource.getInstance().getADNI_HOME() + File.separator + "ADNICSV" + File.separator + "NPI.csv");
			loadMex = "NPI loaded";
		} else {
			loadPercent += PERCENT_NPI;
		}
		
		loadPast += PERCENT_NPI; 

		if (LoadCSVForm.fieldsCB[6].isSelected()) {
			LoaderNPIQCsvToBeanArray npiqCsvToBeanArray = new LoaderNPIQCsvToBeanArray();
			if (LoadCSVForm.files[6] != null && LoadCSVForm.files[6].exists())
				npiqCsvToBeanArray.load(LoadCSVForm.files[6].getAbsolutePath());
			else
				npiqCsvToBeanArray.load(ADNIExternalResource.getInstance().getADNI_HOME() + File.separator + "ADNICSV" + File.separator + "NPIQ.csv");
			loadMex = "NPIQ loaded";
		} else {
			loadPercent += PERCENT_NPIQ;
		}

		loadMex = "End load CSV";
		loadPercent = 100;

		loadMex = "End load CSV into onotlogy";
	}

	public static void loadCsvNoReset() {

		status = 1;
		loadMex = "Load CSV";
		loadPercent = 0;
		loadPast=0;
		
		loadPast += PERCENT_PRE;

		//Carica i CSV in un Array list
		if (LoadCSVForm.fieldsCB[0].isSelected()) {
			LoaderCDRCsvToBeanArray cdrCsvToBeanArray = new LoaderCDRCsvToBeanArray();
			if (LoadCSVForm.files[0] != null && LoadCSVForm.files[0].exists())
				cdrCsvToBeanArray.load(LoadCSVForm.files[2].getAbsolutePath());
			else
				cdrCsvToBeanArray.load(ADNIExternalResource.getInstance().getADNI_HOME() + File.separator + "ADNICSV" + File.separator + "CDR.csv");
			loadMex = "CDR loaded";
		} else {
			loadPercent += PERCENT_CDR;
		}
		
		loadPast += PERCENT_CDR; 
		
		if (LoadCSVForm.fieldsCB[1].isSelected()) {
			LoaderFAQCsvToBeanArray faqCsvToBeanArray = new LoaderFAQCsvToBeanArray();
			if (LoadCSVForm.files[1] != null && LoadCSVForm.files[1].exists())
				faqCsvToBeanArray.load(LoadCSVForm.files[2].getAbsolutePath());
			else
				faqCsvToBeanArray.load(ADNIExternalResource.getInstance().getADNI_HOME() + File.separator + "ADNICSV" + File.separator + "FAQ.csv");
			loadMex = "FAQ loaded";
		} else {
			loadPercent += PERCENT_FAQ;
		}	
		
		loadPast += PERCENT_FAQ; 

		if (LoadCSVForm.fieldsCB[2].isSelected()) {
			LoaderMMSECsvToBeanArray mmseCsvToBeanArray = new LoaderMMSECsvToBeanArray();
			if (LoadCSVForm.files[2] != null && LoadCSVForm.files[2].exists())
				mmseCsvToBeanArray.load(LoadCSVForm.files[2].getAbsolutePath());
			else
				mmseCsvToBeanArray.load(ADNIExternalResource.getInstance().getADNI_HOME() + File.separator + "ADNICSV" + File.separator + "MMSE.csv");
			loadMex = "MMSE loaded";
		} else {
			loadPercent += PERCENT_MMSE;
		}
		
		loadPast += PERCENT_MMSE; 

		if (LoadCSVForm.fieldsCB[3].isSelected()) {
			LoaderNeuroBatteryCsvToBeanArray mmseCsvToBeanArray = new LoaderNeuroBatteryCsvToBeanArray();
			if (LoadCSVForm.files[3] != null && LoadCSVForm.files[3].exists())
				mmseCsvToBeanArray.load(LoadCSVForm.files[3].getAbsolutePath());
			else
				mmseCsvToBeanArray.load(ADNIExternalResource.getInstance().getADNI_HOME() + File.separator + "ADNICSV" + File.separator + "NEUROBAT.csv");
			loadMex = "NEUROBATTERY loaded";
		} else {
			loadPercent += PERCENT_NEUROBAT;
		}
		
		loadPast += PERCENT_NEUROBAT; 

		if (LoadCSVForm.fieldsCB[4].isSelected()) {
			LoaderGDSCsvToBeanArray gdsCsvToBeanArray = new LoaderGDSCsvToBeanArray();
			if (LoadCSVForm.files[4] != null && LoadCSVForm.files[4].exists())
				gdsCsvToBeanArray.load(LoadCSVForm.files[4].getAbsolutePath());
			else
				gdsCsvToBeanArray.load(ADNIExternalResource.getInstance().getADNI_HOME() + File.separator + "ADNICSV" + File.separator + "GDSCALE.csv");
			loadMex = "GDS loaded";
		} else {
			loadPercent += PERCENT_GDS;
		}
		
		loadPast += PERCENT_GDS;

		if (LoadCSVForm.fieldsCB[5].isSelected()) { 
			LoaderNPICsvToBeanArray npiCsvToBeanArray = new LoaderNPICsvToBeanArray();
			if (LoadCSVForm.files[5] != null && LoadCSVForm.files[5].exists())
				npiCsvToBeanArray.load(LoadCSVForm.files[5].getAbsolutePath());
			else
				npiCsvToBeanArray.load(ADNIExternalResource.getInstance().getADNI_HOME() + File.separator + "ADNICSV" + File.separator + "NPI.csv");
			loadMex = "NPI loaded";
		} else {
			loadPercent += PERCENT_NPI;
		}
		
		loadPast += PERCENT_NPI; 

		if (LoadCSVForm.fieldsCB[6].isSelected()) {
			LoaderNPIQCsvToBeanArray npiqCsvToBeanArray = new LoaderNPIQCsvToBeanArray();
			if (LoadCSVForm.files[6] != null && LoadCSVForm.files[6].exists())
				npiqCsvToBeanArray.load(LoadCSVForm.files[6].getAbsolutePath());
			else
				npiqCsvToBeanArray.load(ADNIExternalResource.getInstance().getADNI_HOME() + File.separator + "ADNICSV" + File.separator + "NPIQ.csv");
			loadMex = "NPIQ loaded";
		} else {
			loadPercent += PERCENT_NPIQ;
		}

		loadMex = "End load CSV";
		loadPercent = 100;

		loadMex = "End load CSV into onotlogy";
	}
}
