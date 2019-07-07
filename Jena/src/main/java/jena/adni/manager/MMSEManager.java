package jena.adni.manager;

import java.util.ArrayList;

import com.hp.hpl.jena.vocabulary.RDF;

import jena.adni.bean.CDRBean;
import jena.adni.bean.MMSEBean;
import jena.adni.constants.ADNIExternalResource;
import jena.adni.main.LoadCsv;
import jena.adni.util.TDBUtil;
import jena.test1.TDBConnection;

public class MMSEManager {


	public void insertInADNIOntology(ArrayList<MMSEBean> mmseTestList) {

		TDBConnection tdbConnection = new TDBConnection(ADNIExternalResource.getInstance().getADNI_HOME() + "\\ADNIONTOLOGYSOURCE\\TDBDatabase");

		int count = 0;

		int total = mmseTestList.size();

		String prefix = ADNIExternalResource.getPrefix();
		String modelName = ADNIExternalResource.getModelname();

		for (MMSEBean mmseBean : mmseTestList) {

			try {

				tdbConnection.addStatement(modelName, prefix + "MMSE_" + count, RDF.type.getURI(), prefix + "MMSE");
				tdbConnection.addStatement(modelName, prefix + mmseBean.getSubjectDataBean().getRID(), RDF.type.getURI(), prefix + "Subject");
				tdbConnection.addStatement(modelName, prefix + mmseBean.getSubjectDataBean().getRID(), RDF.type.getURI(), "http://www.w3.org/2002/07/owl#NamedIndividual");
				tdbConnection.addStatement(modelName, prefix + mmseBean.getSubjectDataBean().getRID(), prefix + "hasStandardizedAssesment", prefix + "MMSE_" + count);

				tdbConnection.addStatement(modelName, prefix + "MMSE_" + count, prefix + "hasAssesmentItem", prefix + "MMSE_AttentionAndCalculationItem_1_" + count);
				tdbConnection.addStatement(modelName, prefix + "MMSE_" + count, prefix + "hasAssesmentItem", prefix + "MMSE_AttentionAndCalculationItem_2_" + count);
				tdbConnection.addStatement(modelName, prefix + "MMSE_" + count, prefix + "hasAssesmentItem", prefix + "MMSE_AttentionAndCalculationItem_3_" + count);
				tdbConnection.addStatement(modelName, prefix + "MMSE_" + count, prefix + "hasAssesmentItem", prefix + "MMSE_AttentionAndCalculationItem_4_" + count);
				tdbConnection.addStatement(modelName, prefix + "MMSE_" + count, prefix + "hasAssesmentItem", prefix + "MMSE_AttentionAndCalculationItem_5_" + count);
				tdbConnection.addStatement(modelName, prefix + "MMSE_" + count, prefix + "hasAssesmentItem", prefix + "MMSE_LanguageItem_1_" + count);
				tdbConnection.addStatement(modelName, prefix + "MMSE_" + count, prefix + "hasAssesmentItem", prefix + "MMSE_LanguageItem_2_" + count);
				tdbConnection.addStatement(modelName, prefix + "MMSE_" + count, prefix + "hasAssesmentItem", prefix + "MMSE_LanguageItem_3_" + count);
				tdbConnection.addStatement(modelName, prefix + "MMSE_" + count, prefix + "hasAssesmentItem", prefix + "MMSE_LanguageItem_4_" + count);
				tdbConnection.addStatement(modelName, prefix + "MMSE_" + count, prefix + "hasAssesmentItem", prefix + "MMSE_LanguageItem_5_" + count);
				tdbConnection.addStatement(modelName, prefix + "MMSE_" + count, prefix + "hasAssesmentItem", prefix + "MMSE_LanguageItem_6_" + count);
				tdbConnection.addStatement(modelName, prefix + "MMSE_" + count, prefix + "hasAssesmentItem", prefix + "MMSE_LanguageItem_7_" + count);
				tdbConnection.addStatement(modelName, prefix + "MMSE_" + count, prefix + "hasAssesmentItem", prefix + "MMSE_LanguageItem_8_" + count);
				tdbConnection.addStatement(modelName, prefix + "MMSE_" + count, prefix + "hasAssesmentItem", prefix + "MMSE_LanguageItem_9_" + count);
				tdbConnection.addStatement(modelName, prefix + "MMSE_" + count, prefix + "hasAssesmentItem", prefix + "MMSE_OrientationItem_1_" + count);
				tdbConnection.addStatement(modelName, prefix + "MMSE_" + count, prefix + "hasAssesmentItem", prefix + "MMSE_OrientationItem_2_" + count);
				tdbConnection.addStatement(modelName, prefix + "MMSE_" + count, prefix + "hasAssesmentItem", prefix + "MMSE_OrientationItem_3_" + count);
				tdbConnection.addStatement(modelName, prefix + "MMSE_" + count, prefix + "hasAssesmentItem", prefix + "MMSE_OrientationItem_4_" + count);
				tdbConnection.addStatement(modelName, prefix + "MMSE_" + count, prefix + "hasAssesmentItem", prefix + "MMSE_OrientationItem_5_" + count);
				tdbConnection.addStatement(modelName, prefix + "MMSE_" + count, prefix + "hasAssesmentItem", prefix + "MMSE_OrientationItem_6_" + count);
				tdbConnection.addStatement(modelName, prefix + "MMSE_" + count, prefix + "hasAssesmentItem", prefix + "MMSE_OrientationItem_7_" + count);
				tdbConnection.addStatement(modelName, prefix + "MMSE_" + count, prefix + "hasAssesmentItem", prefix + "MMSE_OrientationItem_8_" + count);
				tdbConnection.addStatement(modelName, prefix + "MMSE_" + count, prefix + "hasAssesmentItem", prefix + "MMSE_OrientationItem_9_" + count);
				tdbConnection.addStatement(modelName, prefix + "MMSE_" + count, prefix + "hasAssesmentItem", prefix + "MMSE_OrientationItem_10_" + count);
				tdbConnection.addStatement(modelName, prefix + "MMSE_" + count, prefix + "hasAssesmentItem", prefix + "MMSE_RecallItem_1_" + count);
				tdbConnection.addStatement(modelName, prefix + "MMSE_" + count, prefix + "hasAssesmentItem", prefix + "MMSE_RecallItem_2_" + count);
				tdbConnection.addStatement(modelName, prefix + "MMSE_" + count, prefix + "hasAssesmentItem", prefix + "MMSE_RecallItem_3_" + count);
				tdbConnection.addStatement(modelName, prefix + "MMSE_" + count, prefix + "hasAssesmentItem", prefix + "MMSE_RegistrationItem_1_" + count);
				tdbConnection.addStatement(modelName, prefix + "MMSE_" + count, prefix + "hasAssesmentItem", prefix + "MMSE_RegistrationItem_2_" + count);
				tdbConnection.addStatement(modelName, prefix + "MMSE_" + count, prefix + "hasAssesmentItem", prefix + "MMSE_RegistrationItem_3_" + count);
				tdbConnection.addStatement(modelName, prefix + "MMSE_" + count, prefix + "hasAssesmentItem", prefix + "MMSE_RegistrationItem_4_" + count);
				
				tdbConnection.addStatement(modelName, prefix + "MMSE_AttentionAndCalculationItem_1_" + count, RDF.type.getURI(), prefix + "MMSE_AttentionAndCalculationItem_1");
				tdbConnection.addStatement(modelName, prefix + "MMSE_AttentionAndCalculationItem_2_" + count, RDF.type.getURI(), prefix + "MMSE_AttentionAndCalculationItem_2");
				tdbConnection.addStatement(modelName, prefix + "MMSE_AttentionAndCalculationItem_3_" + count, RDF.type.getURI(), prefix + "MMSE_AttentionAndCalculationItem_3");
				tdbConnection.addStatement(modelName, prefix + "MMSE_AttentionAndCalculationItem_4_" + count, RDF.type.getURI(), prefix + "MMSE_AttentionAndCalculationItem_4");
				tdbConnection.addStatement(modelName, prefix + "MMSE_AttentionAndCalculationItem_5_" + count, RDF.type.getURI(), prefix + "MMSE_AttentionAndCalculationItem_5");
				tdbConnection.addStatement(modelName, prefix + "MMSE_LanguageItem_1_" + count, RDF.type.getURI(), prefix + "MMSE_LanguageItem_1");
				tdbConnection.addStatement(modelName, prefix + "MMSE_LanguageItem_2_" + count, RDF.type.getURI(), prefix + "MMSE_LanguageItem_2");
				tdbConnection.addStatement(modelName, prefix + "MMSE_LanguageItem_3_" + count, RDF.type.getURI(), prefix + "MMSE_LanguageItem_3");
				tdbConnection.addStatement(modelName, prefix + "MMSE_LanguageItem_4_" + count, RDF.type.getURI(), prefix + "MMSE_LanguageItem_4");
				tdbConnection.addStatement(modelName, prefix + "MMSE_LanguageItem_5_" + count, RDF.type.getURI(), prefix + "MMSE_LanguageItem_5");
				tdbConnection.addStatement(modelName, prefix + "MMSE_LanguageItem_6_" + count, RDF.type.getURI(), prefix + "MMSE_LanguageItem_6");
				tdbConnection.addStatement(modelName, prefix + "MMSE_LanguageItem_7_" + count, RDF.type.getURI(), prefix + "MMSE_LanguageItem_7");
				tdbConnection.addStatement(modelName, prefix + "MMSE_LanguageItem_8_" + count, RDF.type.getURI(), prefix + "MMSE_LanguageItem_8");
				tdbConnection.addStatement(modelName, prefix + "MMSE_LanguageItem_9_" + count, RDF.type.getURI(), prefix + "MMSE_LanguageItem_9");
				tdbConnection.addStatement(modelName, prefix + "MMSE_OrientationItem_1_" + count, RDF.type.getURI(), prefix + "MMSE_OrientationItem_1");
				tdbConnection.addStatement(modelName, prefix + "MMSE_OrientationItem_2_" + count, RDF.type.getURI(), prefix + "MMSE_OrientationItem_2");
				tdbConnection.addStatement(modelName, prefix + "MMSE_OrientationItem_3_" + count, RDF.type.getURI(), prefix + "MMSE_OrientationItem_3");
				tdbConnection.addStatement(modelName, prefix + "MMSE_OrientationItem_4_" + count, RDF.type.getURI(), prefix + "MMSE_OrientationItem_4");
				tdbConnection.addStatement(modelName, prefix + "MMSE_OrientationItem_5_" + count, RDF.type.getURI(), prefix + "MMSE_OrientationItem_5");
				tdbConnection.addStatement(modelName, prefix + "MMSE_OrientationItem_6_" + count, RDF.type.getURI(), prefix + "MMSE_OrientationItem_6");
				tdbConnection.addStatement(modelName, prefix + "MMSE_OrientationItem_7_" + count, RDF.type.getURI(), prefix + "MMSE_OrientationItem_7");
				tdbConnection.addStatement(modelName, prefix + "MMSE_OrientationItem_8_" + count, RDF.type.getURI(), prefix + "MMSE_OrientationItem_8");
				tdbConnection.addStatement(modelName, prefix + "MMSE_OrientationItem_9_" + count, RDF.type.getURI(), prefix + "MMSE_OrientationItem_9");
				tdbConnection.addStatement(modelName, prefix + "MMSE_OrientationItem_10_" + count, RDF.type.getURI(), prefix + "MMSE_OrientationItem_10");
				tdbConnection.addStatement(modelName, prefix + "MMSE_RecallItem_1_" + count, RDF.type.getURI(), prefix + "MMSE_RecallItem_1");
				tdbConnection.addStatement(modelName, prefix + "MMSE_RecallItem_2_" + count, RDF.type.getURI(), prefix + "MMSE_RecallItem_2");
				tdbConnection.addStatement(modelName, prefix + "MMSE_RecallItem_3_" + count, RDF.type.getURI(), prefix + "MMSE_RecallItem_3");
				tdbConnection.addStatement(modelName, prefix + "MMSE_RegistrationItem_1_" + count, RDF.type.getURI(), prefix + "MMSE_RecallItem_3");
				tdbConnection.addStatement(modelName, prefix + "MMSE_RegistrationItem_2_" + count, RDF.type.getURI(), prefix + "MMSE_RecallItem_3");
				tdbConnection.addStatement(modelName, prefix + "MMSE_RegistrationItem_3_" + count, RDF.type.getURI(), prefix + "MMSE_RecallItem_3");
				tdbConnection.addStatement(modelName, prefix + "MMSE_RegistrationItem_4_" + count, RDF.type.getURI(), prefix + "MMSE_RecallItem_3");
				
				//Mi calcolo i valori correct incorrect per le risposte verbose di ADNI3?
				if ("ADNI1".equals(mmseBean.getPhase()) || "ADNIGO".equals(mmseBean.getPhase()) || "ADNI2".equals(mmseBean.getPhase())) {
					
					tdbConnection.addStatement(modelName, prefix + "MMSE_AttentionAndCalculationItem_1_" + count, prefix + "verbatimAnswer", prefix + mmseBean.getBackward_Spelling_Letter_D_V());
					tdbConnection.addStatement(modelName, prefix + "MMSE_AttentionAndCalculationItem_2_" + count, prefix + "verbatimAnswer", prefix + mmseBean.getBackward_Spelling_Letter_L_V());
					tdbConnection.addStatement(modelName, prefix + "MMSE_AttentionAndCalculationItem_3_" + count, prefix + "verbatimAnswer", prefix + mmseBean.getBackward_Spelling_Letter_R_V());
					tdbConnection.addStatement(modelName, prefix + "MMSE_AttentionAndCalculationItem_4_" + count, prefix + "verbatimAnswer", prefix + mmseBean.getBackward_Spelling_Letter_O_V());
					tdbConnection.addStatement(modelName, prefix + "MMSE_AttentionAndCalculationItem_5_" + count, prefix + "verbatimAnswer", prefix + mmseBean.getBackward_Spelling_Letter_W_V());
				} else {
					
					tdbConnection.addStatement(modelName, prefix + "MMSE_AttentionAndCalculationItem_1_" + count, prefix + "verbatimAnswer", prefix + mmseBean.getBackward_Spelling_Letter_1());
					tdbConnection.addStatement(modelName, prefix + "MMSE_AttentionAndCalculationItem_2_" + count, prefix + "verbatimAnswer", prefix + mmseBean.getBackward_Spelling_Letter_2());
					tdbConnection.addStatement(modelName, prefix + "MMSE_AttentionAndCalculationItem_3_" + count, prefix + "verbatimAnswer", prefix + mmseBean.getBackward_Spelling_Letter_3());
					tdbConnection.addStatement(modelName, prefix + "MMSE_AttentionAndCalculationItem_4_" + count, prefix + "verbatimAnswer", prefix + mmseBean.getBackward_Spelling_Letter_4());
					tdbConnection.addStatement(modelName, prefix + "MMSE_AttentionAndCalculationItem_5_" + count, prefix + "verbatimAnswer", prefix + mmseBean.getBackward_Spelling_Letter_5());
				}
				//Converto con 0 e 1 score?
				tdbConnection.addStatement(modelName, prefix + "MMSE_LanguageItem_1_" + count, prefix + "0_1_score", prefix + convert01Score(mmseBean.getMm_Watch()));
				tdbConnection.addStatement(modelName, prefix + "MMSE_LanguageItem_2_" + count, prefix + "0_1_score", prefix + convert01Score(mmseBean.getMm_Pencil()));
				tdbConnection.addStatement(modelName, prefix + "MMSE_LanguageItem_3_" + count, prefix + "0_1_score", prefix + convert01Score(mmseBean.getMm_Repeat()));
				if ("ADNI1".equals(mmseBean.getPhase()) || "ADNIGO".equals(mmseBean.getPhase()) || "ADNI2".equals(mmseBean.getPhase())) {
					tdbConnection.addStatement(modelName, prefix + "MMSE_LanguageItem_4_" + count, prefix + "0_1_score", prefix + convert01Score(mmseBean.getMm_Hand()));
					tdbConnection.addStatement(modelName, prefix + "MMSE_LanguageItem_5_" + count, prefix + "0_1_score", prefix + convert01Score(mmseBean.getMm_Fold()));
				} else {
					//In questo caso cosa metto?
				}
				//Converto con 0 e 1 score?
				tdbConnection.addStatement(modelName, prefix + "MMSE_LanguageItem_6_" + count, prefix + "0_1_score", prefix + convert01Score(mmseBean.getMm_Floor()));
				tdbConnection.addStatement(modelName, prefix + "MMSE_LanguageItem_7_" + count, prefix + "0_1_score", prefix + convert01Score(mmseBean.getMm_Read()));//E' corretto?
				tdbConnection.addStatement(modelName, prefix + "MMSE_LanguageItem_8_" + count, prefix + "0_1_score", prefix + convert01Score(mmseBean.getMm_Write()));//E' corretto?
				tdbConnection.addStatement(modelName, prefix + "MMSE_LanguageItem_9_" + count, prefix + "0_1_score", prefix + convert01Score(mmseBean.getClock_Drawing()));//E' corretto?
				//Per gli orientation item non ho messo le risposte verbose
				//Converto con 0 e 1 score?
				tdbConnection.addStatement(modelName, prefix + "MMSE_OrientationItem_1_" + count, prefix + "0_1_score", prefix + convert01Score(mmseBean.getMm_Date()));
				tdbConnection.addStatement(modelName, prefix + "MMSE_OrientationItem_2_" + count, prefix + "0_1_score", prefix + convert01Score(mmseBean.getMm_Year()));
				tdbConnection.addStatement(modelName, prefix + "MMSE_OrientationItem_3_" + count, prefix + "0_1_score", prefix + convert01Score(mmseBean.getMm_Month()));
				tdbConnection.addStatement(modelName, prefix + "MMSE_OrientationItem_4_" + count, prefix + "0_1_score", prefix + convert01Score(mmseBean.getMm_Day()));
				tdbConnection.addStatement(modelName, prefix + "MMSE_OrientationItem_5_" + count, prefix + "0_1_score", prefix +convert01Score( mmseBean.getMm_Season()));
				if ("ADNI1".equals(mmseBean.getPhase()) || "ADNIGO".equals(mmseBean.getPhase()) || "ADNI2".equals(mmseBean.getPhase())) {
					tdbConnection.addStatement(modelName, prefix + "MMSE_OrientationItem_6_" + count, prefix + "0_1_score", prefix + convert01Score(mmseBean.getMm_Hospit()));
					tdbConnection.addStatement(modelName, prefix + "MMSE_OrientationItem_7_" + count, prefix + "0_1_score", prefix + convert01Score(mmseBean.getMm_Floor()));
				} else {
					//In questo caso cosa metto?
				}
				tdbConnection.addStatement(modelName, prefix + "MMSE_OrientationItem_8_" + count, prefix + "0_1_score", prefix + convert01Score(mmseBean.getMm_City()));
				tdbConnection.addStatement(modelName, prefix + "MMSE_OrientationItem_9_" + count, prefix + "0_1_score", prefix + convert01Score(mmseBean.getMm_Area()));
				tdbConnection.addStatement(modelName, prefix + "MMSE_OrientationItem_10_" + count, prefix + "0_1_score", prefix +convert01Score( mmseBean.getMm_State()));
				if ("ADNI1".equals(mmseBean.getPhase()) || "ADNIGO".equals(mmseBean.getPhase()) || "ADNI2".equals(mmseBean.getPhase())) {
					tdbConnection.addStatement(modelName, prefix + "MMSE_RecallItem_1_" + count, prefix + "0_1_score", prefix + convert01Score(mmseBean.getMm_Ball()));
					tdbConnection.addStatement(modelName, prefix + "MMSE_RecallItem_2_" + count, prefix + "0_1_score", prefix + convert01Score(mmseBean.getMm_Flag()));
					tdbConnection.addStatement(modelName, prefix + "MMSE_RecallItem_3_" + count, prefix + "0_1_score", prefix + convert01Score(mmseBean.getMm_Tree()));
				} else {
					tdbConnection.addStatement(modelName, prefix + "MMSE_RecallItem_1_" + count, prefix + "0_1_score", prefix + convert01Score(mmseBean.getWord1()));
					tdbConnection.addStatement(modelName, prefix + "MMSE_RecallItem_2_" + count, prefix + "0_1_score", prefix + convert01Score(mmseBean.getWord2()));
					tdbConnection.addStatement(modelName, prefix + "MMSE_RecallItem_3_" + count, prefix + "0_1_score", prefix + convert01Score(mmseBean.getWord3()));
				}
				//Cosa metto in questi item?
				tdbConnection.addStatement(modelName, prefix + "MMSE_RegistrationItem_1_" + count, prefix + "0_1_score", prefix + convert01Score(mmseBean.getMm_Floor()));
			} catch (Exception e) {

				e.printStackTrace();
			}

			count++;

			LoadCsv.loadPercent = ((40*count)/total) + 20;
		}

		tdbConnection.close();
		TDBUtil.removeLock();
	}

	private String convert01Score(String value) {
		if ("2".equals(value)) {
			value = "0";
		} 
		return value;
	}
}
