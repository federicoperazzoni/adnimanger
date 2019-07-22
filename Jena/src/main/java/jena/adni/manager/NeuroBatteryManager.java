package jena.adni.manager;

import java.util.ArrayList;

import com.hp.hpl.jena.vocabulary.RDF;

import jena.adni.bean.CDRBean;
import jena.adni.bean.NeuroBatteryBean;
import jena.adni.constants.ADNIExternalResource;
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
//				tdbConnection.addStatement(modelName, prefix + cdrBean.getSubjectDataBean().getRID(), RDF.type.getURI(), prefix + "Subject");
//				tdbConnection.addStatement(modelName, prefix + cdrBean.getSubjectDataBean().getRID(), RDF.type.getURI(), "http://www.w3.org/2002/07/owl#NamedIndividual");
//				tdbConnection.addStatement(modelName, prefix + cdrBean.getSubjectDataBean().getRID(), prefix + "hasStandardizedAssesment", prefix + "CDR_" + count);
//							
//				tdbConnection.addStatement(modelName, prefix + "CDR_" + count, prefix + "hasAssesmentItem", prefix + "CDR_CommunityAffairsItem_" + count);
//				tdbConnection.addStatement(modelName, prefix + "CDR_" + count, prefix + "hasAssesmentItem", prefix + "CDR_HomeAndHobbiesItem_" + count);
//				tdbConnection.addStatement(modelName, prefix + "CDR_" + count, prefix + "hasAssesmentItem", prefix + "CDR_JudgementAndProblemSolvingItem_" + count);
//				tdbConnection.addStatement(modelName, prefix + "CDR_" + count, prefix + "hasAssesmentItem", prefix + "CDR_OrientationItem_" + count);
//				tdbConnection.addStatement(modelName, prefix + "CDR_" + count, prefix + "hasAssesmentItem", prefix + "CDR_MemoryItem_" + count);
//				tdbConnection.addStatement(modelName, prefix + "CDR_" + count, prefix + "hasAssesmentItem", prefix + "CDR_Sob_" + count);
//				tdbConnection.addStatement(modelName, prefix + "CDR_" + count, prefix + "hasAssesmentItem", prefix + "CDR_Global_" + count);
//				
//				tdbConnection.addStatement(modelName, prefix + "CDR_CommunityAffairsItem_" + count, RDF.type.getURI(), prefix + "CDR_CommunityAffairsItem");
//				tdbConnection.addStatement(modelName, prefix + "CDR_HomeAndHobbiesItem_" + count, RDF.type.getURI(), prefix + "CDR_HomeAndHobbiesItem");
//				tdbConnection.addStatement(modelName, prefix + "CDR_JudgementAndProblemSolvingItem_" + count, RDF.type.getURI(), prefix + "CDR_JudgementAndProblemSolvingItem");
//				tdbConnection.addStatement(modelName, prefix + "CDR_OrientationItem_" + count, RDF.type.getURI(), prefix + "CDR_OrientationItem");
//				tdbConnection.addStatement(modelName, prefix + "CDR_MemoryItem_" + count, RDF.type.getURI(), prefix + "CDR_MemoryItem");
//				tdbConnection.addStatement(modelName, prefix + "CDR_Sob_" + count, RDF.type.getURI(), prefix + "CDR_Sob");
//				tdbConnection.addStatement(modelName, prefix + "CDR_Global_" + count, RDF.type.getURI(), prefix + "CDR_Global");
//				
//				tdbConnection.addStatement(modelName, prefix + "CDR_CommunityAffairsItem_" + count, prefix + "0_05_1_2_3_score", prefix + cdrBean.getCDCommunityAffair());
//				tdbConnection.addStatement(modelName, prefix + "CDR_HomeAndHobbiesItem_" + count, prefix + "0_05_1_2_3_score", prefix + cdrBean.getCDHome());
//				tdbConnection.addStatement(modelName, prefix + "CDR_JudgementAndProblemSolvingItem_" + count, prefix + "0_05_1_2_3_score", prefix + cdrBean.getCDJudge());
//				tdbConnection.addStatement(modelName, prefix + "CDR_OrientationItem_" + count, prefix + "0_05_1_2_3_score", prefix + cdrBean.getCDOrient());
//				tdbConnection.addStatement(modelName, prefix + "CDR_MemoryItem_" + count, prefix + "0_05_1_2_3_score", prefix + cdrBean.getCDMemory());
//				tdbConnection.addStatement(modelName, prefix + "CDR_Sob_" + count, prefix + "totalScore", prefix + cdrBean.getCDSob());
//				tdbConnection.addStatement(modelName, prefix + "CDR_Global_" + count, prefix + "0_05_1_2_3_score", prefix + cdrBean.getCDGlobal());
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