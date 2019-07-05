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
import jena.adni.bean.MMSEBean;
import jena.adni.bean.SubjectDataBean;

public class LoaderMMSECsvToBeanArray {

	public ArrayList<MMSEBean> load(String pathCsv) {

		ArrayList<MMSEBean> mmseTestList = new ArrayList<MMSEBean>();

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

				MMSEBean mmseBean = new MMSEBean();
				
				mmseBean.setSubjectDataBean(new SubjectDataBean());
				
				mmseBean.getSubjectDataBean().setRID(row[2].replaceAll("\"", ""));

				mmseTestList.add(mmseBean);
			}
			
			count++;
		}

		} catch (IOException e) {

			e.printStackTrace();
		}

		return mmseTestList;
	}
}
