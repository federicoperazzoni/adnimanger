package jena.adni.manager;

import java.io.File;

import com.hp.hpl.jena.vocabulary.RDF;

import jena.adni.bean.NPIQBean;
import jena.adni.constants.ADNIExternalResource;
import jena.adni.util.TDBUtil;
import jena.test1.TDBConnection;

public class NPIQManager {


	public void insertInADNIOntology(NPIQBean npiqBean, int count) {

		TDBConnection tdbConnection = new TDBConnection(ADNIExternalResource.getInstance().getADNI_HOME() + File.separator + "ADNIONTOLOGYSOURCE" + File.separator + "TDBDatabase");

		String prefix = ADNIExternalResource.getPrefix();
		String modelName = ADNIExternalResource.getModelname();

		try {

			tdbConnection.addStatement(modelName, prefix + "NPIQ_" + count, RDF.type.getURI(), prefix + "NPIQ");
			tdbConnection.addStatement(modelName, prefix + npiqBean.getSubjectDataBean().getRID(), RDF.type.getURI(), prefix + "Subject");
			tdbConnection.addStatement(modelName, prefix + npiqBean.getSubjectDataBean().getRID(), RDF.type.getURI(), "http://www.w3.org/2002/07/owl#NamedIndividual");
			tdbConnection.addStatement(modelName, prefix + npiqBean.getSubjectDataBean().getRID(), prefix + "hasStandardizedAssesment", prefix + "NPIQ_" + count);
			
			tdbConnection.addStatement(modelName, prefix + "NPIQ_" + count, prefix + "hasAssesmentItem", prefix + "NPIQ_PresenceOfAberrantMotorBehaviorItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPIQ_" + count, prefix + "hasAssesmentItem", prefix + "NPIQ_PresenceOfAgitationAggressionItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPIQ_" + count, prefix + "hasAssesmentItem", prefix + "NPIQ_PresenceOfAnxietyItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPIQ_" + count, prefix + "hasAssesmentItem", prefix + "NPIQ_PresenceOfApathyIndifferenceItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPIQ_" + count, prefix + "hasAssesmentItem", prefix + "NPIQ_PresenceOfAppetiteDisordersItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPIQ_" + count, prefix + "hasAssesmentItem", prefix + "NPIQ_PresenceOfDelusionsItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPIQ_" + count, prefix + "hasAssesmentItem", prefix + "NPIQ_PresenceOfDepressionDysphoriaItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPIQ_" + count, prefix + "hasAssesmentItem", prefix + "NPIQ_PresenceOfDishinibitionItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPIQ_" + count, prefix + "hasAssesmentItem", prefix + "NPIQ_PresenceOfElationEuphoriaItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPIQ_" + count, prefix + "hasAssesmentItem", prefix + "NPIQ_PresenceOfHallucinationsItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPIQ_" + count, prefix + "hasAssesmentItem", prefix + "NPIQ_PresenceOfIrritabilityLabilityItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "NPIQ_" + count, prefix + "hasAssesmentItem", prefix + "NPIQ_PresenceOfSleepDisordersItem_" + count);
			
			tdbConnection.addStatement(modelName, prefix + "NPIQ_PresenceOfAberrantMotorBehaviorItem_" + count, RDF.type.getURI(), prefix + "NPIQ_PresenceOfAberrantMotorBehaviorItem");
			tdbConnection.addStatement(modelName, prefix + "NPIQ_PresenceOfAgitationAggressionItem_" + count, RDF.type.getURI(), prefix + "NPIQ_PresenceOfAgitationAggressionItem");
			tdbConnection.addStatement(modelName, prefix + "NPIQ_PresenceOfAnxietyItem_" + count, RDF.type.getURI(), prefix + "NPIQ_PresenceOfAnxietyItem");
			tdbConnection.addStatement(modelName, prefix + "NPIQ_PresenceOfApathyIndifferenceItem_" + count, RDF.type.getURI(), prefix + "NPIQ_PresenceOfApathyIndifferenceItem");
			tdbConnection.addStatement(modelName, prefix + "NPIQ_PresenceOfAppetiteDisordersItem_" + count, RDF.type.getURI(), prefix + "NPIQ_PresenceOfAppetiteDisordersItem");
			tdbConnection.addStatement(modelName, prefix + "NPIQ_PresenceOfDelusionsItem_" + count, RDF.type.getURI(), prefix + "NPIQ_PresenceOfDelusionsItem");
			tdbConnection.addStatement(modelName, prefix + "NPIQ_PresenceOfDepressionDysphoriaItem_" + count, RDF.type.getURI(), prefix + "NPIQ_PresenceOfDepressionDysphoriaItem");
			tdbConnection.addStatement(modelName, prefix + "NPIQ_PresenceOfDishinibitionItem_" + count, RDF.type.getURI(), prefix + "NPIQ_PresenceOfDishinibitionItem");
			tdbConnection.addStatement(modelName, prefix + "NPIQ_PresenceOfElationEuphoriaItem_" + count, RDF.type.getURI(), prefix + "NPIQ_PresenceOfElationEuphoriaItem");
			tdbConnection.addStatement(modelName, prefix + "NPIQ_PresenceOfHallucinationsItem_" + count, RDF.type.getURI(), prefix + "NPIQ_PresenceOfHallucinationsItem");
			tdbConnection.addStatement(modelName, prefix + "NPIQ_PresenceOfIrritabilityLabilityItem_" + count, RDF.type.getURI(), prefix + "NPIQ_PresenceOfIrritabilityLabilityItem");
			tdbConnection.addStatement(modelName, prefix + "NPIQ_PresenceOfSleepDisordersItem_" + count, RDF.type.getURI(), prefix + "NPIQ_PresenceOfSleepDisordersItem");
			
			tdbConnection.addStatement(modelName, prefix + "NPIQ_PresenceOfAberrantMotorBehaviorItem_" + count, prefix + "0_1_2_3_NPIQ_score", prefix + npiqBean.getNpij());
			tdbConnection.addStatement(modelName, prefix + "NPIQ_PresenceOfAberrantMotorBehaviorItem_" + count, prefix + "yesNoAnswer", prefix + npiqBean.getNpijsev());
			tdbConnection.addStatement(modelName, prefix + "NPIQ_PresenceOfAgitationAggressionItem_" + count, prefix + "0_1_2_3_NPIQ_score", prefix + npiqBean.getNpic());
			tdbConnection.addStatement(modelName, prefix + "NPIQ_PresenceOfAgitationAggressionItem_" + count, prefix + "yesNoAnswer", prefix + npiqBean.getNpicsev());
			tdbConnection.addStatement(modelName, prefix + "NPIQ_PresenceOfAnxietyItem_" + count, prefix + "0_1_2_3_NPIQ_score", prefix + npiqBean.getNpie());
			tdbConnection.addStatement(modelName, prefix + "NPIQ_PresenceOfAnxietyItem_" + count, prefix + "yesNoAnswer", prefix + npiqBean.getNpiesev());
			tdbConnection.addStatement(modelName, prefix + "NPIQ_PresenceOfApathyIndifferenceItem_" + count, prefix + "0_1_2_3_NPIQ_score", prefix + npiqBean.getNpig());
			tdbConnection.addStatement(modelName, prefix + "NPIQ_PresenceOfApathyIndifferenceItem_" + count, prefix + "yesNoAnswer", prefix + npiqBean.getNpigsev());
			tdbConnection.addStatement(modelName, prefix + "NPIQ_PresenceOfAppetiteDisordersItem_" + count, prefix + "0_1_2_3_NPIQ_score", prefix + npiqBean.getNpil());
			tdbConnection.addStatement(modelName, prefix + "NPIQ_PresenceOfAppetiteDisordersItem_" + count, prefix + "yesNoAnswer", prefix + npiqBean.getNpilsev());
			tdbConnection.addStatement(modelName, prefix + "NPIQ_PresenceOfDelusionsItem_" + count, prefix + "0_1_2_3_NPIQ_score", prefix + npiqBean.getNpia());
			tdbConnection.addStatement(modelName, prefix + "NPIQ_PresenceOfDelusionsItem_" + count, prefix + "yesNoAnswer", prefix + npiqBean.getNpiasev());
			tdbConnection.addStatement(modelName, prefix + "NPIQ_PresenceOfDepressionDysphoriaItem_" + count, prefix + "0_1_2_3_NPIQ_score", prefix + npiqBean.getNpid());
			tdbConnection.addStatement(modelName, prefix + "NPIQ_PresenceOfDepressionDysphoriaItem_" + count, prefix + "yesNoAnswer", prefix + npiqBean.getNpidsev());
			tdbConnection.addStatement(modelName, prefix + "NPIQ_PresenceOfDishinibitionItem_" + count, prefix + "0_1_2_3_NPIQ_score", prefix + npiqBean.getNpih());
			tdbConnection.addStatement(modelName, prefix + "NPIQ_PresenceOfDishinibitionItem_" + count, prefix + "yesNoAnswer", prefix + npiqBean.getNpihsev());
			tdbConnection.addStatement(modelName, prefix + "NPIQ_PresenceOfElationEuphoriaItem_" + count, prefix + "0_1_2_3_NPIQ_score", prefix + npiqBean.getNpif());
			tdbConnection.addStatement(modelName, prefix + "NPIQ_PresenceOfElationEuphoriaItem_" + count, prefix + "yesNoAnswer", prefix + npiqBean.getNpifsev());
			tdbConnection.addStatement(modelName, prefix + "NPIQ_PresenceOfHallucinationsItem_" + count, prefix + "0_1_2_3_NPIQ_score", prefix + npiqBean.getNpib());
			tdbConnection.addStatement(modelName, prefix + "NPIQ_PresenceOfHallucinationsItem_" + count, prefix + "yesNoAnswer", prefix + npiqBean.getNpibsev());
			tdbConnection.addStatement(modelName, prefix + "NPIQ_PresenceOfIrritabilityLabilityItem_" + count, prefix + "0_1_2_3_NPIQ_score", prefix + npiqBean.getNpii());
			tdbConnection.addStatement(modelName, prefix + "NPIQ_PresenceOfIrritabilityLabilityItem_" + count, prefix + "yesNoAnswer", prefix + npiqBean.getNpiisev());
			tdbConnection.addStatement(modelName, prefix + "NPIQ_PresenceOfSleepDisordersItem_" + count, prefix + "0_1_2_3_NPIQ_score", prefix + npiqBean.getNpik());
			tdbConnection.addStatement(modelName, prefix + "NPIQ_PresenceOfSleepDisordersItem_" + count, prefix + "yesNoAnswer", prefix + npiqBean.getNpiksev());
			
		} catch (Exception e) {

			e.printStackTrace();
		}

		tdbConnection.close();
		TDBUtil.removeLock();
	}
}
