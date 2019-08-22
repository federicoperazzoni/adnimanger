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
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_DelusionsPresenceItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_DelusionsFrequencyItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_DelusionsSeverityItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_DelusionsDistressItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_DelusionsTotItem_" + count);
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
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_HallucinationsPresenceItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_HallucinationsFrequencyItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_HallucinationsSeverityItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_HallucinationsDistressItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_HallucinationsTotItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_HallucinationsQuestionItem_1_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_HallucinationsQuestionItem_2_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_HallucinationsQuestionItem_3_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_HallucinationsQuestionItem_4_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_HallucinationsQuestionItem_5_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_HallucinationsQuestionItem_6_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_HallucinationsQuestionItem_7_" + count);
			//Agitation/Aggression
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_AgitationAggressionPresenceItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_AgitationAggressionFrequencyItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_AgitationAggressionSeverityItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_AgitationAggressionDistressItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_AgitationAggressionTotItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_AgitationAggressionQuestionItem_1_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_AgitationAggressionQuestionItem_2_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_AgitationAggressionQuestionItem_3_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_AgitationAggressionQuestionItem_4_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_AgitationAggressionQuestionItem_5_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_AgitationAggressionQuestionItem_6_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_AgitationAggressionQuestionItem_7_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_AgitationAggressionQuestionItem_8_" + count);
			//Depression/Dysphoria
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_DepressionDysphoriaPresenceItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_DepressionDysphoriaFrequencyItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_DepressionDysphoriaSeverityItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_DepressionDysphoriaDistressItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_DepressionDysphoriaTotItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_DepressionDysphoriaQuestionItem_1_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_DepressionDysphoriaQuestionItem_2_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_DepressionDysphoriaQuestionItem_3_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_DepressionDysphoriaQuestionItem_4_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_DepressionDysphoriaQuestionItem_5_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_DepressionDysphoriaQuestionItem_6_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_DepressionDysphoriaQuestionItem_7_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_DepressionDysphoriaQuestionItem_8_" + count);
			//Anxiety
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_AnxietyPresenceItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_AnxietyFrequencyItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_AnxietySeverityItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_AnxietyDistressItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_AnxietyTotItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_AnxietyQuestionItem_1_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_AnxietyQuestionItem_2_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_AnxietyQuestionItem_3_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_AnxietyQuestionItem_4_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_AnxietyQuestionItem_5_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_AnxietyQuestionItem_6_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_AnxietyQuestionItem_7_" + count);
			//Elation/Euphoria
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_ElationEuphoriaPresenceItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_ElationEuphoriaFrequencyItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_ElationEuphoriaSeverityItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_ElationEuphoriaDistressItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_ElationEuphoriaTotItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_ElationEuphoriaQuestionItem_1_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_ElationEuphoriaQuestionItem_2_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_ElationEuphoriaQuestionItem_3_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_ElationEuphoriaQuestionItem_4_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_ElationEuphoriaQuestionItem_5_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_ElationEuphoriaQuestionItem_6_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_ElationEuphoriaQuestionItem_7_" + count);
			//Apathy / Indifference
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_ApathyIndifferencePresenceItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_ApathyIndifferenceFrequencyItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_ApathyIndifferenceSeverityItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_ApathyIndifferenceDistressItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_ApathyIndifferenceTotItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_ApathyIndifferenceQuestionItem_1_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_ApathyIndifferenceQuestionItem_2_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_ApathyIndifferenceQuestionItem_3_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_ApathyIndifferenceQuestionItem_4_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_ApathyIndifferenceQuestionItem_5_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_ApathyIndifferenceQuestionItem_6_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_ApathyIndifferenceQuestionItem_7_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_ApathyIndifferenceQuestionItem_8_" + count);
			//Disinhibition
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_DisinhibitionPresenceItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_DisinhibitionFrequencyItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_DisinhibitionSeverityItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_DisinhibitionDistressItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_DisinhibitionTotItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_DisinhibitionQuestionItem_1_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_DisinhibitionQuestionItem_2_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_DisinhibitionQuestionItem_3_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_DisinhibitionQuestionItem_4_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_DisinhibitionQuestionItem_5_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_DisinhibitionQuestionItem_6_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_DisinhibitionQuestionItem_7_" + count);
			//Irritability/ Lability
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_IrritabilityLabilityPresenceItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_IrritabilityLabilityFrequencyItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_IrritabilityLabilitySeverityItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_IrritabilityLabilityDistressItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_IrritabilityLabilityTotItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_IrritabilityLabilityQuestionItem_1_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_IrritabilityLabilityQuestionItem_2_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_IrritabilityLabilityQuestionItem_3_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_IrritabilityLabilityQuestionItem_4_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_IrritabilityLabilityQuestionItem_5_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_IrritabilityLabilityQuestionItem_6_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_IrritabilityLabilityQuestionItem_7_" + count);
			//Aberrant Motor Behaviour			
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_AberrantMotorBehaviourPresenceItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_AberrantMotorBehaviourFrequencyItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_AberrantMotorBehaviourSeverityItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_AberrantMotorBehaviourDistressItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_AberrantMotorBehaviourTotItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_AberrantMotorBehaviourQuestionItem_1_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_AberrantMotorBehaviourQuestionItem_2_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_AberrantMotorBehaviourQuestionItem_3_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_AberrantMotorBehaviourQuestionItem_4_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_AberrantMotorBehaviourQuestionItem_5_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_AberrantMotorBehaviourQuestionItem_6_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_AberrantMotorBehaviourQuestionItem_7_" + count);
			//Sleep Disorders
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_SleepPresenceItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_SleepFrequencyItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_SleepSeverityItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_SleepDistressItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_SleepTotItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_SleepQuestionItem_1_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_SleepQuestionItem_2_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_SleepQuestionItem_3_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_SleepQuestionItem_4_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_SleepQuestionItem_5_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_SleepQuestionItem_6_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_SleepQuestionItem_7_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_SleepQuestionItem_8_" + count);
			//Eating Disorders
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_EatingDisordersPresenceItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_EatingDisordersFrequencyItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_EatingDisordersSeverityItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_EatingDisordersDistressItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_EatingDisordersTotItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_EatingDisordersQuestionItem_1_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_EatingDisordersQuestionItem_2_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_EatingDisordersQuestionItem_3_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_EatingDisordersQuestionItem_4_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_EatingDisordersQuestionItem_5_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_EatingDisordersQuestionItem_6_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_EatingDisordersQuestionItem_7_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPI_" + count, prefix + "hasAssesmentItem", prefix + "NPI_EatingDisordersQuestionItem_8_" + count);
			
			//Delusion type
			tdbConnection.addStatement(modelName, prefix + "NPI_DelusionsPresenceItem_" + count, RDF.type.getURI(), prefix + "NPI_DelusionsPresenceItem");
			tdbConnection.addStatement(modelName, prefix + "NPI_DelusionsFrequencyItem_" + count, RDF.type.getURI(), prefix + "NPI_DelusionsFrequencyItem");
			tdbConnection.addStatement(modelName, prefix + "NPI_DelusionsSeverityItem_" + count, RDF.type.getURI(), prefix + "NPI_DelusionsSeverityItem");
			tdbConnection.addStatement(modelName, prefix + "NPI_DelusionsDistressItem_" + count, RDF.type.getURI(), prefix + "NPI_DelusionsDistressItem");
			tdbConnection.addStatement(modelName, prefix + "NPI_DelusionsTotItem_" + count, RDF.type.getURI(), prefix + "NPI_DelusionsTotItem");
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
			tdbConnection.addStatement(modelName, prefix + "NPI_HallucinationsPresenceItem_" + count, RDF.type.getURI(), prefix + "NPI_HallucinationsPresenceItem");
			tdbConnection.addStatement(modelName, prefix + "NPI_HallucinationsFrequencyItem_" + count, RDF.type.getURI(), prefix + "NPI_HallucinationsFrequencyItem");
			tdbConnection.addStatement(modelName, prefix + "NPI_HallucinationsSeverityItem_" + count, RDF.type.getURI(), prefix + "NPI_HallucinationsSeverityItem");
			tdbConnection.addStatement(modelName, prefix + "NPI_HallucinationsDistressItem_" + count, RDF.type.getURI(), prefix + "NPI_HallucinationsDistressItem");
			tdbConnection.addStatement(modelName, prefix + "NPI_HallucinationsTotItem_" + count, RDF.type.getURI(), prefix + "NPI_HallucinationsTotItem");
			tdbConnection.addStatement(modelName, prefix + "NPI_HallucinationsQuestionItem_1_" + count, RDF.type.getURI(), prefix + "NPI_HallucinationsQuestionItem_1");
			tdbConnection.addStatement(modelName, prefix + "NPI_HallucinationsQuestionItem_2_" + count, RDF.type.getURI(), prefix + "NPI_HallucinationsQuestionItem_2");
			tdbConnection.addStatement(modelName, prefix + "NPI_HallucinationsQuestionItem_3_" + count, RDF.type.getURI(), prefix + "NPI_HallucinationsQuestionItem_3");
			tdbConnection.addStatement(modelName, prefix + "NPI_HallucinationsQuestionItem_4_" + count, RDF.type.getURI(), prefix + "NPI_HallucinationsQuestionItem_4");
			tdbConnection.addStatement(modelName, prefix + "NPI_HallucinationsQuestionItem_5_" + count, RDF.type.getURI(), prefix + "NPI_HallucinationsQuestionItem_5");
			tdbConnection.addStatement(modelName, prefix + "NPI_HallucinationsQuestionItem_6_" + count, RDF.type.getURI(), prefix + "NPI_HallucinationsQuestionItem_6");
			tdbConnection.addStatement(modelName, prefix + "NPI_HallucinationsQuestionItem_7_" + count, RDF.type.getURI(), prefix + "NPI_HallucinationsQuestionItem_7");
			//Agitation/Aggression type
			tdbConnection.addStatement(modelName, prefix + "NPI_AgitationAggressionPresenceItem_" + count, RDF.type.getURI(), prefix + "NPI_AgitationAggressionPresenceItem");
			tdbConnection.addStatement(modelName, prefix + "NPI_AgitationAggressionFrequencyItem_" + count, RDF.type.getURI(), prefix + "NPI_AgitationAggressionFrequencyItem");
			tdbConnection.addStatement(modelName, prefix + "NPI_AgitationAggressionSeverityItem_" + count, RDF.type.getURI(), prefix + "NPI_AgitationAggressionSeverityItem");
			tdbConnection.addStatement(modelName, prefix + "NPI_AgitationAggressionDistressItem_" + count, RDF.type.getURI(), prefix + "NPI_AgitationAggressionDistressItem");
			tdbConnection.addStatement(modelName, prefix + "NPI_AgitationAggressionTotItem_" + count, RDF.type.getURI(), prefix + "NPI_AgitationAggressionTotItem");
			tdbConnection.addStatement(modelName, prefix + "NPI_AgitationAggressionQuestionItem_1_" + count, RDF.type.getURI(), prefix + "NPI_AgitationAggressionQuestionItem_1");
			tdbConnection.addStatement(modelName, prefix + "NPI_AgitationAggressionQuestionItem_2_" + count, RDF.type.getURI(), prefix + "NPI_AgitationAggressionQuestionItem_2");
			tdbConnection.addStatement(modelName, prefix + "NPI_AgitationAggressionQuestionItem_3_" + count, RDF.type.getURI(), prefix + "NPI_AgitationAggressionQuestionItem_3");
			tdbConnection.addStatement(modelName, prefix + "NPI_AgitationAggressionQuestionItem_4_" + count, RDF.type.getURI(), prefix + "NPI_AgitationAggressionQuestionItem_4");
			tdbConnection.addStatement(modelName, prefix + "NPI_AgitationAggressionQuestionItem_5_" + count, RDF.type.getURI(), prefix + "NPI_AgitationAggressionQuestionItem_5");
			tdbConnection.addStatement(modelName, prefix + "NPI_AgitationAggressionQuestionItem_6_" + count, RDF.type.getURI(), prefix + "NPI_AgitationAggressionQuestionItem_6");
			tdbConnection.addStatement(modelName, prefix + "NPI_AgitationAggressionQuestionItem_7_" + count, RDF.type.getURI(), prefix + "NPI_AgitationAggressionQuestionItem_7");
			tdbConnection.addStatement(modelName, prefix + "NPI_AgitationAggressionQuestionItem_8_" + count, RDF.type.getURI(), prefix + "NPI_AgitationAggressionQuestionItem_8");
			//Depression/Dysphoria type
			tdbConnection.addStatement(modelName, prefix + "NPI_DepressionDysphoriaPresenceItem_" + count, RDF.type.getURI(), prefix + "NPI_DepressionDysphoriaPresenceItem");
			tdbConnection.addStatement(modelName, prefix + "NPI_DepressionDysphoriaFrequencyItem_" + count, RDF.type.getURI(), prefix + "NPI_DepressionDysphoriaFrequencyItem");
			tdbConnection.addStatement(modelName, prefix + "NPI_DepressionDysphoriaSeverityItem_" + count, RDF.type.getURI(), prefix + "NPI_DepressionDysphoriaSeverityItem");
			tdbConnection.addStatement(modelName, prefix + "NPI_DepressionDysphoriaDistressItem_" + count, RDF.type.getURI(), prefix + "NPI_DepressionDysphoriaDistressItem");
			tdbConnection.addStatement(modelName, prefix + "NPI_DepressionDysphoriaTotItem_" + count, RDF.type.getURI(), prefix + "NPI_DepressionDysphoriaTotItem");
			tdbConnection.addStatement(modelName, prefix + "NPI_DepressionDysphoriaQuestionItem_1_" + count, RDF.type.getURI(), prefix + "NPI_DepressionDysphoriaQuestionItem_1");
			tdbConnection.addStatement(modelName, prefix + "NPI_DepressionDysphoriaQuestionItem_2_" + count, RDF.type.getURI(), prefix + "NPI_DepressionDysphoriaQuestionItem_2");
			tdbConnection.addStatement(modelName, prefix + "NPI_DepressionDysphoriaQuestionItem_3_" + count, RDF.type.getURI(), prefix + "NPI_DepressionDysphoriaQuestionItem_3");
			tdbConnection.addStatement(modelName, prefix + "NPI_DepressionDysphoriaQuestionItem_4_" + count, RDF.type.getURI(), prefix + "NPI_DepressionDysphoriaQuestionItem_4");
			tdbConnection.addStatement(modelName, prefix + "NPI_DepressionDysphoriaQuestionItem_5_" + count, RDF.type.getURI(), prefix + "NPI_DepressionDysphoriaQuestionItem_5");
			tdbConnection.addStatement(modelName, prefix + "NPI_DepressionDysphoriaQuestionItem_6_" + count, RDF.type.getURI(), prefix + "NPI_DepressionDysphoriaQuestionItem_6");
			tdbConnection.addStatement(modelName, prefix + "NPI_DepressionDysphoriaQuestionItem_7_" + count, RDF.type.getURI(), prefix + "NPI_DepressionDysphoriaQuestionItem_7");
			tdbConnection.addStatement(modelName, prefix + "NPI_DepressionDysphoriaQuestionItem_8_" + count, RDF.type.getURI(), prefix + "NPI_DepressionDysphoriaQuestionItem_8");
			//Anxiety type
			tdbConnection.addStatement(modelName, prefix + "NPI_AnxietyPresenceItem_" + count, RDF.type.getURI(), prefix + "NPI_AnxietyPresenceItem");
			tdbConnection.addStatement(modelName, prefix + "NPI_AnxietyFrequencyItem_" + count, RDF.type.getURI(), prefix + "NPI_AnxietyFrequencyItem");
			tdbConnection.addStatement(modelName, prefix + "NPI_AnxietySeverityItem_" + count, RDF.type.getURI(), prefix + "NPI_AnxietySeverityItem");
			tdbConnection.addStatement(modelName, prefix + "NPI_AnxietyDistressItem_" + count, RDF.type.getURI(), prefix + "NPI_AnxietyDistressItem");
			tdbConnection.addStatement(modelName, prefix + "NPI_AnxietyTotItem_" + count, RDF.type.getURI(), prefix + "NPI_AnxietyTotItem");
			tdbConnection.addStatement(modelName, prefix + "NPI_AnxietyQuestionItem_1_" + count, RDF.type.getURI(), prefix + "NPI_AnxietyQuestionItem_1");
			tdbConnection.addStatement(modelName, prefix + "NPI_AnxietyQuestionItem_2_" + count, RDF.type.getURI(), prefix + "NPI_AnxietyQuestionItem_2");
			tdbConnection.addStatement(modelName, prefix + "NPI_AnxietyQuestionItem_3_" + count, RDF.type.getURI(), prefix + "NPI_AnxietyQuestionItem_3");
			tdbConnection.addStatement(modelName, prefix + "NPI_AnxietyQuestionItem_4_" + count, RDF.type.getURI(), prefix + "NPI_AnxietyQuestionItem_4");
			tdbConnection.addStatement(modelName, prefix + "NPI_AnxietyQuestionItem_5_" + count, RDF.type.getURI(), prefix + "NPI_AnxietyQuestionItem_5");
			tdbConnection.addStatement(modelName, prefix + "NPI_AnxietyQuestionItem_6_" + count, RDF.type.getURI(), prefix + "NPI_AnxietyQuestionItem_6");
			tdbConnection.addStatement(modelName, prefix + "NPI_AnxietyQuestionItem_7_" + count, RDF.type.getURI(), prefix + "NPI_AnxietyQuestionItem_7");
			//Elation/Euphoria type
			tdbConnection.addStatement(modelName, prefix + "NPI_ElationEuphoriaPresenceItem_" + count, RDF.type.getURI(), prefix + "NPI_ElationEuphoriaPresenceItem");
			tdbConnection.addStatement(modelName, prefix + "NPI_ElationEuphoriaFrequencyItem_" + count, RDF.type.getURI(), prefix + "NPI_ElationEuphoriaFrequencyItem");
			tdbConnection.addStatement(modelName, prefix + "NPI_ElationEuphoriaSeverityItem_" + count, RDF.type.getURI(), prefix + "NPI_ElationEuphoriaSeverityItem");
			tdbConnection.addStatement(modelName, prefix + "NPI_ElationEuphoriaDistressItem_" + count, RDF.type.getURI(), prefix + "NPI_ElationEuphoriaDistressItem");
			tdbConnection.addStatement(modelName, prefix + "NPI_ElationEuphoriaTotItem_" + count, RDF.type.getURI(), prefix + "NPI_ElationEuphoriaTotItem");
			tdbConnection.addStatement(modelName, prefix + "NPI_ElationEuphoriaQuestionItem_1_" + count, RDF.type.getURI(), prefix + "NPI_ElationEuphoriaQuestionItem_1");
			tdbConnection.addStatement(modelName, prefix + "NPI_ElationEuphoriaQuestionItem_2_" + count, RDF.type.getURI(), prefix + "NPI_ElationEuphoriaQuestionItem_2");
			tdbConnection.addStatement(modelName, prefix + "NPI_ElationEuphoriaQuestionItem_3_" + count, RDF.type.getURI(), prefix + "NPI_ElationEuphoriaQuestionItem_3");
			tdbConnection.addStatement(modelName, prefix + "NPI_ElationEuphoriaQuestionItem_4_" + count, RDF.type.getURI(), prefix + "NPI_ElationEuphoriaQuestionItem_4");
			tdbConnection.addStatement(modelName, prefix + "NPI_ElationEuphoriaQuestionItem_5_" + count, RDF.type.getURI(), prefix + "NPI_ElationEuphoriaQuestionItem_5");
			tdbConnection.addStatement(modelName, prefix + "NPI_ElationEuphoriaQuestionItem_6_" + count, RDF.type.getURI(), prefix + "NPI_ElationEuphoriaQuestionItem_6");
			tdbConnection.addStatement(modelName, prefix + "NPI_ElationEuphoriaQuestionItem_7_" + count, RDF.type.getURI(), prefix + "NPI_ElationEuphoriaQuestionItem_7");
			//Apathy / Indifference type
			tdbConnection.addStatement(modelName, prefix + "NPI_ApathyIndifferencePresenceItem_" + count, RDF.type.getURI(), prefix + "NPI_ApathyIndifferencePresenceItem");
			tdbConnection.addStatement(modelName, prefix + "NPI_ApathyIndifferenceFrequencyItem_" + count, RDF.type.getURI(), prefix + "NPI_ApathyIndifferenceFrequencyItem");
			tdbConnection.addStatement(modelName, prefix + "NPI_ApathyIndifferenceSeverityItem_" + count, RDF.type.getURI(), prefix + "NPI_ApathyIndifferenceSeverityItem");
			tdbConnection.addStatement(modelName, prefix + "NPI_ApathyIndifferenceDistressItem_" + count, RDF.type.getURI(), prefix + "NPI_ApathyIndifferenceDistressItem");
			tdbConnection.addStatement(modelName, prefix + "NPI_ApathyIndifferenceTotItem_" + count, RDF.type.getURI(), prefix + "NPI_ApathyIndifferenceTotItem");
			tdbConnection.addStatement(modelName, prefix + "NPI_ApathyIndifferenceQuestionItem_1_" + count, RDF.type.getURI(), prefix + "NPI_ApathyIndifferenceQuestionItem_1");
			tdbConnection.addStatement(modelName, prefix + "NPI_ApathyIndifferenceQuestionItem_2_" + count, RDF.type.getURI(), prefix + "NPI_ApathyIndifferenceQuestionItem_2");
			tdbConnection.addStatement(modelName, prefix + "NPI_ApathyIndifferenceQuestionItem_3_" + count, RDF.type.getURI(), prefix + "NPI_ApathyIndifferenceQuestionItem_3");
			tdbConnection.addStatement(modelName, prefix + "NPI_ApathyIndifferenceQuestionItem_4_" + count, RDF.type.getURI(), prefix + "NPI_ApathyIndifferenceQuestionItem_4");
			tdbConnection.addStatement(modelName, prefix + "NPI_ApathyIndifferenceQuestionItem_5_" + count, RDF.type.getURI(), prefix + "NPI_ApathyIndifferenceQuestionItem_5");
			tdbConnection.addStatement(modelName, prefix + "NPI_ApathyIndifferenceQuestionItem_6_" + count, RDF.type.getURI(), prefix + "NPI_ApathyIndifferenceQuestionItem_6");
			tdbConnection.addStatement(modelName, prefix + "NPI_ApathyIndifferenceQuestionItem_7_" + count, RDF.type.getURI(), prefix + "NPI_ApathyIndifferenceQuestionItem_7");
			tdbConnection.addStatement(modelName, prefix + "NPI_ApathyIndifferenceQuestionItem_8_" + count, RDF.type.getURI(), prefix + "NPI_ApathyIndifferenceQuestionItem_8");
			//Disinhibition type
			tdbConnection.addStatement(modelName, prefix + "NPI_DisinhibitionPresenceItem_" + count, RDF.type.getURI(), prefix + "NPI_DisinhibitionPresenceItem");
			tdbConnection.addStatement(modelName, prefix + "NPI_DisinhibitionFrequencyItem_" + count, RDF.type.getURI(), prefix + "NPI_DisinhibitionFrequencyItem");
			tdbConnection.addStatement(modelName, prefix + "NPI_DisinhibitionSeverityItem_" + count, RDF.type.getURI(), prefix + "NPI_DisinhibitionSeverityItem");
			tdbConnection.addStatement(modelName, prefix + "NPI_DisinhibitionDistressItem_" + count, RDF.type.getURI(), prefix + "NPI_DisinhibitionDistressItem");
			tdbConnection.addStatement(modelName, prefix + "NPI_DisinhibitionTotItem_" + count, RDF.type.getURI(), prefix + "NPI_DisinhibitionTotItem");
			tdbConnection.addStatement(modelName, prefix + "NPI_DisinhibitionQuestionItem_1_" + count, RDF.type.getURI(), prefix + "NPI_DisinhibitionQuestionItem_1");
			tdbConnection.addStatement(modelName, prefix + "NPI_DisinhibitionQuestionItem_2_" + count, RDF.type.getURI(), prefix + "NPI_DisinhibitionQuestionItem_2");
			tdbConnection.addStatement(modelName, prefix + "NPI_DisinhibitionQuestionItem_3_" + count, RDF.type.getURI(), prefix + "NPI_DisinhibitionQuestionItem_3");
			tdbConnection.addStatement(modelName, prefix + "NPI_DisinhibitionQuestionItem_4_" + count, RDF.type.getURI(), prefix + "NPI_DisinhibitionQuestionItem_4");
			tdbConnection.addStatement(modelName, prefix + "NPI_DisinhibitionQuestionItem_5_" + count, RDF.type.getURI(), prefix + "NPI_DisinhibitionQuestionItem_5");
			tdbConnection.addStatement(modelName, prefix + "NPI_DisinhibitionQuestionItem_6_" + count, RDF.type.getURI(), prefix + "NPI_DisinhibitionQuestionItem_6");
			tdbConnection.addStatement(modelName, prefix + "NPI_DisinhibitionQuestionItem_7_" + count, RDF.type.getURI(), prefix + "NPI_DisinhibitionQuestionItem_7");
			//Irritability/ Lability type
			tdbConnection.addStatement(modelName, prefix + "NPI_IrritabilityLabilityPresenceItem_" + count, RDF.type.getURI(), prefix + "NPI_IrritabilityLabilityPresenceItem");
			tdbConnection.addStatement(modelName, prefix + "NPI_IrritabilityLabilityFrequencyItem_" + count, RDF.type.getURI(), prefix + "NPI_IrritabilityLabilityFrequencyItem");
			tdbConnection.addStatement(modelName, prefix + "NPI_IrritabilityLabilitySeverityItem_" + count, RDF.type.getURI(), prefix + "NPI_IrritabilityLabilitySeverityItem");
			tdbConnection.addStatement(modelName, prefix + "NPI_IrritabilityLabilityDistressItem_" + count, RDF.type.getURI(), prefix + "NPI_IrritabilityLabilityDistressItem");
			tdbConnection.addStatement(modelName, prefix + "NPI_IrritabilityLabilityTotItem_" + count, RDF.type.getURI(), prefix + "NPI_IrritabilityLabilityTotItem");
			tdbConnection.addStatement(modelName, prefix + "NPI_IrritabilityLabilityQuestionItem_1_" + count, RDF.type.getURI(), prefix + "NPI_IrritabilityLabilityQuestionItem_1");
			tdbConnection.addStatement(modelName, prefix + "NPI_IrritabilityLabilityQuestionItem_2_" + count, RDF.type.getURI(), prefix + "NPI_IrritabilityLabilityQuestionItem_2");
			tdbConnection.addStatement(modelName, prefix + "NPI_IrritabilityLabilityQuestionItem_3_" + count, RDF.type.getURI(), prefix + "NPI_IrritabilityLabilityQuestionItem_3");
			tdbConnection.addStatement(modelName, prefix + "NPI_IrritabilityLabilityQuestionItem_4_" + count, RDF.type.getURI(), prefix + "NPI_IrritabilityLabilityQuestionItem_4");
			tdbConnection.addStatement(modelName, prefix + "NPI_IrritabilityLabilityQuestionItem_5_" + count, RDF.type.getURI(), prefix + "NPI_IrritabilityLabilityQuestionItem_5");
			tdbConnection.addStatement(modelName, prefix + "NPI_IrritabilityLabilityQuestionItem_6_" + count, RDF.type.getURI(), prefix + "NPI_IrritabilityLabilityQuestionItem_6");
			tdbConnection.addStatement(modelName, prefix + "NPI_IrritabilityLabilityQuestionItem_7_" + count, RDF.type.getURI(), prefix + "NPI_IrritabilityLabilityQuestionItem_7");
			//Aberrant Motor Behaviour type
			tdbConnection.addStatement(modelName, prefix + "NPI_AberrantMotorBehaviourPresenceItem_" + count, RDF.type.getURI(), prefix + "NPI_AberrantMotorBehaviourPresenceItem");			
			tdbConnection.addStatement(modelName, prefix + "NPI_AberrantMotorBehaviourFrequencyItem_" + count, RDF.type.getURI(), prefix + "NPI_AberrantMotorBehaviourFrequencyItem");
			tdbConnection.addStatement(modelName, prefix + "NPI_AberrantMotorBehaviourSeverityItem_" + count, RDF.type.getURI(), prefix + "NPI_AberrantMotorBehaviourSeverityItem");
			tdbConnection.addStatement(modelName, prefix + "NPI_AberrantMotorBehaviourDistressItem_" + count, RDF.type.getURI(), prefix + "NPI_AberrantMotorBehaviourDistressItem");			
			tdbConnection.addStatement(modelName, prefix + "NPI_AberrantMotorBehaviourTotItem_" + count, RDF.type.getURI(), prefix + "NPI_AberrantMotorBehaviourTotItem");
			tdbConnection.addStatement(modelName, prefix + "NPI_AberrantMotorBehaviourQuestionItem_1_" + count, RDF.type.getURI(), prefix + "NPI_AberrantMotorBehaviourQuestionItem_1");
			tdbConnection.addStatement(modelName, prefix + "NPI_AberrantMotorBehaviourQuestionItem_2_" + count, RDF.type.getURI(), prefix + "NPI_AberrantMotorBehaviourQuestionItem_2");
			tdbConnection.addStatement(modelName, prefix + "NPI_AberrantMotorBehaviourQuestionItem_3_" + count, RDF.type.getURI(), prefix + "NPI_AberrantMotorBehaviourQuestionItem_3");
			tdbConnection.addStatement(modelName, prefix + "NPI_AberrantMotorBehaviourQuestionItem_4_" + count, RDF.type.getURI(), prefix + "NPI_AberrantMotorBehaviourQuestionItem_4");
			tdbConnection.addStatement(modelName, prefix + "NPI_AberrantMotorBehaviourQuestionItem_5_" + count, RDF.type.getURI(), prefix + "NPI_AberrantMotorBehaviourQuestionItem_5");
			tdbConnection.addStatement(modelName, prefix + "NPI_AberrantMotorBehaviourQuestionItem_6_" + count, RDF.type.getURI(), prefix + "NPI_AberrantMotorBehaviourQuestionItem_6");
			tdbConnection.addStatement(modelName, prefix + "NPI_AberrantMotorBehaviourQuestionItem_7_" + count, RDF.type.getURI(), prefix + "NPI_AberrantMotorBehaviourQuestionItem_7");
			//Sleep Disorders type
			tdbConnection.addStatement(modelName, prefix + "NPI_SleepPresenceItem_" + count, RDF.type.getURI(), prefix + "NPI_SleepPresenceItem");
			tdbConnection.addStatement(modelName, prefix + "NPI_SleepFrequencyItem_" + count, RDF.type.getURI(), prefix + "NPI_SleepFrequencyItem");
			tdbConnection.addStatement(modelName, prefix + "NPI_SleepSeverityItem_" + count, RDF.type.getURI(), prefix + "NPI_SleepSeverityItem");
			tdbConnection.addStatement(modelName, prefix + "NPI_SleepDistressItem_" + count, RDF.type.getURI(), prefix + "NPI_SleepDistressItem");
			tdbConnection.addStatement(modelName, prefix + "NPI_SleepTotItem_" + count, RDF.type.getURI(), prefix + "NPI_SleepTotItem");
			tdbConnection.addStatement(modelName, prefix + "NPI_SleepQuestionItem_1_" + count, RDF.type.getURI(), prefix + "NPI_SleepQuestionItem_1");
			tdbConnection.addStatement(modelName, prefix + "NPI_SleepQuestionItem_2_" + count, RDF.type.getURI(), prefix + "NPI_SleepQuestionItem_2");
			tdbConnection.addStatement(modelName, prefix + "NPI_SleepQuestionItem_3_" + count, RDF.type.getURI(), prefix + "NPI_SleepQuestionItem_3");
			tdbConnection.addStatement(modelName, prefix + "NPI_SleepQuestionItem_4_" + count, RDF.type.getURI(), prefix + "NPI_SleepQuestionItem_4");
			tdbConnection.addStatement(modelName, prefix + "NPI_SleepQuestionItem_5_" + count, RDF.type.getURI(), prefix + "NPI_SleepQuestionItem_5");
			tdbConnection.addStatement(modelName, prefix + "NPI_SleepQuestionItem_6_" + count, RDF.type.getURI(), prefix + "NPI_SleepQuestionItem_6");
			tdbConnection.addStatement(modelName, prefix + "NPI_SleepQuestionItem_7_" + count, RDF.type.getURI(), prefix + "NPI_SleepQuestionItem_7");
			tdbConnection.addStatement(modelName, prefix + "NPI_SleepQuestionItem_8_" + count, RDF.type.getURI(), prefix + "NPI_SleepQuestionItem_8");
			//Eating Disorders type
			tdbConnection.addStatement(modelName, prefix + "NPI_EatingDisordersPresenceItem_" + count, RDF.type.getURI(), prefix + "NPI_EatingDisordersPresenceItem");
			tdbConnection.addStatement(modelName, prefix + "NPI_EatingDisordersFrequencyItem_" + count, RDF.type.getURI(), prefix + "NPI_EatingDisordersFrequencyItem");
			tdbConnection.addStatement(modelName, prefix + "NPI_EatingDisordersSeverityItem_" + count, RDF.type.getURI(), prefix + "NPI_EatingDisordersSeverityItem");
			tdbConnection.addStatement(modelName, prefix + "NPI_EatingDisordersDistressItem_" + count, RDF.type.getURI(), prefix + "NPI_EatingDisordersDistressItem");
			tdbConnection.addStatement(modelName, prefix + "NPI_EatingDisordersTotItem_" + count, RDF.type.getURI(), prefix + "NPI_EatingDisordersTotItem");
			tdbConnection.addStatement(modelName, prefix + "NPI_EatingDisordersQuestionItem_1_" + count, RDF.type.getURI(), prefix + "NPI_EatingDisordersQuestionItem_1");
			tdbConnection.addStatement(modelName, prefix + "NPI_EatingDisordersQuestionItem_2_" + count, RDF.type.getURI(), prefix + "NPI_EatingDisordersQuestionItem_2");
			tdbConnection.addStatement(modelName, prefix + "NPI_EatingDisordersQuestionItem_3_" + count, RDF.type.getURI(), prefix + "NPI_EatingDisordersQuestionItem_3");
			tdbConnection.addStatement(modelName, prefix + "NPI_EatingDisordersQuestionItem_4_" + count, RDF.type.getURI(), prefix + "NPI_EatingDisordersQuestionItem_4");
			tdbConnection.addStatement(modelName, prefix + "NPI_EatingDisordersQuestionItem_5_" + count, RDF.type.getURI(), prefix + "NPI_EatingDisordersQuestionItem_5");
			tdbConnection.addStatement(modelName, prefix + "NPI_EatingDisordersQuestionItem_6_" + count, RDF.type.getURI(), prefix + "NPI_EatingDisordersQuestionItem_6");
			tdbConnection.addStatement(modelName, prefix + "NPI_EatingDisordersQuestionItem_7_" + count, RDF.type.getURI(), prefix + "NPI_EatingDisordersQuestionItem_7");
			tdbConnection.addStatement(modelName, prefix + "NPI_EatingDisordersQuestionItem_8_" + count, RDF.type.getURI(), prefix + "NPI_EatingDisordersQuestionItem_8");
			
			//Delusion insert value
			tdbConnection.addStatement(modelName, prefix + "NPI_DelusionsPresenceItem_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpia());
			tdbConnection.addStatement(modelName, prefix + "NPI_DelusionsFrequencyItem_" + count, prefix + "1_2_3_4_NPI_score_3", prefix + npiBean.getNpia10a());
			tdbConnection.addStatement(modelName, prefix + "NPI_DelusionsSeverityItem_" + count, prefix + "1_2_3_NPI_score_2", prefix + npiBean.getNpia10b());
			tdbConnection.addStatement(modelName, prefix + "NPI_DelusionsDistressItem_" + count, prefix + "0_1_2_3_4_5_NPI_score", prefix + npiBean.getNpia10c());
			tdbConnection.addStatement(modelName, prefix + "NPI_DelusionsTotItem_" + count, prefix + "totalScore", prefix + npiBean.getNpiatot());
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
			tdbConnection.addStatement(modelName, prefix + "NPI_HallucinationsPresenceItem_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpib());
			tdbConnection.addStatement(modelName, prefix + "NPI_HallucinationsFrequencyItem_" + count, prefix + "1_2_3_4_NPI_score_3", prefix + npiBean.getNpib8a());
			tdbConnection.addStatement(modelName, prefix + "NPI_HallucinationsSeverityItem_" + count, prefix + "1_2_3_NPI_score_2", prefix + npiBean.getNpib8b());
			tdbConnection.addStatement(modelName, prefix + "NPI_HallucinationsDistressItem_" + count, prefix + "0_1_2_3_4_5_NPI_score", prefix + npiBean.getNpib8c());
			tdbConnection.addStatement(modelName, prefix + "NPI_HallucinationsTotItem_" + count, prefix + "totalScore", prefix + npiBean.getNpibtot());
			tdbConnection.addStatement(modelName, prefix + "NPI_HallucinationsQuestionItem_1_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpib1());
			tdbConnection.addStatement(modelName, prefix + "NPI_HallucinationsQuestionItem_2_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpib2());
			tdbConnection.addStatement(modelName, prefix + "NPI_HallucinationsQuestionItem_3_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpib3());
			tdbConnection.addStatement(modelName, prefix + "NPI_HallucinationsQuestionItem_4_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpib4());
			tdbConnection.addStatement(modelName, prefix + "NPI_HallucinationsQuestionItem_5_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpib5());
			tdbConnection.addStatement(modelName, prefix + "NPI_HallucinationsQuestionItem_6_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpib6());
			tdbConnection.addStatement(modelName, prefix + "NPI_HallucinationsQuestionItem_7_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpib7());
			//Agitation/Aggression insert value
			tdbConnection.addStatement(modelName, prefix + "NPI_AgitationAggressionPresenceItem_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpic());
			tdbConnection.addStatement(modelName, prefix + "NPI_AgitationAggressionFrequencyItem_" + count, prefix + "1_2_3_4_NPI_score_3", prefix + npiBean.getNpic9a());
			tdbConnection.addStatement(modelName, prefix + "NPI_AgitationAggressionSeverityItem_" + count, prefix + "1_2_3_NPI_score_2", prefix + npiBean.getNpic9b());
			tdbConnection.addStatement(modelName, prefix + "NPI_AgitationAggressionDistressItem_" + count, prefix + "0_1_2_3_4_5_NPI_score", prefix + npiBean.getNpic9c());
			tdbConnection.addStatement(modelName, prefix + "NPI_AgitationAggressionTotItem_" + count, prefix + "totalScore", prefix + npiBean.getNpictot());
			tdbConnection.addStatement(modelName, prefix + "NPI_AgitationAggressionQuestionItem_1_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpic1());
			tdbConnection.addStatement(modelName, prefix + "NPI_AgitationAggressionQuestionItem_2_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpic2());
			tdbConnection.addStatement(modelName, prefix + "NPI_AgitationAggressionQuestionItem_3_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpic3());
			tdbConnection.addStatement(modelName, prefix + "NPI_AgitationAggressionQuestionItem_4_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpic4());
			tdbConnection.addStatement(modelName, prefix + "NPI_AgitationAggressionQuestionItem_5_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpic5());
			tdbConnection.addStatement(modelName, prefix + "NPI_AgitationAggressionQuestionItem_6_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpic6());
			tdbConnection.addStatement(modelName, prefix + "NPI_AgitationAggressionQuestionItem_7_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpic7());
			tdbConnection.addStatement(modelName, prefix + "NPI_AgitationAggressionQuestionItem_8_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpic8());
			//Depression/Dysphoria insert value
			tdbConnection.addStatement(modelName, prefix + "NPI_DepressionDysphoriaPresenceItem_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpid());
			tdbConnection.addStatement(modelName, prefix + "NPI_DepressionDysphoriaFrequencyItem_" + count, prefix + "1_2_3_4_NPI_score_3", prefix + npiBean.getNpid9a());
			tdbConnection.addStatement(modelName, prefix + "NPI_DepressionDysphoriaSeverityItem_" + count, prefix + "1_2_3_NPI_score_2", prefix + npiBean.getNpid9b());
			tdbConnection.addStatement(modelName, prefix + "NPI_DepressionDysphoriaDistressItem_" + count, prefix + "0_1_2_3_4_5_NPI_score", prefix + npiBean.getNpid9c());
			tdbConnection.addStatement(modelName, prefix + "NPI_DepressionDysphoriaTotItem_" + count, prefix + "totalScore", prefix + npiBean.getNpidtot());
			tdbConnection.addStatement(modelName, prefix + "NPI_DepressionDysphoriaQuestionItem_1_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpid1());
			tdbConnection.addStatement(modelName, prefix + "NPI_DepressionDysphoriaQuestionItem_2_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpid2());
			tdbConnection.addStatement(modelName, prefix + "NPI_DepressionDysphoriaQuestionItem_3_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpid3());
			tdbConnection.addStatement(modelName, prefix + "NPI_DepressionDysphoriaQuestionItem_4_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpid4());
			tdbConnection.addStatement(modelName, prefix + "NPI_DepressionDysphoriaQuestionItem_5_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpid5());
			tdbConnection.addStatement(modelName, prefix + "NPI_DepressionDysphoriaQuestionItem_6_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpid6());
			tdbConnection.addStatement(modelName, prefix + "NPI_DepressionDysphoriaQuestionItem_7_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpid7());
			tdbConnection.addStatement(modelName, prefix + "NPI_DepressionDysphoriaQuestionItem_8_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpid8());
			//Anxiety insert value
			tdbConnection.addStatement(modelName, prefix + "NPI_AnxietyPresenceItem_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpie());
			tdbConnection.addStatement(modelName, prefix + "NPI_AnxietyFrequencyItem_" + count, prefix + "1_2_3_4_NPI_score_3", prefix + npiBean.getNpie8a());
			tdbConnection.addStatement(modelName, prefix + "NPI_AnxietySeverityItem_" + count, prefix + "1_2_3_NPI_score_2", prefix + npiBean.getNpie8b());
			tdbConnection.addStatement(modelName, prefix + "NPI_AnxietyDistressItem_" + count, prefix + "0_1_2_3_4_5_NPI_score", prefix + npiBean.getNpie8c());
			tdbConnection.addStatement(modelName, prefix + "NPI_AnxietyTotItem_" + count, prefix + "totalScore", prefix + npiBean.getNpietot());
			tdbConnection.addStatement(modelName, prefix + "NPI_AnxietyQuestionItem_1_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpie1());
			tdbConnection.addStatement(modelName, prefix + "NPI_AnxietyQuestionItem_2_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpie2());
			tdbConnection.addStatement(modelName, prefix + "NPI_AnxietyQuestionItem_3_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpie3());
			tdbConnection.addStatement(modelName, prefix + "NPI_AnxietyQuestionItem_4_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpie4());
			tdbConnection.addStatement(modelName, prefix + "NPI_AnxietyQuestionItem_5_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpie5());
			tdbConnection.addStatement(modelName, prefix + "NPI_AnxietyQuestionItem_6_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpie6());
			tdbConnection.addStatement(modelName, prefix + "NPI_AnxietyQuestionItem_7_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpie7());
			//Elation/Euphoria insert value
			tdbConnection.addStatement(modelName, prefix + "NPI_ElationEuphoriaPresenceItem_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpif());
			tdbConnection.addStatement(modelName, prefix + "NPI_ElationEuphoriaFrequencyItem_" + count, prefix + "1_2_3_4_NPI_score_3", prefix + npiBean.getNpif8a());
			tdbConnection.addStatement(modelName, prefix + "NPI_ElationEuphoriaSeverityItem_" + count, prefix + "1_2_3_NPI_score_2", prefix + npiBean.getNpif8b());
			tdbConnection.addStatement(modelName, prefix + "NPI_ElationEuphoriaDistressItem_" + count, prefix + "0_1_2_3_4_5_NPI_score", prefix + npiBean.getNpif8c());
			tdbConnection.addStatement(modelName, prefix + "NPI_ElationEuphoriaTotItem_" + count, prefix + "totalScore", prefix + npiBean.getNpiftot());
			tdbConnection.addStatement(modelName, prefix + "NPI_ElationEuphoriaQuestionItem_1_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpif1());
			tdbConnection.addStatement(modelName, prefix + "NPI_ElationEuphoriaQuestionItem_2_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpif2());
			tdbConnection.addStatement(modelName, prefix + "NPI_ElationEuphoriaQuestionItem_3_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpif3());
			tdbConnection.addStatement(modelName, prefix + "NPI_ElationEuphoriaQuestionItem_4_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpif4());
			tdbConnection.addStatement(modelName, prefix + "NPI_ElationEuphoriaQuestionItem_5_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpif5());
			tdbConnection.addStatement(modelName, prefix + "NPI_ElationEuphoriaQuestionItem_6_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpif6());
			tdbConnection.addStatement(modelName, prefix + "NPI_ElationEuphoriaQuestionItem_7_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpif7());
			//Apathy / Indifference insert value
			tdbConnection.addStatement(modelName, prefix + "NPI_ApathyIndifferencePresenceItem_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpig1());
			tdbConnection.addStatement(modelName, prefix + "NPI_ApathyIndifferenceFrequencyItem_" + count, prefix + "1_2_3_4_NPI_score_3", prefix + npiBean.getNpig9a());
			tdbConnection.addStatement(modelName, prefix + "NPI_ApathyIndifferenceSeverityItem_" + count, prefix + "1_2_3_NPI_score_2", prefix + npiBean.getNpig9b());
			tdbConnection.addStatement(modelName, prefix + "NPI_ApathyIndifferenceDistressItem_" + count, prefix + "0_1_2_3_4_5_NPI_score", prefix + npiBean.getNpig9c());
			tdbConnection.addStatement(modelName, prefix + "NPI_ApathyIndifferenceTotItem_" + count, prefix + "totalScore", prefix + npiBean.getNpigtot());
			tdbConnection.addStatement(modelName, prefix + "NPI_ApathyIndifferenceQuestionItem_1_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpig1());
			tdbConnection.addStatement(modelName, prefix + "NPI_ApathyIndifferenceQuestionItem_2_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpig2());
			tdbConnection.addStatement(modelName, prefix + "NPI_ApathyIndifferenceQuestionItem_3_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpig3());
			tdbConnection.addStatement(modelName, prefix + "NPI_ApathyIndifferenceQuestionItem_4_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpig4());
			tdbConnection.addStatement(modelName, prefix + "NPI_ApathyIndifferenceQuestionItem_5_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpig5());
			tdbConnection.addStatement(modelName, prefix + "NPI_ApathyIndifferenceQuestionItem_6_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpig6());
			tdbConnection.addStatement(modelName, prefix + "NPI_ApathyIndifferenceQuestionItem_7_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpig7());
			tdbConnection.addStatement(modelName, prefix + "NPI_ApathyIndifferenceQuestionItem_8_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpig8());
			//Disinhibition insert value
			tdbConnection.addStatement(modelName, prefix + "NPI_DisinhibitionPresenceItem_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpih());
			tdbConnection.addStatement(modelName, prefix + "NPI_DisinhibitionFrequencyItem_" + count, prefix + "1_2_3_4_NPI_score_3", prefix + npiBean.getNpih8a());
			tdbConnection.addStatement(modelName, prefix + "NPI_DisinhibitionSeverityItem_" + count, prefix + "1_2_3_NPI_score_2", prefix + npiBean.getNpih8b());
			tdbConnection.addStatement(modelName, prefix + "NPI_DisinhibitionDistressItem_" + count, prefix + "0_1_2_3_4_5_NPI_score", prefix + npiBean.getNpih8c());
			tdbConnection.addStatement(modelName, prefix + "NPI_DisinhibitionTotItem_" + count, prefix + "totalScore", prefix + npiBean.getNpihtot());
			tdbConnection.addStatement(modelName, prefix + "NPI_DisinhibitionQuestionItem_1_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpih1());
			tdbConnection.addStatement(modelName, prefix + "NPI_DisinhibitionQuestionItem_2_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpih2());
			tdbConnection.addStatement(modelName, prefix + "NPI_DisinhibitionQuestionItem_3_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpih3());
			tdbConnection.addStatement(modelName, prefix + "NPI_DisinhibitionQuestionItem_4_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpih4());
			tdbConnection.addStatement(modelName, prefix + "NPI_DisinhibitionQuestionItem_5_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpih5());
			tdbConnection.addStatement(modelName, prefix + "NPI_DisinhibitionQuestionItem_6_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpih6());
			tdbConnection.addStatement(modelName, prefix + "NPI_DisinhibitionQuestionItem_7_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpih7());
			//Irritability/ Lability insert value
			tdbConnection.addStatement(modelName, prefix + "NPI_IrritabilityLabilityPresenceItem_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpii());
			tdbConnection.addStatement(modelName, prefix + "NPI_IrritabilityLabilityFrequencyItem_" + count, prefix + "1_2_3_4_NPI_score_3", prefix + npiBean.getNpii8a());
			tdbConnection.addStatement(modelName, prefix + "NPI_IrritabilityLabilitySeverityItem_" + count, prefix + "1_2_3_NPI_score_2", prefix + npiBean.getNpii8b());
			tdbConnection.addStatement(modelName, prefix + "NPI_IrritabilityLabilityDistressItem_" + count, prefix + "0_1_2_3_4_5_NPI_score", prefix + npiBean.getNpii8c());
			tdbConnection.addStatement(modelName, prefix + "NPI_IrritabilityLabilityTotItem_" + count, prefix + "totalScore", prefix + npiBean.getNpiitot());
			tdbConnection.addStatement(modelName, prefix + "NPI_IrritabilityLabilityQuestionItem_1_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpii1());
			tdbConnection.addStatement(modelName, prefix + "NPI_IrritabilityLabilityQuestionItem_2_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpii2());
			tdbConnection.addStatement(modelName, prefix + "NPI_IrritabilityLabilityQuestionItem_3_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpii3());
			tdbConnection.addStatement(modelName, prefix + "NPI_IrritabilityLabilityQuestionItem_4_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpii4());
			tdbConnection.addStatement(modelName, prefix + "NPI_IrritabilityLabilityQuestionItem_5_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpii5());
			tdbConnection.addStatement(modelName, prefix + "NPI_IrritabilityLabilityQuestionItem_6_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpii6());
			tdbConnection.addStatement(modelName, prefix + "NPI_IrritabilityLabilityQuestionItem_7_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpii7());
			//Aberrant Motor Behaviour insert value
			tdbConnection.addStatement(modelName, prefix + "NPI_AberrantMotorBehaviourPresenceItem_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpij());
			tdbConnection.addStatement(modelName, prefix + "NPI_AberrantMotorBehaviourFrequencyItem_" + count, prefix + "1_2_3_4_NPI_score_3", prefix + npiBean.getNpij8a());
			tdbConnection.addStatement(modelName, prefix + "NPI_AberrantMotorBehaviourSeverityItem_" + count, prefix + "1_2_3_NPI_score_2", prefix + npiBean.getNpij8b());
			tdbConnection.addStatement(modelName, prefix + "NPI_AberrantMotorBehaviourDistressItem_" + count, prefix + "0_1_2_3_4_5_NPI_score", prefix + npiBean.getNpij8c());
			tdbConnection.addStatement(modelName, prefix + "NPI_AberrantMotorBehaviourTotItem_" + count, prefix + "totalScore", prefix + npiBean.getNpijtot());
			tdbConnection.addStatement(modelName, prefix + "NPI_AberrantMotorBehaviourQuestionItem_1_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpij1());
			tdbConnection.addStatement(modelName, prefix + "NPI_AberrantMotorBehaviourQuestionItem_2_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpij2());
			tdbConnection.addStatement(modelName, prefix + "NPI_AberrantMotorBehaviourQuestionItem_3_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpij3());
			tdbConnection.addStatement(modelName, prefix + "NPI_AberrantMotorBehaviourQuestionItem_4_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpij4());
			tdbConnection.addStatement(modelName, prefix + "NPI_AberrantMotorBehaviourQuestionItem_5_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpij5());
			tdbConnection.addStatement(modelName, prefix + "NPI_AberrantMotorBehaviourQuestionItem_6_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpij6());
			tdbConnection.addStatement(modelName, prefix + "NPI_AberrantMotorBehaviourQuestionItem_7_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpij7());
			//Sleep Disorders insert value
			tdbConnection.addStatement(modelName, prefix + "NPI_SleepPresenceItem_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpik1());
			tdbConnection.addStatement(modelName, prefix + "NPI_SleepFrequencyItem_" + count, prefix + "1_2_3_4_NPI_score_3", prefix + npiBean.getNpik1());
			tdbConnection.addStatement(modelName, prefix + "NPI_SleepSeverityItem_" + count, prefix + "1_2_3_NPI_score_2", prefix + npiBean.getNpik1());
			tdbConnection.addStatement(modelName, prefix + "NPI_SleepDistressItem_" + count, prefix + "0_1_2_3_4_5_NPI_score", prefix + npiBean.getNpik1());
			tdbConnection.addStatement(modelName, prefix + "NPI_SleepTotItem_" + count, prefix + "totalScore", prefix + npiBean.getNpik1());
			tdbConnection.addStatement(modelName, prefix + "NPI_SleepQuestionItem_1_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpik1());
			tdbConnection.addStatement(modelName, prefix + "NPI_SleepQuestionItem_2_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpik2());
			tdbConnection.addStatement(modelName, prefix + "NPI_SleepQuestionItem_3_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpik3());
			tdbConnection.addStatement(modelName, prefix + "NPI_SleepQuestionItem_4_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpik4());
			tdbConnection.addStatement(modelName, prefix + "NPI_SleepQuestionItem_5_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpik5());
			tdbConnection.addStatement(modelName, prefix + "NPI_SleepQuestionItem_6_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpik6());
			tdbConnection.addStatement(modelName, prefix + "NPI_SleepQuestionItem_7_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpik7());
			tdbConnection.addStatement(modelName, prefix + "NPI_SleepQuestionItem_8_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpik8());
			//Eating Disorders insert value
			tdbConnection.addStatement(modelName, prefix + "NPI_EatingDisordersPresenceItem_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpil());
			tdbConnection.addStatement(modelName, prefix + "NPI_EatingDisordersFrequencyItem_" + count, prefix + "1_2_3_4_NPI_score_3", prefix + npiBean.getNpil9a());
			tdbConnection.addStatement(modelName, prefix + "NPI_EatingDisordersSeverityItem_" + count, prefix + "0_1_2_3_4_5_NPI_score", prefix + npiBean.getNpil9b());
			tdbConnection.addStatement(modelName, prefix + "NPI_EatingDisordersTotItem_" + count, prefix + "totalScore", prefix + npiBean.getNpil9c());
			tdbConnection.addStatement(modelName, prefix + "NPI_EatingDisordersQuestionItem_1_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpiltot());
			tdbConnection.addStatement(modelName, prefix + "NPI_EatingDisordersQuestionItem_1_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpil1());
			tdbConnection.addStatement(modelName, prefix + "NPI_EatingDisordersQuestionItem_2_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpil2());
			tdbConnection.addStatement(modelName, prefix + "NPI_EatingDisordersQuestionItem_3_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpil3());
			tdbConnection.addStatement(modelName, prefix + "NPI_EatingDisordersQuestionItem_4_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpil4());
			tdbConnection.addStatement(modelName, prefix + "NPI_EatingDisordersQuestionItem_5_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpil5());
			tdbConnection.addStatement(modelName, prefix + "NPI_EatingDisordersQuestionItem_6_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpil6());
			tdbConnection.addStatement(modelName, prefix + "NPI_EatingDisordersQuestionItem_7_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpil7());
			tdbConnection.addStatement(modelName, prefix + "NPI_EatingDisordersQuestionItem_8_" + count, prefix + "yesNoAnswer", prefix + npiBean.getNpil8());
			
		} catch (Exception e) {

			e.printStackTrace();
		}

		tdbConnection.close();
		TDBUtil.removeLock();
	}
}
