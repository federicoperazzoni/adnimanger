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
import jena.adni.bean.SubjectDataBean;

public class LoaderNPICsvToBeanArray {

	public void load(String pathCsv) {

		Path myPath = Paths.get(pathCsv);

		CSVParser parser = new CSVParserBuilder().withSeparator(';').build();

		try { BufferedReader br = Files.newBufferedReader(myPath, 
				StandardCharsets.UTF_8);
		CSVReader reader = new CSVReaderBuilder(br).withCSVParser(parser)
				.build();

		List<String[]> rows = reader.readAll();

		int count = 0;

		for (String[] row : rows) {

			if (count > 0) {

				NPIBean npiBean = new NPIBean();
				
				npiBean.setNpia(row[11]);
				npiBean.setNpia1(row[12]);
				npiBean.setNpia10a(row[21]);
				npiBean.setNpia10b(row[22]);
				
				npiBean.setSubjectDataBean(new SubjectDataBean());
				
				npiBean.getSubjectDataBean().setRID(row[2].replaceAll("\"", ""));
			}
			
			count++;
		}

		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}
