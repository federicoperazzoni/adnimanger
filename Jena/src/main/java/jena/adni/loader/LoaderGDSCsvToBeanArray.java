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
				
				gdsBean.setGdafraid(row[17].replaceAll("\"", ""));
				gdsBean.setGdalive(row[22].replaceAll("\"", ""));
				gdsBean.setGdbetter(row[26].replaceAll("\"", ""));
				gdsBean.setGdbored(row[15].replaceAll("\"", ""));
				gdsBean.setGddrop(row[13].replaceAll("\"", ""));
				gdsBean.setGdempty(row[14].replaceAll("\"", ""));
				gdsBean.setGdenergy(row[24].replaceAll("\"", ""));
				gdsBean.setGdhappy(row[18].replaceAll("\"", ""));
				gdsBean.setGdhelp(row[19].replaceAll("\"", ""));
				gdsBean.setGdhome(row[20].replaceAll("\"", ""));
				gdsBean.setGdhope(row[25].replaceAll("\"", ""));
				gdsBean.setGdmemory(row[21].replaceAll("\"", ""));
				gdsBean.setGdsatis(row[12].replaceAll("\"", ""));
				gdsBean.setGdspirit(row[16].replaceAll("\"", ""));
				gdsBean.setGdtotal(row[27].replaceAll("\"", ""));
				gdsBean.setGdunabl(row[10].replaceAll("\"", ""));
				gdsBean.setGdunabsp(row[11].replaceAll("\"", ""));
				gdsBean.setGdworth(row[23].replaceAll("\"", ""));
				//gdsBean.setSource(row[9].replaceAll("\"", ""));
				gdsBean.setExamdate(row[8].replaceAll("\"", ""));
				gdsBean.setGdsource(row[9].replaceAll("\"", ""));
				//gdsBean.setOrigprot(row[9].replaceAll("\"", ""));
				gdsBean.setViscode(row[4].replaceAll("\"", ""));
				
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
