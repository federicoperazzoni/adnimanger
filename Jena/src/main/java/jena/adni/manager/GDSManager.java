package jena.adni.manager;

import java.io.File;

import com.hp.hpl.jena.vocabulary.RDF;

import jena.adni.bean.GDSBean;
import jena.adni.constants.ADNIExternalResource;
import jena.adni.util.TDBUtil;
import jena.test1.TDBConnection;

public class GDSManager {


	public void insertInADNIOntology(GDSBean gdsBean, int count) {

		TDBConnection tdbConnection = new TDBConnection(ADNIExternalResource.getInstance().getADNI_HOME() + File.separator + "ADNIONTOLOGYSOURCE" + File.separator + "TDBDatabase");

		String prefix = ADNIExternalResource.getPrefix();
		String modelName = ADNIExternalResource.getModelname();

		try {

			tdbConnection.addStatement(modelName, prefix + "GDS_" + count, RDF.type.getURI(), prefix + "GDS");
			tdbConnection.addStatement(modelName, prefix + gdsBean.getSubjectDataBean().getRID(), RDF.type.getURI(), prefix + "Subject");
			tdbConnection.addStatement(modelName, prefix + gdsBean.getSubjectDataBean().getRID(), RDF.type.getURI(), "http://www.w3.org/2002/07/owl#NamedIndividual");
			tdbConnection.addStatement(modelName, prefix + gdsBean.getSubjectDataBean().getRID(), prefix + "hasStandardizedAssesment", prefix + "GDS_" + count);
			
			tdbConnection.addStatement(modelName, prefix + "GDS_" + count, prefix + "hasAssesmentItem", prefix + "GDS_AliveFeelingItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "GDS_" + count, prefix + "hasAssesmentItem", prefix + "GDS_BoredomeItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "GDS_" + count, prefix + "hasAssesmentItem", prefix + "GDS_DroppingItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "GDS_" + count, prefix + "hasAssesmentItem", prefix + "GDS_EmptinessItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "GDS_" + count, prefix + "hasAssesmentItem", prefix + "GDS_EnergyItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "GDS_" + count, prefix + "hasAssesmentItem", prefix + "GDS_FearItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "GDS_" + count, prefix + "hasAssesmentItem", prefix + "GDS_GoodSpiritItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "GDS_" + count, prefix + "hasAssesmentItem", prefix + "GDS_HappinessItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "GDS_" + count, prefix + "hasAssesmentItem", prefix + "GDS_HelplessnessItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "GDS_" + count, prefix + "hasAssesmentItem", prefix + "GDS_HomeStayingItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "GDS_" + count, prefix + "hasAssesmentItem", prefix + "GDS_HopeItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "GDS_" + count, prefix + "hasAssesmentItem", prefix + "GDS_MemoryItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "GDS_" + count, prefix + "hasAssesmentItem", prefix + "GDS_PeopleItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "GDS_" + count, prefix + "hasAssesmentItem", prefix + "GDS_SatisfactionItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "GDS_" + count, prefix + "hasAssesmentItem", prefix + "GDS_WorthlessItem_" + count);
			
			tdbConnection.addStatement(modelName, prefix + "GDS_AliveFeelingItem_" + count, RDF.type.getURI(), prefix + "CDR_CommunityAffairsItem");
			tdbConnection.addStatement(modelName, prefix + "GDS_BoredomeItem_" + count, RDF.type.getURI(), prefix + "GDS_BoredomeItem");
			tdbConnection.addStatement(modelName, prefix + "GDS_DroppingItem_" + count, RDF.type.getURI(), prefix + "GDS_DroppingItem");
			tdbConnection.addStatement(modelName, prefix + "GDS_EmptinessItem_" + count, RDF.type.getURI(), prefix + "GDS_EmptinessItem");
			tdbConnection.addStatement(modelName, prefix + "GDS_EnergyItem_" + count, RDF.type.getURI(), prefix + "GDS_EnergyItem");
			tdbConnection.addStatement(modelName, prefix + "GDS_FearItem_" + count, RDF.type.getURI(), prefix + "GDS_FearItem");
			tdbConnection.addStatement(modelName, prefix + "GDS_GoodSpiritItem_" + count, RDF.type.getURI(), prefix + "GDS_GoodSpiritItem");
			tdbConnection.addStatement(modelName, prefix + "GDS_HappinessItem_" + count, RDF.type.getURI(), prefix + "GDS_HappinessItem");
			tdbConnection.addStatement(modelName, prefix + "GDS_HelplessnessItem_" + count, RDF.type.getURI(), prefix + "GDS_HelplessnessItem");
			tdbConnection.addStatement(modelName, prefix + "GDS_HomeStayingItem_" + count, RDF.type.getURI(), prefix + "GDS_HomeStayingItem");
			tdbConnection.addStatement(modelName, prefix + "GDS_HopeItem_" + count, RDF.type.getURI(), prefix + "GDS_HomeStayingItem");
			tdbConnection.addStatement(modelName, prefix + "GDS_MemoryItem_" + count, RDF.type.getURI(), prefix + "GDS_HomeStayingItem");
			tdbConnection.addStatement(modelName, prefix + "GDS_PeopleItem_" + count, RDF.type.getURI(), prefix + "GDS_PeopleItem");
			tdbConnection.addStatement(modelName, prefix + "GDS_SatisfactionItem_" + count, RDF.type.getURI(), prefix + "GDS_SatisfactionItem");
			tdbConnection.addStatement(modelName, prefix + "GDS_WorthlessItem_" + count, RDF.type.getURI(), prefix + "GDS_WorthlessItem");
			
			tdbConnection.addStatement(modelName, prefix + "GDS_AliveFeelingItem_" + count, prefix + "yesNoAnswer", prefix + gdsBean.getGdalive());
			tdbConnection.addStatement(modelName, prefix + "GDS_BoredomeItem_" + count, prefix + "yesNoAnswer", prefix + gdsBean.getGdbored());
			tdbConnection.addStatement(modelName, prefix + "GDS_DroppingItem_" + count, prefix + "yesNoAnswer", prefix + gdsBean.getGddrop());
			tdbConnection.addStatement(modelName, prefix + "GDS_EmptinessItem_" + count, prefix + "yesNoAnswer", prefix + gdsBean.getGdempty());
			tdbConnection.addStatement(modelName, prefix + "GDS_EnergyItem_" + count, prefix + "yesNoAnswer", prefix + gdsBean.getGdenergy());
			tdbConnection.addStatement(modelName, prefix + "GDS_FearItem_" + count, prefix + "yesNoAnswer", prefix + gdsBean.getGdafraid());
			tdbConnection.addStatement(modelName, prefix + "GDS_GoodSpiritItem_" + count, prefix + "yesNoAnswer", prefix + gdsBean.getGdspirit());
			tdbConnection.addStatement(modelName, prefix + "GDS_HappinessItem_" + count, prefix + "yesNoAnswer", prefix + gdsBean.getGdhappy());
			tdbConnection.addStatement(modelName, prefix + "GDS_HelplessnessItem_" + count, prefix + "yesNoAnswer", prefix + gdsBean.getGdhelp());
			tdbConnection.addStatement(modelName, prefix + "GDS_HomeStayingItem_" + count, prefix + "yesNoAnswer", prefix + gdsBean.getGdhome());
			tdbConnection.addStatement(modelName, prefix + "GDS_HopeItem_" + count, prefix + "yesNoAnswer", prefix + gdsBean.getGdhope());
			tdbConnection.addStatement(modelName, prefix + "GDS_MemoryItem_" + count, prefix + "yesNoAnswer", prefix + gdsBean.getGdmemory());
			tdbConnection.addStatement(modelName, prefix + "GDS_PeopleItem_" + count, prefix + "yesNoAnswer", prefix + gdsBean.getGdbetter());
			tdbConnection.addStatement(modelName, prefix + "GDS_SatisfactionItem_" + count, prefix + "yesNoAnswer", prefix + gdsBean.getGdsatis());
			tdbConnection.addStatement(modelName, prefix + "GDS_WorthlessItem_" + count, prefix + "yesNoAnswer", prefix + gdsBean.getGdworth());

		} catch (Exception e) {

			e.printStackTrace();
		}

		tdbConnection.close();
		TDBUtil.removeLock();
	}
}
