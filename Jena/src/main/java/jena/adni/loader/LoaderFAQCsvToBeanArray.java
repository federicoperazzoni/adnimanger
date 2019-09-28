package jena.adni.loader;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import jena.adni.bean.CDRBean;
import jena.adni.bean.FAQBean;
import jena.adni.bean.SubjectDataBean;
import jena.adni.main.LoadCsv;
import jena.adni.manager.FAQManager;

public class LoaderFAQCsvToBeanArray {

	public void load(String pathCsv) {

		Path myPath = Paths.get(pathCsv);

		CSVParser parser = new CSVParserBuilder().withSeparator(';').build();

		try { BufferedReader br = Files.newBufferedReader(myPath, 
				StandardCharsets.UTF_8);
		CSVReader reader = new CSVReaderBuilder(br).withCSVParser(parser)
				.build();

		List<String[]> rows = reader.readAll();

		int count = 0;
		int total = rows.size();
		FAQManager faqManager = new FAQManager();
		
		for (String[] row : rows) {

			if (count > 0) {

				FAQBean faqBean = new FAQBean();

				faqBean.setFAQSource(row[9].replaceAll("\"", ""));
				faqBean.setFAQFinance(row[10].replaceAll("\"", ""));
				faqBean.setFAQForm(row[11].replaceAll("\"", ""));
				faqBean.setFAQShop(row[12].replaceAll("\"", ""));
				faqBean.setFAQGame(row[13].replaceAll("\"", ""));
				faqBean.setFAQBevarege(row[14].replaceAll("\"", ""));
				faqBean.setFAQMeal(row[15].replaceAll("\"", ""));
				faqBean.setFAQEvent(row[16].replaceAll("\"", ""));
				faqBean.setFAQTv(row[17].replaceAll("\"", ""));
				faqBean.setFAQRem(row[18].replaceAll("\"", ""));
				faqBean.setFAQTravel(row[19].replaceAll("\"", ""));
				faqBean.setFAQTotal(row[20].replaceAll("\"", ""));
				
				faqBean.setSubjectDataBean(new SubjectDataBean());
				
				faqBean.getSubjectDataBean().setRID(row[2].replaceAll("\"", ""));

				faqManager.insertInADNIOntology(faqBean,count);
			}
			
			count++;
			LoadCsv.loadPercent = ((LoadCsv.PERCENT_FAQ*count)/total) + LoadCsv.PERCENT_PRE;
		}

		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}
