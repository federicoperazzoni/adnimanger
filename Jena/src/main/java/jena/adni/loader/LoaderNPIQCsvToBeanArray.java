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
				
				npiqBean.setNpia(row[10]);
				npiqBean.setNpiasev(row[11]);
				npiqBean.setNpib(row[12]);
				npiqBean.setNpibsev(row[13]);
				npiqBean.setNpic(row[14]);
				npiqBean.setNpicsev(row[15]);
				npiqBean.setNpid(row[16]);
				npiqBean.setNpidsev(row[17]);
				npiqBean.setNpie(row[18]);
				npiqBean.setNpiesev(row[19]);
				npiqBean.setNpif(row[20]);
				npiqBean.setNpifsev(row[21]);
				npiqBean.setNpig(row[22]);
				npiqBean.setNpigsev(row[23]);
				npiqBean.setNpih(row[24]);
				npiqBean.setNpihsev(row[25]);
				npiqBean.setNpii(row[26]);
				npiqBean.setNpiisev(row[27]);
				npiqBean.setNpij(row[28]);
				npiqBean.setNpijsev(row[29]);
				npiqBean.setNpik(row[30]);
				npiqBean.setNpiksev(row[31]);
				npiqBean.setNpil(row[32]);
				npiqBean.setNpilsev(row[33]);
				npiqBean.setExamdate(row[8]);
				npiqBean.setSiteid(row[3]);
				npiqBean.setViscode(row[4]);
				
				npiqManager.insertInADNIOntology(npiqBean, count);
			}
		
			LoadCsv.loadPercent = ((LoadCsv.PERCENT_NPIQ*count)/total) + LoadCsv.PERCENT_PRE;
			
			count++;
		}

		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}
