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
import jena.adni.bean.NeuroBatteryBean;
import jena.adni.bean.SubjectDataBean;

public class LoaderNeuroBatteryCsvToBeanArray {

	public ArrayList<NeuroBatteryBean> load(String pathCsv) {

		ArrayList<NeuroBatteryBean> neuroBatteryTestList = new ArrayList<NeuroBatteryBean>();

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

				NeuroBatteryBean neuroBatteryBean = new NeuroBatteryBean();

				neuroBatteryBean.setAnart_Nd(row[71]);
				neuroBatteryBean.setAnart_Err(row[72]);
				neuroBatteryBean.setAvdel30_Min(row[67]);
				neuroBatteryBean.setAvdel_Err1(row[68]);
				neuroBatteryBean.setAvdel_Err2(row[70]);
				neuroBatteryBean.setAvdel_Tot(row[69]);
				neuroBatteryBean.setAvended(row[38]);
				neuroBatteryBean.setAverr1(row[25]);
				neuroBatteryBean.setAverr2(row[27]);
				neuroBatteryBean.setAverr3(row[29]);
				neuroBatteryBean.setAverr4(row[31]);
				neuroBatteryBean.setAverr5(row[33]);
				neuroBatteryBean.setAverr6(row[35]);
				neuroBatteryBean.setAverrB(row[37]);
				neuroBatteryBean.setAvtot1(row[24]);
				neuroBatteryBean.setAvtot2(row[26]);
				neuroBatteryBean.setAvtot3(row[28]);
				
				neuroBatteryBean.setSubjectDataBean(new SubjectDataBean());
				
				neuroBatteryBean.getSubjectDataBean().setRID(row[2].replaceAll("\"", ""));

				neuroBatteryTestList.add(neuroBatteryBean);
			}
			
			count++;
		}

		} catch (IOException e) {

			e.printStackTrace();
		}

		return neuroBatteryTestList;
	}
}
