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

import jena.adni.bean.NPIBean;
import jena.adni.bean.NPIQBean;
import jena.adni.bean.SubjectDataBean;
import jena.adni.main.LoadCsv;
import jena.adni.manager.NPIManager;
import jena.adni.manager.NPIQManager;

public class LoaderNPIQCsvToBeanArray {

	public void load(String pathCsv) {

		Path myPath = Paths.get(pathCsv);

		CSVParser parser = new CSVParserBuilder().withSeparator(';').build();

		try { BufferedReader br = Files.newBufferedReader(myPath, 
				StandardCharsets.UTF_8);
		CSVReader reader = new CSVReaderBuilder(br).withCSVParser(parser)
				.build();

		List<String[]> rows = reader.readAll();

		int count = 0;
		NPIQManager npiqManager = new NPIQManager();
		int total = rows.size();

		for (String[] row : rows) {

			if (count > 0) {

				NPIQBean npiqBean = new NPIQBean();
				

				npiqBean.setSubjectDataBean(new SubjectDataBean());
				
				npiqBean.getSubjectDataBean().setRID(row[2].replaceAll("\"", ""));
				
				npiqBean.setNpia(row[10].replaceAll("\"", ""));
				npiqBean.setNpiasev(row[11].replaceAll("\"", ""));
				npiqBean.setNpib(row[12].replaceAll("\"", ""));
				npiqBean.setNpibsev(row[13].replaceAll("\"", ""));
				npiqBean.setNpic(row[14].replaceAll("\"", ""));
				npiqBean.setNpicsev(row[15].replaceAll("\"", ""));
				npiqBean.setNpid(row[16].replaceAll("\"", ""));
				npiqBean.setNpidsev(row[17].replaceAll("\"", ""));
				npiqBean.setNpie(row[18].replaceAll("\"", ""));
				npiqBean.setNpiesev(row[19].replaceAll("\"", ""));
				npiqBean.setNpif(row[20].replaceAll("\"", ""));
				npiqBean.setNpifsev(row[21].replaceAll("\"", ""));
				npiqBean.setNpig(row[22].replaceAll("\"", ""));
				npiqBean.setNpigsev(row[23].replaceAll("\"", ""));
				npiqBean.setNpih(row[24].replaceAll("\"", ""));
				npiqBean.setNpihsev(row[25].replaceAll("\"", ""));
				npiqBean.setNpii(row[26].replaceAll("\"", ""));
				npiqBean.setNpiisev(row[27].replaceAll("\"", ""));
				npiqBean.setNpij(row[28].replaceAll("\"", ""));
				npiqBean.setNpijsev(row[29].replaceAll("\"", ""));
				npiqBean.setNpik(row[30].replaceAll("\"", ""));
				npiqBean.setNpiksev(row[31].replaceAll("\"", ""));
				npiqBean.setNpil(row[32].replaceAll("\"", ""));
				npiqBean.setNpilsev(row[33].replaceAll("\"", ""));
				npiqBean.setExamdate(row[8].replaceAll("\"", ""));
				npiqBean.setSiteid(row[3].replaceAll("\"", ""));
				npiqBean.setViscode(row[4].replaceAll("\"", ""));
				
				npiqManager.insertInADNIOntology(npiqBean, count);
			}
		
			LoadCsv.loadPercent = ((LoadCsv.PERCENT_NPIQ*count)/total) + LoadCsv.loadPast;
			
			count++;
		}

		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}
