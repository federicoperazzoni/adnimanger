package jena.adni.main;

import java.util.ArrayList;

import jena.adni.bean.CDRBean;
import jena.adni.bean.FAQBean;
import jena.adni.bean.MMSEBean;
import jena.adni.constants.ADNIExternalResource;
import jena.adni.loader.LoaderCDRCsvToBeanArray;
import jena.adni.loader.LoaderFAQCsvToBeanArray;
import jena.adni.loader.LoaderMMSECsvToBeanArray;
import jena.adni.main.application.util.LoadCSVForm;
import jena.adni.manager.CDRManager;
import jena.adni.manager.FAQManager;
import jena.adni.manager.MMSEManager;
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
		loadPercent = 1;

		status = 2;
		loadMex = "Caricamento CSV";
		ArrayList<MMSEBean> mmseTestList = null;
		ArrayList<FAQBean> faqTestList = null;
		ArrayList<CDRBean> cdrTestList = null;
		//Carica i CSV in un Array list
		if (LoadCSVForm.fieldsCB[0].isSelected()) {
			LoaderCDRCsvToBeanArray cdrCsvToBeanArray = new LoaderCDRCsvToBeanArray();
			if (LoadCSVForm.files[0] != null && LoadCSVForm.files[0].exists())
				cdrTestList = cdrCsvToBeanArray.load(LoadCSVForm.files[2].getAbsolutePath());
			else
				cdrTestList = cdrCsvToBeanArray.load(ADNIExternalResource.getInstance().getADNI_HOME() + "\\ADNICSV\\CDR.csv");
		}

		if (LoadCSVForm.fieldsCB[1].isSelected()) {
			LoaderFAQCsvToBeanArray faqCsvToBeanArray = new LoaderFAQCsvToBeanArray();
			if (LoadCSVForm.files[1] != null && LoadCSVForm.files[1].exists())
				faqTestList = faqCsvToBeanArray.load(LoadCSVForm.files[2].getAbsolutePath());
			else
				faqTestList = faqCsvToBeanArray.load(ADNIExternalResource.getInstance().getADNI_HOME() + "\\ADNICSV\\FAQ.csv");
		}

		if (LoadCSVForm.fieldsCB[2].isSelected()) {
			LoaderMMSECsvToBeanArray mmseCsvToBeanArray = new LoaderMMSECsvToBeanArray();
			if (LoadCSVForm.files[2] != null && LoadCSVForm.files[2].exists())
				mmseTestList = mmseCsvToBeanArray.load(LoadCSVForm.files[2].getAbsolutePath());
			else
				mmseTestList = mmseCsvToBeanArray.load(ADNIExternalResource.getInstance().getADNI_HOME() + "\\ADNICSV\\MMSE.csv");
		}

		loadMex = "Fine caricamento CSV";
		loadPercent = 1;

		status = 3;
		loadMex = "Caricamento CSV nell'ontologia";
		//Carica i dati (individui) nel TDB
		if (LoadCSVForm.fieldsCB[0].isSelected()) {
			CDRManager cdrManager = new CDRManager();
			cdrManager.insertInADNIOntology(cdrTestList);
		} else {
			loadPercent += 4;
		}
		if (LoadCSVForm.fieldsCB[1].isSelected()) {		
			FAQManager faqManager = new FAQManager();
			faqManager.insertInADNIOntology(faqTestList);
		} else {
			loadPercent += 4;
		}
		if (LoadCSVForm.fieldsCB[2].isSelected()) {		
			MMSEManager mmseManager = new MMSEManager();
			mmseManager.insertInADNIOntology(mmseTestList);
		} else {
			loadPercent += 90;
		}
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

		LoaderMMSECsvToBeanArray mmseCsvToBeanArray = new LoaderMMSECsvToBeanArray();
		ArrayList<MMSEBean> mmseTestList = mmseCsvToBeanArray.load(ADNIExternalResource.getInstance().getADNI_HOME() + "\\ADNICSV\\MMSE.csv");
		loadMex = "Fine caricamento CSV";
		loadPercent = 20;

		status = 3;
		loadMex = "Caricamento CSV nell'ontologia";

		//Carica i dati (individui) nel TDB
		CDRManager cdrManager = new CDRManager();
		cdrManager.insertInADNIOntology(cdrTestList);

		FAQManager faqManager = new FAQManager();
		faqManager.insertInADNIOntology(faqTestList);

		MMSEManager mmseManager = new MMSEManager();
		mmseManager.insertInADNIOntology(mmseTestList);
		loadMex = "Fine caricamento CSV nell'ontologia";
	}
}
