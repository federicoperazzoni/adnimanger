package jena.adni.manager;

import java.util.ArrayList;

import com.hp.hpl.jena.vocabulary.RDF;

import jena.adni.bean.CDRBean;
import jena.adni.bean.NeuroBatteryBean;
import jena.adni.constants.ADNIExternalResource;
import jena.adni.constants.Constants;
import jena.adni.main.LoadCsv;
import jena.adni.util.TDBUtil;
import jena.test1.TDBConnection;

public class NeuroBatteryManager {
	
	
	public void insertInADNIOntology(ArrayList<NeuroBatteryBean> neuroBatteryTestList) {
		
		TDBConnection tdbConnection = new TDBConnection(ADNIExternalResource.getInstance().getADNI_HOME() + "\\ADNIONTOLOGYSOURCE\\TDBDatabase");
		
		int count = 0;
		
		int total = neuroBatteryTestList.size();
		
		String prefix = ADNIExternalResource.getPrefix();
		String modelName = ADNIExternalResource.getModelname();
		
		for (NeuroBatteryBean neuroBatteryBean : neuroBatteryTestList) {
			
			try {
				
				tdbConnection.addStatement(modelName, prefix + "CDR_" + count, RDF.type.getURI(), prefix + "CDR");
				tdbConnection.addStatement(modelName, prefix + neuroBatteryBean.getSubjectDataBean().getRID(), RDF.type.getURI(), prefix + "Subject");
				tdbConnection.addStatement(modelName, prefix + neuroBatteryBean.getSubjectDataBean().getRID(), RDF.type.getURI(), "http://www.w3.org/2002/07/owl#NamedIndividual");
				tdbConnection.addStatement(modelName, prefix + neuroBatteryBean.getSubjectDataBean().getRID(), prefix + "hasStandardizedAssesment", prefix + "NB_" + count);
							
				tdbConnection.addStatement(modelName, prefix + "NB_" + count, prefix + "hasAssesmentItem", prefix + "NB_AmericanNationalAdultReadingTestItem_1_" + count);
				tdbConnection.addStatement(modelName, prefix + "NB_" + count, prefix + "hasAssesmentItem", prefix + "NB_AmericanNationalAdultReadingTestItem_2_" + count);
				tdbConnection.addStatement(modelName, prefix + "NB_" + count, prefix + "hasAssesmentItem", prefix + "NB_BostonNamingTestItem_1_" + count);
				tdbConnection.addStatement(modelName, prefix + "NB_" + count, prefix + "hasAssesmentItem", prefix + "NB_BostonNamingTestItem_2_" + count);
				tdbConnection.addStatement(modelName, prefix + "NB_" + count, prefix + "hasAssesmentItem", prefix + "NB_BostonNamingTestItem_3_" + count);
				tdbConnection.addStatement(modelName, prefix + "NB_" + count, prefix + "hasAssesmentItem", prefix + "NB_BostonNamingTestItem_4_" + count);
				tdbConnection.addStatement(modelName, prefix + "NB_" + count, prefix + "hasAssesmentItem", prefix + "NB_BostonNamingTestItem_5_" + count);
				tdbConnection.addStatement(modelName, prefix + "NB_" + count, prefix + "hasAssesmentItem", prefix + "NB_BostonNamingTestItem_6_" + count);
				tdbConnection.addStatement(modelName, prefix + "NB_" + count, prefix + "hasAssesmentItem", prefix + "NB_CategoryFluencyTestItem_1_" + count);
				tdbConnection.addStatement(modelName, prefix + "NB_" + count, prefix + "hasAssesmentItem", prefix + "NB_CategoryFluencyTestItem_2_" + count);
				tdbConnection.addStatement(modelName, prefix + "NB_" + count, prefix + "hasAssesmentItem", prefix + "NB_CategoryFluencyTestItem_3_" + count);
				tdbConnection.addStatement(modelName, prefix + "NB_" + count, prefix + "hasAssesmentItem", prefix + "NB_CategoryFluencyTestVegetablesItem_1_" + count);
				tdbConnection.addStatement(modelName, prefix + "NB_" + count, prefix + "hasAssesmentItem", prefix + "NB_CategoryFluencyTestVegetablesItem_2_" + count);
				tdbConnection.addStatement(modelName, prefix + "NB_" + count, prefix + "hasAssesmentItem", prefix + "NB_CategoryFluencyTestVegetablesItem_3_" + count);
				tdbConnection.addStatement(modelName, prefix + "NB_" + count, prefix + "hasAssesmentItem", prefix + "NB_ClockCopyingItem_1_" + count);
				tdbConnection.addStatement(modelName, prefix + "NB_" + count, prefix + "hasAssesmentItem", prefix + "NB_ClockCopyingItem_2_" + count);
				tdbConnection.addStatement(modelName, prefix + "NB_" + count, prefix + "hasAssesmentItem", prefix + "NB_ClockCopyingItem_3_" + count);
				tdbConnection.addStatement(modelName, prefix + "NB_" + count, prefix + "hasAssesmentItem", prefix + "NB_ClockCopyingItem_4_" + count);
				tdbConnection.addStatement(modelName, prefix + "NB_" + count, prefix + "hasAssesmentItem", prefix + "NB_ClockCopyingItem_5_" + count);
				tdbConnection.addStatement(modelName, prefix + "NB_" + count, prefix + "hasAssesmentItem", prefix + "NB_ClockCopyingItem_6_" + count);
				tdbConnection.addStatement(modelName, prefix + "NB_" + count, prefix + "hasAssesmentItem", prefix + "NB_ClockDrawingTestItem_1_" + count);
				tdbConnection.addStatement(modelName, prefix + "NB_" + count, prefix + "hasAssesmentItem", prefix + "NB_ClockDrawingTestItem_2_" + count);
				tdbConnection.addStatement(modelName, prefix + "NB_" + count, prefix + "hasAssesmentItem", prefix + "NB_ClockDrawingTestItem_3_" + count);
				tdbConnection.addStatement(modelName, prefix + "NB_" + count, prefix + "hasAssesmentItem", prefix + "NB_ClockDrawingTestItem_4_" + count);
				tdbConnection.addStatement(modelName, prefix + "NB_" + count, prefix + "hasAssesmentItem", prefix + "NB_ClockDrawingTestItem_5_" + count);
				tdbConnection.addStatement(modelName, prefix + "NB_" + count, prefix + "hasAssesmentItem", prefix + "NB_ClockDrawingTestItem_6_" + count);
				tdbConnection.addStatement(modelName, prefix + "NB_" + count, prefix + "hasAssesmentItem", prefix + "NB_DigitSpanBackwardItem_1_" + count);
				tdbConnection.addStatement(modelName, prefix + "NB_" + count, prefix + "hasAssesmentItem", prefix + "NB_DigitSpanBackwardItem_2_" + count);
				tdbConnection.addStatement(modelName, prefix + "NB_" + count, prefix + "hasAssesmentItem", prefix + "NB_DigitSpanForwardItem_1_" + count);
				tdbConnection.addStatement(modelName, prefix + "NB_" + count, prefix + "hasAssesmentItem", prefix + "NB_DigitSpanForwardItem_2_" + count);
				tdbConnection.addStatement(modelName, prefix + "NB_" + count, prefix + "hasAssesmentItem", prefix + "NB_DigitSymbolSubstitutionItem_1_" + count);
				tdbConnection.addStatement(modelName, prefix + "NB_" + count, prefix + "hasAssesmentItem", prefix + "NB_LogicalMemoryTestItem_1_" + count);	
				tdbConnection.addStatement(modelName, prefix + "NB_" + count, prefix + "hasAssesmentItem", prefix + "NB_LogicalMemoryTestItem_2_" + count);
				tdbConnection.addStatement(modelName, prefix + "NB_" + count, prefix + "hasAssesmentItem", prefix + "NB_LogicalMemoryTestItem_3_" + count);
				tdbConnection.addStatement(modelName, prefix + "NB_" + count, prefix + "hasAssesmentItem", prefix + "NB_LogicalMemoryTestItem_4_" + count);
				tdbConnection.addStatement(modelName, prefix + "NB_" + count, prefix + "hasAssesmentItem", prefix + "NB_LogicalMemoryTestItem_5_" + count);
				tdbConnection.addStatement(modelName, prefix + "NB_" + count, prefix + "hasAssesmentItem", prefix + "NB_LogicalMemoryTestItem_6_" + count);
				tdbConnection.addStatement(modelName, prefix + "NB_" + count, prefix + "hasAssesmentItem", prefix + "NB_MultilingualNamingTestItem_1_" + count);
				tdbConnection.addStatement(modelName, prefix + "NB_" + count, prefix + "hasAssesmentItem", prefix + "NB_MultilingualNamingTestItem_2_" + count);
				tdbConnection.addStatement(modelName, prefix + "NB_" + count, prefix + "hasAssesmentItem", prefix + "NB_MultilingualNamingTestItem_3_" + count);
				tdbConnection.addStatement(modelName, prefix + "NB_" + count, prefix + "hasAssesmentItem", prefix + "NB_ReyAuditoryLearningTestItem_1_" + count);
				tdbConnection.addStatement(modelName, prefix + "NB_" + count, prefix + "hasAssesmentItem", prefix + "NB_ReyAuditoryLearningTestItem_2_" + count);
				tdbConnection.addStatement(modelName, prefix + "NB_" + count, prefix + "hasAssesmentItem", prefix + "NB_ReyAuditoryLearningTestItem_3_" + count);
				tdbConnection.addStatement(modelName, prefix + "NB_" + count, prefix + "hasAssesmentItem", prefix + "NB_ReyAuditoryLearningTestItem_4_" + count);
				tdbConnection.addStatement(modelName, prefix + "NB_" + count, prefix + "hasAssesmentItem", prefix + "NB_ReyAuditoryVerbalLearningTestItem_1_" + count);
				tdbConnection.addStatement(modelName, prefix + "NB_" + count, prefix + "hasAssesmentItem", prefix + "NB_ReyAuditoryVerbalLearningTestItem_2_" + count);
				tdbConnection.addStatement(modelName, prefix + "NB_" + count, prefix + "hasAssesmentItem", prefix + "NB_ReyAuditoryVerbalLearningTestItem_3_" + count);
				tdbConnection.addStatement(modelName, prefix + "NB_" + count, prefix + "hasAssesmentItem", prefix + "NB_ReyAuditoryVerbalLearningTestItem_4_" + count);
				tdbConnection.addStatement(modelName, prefix + "NB_" + count, prefix + "hasAssesmentItem", prefix + "NB_ReyAuditoryVerbalLearningTestItem_5_" + count);
				tdbConnection.addStatement(modelName, prefix + "NB_" + count, prefix + "hasAssesmentItem", prefix + "NB_ReyAuditoryVerbalLearningTestItem_6_" + count);
				tdbConnection.addStatement(modelName, prefix + "NB_" + count, prefix + "hasAssesmentItem", prefix + "NB_ReyAuditoryVerbalLearningTestItem_7_" + count);
				tdbConnection.addStatement(modelName, prefix + "NB_" + count, prefix + "hasAssesmentItem", prefix + "NB_ReyAuditoryVerbalLearningTestItem_8_" + count);
				tdbConnection.addStatement(modelName, prefix + "NB_" + count, prefix + "hasAssesmentItem", prefix + "NB_ReyAuditoryVerbalLearningTestItem_9_" + count);
				tdbConnection.addStatement(modelName, prefix + "NB_" + count, prefix + "hasAssesmentItem", prefix + "NB_ReyAuditoryVerbalLearningTestItem_10_" + count);
				tdbConnection.addStatement(modelName, prefix + "NB_" + count, prefix + "hasAssesmentItem", prefix + "NB_ReyAuditoryVerbalLearningTestItem_11_" + count);
				tdbConnection.addStatement(modelName, prefix + "NB_" + count, prefix + "hasAssesmentItem", prefix + "NB_ReyAuditoryVerbalLearningTestItem_12_" + count);
				tdbConnection.addStatement(modelName, prefix + "NB_" + count, prefix + "hasAssesmentItem", prefix + "NB_ReyAuditoryVerbalLearningTestItem_13_" + count);
				tdbConnection.addStatement(modelName, prefix + "NB_" + count, prefix + "hasAssesmentItem", prefix + "NB_ReyAuditoryVerbalLearningTestItem_14_" + count);
				tdbConnection.addStatement(modelName, prefix + "NB_" + count, prefix + "hasAssesmentItem", prefix + "NB_ReyAuditoryVerbalLearningTestItem_15_" + count);
				tdbConnection.addStatement(modelName, prefix + "NB_" + count, prefix + "hasAssesmentItem", prefix + "NB_ReyAuditoryVerbalLearningTestItem_16_" + count);
				tdbConnection.addStatement(modelName, prefix + "NB_" + count, prefix + "hasAssesmentItem", prefix + "NB_ReyAuditoryVerbalLearningTestItem_17_" + count);
				tdbConnection.addStatement(modelName, prefix + "NB_" + count, prefix + "hasAssesmentItem", prefix + "NB_ReyAuditoryVerbalLearningTestItem_18_" + count);
				tdbConnection.addStatement(modelName, prefix + "NB_" + count, prefix + "hasAssesmentItem", prefix + "NB_ReyAuditoryVerbalLearningTestItem_19_" + count);
				tdbConnection.addStatement(modelName, prefix + "NB_" + count, prefix + "hasAssesmentItem", prefix + "NB_TrailMakingTestAItem_1_" + count);
				tdbConnection.addStatement(modelName, prefix + "NB_" + count, prefix + "hasAssesmentItem", prefix + "NB_TrailMakingTestAItem_2_" + count);
				tdbConnection.addStatement(modelName, prefix + "NB_" + count, prefix + "hasAssesmentItem", prefix + "NB_TrailMakingTestAItem_3_" + count);
				tdbConnection.addStatement(modelName, prefix + "NB_" + count, prefix + "hasAssesmentItem", prefix + "NB_TrailMakingTestBItem_1_" + count);
				tdbConnection.addStatement(modelName, prefix + "NB_" + count, prefix + "hasAssesmentItem", prefix + "NB_TrailMakingTestBItem_2_" + count);
				tdbConnection.addStatement(modelName, prefix + "NB_" + count, prefix + "hasAssesmentItem", prefix + "NB_TrailMakingTestBItem_3_" + count);
				
				tdbConnection.addStatement(modelName, prefix + "NB_AmericanNationalAdultReadingTestItem_1_" + count, RDF.type.getURI(), prefix + "NB_AmericanNationalAdultReadingTestItem_1");
				tdbConnection.addStatement(modelName, prefix + "NB_AmericanNationalAdultReadingTestItem_2_" + count, RDF.type.getURI(), prefix + "NB_AmericanNationalAdultReadingTestItem_2");
				tdbConnection.addStatement(modelName, prefix + "NB_BostonNamingTestItem_1_" + count, RDF.type.getURI(), prefix + "NB_BostonNamingTestItem_1");
				tdbConnection.addStatement(modelName, prefix + "NB_BostonNamingTestItem_2_" + count, RDF.type.getURI(), prefix + "NB_BostonNamingTestItem_2");
				tdbConnection.addStatement(modelName, prefix + "NB_BostonNamingTestItem_3_" + count, RDF.type.getURI(), prefix + "NB_BostonNamingTestItem_3");
				tdbConnection.addStatement(modelName, prefix + "NB_BostonNamingTestItem_4_" + count, RDF.type.getURI(), prefix + "NB_BostonNamingTestItem_4");
				tdbConnection.addStatement(modelName, prefix + "NB_BostonNamingTestItem_5_" + count, RDF.type.getURI(), prefix + "NB_BostonNamingTestItem_5");
				tdbConnection.addStatement(modelName, prefix + "NB_BostonNamingTestItem_6_" + count, RDF.type.getURI(), prefix + "NB_BostonNamingTestItem_6");
				tdbConnection.addStatement(modelName, prefix + "NB_CategoryFluencyTestItem_1_" + count, RDF.type.getURI(), prefix + "NB_CategoryFluencyTestItem_1");
				tdbConnection.addStatement(modelName, prefix + "NB_CategoryFluencyTestItem_2_" + count, RDF.type.getURI(), prefix + "NB_CategoryFluencyTestItem_2");
				tdbConnection.addStatement(modelName, prefix + "NB_CategoryFluencyTestItem_3_" + count, RDF.type.getURI(), prefix + "NB_CategoryFluencyTestItem_3");
				tdbConnection.addStatement(modelName, prefix + "NB_CategoryFluencyTestVegetablesItem_1_" + count, RDF.type.getURI(), prefix + "NB_CategoryFluencyTestVegetablesItem_1");
				tdbConnection.addStatement(modelName, prefix + "NB_CategoryFluencyTestVegetablesItem_2_" + count, RDF.type.getURI(), prefix + "NB_CategoryFluencyTestVegetablesItem_2");
				tdbConnection.addStatement(modelName, prefix + "NB_CategoryFluencyTestVegetablesItem_3_" + count, RDF.type.getURI(), prefix + "NB_CategoryFluencyTestVegetablesItem_3");
				tdbConnection.addStatement(modelName, prefix + "NB_ClockCopyingItem_1_" + count, RDF.type.getURI(), prefix + "NB_ClockCopyingItem_1");
				tdbConnection.addStatement(modelName, prefix + "NB_ClockCopyingItem_2_" + count, RDF.type.getURI(), prefix + "NB_ClockCopyingItem_2");
				tdbConnection.addStatement(modelName, prefix + "NB_ClockCopyingItem_3_" + count, RDF.type.getURI(), prefix + "NB_ClockCopyingItem_3");
				tdbConnection.addStatement(modelName, prefix + "NB_ClockCopyingItem_4_" + count, RDF.type.getURI(), prefix + "NB_ClockCopyingItem_4");
				tdbConnection.addStatement(modelName, prefix + "NB_ClockCopyingItem_5_" + count, RDF.type.getURI(), prefix + "NB_ClockCopyingItem_5");
				tdbConnection.addStatement(modelName, prefix + "NB_ClockCopyingItem_6_" + count, RDF.type.getURI(), prefix + "NB_ClockCopyingItem_6");
				tdbConnection.addStatement(modelName, prefix + "NB_ClockDrawingTestItem_1_" + count, RDF.type.getURI(), prefix + "NB_ClockDrawingTestItem_1");
				tdbConnection.addStatement(modelName, prefix + "NB_ClockDrawingTestItem_2_" + count, RDF.type.getURI(), prefix + "NB_ClockDrawingTestItem_2");
				tdbConnection.addStatement(modelName, prefix + "NB_ClockDrawingTestItem_3_" + count, RDF.type.getURI(), prefix + "NB_ClockDrawingTestItem_3");
				tdbConnection.addStatement(modelName, prefix + "NB_ClockDrawingTestItem_4_" + count, RDF.type.getURI(), prefix + "NB_ClockDrawingTestItem_4");
				tdbConnection.addStatement(modelName, prefix + "NB_ClockDrawingTestItem_5_" + count, RDF.type.getURI(), prefix + "NB_ClockDrawingTestItem_5");
				tdbConnection.addStatement(modelName, prefix + "NB_ClockDrawingTestItem_6_" + count, RDF.type.getURI(), prefix + "NB_ClockDrawingTestItem_6");
				tdbConnection.addStatement(modelName, prefix + "NB_DigitSpanBackwardItem_1_" + count, RDF.type.getURI(), prefix + "NB_DigitSpanBackwardItem_1");
				tdbConnection.addStatement(modelName, prefix + "NB_DigitSpanBackwardItem_2_" + count, RDF.type.getURI(), prefix + "NB_DigitSpanBackwardItem_2");
				tdbConnection.addStatement(modelName, prefix + "NB_DigitSpanForwardItem_1_" + count, RDF.type.getURI(), prefix + "NB_DigitSpanForwardItem_1");
				tdbConnection.addStatement(modelName, prefix + "NB_DigitSpanForwardItem_2_" + count, RDF.type.getURI(), prefix + "NB_DigitSpanForwardItem_2");
				tdbConnection.addStatement(modelName, prefix + "NB_DigitSymbolSubstitutionItem_1_" + count, RDF.type.getURI(), prefix + "NB_DigitSymbolSubstitutionItem_1");
				tdbConnection.addStatement(modelName, prefix + "NB_LogicalMemoryTestItem_1_" + count, RDF.type.getURI(), prefix + "NB_LogicalMemoryTestItem_1");
				tdbConnection.addStatement(modelName, prefix + "NB_LogicalMemoryTestItem_2_" + count, RDF.type.getURI(), prefix + "NB_LogicalMemoryTestItem_2");
				tdbConnection.addStatement(modelName, prefix + "NB_LogicalMemoryTestItem_3_" + count, RDF.type.getURI(), prefix + "NB_LogicalMemoryTestItem_3");
				tdbConnection.addStatement(modelName, prefix + "NB_LogicalMemoryTestItem_4_" + count, RDF.type.getURI(), prefix + "NB_LogicalMemoryTestItem_4");
				tdbConnection.addStatement(modelName, prefix + "NB_LogicalMemoryTestItem_5_" + count, RDF.type.getURI(), prefix + "NB_LogicalMemoryTestItem_5");
				tdbConnection.addStatement(modelName, prefix + "NB_LogicalMemoryTestItem_6_" + count, RDF.type.getURI(), prefix + "NB_LogicalMemoryTestItem_6");
				tdbConnection.addStatement(modelName, prefix + "NB_MultilingualNamingTestItem_1_" + count, RDF.type.getURI(), prefix + "NB_MultilingualNamingTestItem_1");
				tdbConnection.addStatement(modelName, prefix + "NB_MultilingualNamingTestItem_2_" + count, RDF.type.getURI(), prefix + "NB_MultilingualNamingTestItem_2");
				tdbConnection.addStatement(modelName, prefix + "NB_MultilingualNamingTestItem_3_" + count, RDF.type.getURI(), prefix + "NB_MultilingualNamingTestItem_3");
				tdbConnection.addStatement(modelName, prefix + "NB_ReyAuditoryLearningTestItem_1_" + count, RDF.type.getURI(), prefix + "NB_ReyAuditoryLearningTestItem_1");
				tdbConnection.addStatement(modelName, prefix + "NB_ReyAuditoryLearningTestItem_2_" + count, RDF.type.getURI(), prefix + "NB_ReyAuditoryLearningTestItem_2");
				tdbConnection.addStatement(modelName, prefix + "NB_ReyAuditoryLearningTestItem_3_" + count, RDF.type.getURI(), prefix + "NB_ReyAuditoryLearningTestItem_3");
				tdbConnection.addStatement(modelName, prefix + "NB_ReyAuditoryLearningTestItem_4_" + count, RDF.type.getURI(), prefix + "NB_ReyAuditoryLearningTestItem_4");
				tdbConnection.addStatement(modelName, prefix + "NB_ReyAuditoryVerbalLearningTestItem_1_" + count, RDF.type.getURI(), prefix + "NB_ReyAuditoryVerbalLearningTestItem_1");
				tdbConnection.addStatement(modelName, prefix + "NB_ReyAuditoryVerbalLearningTestItem_2_" + count, RDF.type.getURI(), prefix + "NB_ReyAuditoryVerbalLearningTestItem_2");
				tdbConnection.addStatement(modelName, prefix + "NB_ReyAuditoryVerbalLearningTestItem_3_" + count, RDF.type.getURI(), prefix + "NB_ReyAuditoryVerbalLearningTestItem_3");
				tdbConnection.addStatement(modelName, prefix + "NB_ReyAuditoryVerbalLearningTestItem_4_" + count, RDF.type.getURI(), prefix + "NB_ReyAuditoryVerbalLearningTestItem_4");
				tdbConnection.addStatement(modelName, prefix + "NB_ReyAuditoryVerbalLearningTestItem_5_" + count, RDF.type.getURI(), prefix + "NB_ReyAuditoryVerbalLearningTestItem_5");
				tdbConnection.addStatement(modelName, prefix + "NB_ReyAuditoryVerbalLearningTestItem_6_" + count, RDF.type.getURI(), prefix + "NB_ReyAuditoryVerbalLearningTestItem_6");
				tdbConnection.addStatement(modelName, prefix + "NB_ReyAuditoryVerbalLearningTestItem_7_" + count, RDF.type.getURI(), prefix + "NB_ReyAuditoryVerbalLearningTestItem_7");
				tdbConnection.addStatement(modelName, prefix + "NB_ReyAuditoryVerbalLearningTestItem_8_" + count, RDF.type.getURI(), prefix + "NB_ReyAuditoryVerbalLearningTestItem_8");
				tdbConnection.addStatement(modelName, prefix + "NB_ReyAuditoryVerbalLearningTestItem_9_" + count, RDF.type.getURI(), prefix + "NB_ReyAuditoryVerbalLearningTestItem_9");
				tdbConnection.addStatement(modelName, prefix + "NB_ReyAuditoryVerbalLearningTestItem_10_" + count, RDF.type.getURI(), prefix + "NB_ReyAuditoryVerbalLearningTestItem_10");
				tdbConnection.addStatement(modelName, prefix + "NB_ReyAuditoryVerbalLearningTestItem_11_" + count, RDF.type.getURI(), prefix + "NB_ReyAuditoryVerbalLearningTestItem_11");
				tdbConnection.addStatement(modelName, prefix + "NB_ReyAuditoryVerbalLearningTestItem_12_" + count, RDF.type.getURI(), prefix + "NB_ReyAuditoryVerbalLearningTestItem_12");
				tdbConnection.addStatement(modelName, prefix + "NB_ReyAuditoryVerbalLearningTestItem_13_" + count, RDF.type.getURI(), prefix + "NB_ReyAuditoryVerbalLearningTestItem_13");
				tdbConnection.addStatement(modelName, prefix + "NB_ReyAuditoryVerbalLearningTestItem_14_" + count, RDF.type.getURI(), prefix + "NB_ReyAuditoryVerbalLearningTestItem_14");
				tdbConnection.addStatement(modelName, prefix + "NB_ReyAuditoryVerbalLearningTestItem_15_" + count, RDF.type.getURI(), prefix + "NB_ReyAuditoryVerbalLearningTestItem_15");
				tdbConnection.addStatement(modelName, prefix + "NB_ReyAuditoryVerbalLearningTestItem_16_" + count, RDF.type.getURI(), prefix + "NB_ReyAuditoryVerbalLearningTestItem_16");
				tdbConnection.addStatement(modelName, prefix + "NB_ReyAuditoryVerbalLearningTestItem_17_" + count, RDF.type.getURI(), prefix + "NB_ReyAuditoryVerbalLearningTestItem_17");
				tdbConnection.addStatement(modelName, prefix + "NB_ReyAuditoryVerbalLearningTestItem_18_" + count, RDF.type.getURI(), prefix + "NB_ReyAuditoryVerbalLearningTestItem_18");
				tdbConnection.addStatement(modelName, prefix + "NB_ReyAuditoryVerbalLearningTestItem_19_" + count, RDF.type.getURI(), prefix + "NB_ReyAuditoryVerbalLearningTestItem_19");
				tdbConnection.addStatement(modelName, prefix + "NB_TrailMakingTestAItem_1_" + count, RDF.type.getURI(), prefix + "NB_TrailMakingTestAItem_1");
				tdbConnection.addStatement(modelName, prefix + "NB_TrailMakingTestAItem_2_" + count, RDF.type.getURI(), prefix + "NB_TrailMakingTestAItem_2");
				tdbConnection.addStatement(modelName, prefix + "NB_TrailMakingTestAItem_3_" + count, RDF.type.getURI(), prefix + "NB_TrailMakingTestAItem_3");
				tdbConnection.addStatement(modelName, prefix + "NB_TrailMakingTestBItem_1_" + count, RDF.type.getURI(), prefix + "NB_TrailMakingTestBItem_1");
				tdbConnection.addStatement(modelName, prefix + "NB_TrailMakingTestBItem_2_" + count, RDF.type.getURI(), prefix + "NB_TrailMakingTestBItem_2");
				tdbConnection.addStatement(modelName, prefix + "NB_TrailMakingTestBItem_3_" + count, RDF.type.getURI(), prefix + "NB_TrailMakingTestBItem_3");
				
				if (!Constants.PHASE_ADNI3.equals(neuroBatteryBean.getPhase())) {
					tdbConnection.addStatement(modelName, prefix + "NB_AmericanNationalAdultReadingTestItem_1_" + count, prefix + "yesNoAnswer", prefix + neuroBatteryBean.getAnart_Nd());
					tdbConnection.addStatement(modelName, prefix + "NB_AmericanNationalAdultReadingTestItem_2_" + count, prefix + "yesNoAnswer", prefix + neuroBatteryBean.getAnart_Err());
				} else {
					//TODO in questo caso?
				}
				//TODO numeric score è corretto? Se si va inserito nell'ontologia
				tdbConnection.addStatement(modelName, prefix + "NB_ReyAuditoryVerbalLearningTestItem_1_" + count, prefix + "numeric_score", prefix + neuroBatteryBean.getAvdel30_Min());
				tdbConnection.addStatement(modelName, prefix + "NB_ReyAuditoryVerbalLearningTestItem_2_" + count, prefix + "numeric_score", prefix + neuroBatteryBean.getAvdel_Err1());
				tdbConnection.addStatement(modelName, prefix + "NB_ReyAuditoryVerbalLearningTestItem_3_" + count, prefix + "numeric_score", prefix + neuroBatteryBean.getAvdel_Err2());
				tdbConnection.addStatement(modelName, prefix + "NB_ReyAuditoryVerbalLearningTestItem_4_" + count, prefix + "numeric_score", prefix + neuroBatteryBean.getAvdel_Tot());
				tdbConnection.addStatement(modelName, prefix + "NB_ReyAuditoryVerbalLearningTestItem_5_" + count, prefix + "numeric_score", prefix + neuroBatteryBean.getAvended());
				tdbConnection.addStatement(modelName, prefix + "NB_ReyAuditoryVerbalLearningTestItem_6_" + count, prefix + "numeric_score", prefix + neuroBatteryBean.getAverr1());
				tdbConnection.addStatement(modelName, prefix + "NB_ReyAuditoryVerbalLearningTestItem_7_" + count, prefix + "numeric_score", prefix + neuroBatteryBean.getAverr2());
				tdbConnection.addStatement(modelName, prefix + "NB_ReyAuditoryVerbalLearningTestItem_8_" + count, prefix + "numeric_score", prefix + neuroBatteryBean.getAverr3());
				tdbConnection.addStatement(modelName, prefix + "NB_ReyAuditoryVerbalLearningTestItem_9_" + count, prefix + "numeric_score", prefix + neuroBatteryBean.getAverr4());
				tdbConnection.addStatement(modelName, prefix + "NB_ReyAuditoryVerbalLearningTestItem_10_" + count, prefix + "numeric_score", prefix + neuroBatteryBean.getAverr5());
				tdbConnection.addStatement(modelName, prefix + "NB_ReyAuditoryVerbalLearningTestItem_11_" + count, prefix + "numeric_score", prefix + neuroBatteryBean.getAverr6());
				tdbConnection.addStatement(modelName, prefix + "NB_ReyAuditoryVerbalLearningTestItem_12_" + count, prefix + "numeric_score", prefix + neuroBatteryBean.getAverrB());
				tdbConnection.addStatement(modelName, prefix + "NB_ReyAuditoryVerbalLearningTestItem_13_" + count, prefix + "numeric_score", prefix + neuroBatteryBean.getAvtot1());
				tdbConnection.addStatement(modelName, prefix + "NB_ReyAuditoryVerbalLearningTestItem_14_" + count, prefix + "numeric_score", prefix + neuroBatteryBean.getAvtot2());
				tdbConnection.addStatement(modelName, prefix + "NB_ReyAuditoryVerbalLearningTestItem_15_" + count, prefix + "numeric_score", prefix + neuroBatteryBean.getAvtot3());
				tdbConnection.addStatement(modelName, prefix + "NB_ReyAuditoryVerbalLearningTestItem_16_" + count, prefix + "numeric_score", prefix + neuroBatteryBean.getAvtot4());
				tdbConnection.addStatement(modelName, prefix + "NB_ReyAuditoryVerbalLearningTestItem_17_" + count, prefix + "numeric_score", prefix + neuroBatteryBean.getAvtot5());
				tdbConnection.addStatement(modelName, prefix + "NB_ReyAuditoryVerbalLearningTestItem_18_" + count, prefix + "numeric_score", prefix + neuroBatteryBean.getAvtot6());
				tdbConnection.addStatement(modelName, prefix + "NB_ReyAuditoryVerbalLearningTestItem_19_" + count, prefix + "numeric_score", prefix + neuroBatteryBean.getAvtotB());
				tdbConnection.addStatement(modelName, prefix + "NB_CategoryFluencyTestVegetablesItem_1_" + count, prefix + "numeric_score", prefix + neuroBatteryBean.getCatanimsc());
				tdbConnection.addStatement(modelName, prefix + "NB_CategoryFluencyTestVegetablesItem_2_" + count, prefix + "numeric_score", prefix + neuroBatteryBean.getCatanintr());
				tdbConnection.addStatement(modelName, prefix + "NB_CategoryFluencyTestVegetablesItem_3_" + count, prefix + "numeric_score", prefix + neuroBatteryBean.getCatanpers());
				tdbConnection.addStatement(modelName, prefix + "NB_ClockDrawingTestItem_1_" + count, prefix + "0_1_score", prefix + neuroBatteryBean.getClockcirc());
				tdbConnection.addStatement(modelName, prefix + "NB_ClockDrawingTestItem_2_" + count, prefix + "0_1_score", prefix + neuroBatteryBean.getClockhand());
				tdbConnection.addStatement(modelName, prefix + "NB_ClockDrawingTestItem_3_" + count, prefix + "0_1_score", prefix + neuroBatteryBean.getClocknum());
				tdbConnection.addStatement(modelName, prefix + "NB_ClockDrawingTestItem_4_" + count, prefix + "totalScore", prefix + neuroBatteryBean.getClockscor());
				tdbConnection.addStatement(modelName, prefix + "NB_ClockDrawingTestItem_5_" + count, prefix + "0_1_score", prefix + neuroBatteryBean.getClocksym());
				tdbConnection.addStatement(modelName, prefix + "NB_ClockDrawingTestItem_6_" + count, prefix + "0_1_score", prefix + neuroBatteryBean.getClocktime());
				tdbConnection.addStatement(modelName, prefix + "NB_ClockCopyingItem_1_" + count, prefix + "0_1_score", prefix + neuroBatteryBean.getCopycirc());
				tdbConnection.addStatement(modelName, prefix + "NB_ClockCopyingItem_2_" + count, prefix + "0_1_score", prefix + neuroBatteryBean.getCopyhand());
				tdbConnection.addStatement(modelName, prefix + "NB_ClockCopyingItem_3_" + count, prefix + "0_1_score", prefix + neuroBatteryBean.getCopynum());
				tdbConnection.addStatement(modelName, prefix + "NB_ClockCopyingItem_4_" + count, prefix + "totalScore", prefix + neuroBatteryBean.getCopyscor());
				tdbConnection.addStatement(modelName, prefix + "NB_ClockCopyingItem_5_" + count, prefix + "0_1_score", prefix + neuroBatteryBean.getCopysym());
				tdbConnection.addStatement(modelName, prefix + "NB_ClockCopyingItem_6_" + count, prefix + "0_1_score", prefix + neuroBatteryBean.getCopytime());
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
			count++;
			
			LoadCsv.loadPercent = ((LoadCsv.PERCENT_NEUROBAT*count)/total) + (LoadCsv.PERCENT_PRE+LoadCsv.PERCENT_CDR+LoadCsv.PERCENT_FAQ+LoadCsv.PERCENT_MMSE);
		}
		
		tdbConnection.close();
		TDBUtil.removeLock();
	}
}
