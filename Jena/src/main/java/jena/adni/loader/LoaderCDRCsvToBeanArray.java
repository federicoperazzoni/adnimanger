package jena.adni.loader;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.Reader;
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
import jena.adni.bean.SubjectDataBean;
import jena.adni.main.LoadCsv;
import jena.adni.manager.CDRManager;

public class LoaderCDRCsvToBeanArray {

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
		CDRManager cdrManager = new CDRManager();

		for (String[] row : rows) {

			if (count > 0) {

				CDRBean cdrBean = new CDRBean();

				cdrBean.setCDMemory(row[9].replaceAll("\"", ""));
				cdrBean.setCDOrient(row[10].replaceAll("\"", ""));
				cdrBean.setCDJudge(row[11].replaceAll("\"", ""));
				cdrBean.setCDCommunityAffair(row[12].replaceAll("\"", ""));
				cdrBean.setCDHome(row[13].replaceAll("\"", ""));
				cdrBean.setCDPersonalCare(row[14].replaceAll("\"", ""));
				cdrBean.setCDSob(row[15].replaceAll("\"", ""));
				cdrBean.setCDGlobal(row[16].replaceAll("\"", ""));
				
				cdrBean.setSubjectDataBean(new SubjectDataBean());
				
				cdrBean.getSubjectDataBean().setRID(row[2].replaceAll("\"", ""));

				cdrManager.insertInADNIOntology(cdrBean,count);
			}
			
			count++;
			LoadCsv.loadPercent = ((LoadCsv.PERCENT_CDR*count)/total) + LoadCsv.loadPast;
		}

		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}