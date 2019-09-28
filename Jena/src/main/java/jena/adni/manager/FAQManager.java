package jena.adni.manager;

import java.io.File;

import com.hp.hpl.jena.vocabulary.RDF;

import jena.adni.bean.FAQBean;
import jena.adni.constants.ADNIExternalResource;
import jena.adni.util.TDBUtil;
import jena.test1.TDBConnection;

public class FAQManager {


	public void insertInADNIOntology(FAQBean faqBean, int count) {

		TDBConnection tdbConnection = new TDBConnection(ADNIExternalResource.getInstance().getADNI_HOME() + File.separator + "ADNIONTOLOGYSOURCE" + File.separator + "TDBDatabase");

		String prefix = ADNIExternalResource.getPrefix();
		String modelName = ADNIExternalResource.getModelname();

		try {

			tdbConnection.addStatement(modelName, prefix + "FAQ_" + count, RDF.type.getURI(), prefix + "FAQ");
			tdbConnection.addStatement(modelName, prefix + faqBean.getSubjectDataBean().getRID(), RDF.type.getURI(), prefix + "Subject");
			tdbConnection.addStatement(modelName, prefix + faqBean.getSubjectDataBean().getRID(), RDF.type.getURI(), "http://www.w3.org/2002/07/owl#NamedIndividual");
			tdbConnection.addStatement(modelName, prefix + faqBean.getSubjectDataBean().getRID(), prefix + "hasStandardizedAssesment", prefix + "FAQ_" + count);

			tdbConnection.addStatement(modelName, prefix + "FAQ_" + count, prefix + "hasAssesmentItem", prefix + "FAQ_FinancesItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "FAQ_" + count, prefix + "hasAssesmentItem", prefix + "FAQ_FormsItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "FAQ_" + count, prefix + "hasAssesmentItem", prefix + "FAQ_ShopItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "FAQ_" + count, prefix + "hasAssesmentItem", prefix + "FAQ_GamesItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "FAQ_" + count, prefix + "hasAssesmentItem", prefix + "FAQ_BeveragesItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "FAQ_" + count, prefix + "hasAssesmentItem", prefix + "FAQ_MealItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "FAQ_" + count, prefix + "hasAssesmentItem", prefix + "FAQ_EventsItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "FAQ_" + count, prefix + "hasAssesmentItem", prefix + "FAQ_TelevisionItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "FAQ_" + count, prefix + "hasAssesmentItem", prefix + "FAQ_MemoryItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "FAQ_" + count, prefix + "hasAssesmentItem", prefix + "FAQ_TravelItem_" + count);
			tdbConnection.addStatement(modelName, prefix + "FAQ_" + count, prefix + "hasAssesmentItem", prefix + "FAQ_Total_" + count);

			tdbConnection.addStatement(modelName, prefix + "FAQ_FinancesItem_" + count, RDF.type.getURI(), prefix + "FAQ_FinancesItem");
			tdbConnection.addStatement(modelName, prefix + "FAQ_FormsItem_" + count, RDF.type.getURI(), prefix + "FAQ_FormsItem");
			tdbConnection.addStatement(modelName, prefix + "FAQ_ShopItem_" + count, RDF.type.getURI(), prefix + "FAQ_ShopItem");
			tdbConnection.addStatement(modelName, prefix + "FAQ_GamesItem_" + count, RDF.type.getURI(), prefix + "FAQ_GamesItem");
			tdbConnection.addStatement(modelName, prefix + "FAQ_BeveragesItem_" + count, RDF.type.getURI(), prefix + "FAQ_BeveragesItem");
			tdbConnection.addStatement(modelName, prefix + "FAQ_MealItem_" + count, RDF.type.getURI(), prefix + "FAQ_MealItem");
			tdbConnection.addStatement(modelName, prefix + "FAQ_EventsItem_" + count, RDF.type.getURI(), prefix + "FAQ_EventsItem");
			tdbConnection.addStatement(modelName, prefix + "FAQ_TelevisionItem_" + count, RDF.type.getURI(), prefix + "FAQ_TelevisionItem");
			tdbConnection.addStatement(modelName, prefix + "FAQ_MemoryItem_" + count, RDF.type.getURI(), prefix + "FAQ_MemoryItem");
			tdbConnection.addStatement(modelName, prefix + "FAQ_TravelItem_" + count, RDF.type.getURI(), prefix + "FAQ_TravelItem");
			tdbConnection.addStatement(modelName, prefix + "FAQ_Total_" + count, RDF.type.getURI(), prefix + "FAQ_Total");	

			tdbConnection.addStatement(modelName, prefix + "FAQ_FinancesItem_" + count, prefix + "0_1_2_3_4_5_score", prefix + faqBean.getFAQFinance());
			tdbConnection.addStatement(modelName, prefix + "FAQ_FormsItem_" + count, prefix + "0_1_2_3_4_5_score", prefix + faqBean.getFAQForm());
			tdbConnection.addStatement(modelName, prefix + "FAQ_ShopItem_" + count, prefix + "0_1_2_3_4_5_score", prefix + faqBean.getFAQShop());
			tdbConnection.addStatement(modelName, prefix + "FAQ_GamesItem_" + count, prefix + "0_1_2_3_4_5_score", prefix + faqBean.getFAQGame());
			tdbConnection.addStatement(modelName, prefix + "FAQ_BeveragesItem_" + count, prefix + "0_1_2_3_4_5_score", prefix + faqBean.getFAQBevarege());
			tdbConnection.addStatement(modelName, prefix + "FAQ_MealItem_" + count, prefix + "0_1_2_3_4_5_score", prefix + faqBean.getFAQMeal());
			tdbConnection.addStatement(modelName, prefix + "FAQ_EventsItem_" + count, prefix + "0_1_2_3_4_5_score", prefix + faqBean.getFAQEvent());
			tdbConnection.addStatement(modelName, prefix + "FAQ_TelevisionItem_" + count, prefix + "0_1_2_3_4_5_score", prefix + faqBean.getFAQTv());
			tdbConnection.addStatement(modelName, prefix + "FAQ_MemoryItem_" + count, prefix + "0_1_2_3_4_5_score", prefix + faqBean.getFAQRem());
			tdbConnection.addStatement(modelName, prefix + "FAQ_TravelItem_" + count, prefix + "0_1_2_3_4_5_score", prefix + faqBean.getFAQTravel());
			tdbConnection.addStatement(modelName, prefix + "FAQ_Total_" + count, prefix + "totalScore", prefix + faqBean.getFAQTotal());		

		} catch (Exception e) {

			e.printStackTrace();
		}

		tdbConnection.close();
		TDBUtil.removeLock();
	}
}
