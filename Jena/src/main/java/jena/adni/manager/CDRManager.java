package jena.adni.manager;

import java.io.File;
import java.util.ArrayList;

import com.hp.hpl.jena.vocabulary.RDF;

import jena.adni.bean.CDRBean;
import jena.adni.constants.ADNIExternalResource;
import jena.adni.main.LoadCsv;
import jena.adni.util.TDBUtil;
import jena.test1.TDBConnection;

public class CDRManager {


	public void insertInADNIOntology(CDRBean cdrBean,int count) {

		TDBConnection tdbConnection = new TDBConnection(ADNIExternalResource.getInstance().getADNI_HOME() + File.separator + "ADNIONTOLOGYSOURCE" + File.separator + "TDBDatabase");

		String prefix = ADNIExternalResource.getPrefix();
		String modelName = ADNIExternalResource.getModelname();

		try {

			tdbConnection.addStatement(modelName, prefix + "CDR_" + count, RDF.type.getURI(), prefix + "CDR");
			tdbConnection.addStatement(modelName, prefix + cdrBean.getSubjectDataBean().getRID(), RDF.type.getURI(), prefix + "Subject");
			tdbConnection.addStatement(modelName, prefix + cdrBean.getSubjectDataBean().getRID(), RDF.type.getURI(), "http://www.w3.org/2002/07/owl#NamedIndividual");
			tdbConnection.addStatement(modelName, prefix + cdrBean.getSubjectDataBean().getRID(), prefix + "hasStandardizedAssesment", prefix + "CDR_" + count);

			tdbConnection.addStatement(modelName, prefix + "CDR_" + count, prefix + "hasAssesmentItem", prefix + "CDR_CommunityAffairsItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "CDR_" + count, prefix + "hasAssesmentItem", prefix + "CDR_HomeAndHobbiesItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "CDR_" + count, prefix + "hasAssesmentItem", prefix + "CDR_JudgementAndProblemSolvingItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "CDR_" + count, prefix + "hasAssesmentItem", prefix + "CDR_OrientationItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "CDR_" + count, prefix + "hasAssesmentItem", prefix + "CDR_MemoryItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "CDR_" + count, prefix + "hasAssesmentItem", prefix + "CDR_Sob_" + count);
			tdbConnection.addStatement(modelName, prefix + "CDR_" + count, prefix + "hasAssesmentItem", prefix + "CDR_Global_" + count);

			tdbConnection.addStatement(modelName, prefix + "CDR_CommunityAffairsItem_" + count, RDF.type.getURI(), prefix + "CDR_CommunityAffairsItem");
			tdbConnection.addStatement(modelName, prefix + "CDR_HomeAndHobbiesItem_" + count, RDF.type.getURI(), prefix + "CDR_HomeAndHobbiesItem");
			tdbConnection.addStatement(modelName, prefix + "CDR_JudgementAndProblemSolvingItem_" + count, RDF.type.getURI(), prefix + "CDR_JudgementAndProblemSolvingItem");
			tdbConnection.addStatement(modelName, prefix + "CDR_OrientationItem_" + count, RDF.type.getURI(), prefix + "CDR_OrientationItem");
			tdbConnection.addStatement(modelName, prefix + "CDR_MemoryItem_" + count, RDF.type.getURI(), prefix + "CDR_MemoryItem");
			tdbConnection.addStatement(modelName, prefix + "CDR_Sob_" + count, RDF.type.getURI(), prefix + "CDR_Sob");
			tdbConnection.addStatement(modelName, prefix + "CDR_Global_" + count, RDF.type.getURI(), prefix + "CDR_Global");

			tdbConnection.addStatement(modelName, prefix + "CDR_CommunityAffairsItem_" + count, prefix + "0_05_1_2_3_score", prefix + cdrBean.getCDCommunityAffair());
			tdbConnection.addStatement(modelName, prefix + "CDR_HomeAndHobbiesItem_" + count, prefix + "0_05_1_2_3_score", prefix + cdrBean.getCDHome());
			tdbConnection.addStatement(modelName, prefix + "CDR_JudgementAndProblemSolvingItem_" + count, prefix + "0_05_1_2_3_score", prefix + cdrBean.getCDJudge());
			tdbConnection.addStatement(modelName, prefix + "CDR_OrientationItem_" + count, prefix + "0_05_1_2_3_score", prefix + cdrBean.getCDOrient());
			tdbConnection.addStatement(modelName, prefix + "CDR_MemoryItem_" + count, prefix + "0_05_1_2_3_score", prefix + cdrBean.getCDMemory());
			tdbConnection.addStatement(modelName, prefix + "CDR_Sob_" + count, prefix + "totalScore", prefix + cdrBean.getCDSob());
			tdbConnection.addStatement(modelName, prefix + "CDR_Global_" + count, prefix + "0_05_1_2_3_score", prefix + cdrBean.getCDGlobal());
		} catch (Exception e) {

			e.printStackTrace();
		}

		tdbConnection.close();
		TDBUtil.removeLock();
	}
}
