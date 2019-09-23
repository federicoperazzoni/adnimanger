package jena.adni.loader;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import jena.adni.bean.GDSBean;
import jena.adni.bean.NPIBean;
import jena.adni.bean.NPIQBean;
import jena.adni.bean.SubjectDataBean;
import jena.adni.main.LoadCsv;
import jena.adni.manager.GDSManager;
import jena.adni.manager.NPIManager;
import jena.adni.manager.NPIQManager;

public class LoaderGDSCsvToBeanArray {

	public void load(String pathCsv) {

		Path myPath = Paths.get(pathCsv);

		CSVParser parser = new CSVParserBuilder().withSeparator(';').build();

		try { BufferedReader br = Files.newBufferedReader(myPath, 
				StandardCharsets.UTF_8);
		CSVReader reader = new CSVReaderBuilder(br).withCSVParser(parser)
				.build();

		List<String[]> rows = reader.readAll();

		int count = 0;
		GDSManager gdsManager = new GDSManager();
		int total = rows.size();

		for (String[] row : rows) {

			if (count > 0) {

				GDSBean gdsBean = new GDSBean();
				

				gdsBean.setSubjectDataBean(new SubjectDataBean());
				
				gdsBean.getSubjectDataBean().setRID(row[2].replaceAll("\"", ""));
				
				gdsManager.insertInADNIOntology(gdsBean, count);
			}
		
			LoadCsv.loadPercent = ((LoadCsv.PERCENT_GDS*count)/total) + LoadCsv.PERCENT_PRE;
			
			count++;
		}

		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}
