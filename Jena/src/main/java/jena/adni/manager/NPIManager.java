package jena.adni.manager;

import java.util.ArrayList;

import com.hp.hpl.jena.vocabulary.RDF;

import jena.adni.bean.CDRBean;
import jena.adni.bean.NPIBean;
import jena.adni.constants.ADNIExternalResource;
import jena.adni.main.LoadCsv;
import jena.adni.util.TDBUtil;
import jena.test1.TDBConnection;

public class NPIManager {


	public void insertInADNIOntology(NPIBean npiBean, int count) {

		TDBConnection tdbConnection = new TDBConnection(ADNIExternalResource.getInstance().getADNI_HOME() + "\\ADNIONTOLOGYSOURCE\\TDBDatabase");

		String prefix = ADNIExternalResource.getPrefix();
		String modelName = ADNIExternalResource.getModelname();

		try {

			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, RDF.type.getURI(), prefix + "NPI");
			tdbConnection.addStatement(modelName, prefix + npiBean.getSubjectDataBean().getRID(), RDF.type.getURI(), prefix + "Subject");
			tdbConnection.addStatement(modelName, prefix + npiBean.getSubjectDataBean().getRID(), RDF.type.getURI(), "http://www.w3.org/2002/07/owl#NamedIndividual");
			tdbConnection.addStatement(modelName, prefix + npiBean.getSubjectDataBean().getRID(), prefix + "hasStandardizedAssesment", prefix + "NPI_" + count);
			
			//Delusion
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_DelusionsQuestionItem_1_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_DelusionsQuestionItem_2_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_DelusionsQuestionItem_3_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_DelusionsQuestionItem_4_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_DelusionsQuestionItem_5_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_DelusionsQuestionItem_6_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_DelusionsQuestionItem_7_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_DelusionsQuestionItem_8_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_DelusionsQuestionItem_9_" + count);
			//Hallucinations
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_HallucinationsQuestionItem_1_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_HallucinationsQuestionItem_2_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_HallucinationsQuestionItem_3_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_HallucinationsQuestionItem_4_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_HallucinationsQuestionItem_5_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_HallucinationsQuestionItem_6_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_HallucinationsQuestionItem_7_" + count);
			//Agitation/Aggression
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_AgitationAggressionQuestionItem_1_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_AgitationAggressionQuestionItem_2_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_AgitationAggressionQuestionItem_3_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_AgitationAggressionQuestionItem_4_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_AgitationAggressionQuestionItem_5_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_AgitationAggressionQuestionItem_6_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_AgitationAggressionQuestionItem_7_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_AgitationAggressionQuestionItem_8_" + count);
			//Depression/Dysphoria
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_DepressionDysphoriaQuestionItem_1_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_DepressionDysphoriaQuestionItem_2_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_DepressionDysphoriaQuestionItem_3_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_DepressionDysphoriaQuestionItem_4_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_DepressionDysphoriaQuestionItem_5_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_DepressionDysphoriaQuestionItem_6_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_DepressionDysphoriaQuestionItem_7_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_DepressionDysphoriaQuestionItem_8_" + count);
			//Anxiety
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_AnxietyQuestionItem_1_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_AnxietyQuestionItem_2_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_AnxietyQuestionItem_3_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_AnxietyQuestionItem_4_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_AnxietyQuestionItem_5_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_AnxietyQuestionItem_6_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_AnxietyQuestionItem_7_" + count);
			//Elation/Euphoria
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_ElationEuphoriaQuestionItem_1_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_ElationEuphoriaQuestionItem_2_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_ElationEuphoriaQuestionItem_3_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_ElationEuphoriaQuestionItem_4_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_ElationEuphoriaQuestionItem_5_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_ElationEuphoriaQuestionItem_6_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_ElationEuphoriaQuestionItem_7_" + count);
			
			//Delusion type
			tdbConnection.addStatement(modelName, prefix + "NPI_DelusionsQuestionItem_1_" + count, RDF.type.getURI(), prefix + "NPI_DelusionsQuestionItem_1");
			tdbConnection.addStatement(modelName, prefix + "NPI_DelusionsQuestionItem_2_" + count, RDF.type.getURI(), prefix + "NPI_DelusionsQuestionItem_2");
			tdbConnection.addStatement(modelName, prefix + "NPI_DelusionsQuestionItem_3_" + count, RDF.type.getURI(), prefix + "NPI_DelusionsQuestionItem_3");
			tdbConnection.addStatement(modelName, prefix + "NPI_DelusionsQuestionItem_4_" + count, RDF.type.getURI(), prefix + "NPI_DelusionsQuestionItem_4");
			tdbConnection.addStatement(modelName, prefix + "NPI_DelusionsQuestionItem_5_" + count, RDF.type.getURI(), prefix + "NPI_DelusionsQuestionItem_5");
			tdbConnection.addStatement(modelName, prefix + "NPI_DelusionsQuestionItem_6_" + count, RDF.type.getURI(), prefix + "NPI_DelusionsQuestionItem_6");
			tdbConnection.addStatement(modelName, prefix + "NPI_DelusionsQuestionItem_7_" + count, RDF.type.getURI(), prefix + "NPI_DelusionsQuestionItem_7");
			tdbConnection.addStatement(modelName, prefix + "NPI_DelusionsQuestionItem_8_" + count, RDF.type.getURI(), prefix + "NPI_DelusionsQuestionItem_8");
			tdbConnection.addStatement(modelName, prefix + "NPI_DelusionsQuestionItem_9_" + count, RDF.type.getURI(), prefix + "NPI_DelusionsQuestionItem_9");
			//Hallucinations type
			tdbConnection.addStatement(modelName, prefix + "NPI_HallucinationsQuestionItem_1_" + count, RDF.type.getURI(), prefix + "NPI_HallucinationsQuestionItem_1");
			tdbConnection.addStatement(modelName, prefix + "NPI_HallucinationsQuestionItem_2_" + count, RDF.type.getURI(), prefix + "NPI_HallucinationsQuestionItem_2");
			tdbConnection.addStatement(modelName, prefix + "NPI_HallucinationsQuestionItem_3_" + count, RDF.type.getURI(), prefix + "NPI_HallucinationsQuestionItem_3");
			tdbConnection.addStatement(modelName, prefix + "NPI_HallucinationsQuestionItem_4_" + count, RDF.type.getURI(), prefix + "NPI_HallucinationsQuestionItem_4");
			tdbConnection.addStatement(modelName, prefix + "NPI_HallucinationsQuestionItem_5_" + count, RDF.type.getURI(), prefix + "NPI_HallucinationsQuestionItem_5");
			tdbConnection.addStatement(modelName, prefix + "NPI_HallucinationsQuestionItem_6_" + count, RDF.type.getURI(), prefix + "NPI_HallucinationsQuestionItem_6");
			tdbConnection.addStatement(modelName, prefix + "NPI_HallucinationsQuestionItem_7_" + count, RDF.type.getURI(), prefix + "NPI_HallucinationsQuestionItem_7");
			//Agitation/Aggression type
			tdbConnection.addStatement(modelName, prefix + "NPI_AgitationAggressionQuestionItem_1_" + count, RDF.type.getURI(), prefix + "NPI_AgitationAggressionQuestionItem_1");
			tdbConnection.addStatement(modelName, prefix + "NPI_AgitationAggressionQuestionItem_2_" + count, RDF.type.getURI(), prefix + "NPI_AgitationAggressionQuestionItem_2");
			tdbConnection.addStatement(modelName, prefix + "NPI_AgitationAggressionQuestionItem_3_" + count, RDF.type.getURI(), prefix + "NPI_AgitationAggressionQuestionItem_3");
			tdbConnection.addStatement(modelName, prefix + "NPI_AgitationAggressionQuestionItem_4_" + count, RDF.type.getURI(), prefix + "NPI_AgitationAggressionQuestionItem_4");
			tdbConnection.addStatement(modelName, prefix + "NPI_AgitationAggressionQuestionItem_5_" + count, RDF.type.getURI(), prefix + "NPI_AgitationAggressionQuestionItem_5");
			tdbConnection.addStatement(modelName, prefix + "NPI_AgitationAggressionQuestionItem_6_" + count, RDF.type.getURI(), prefix + "NPI_AgitationAggressionQuestionItem_6");
			tdbConnection.addStatement(modelName, prefix + "NPI_AgitationAggressionQuestionItem_7_" + count, RDF.type.getURI(), prefix + "NPI_AgitationAggressionQuestionItem_7");
			tdbConnection.addStatement(modelName, prefix + "NPI_AgitationAggressionQuestionItem_8_" + count, RDF.type.getURI(), prefix + "NPI_AgitationAggressionQuestionItem_8");
			//Depression/Dysphoria type
			tdbConnection.addStatement(modelName, prefix + "NPI_DepressionDysphoriaQuestionItem_1_" + count, RDF.type.getURI(), prefix + "NPI_DepressionDysphoriaQuestionItem_1");
			tdbConnection.addStatement(modelName, prefix + "NPI_DepressionDysphoriaQuestionItem_2_" + count, RDF.type.getURI(), prefix + "NPI_DepressionDysphoriaQuestionItem_2");
			tdbConnection.addStatement(modelName, prefix + "NPI_DepressionDysphoriaQuestionItem_3_" + count, RDF.type.getURI(), prefix + "NPI_DepressionDysphoriaQuestionItem_3");
			tdbConnection.addStatement(modelName, prefix + "NPI_DepressionDysphoriaQuestionItem_4_" + count, RDF.type.getURI(), prefix + "NPI_DepressionDysphoriaQuestionItem_4");
			tdbConnection.addStatement(modelName, prefix + "NPI_DepressionDysphoriaQuestionItem_5_" + count, RDF.type.getURI(), prefix + "NPI_DepressionDysphoriaQuestionItem_5");
			tdbConnection.addStatement(modelName, prefix + "NPI_DepressionDysphoriaQuestionItem_6_" + count, RDF.type.getURI(), prefix + "NPI_DepressionDysphoriaQuestionItem_6");
			tdbConnection.addStatement(modelName, prefix + "NPI_DepressionDysphoriaQuestionItem_7_" + count, RDF.type.getURI(), prefix + "NPI_DepressionDysphoriaQuestionItem_7");
			tdbConnection.addStatement(modelName, prefix + "NPI_DepressionDysphoriaQuestionItem_8_" + count, RDF.type.getURI(), prefix + "NPI_DepressionDysphoriaQuestionItem_8");
			//Anxiety type
			tdbConnection.addStatement(modelName, prefix + "NPI_AnxietyQuestionItem_1_" + count, RDF.type.getURI(), prefix + "NPI_AnxietyQuestionItem_1");
			tdbConnection.addStatement(modelName, prefix + "NPI_AnxietyQuestionItem_2_" + count, RDF.type.getURI(), prefix + "NPI_AnxietyQuestionItem_2");
			tdbConnection.addStatement(modelName, prefix + "NPI_AnxietyQuestionItem_3_" + count, RDF.type.getURI(), prefix + "NPI_AnxietyQuestionItem_3");
			tdbConnection.addStatement(modelName, prefix + "NPI_AnxietyQuestionItem_4_" + count, RDF.type.getURI(), prefix + "NPI_AnxietyQuestionItem_4");
			tdbConnection.addStatement(modelName, prefix + "NPI_AnxietyQuestionItem_5_" + count, RDF.type.getURI(), prefix + "NPI_AnxietyQuestionItem_5");
			tdbConnection.addStatement(modelName, prefix + "NPI_AnxietyQuestionItem_6_" + count, RDF.type.getURI(), prefix + "NPI_AnxietyQuestionItem_6");
			tdbConnection.addStatement(modelName, prefix + "NPI_AnxietyQuestionItem_7_" + count, RDF.type.getURI(), prefix + "NPI_AnxietyQuestionItem_7");
			//Elation/Euphoria type
			tdbConnection.addStatement(modelName, prefix + "NPI_ElationEuphoriaQuestionItem_1_" + count, RDF.type.getURI(), prefix + "NPI_ElationEuphoriaQuestionItem_1");
			tdbConnection.addStatement(modelName, prefix + "NPI_ElationEuphoriaQuestionItem_2_" + count, RDF.type.getURI(), prefix + "NPI_ElationEuphoriaQuestionItem_2");
			tdbConnection.addStatement(modelName, prefix + "NPI_ElationEuphoriaQuestionItem_3_" + count, RDF.type.getURI(), prefix + "NPI_ElationEuphoriaQuestionItem_3");
			tdbConnection.addStatement(modelName, prefix + "NPI_ElationEuphoriaQuestionItem_4_" + count, RDF.type.getURI(), prefix + "NPI_ElationEuphoriaQuestionItem_4");
			tdbConnection.addStatement(modelName, prefix + "NPI_ElationEuphoriaQuestionItem_5_" + count, RDF.type.getURI(), prefix + "NPI_ElationEuphoriaQuestionItem_5");
			tdbConnection.addStatement(modelName, prefix + "NPI_ElationEuphoriaQuestionItem_6_" + count, RDF.type.getURI(), prefix + "NPI_ElationEuphoriaQuestionItem_6");
			tdbConnection.addStatement(modelName, prefix + "NPI_ElationEuphoriaQuestionItem_7_" + count, RDF.type.getURI(), prefix + "NPI_ElationEuphoriaQuestionItem_7");
			
			//Delusion insert value
			tdbConnection.addStatement(modelName, prefix + "NPI_DelusionsQuestionItem_1_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpia1());
			tdbConnection.addStatement(modelName, prefix + "NPI_DelusionsQuestionItem_2_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpia2());
			tdbConnection.addStatement(modelName, prefix + "NPI_DelusionsQuestionItem_3_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpia3());
			tdbConnection.addStatement(modelName, prefix + "NPI_DelusionsQuestionItem_4_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpia4());
			tdbConnection.addStatement(modelName, prefix + "NPI_DelusionsQuestionItem_5_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpia5());
			tdbConnection.addStatement(modelName, prefix + "NPI_DelusionsQuestionItem_6_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpia6());
			tdbConnection.addStatement(modelName, prefix + "NPI_DelusionsQuestionItem_7_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpia7());
			tdbConnection.addStatement(modelName, prefix + "NPI_DelusionsQuestionItem_8_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpia8());
			tdbConnection.addStatement(modelName, prefix + "NPI_DelusionsQuestionItem_9_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpia9());
			//Hallucinations insert value
			tdbConnection.addStatement(modelName, prefix + "NPI_HallucinationsQuestionItem_1_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpib1());
			tdbConnection.addStatement(modelName, prefix + "NPI_HallucinationsQuestionItem_2_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpib2());
			tdbConnection.addStatement(modelName, prefix + "NPI_HallucinationsQuestionItem_3_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpib3());
			tdbConnection.addStatement(modelName, prefix + "NPI_HallucinationsQuestionItem_4_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpib4());
			tdbConnection.addStatement(modelName, prefix + "NPI_HallucinationsQuestionItem_5_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpib5());
			tdbConnection.addStatement(modelName, prefix + "NPI_HallucinationsQuestionItem_6_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpib6());
			tdbConnection.addStatement(modelName, prefix + "NPI_HallucinationsQuestionItem_7_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpib7());
			//Agitation/Aggression insert value
			tdbConnection.addStatement(modelName, prefix + "NPI_AgitationAggressionQuestionItem_1_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpic1());
			tdbConnection.addStatement(modelName, prefix + "NPI_AgitationAggressionQuestionItem_2_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpic2());
			tdbConnection.addStatement(modelName, prefix + "NPI_AgitationAggressionQuestionItem_3_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpic3());
			tdbConnection.addStatement(modelName, prefix + "NPI_AgitationAggressionQuestionItem_4_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpic4());
			tdbConnection.addStatement(modelName, prefix + "NPI_AgitationAggressionQuestionItem_5_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpic5());
			tdbConnection.addStatement(modelName, prefix + "NPI_AgitationAggressionQuestionItem_6_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpic6());
			tdbConnection.addStatement(modelName, prefix + "NPI_AgitationAggressionQuestionItem_7_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpic7());
			tdbConnection.addStatement(modelName, prefix + "NPI_AgitationAggressionQuestionItem_8_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpic8());
			//Depression/Dysphoria insert value
			tdbConnection.addStatement(modelName, prefix + "NPI_DepressionDysphoriaQuestionItem_1_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpid1());
			tdbConnection.addStatement(modelName, prefix + "NPI_DepressionDysphoriaQuestionItem_2_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpid2());
			tdbConnection.addStatement(modelName, prefix + "NPI_DepressionDysphoriaQuestionItem_3_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpid3());
			tdbConnection.addStatement(modelName, prefix + "NPI_DepressionDysphoriaQuestionItem_4_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpid4());
			tdbConnection.addStatement(modelName, prefix + "NPI_DepressionDysphoriaQuestionItem_5_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpid5());
			tdbConnection.addStatement(modelName, prefix + "NPI_DepressionDysphoriaQuestionItem_6_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpid6());
			tdbConnection.addStatement(modelName, prefix + "NPI_DepressionDysphoriaQuestionItem_7_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpid7());
			tdbConnection.addStatement(modelName, prefix + "NPI_DepressionDysphoriaQuestionItem_8_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpid8());
			//Anxiety insert value
			tdbConnection.addStatement(modelName, prefix + "NPI_AnxietyQuestionItem_1_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpie1());
			tdbConnection.addStatement(modelName, prefix + "NPI_AnxietyQuestionItem_2_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpie2());
			tdbConnection.addStatement(modelName, prefix + "NPI_AnxietyQuestionItem_3_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpie3());
			tdbConnection.addStatement(modelName, prefix + "NPI_AnxietyQuestionItem_4_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpie4());
			tdbConnection.addStatement(modelName, prefix + "NPI_AnxietyQuestionItem_5_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpie5());
			tdbConnection.addStatement(modelName, prefix + "NPI_AnxietyQuestionItem_6_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpie6());
			tdbConnection.addStatement(modelName, prefix + "NPI_AnxietyQuestionItem_7_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpie7());
			//Anxiety insert value
			tdbConnection.addStatement(modelName, prefix + "NPI_ElationEuphoriaQuestionItem_1_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpif1());
			tdbConnection.addStatement(modelName, prefix + "NPI_ElationEuphoriaQuestionItem_2_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpif2());
			tdbConnection.addStatement(modelName, prefix + "NPI_ElationEuphoriaQuestionItem_3_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpif3());
			tdbConnection.addStatement(modelName, prefix + "NPI_ElationEuphoriaQuestionItem_4_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpif4());
			tdbConnection.addStatement(modelName, prefix + "NPI_ElationEuphoriaQuestionItem_5_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpif5());
			tdbConnection.addStatement(modelName, prefix + "NPI_ElationEuphoriaQuestionItem_6_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpif6());
			tdbConnection.addStatement(modelName, prefix + "NPI_ElationEuphoriaQuestionItem_7_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpif7());
			
		} catch (Exception e) {

			e.printStackTrace();
		}

		tdbConnection.close();
		TDBUtil.removeLock();
	}
}
