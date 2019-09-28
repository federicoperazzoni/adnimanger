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
import jena.adni.main.LoadCsv;
import jena.adni.manager.NeuroBatteryManager;

public class LoaderNeuroBatteryCsvToBeanArray {

	public void load(String pathCsv) {

		Path myPath = Paths.get(pathCsv);

		CSVParser parser = new CSVParserBuilder().withSeparator(';').build();

		try { BufferedReader br = Files.newBufferedReader(myPath, 
				StandardCharsets.UTF_8);
		CSVReader reader = new CSVReaderBuilder(br).withCSVParser(parser)
				.build();

		List<String[]> rows = reader.readAll();

		int count = 0;
		NeuroBatteryManager neuroBatteryManager = new NeuroBatteryManager();
		int total = rows.size();

		for (String[] row : rows) {

			if (count > 0) {

				NeuroBatteryBean neuroBatteryBean = new NeuroBatteryBean();

				neuroBatteryBean.setAnart_Nd(row[71].replaceAll("\"", ""));
				neuroBatteryBean.setAnart_Err(row[72].replaceAll("\"", ""));
				neuroBatteryBean.setAvdel30_Min(row[67].replaceAll("\"", ""));
				neuroBatteryBean.setAvdel_Err1(row[68].replaceAll("\"", ""));
				neuroBatteryBean.setAvdel_Err2(row[70].replaceAll("\"", ""));
				neuroBatteryBean.setAvdel_Tot(row[69].replaceAll("\"", ""));
				neuroBatteryBean.setAvended(row[38].replaceAll("\"", ""));
				neuroBatteryBean.setAverr1(row[25].replaceAll("\"", ""));
				neuroBatteryBean.setAverr2(row[27].replaceAll("\"", ""));
				neuroBatteryBean.setAverr3(row[29].replaceAll("\"", ""));
				neuroBatteryBean.setAverr4(row[31].replaceAll("\"", ""));
				neuroBatteryBean.setAverr5(row[33].replaceAll("\"", ""));
				neuroBatteryBean.setAverr6(row[35].replaceAll("\"", ""));
				neuroBatteryBean.setAverrB(row[37].replaceAll("\"", ""));
				neuroBatteryBean.setAvtot1(row[24].replaceAll("\"", ""));
				neuroBatteryBean.setAvtot2(row[26].replaceAll("\"", ""));
				neuroBatteryBean.setAvtot3(row[28].replaceAll("\"", ""));
				neuroBatteryBean.setAvtot4(row[30].replaceAll("\"", ""));
				neuroBatteryBean.setAvtot5(row[32].replaceAll("\"", ""));
				neuroBatteryBean.setAvtot6(row[34].replaceAll("\"", ""));
				neuroBatteryBean.setAvtotB(row[36].replaceAll("\"", ""));
				neuroBatteryBean.setCatanimsc(row[43].replaceAll("\"", ""));
				neuroBatteryBean.setCatanintr(row[45].replaceAll("\"", ""));
				neuroBatteryBean.setCatanpers(row[44].replaceAll("\"", ""));
				neuroBatteryBean.setClockcirc(row[9].replaceAll("\"", ""));
				neuroBatteryBean.setClockhand(row[12].replaceAll("\"", ""));
				neuroBatteryBean.setClocknum(row[11].replaceAll("\"", ""));
				neuroBatteryBean.setClockscor(row[14].replaceAll("\"", ""));
				neuroBatteryBean.setClocktime(row[13].replaceAll("\"", ""));
				neuroBatteryBean.setCopycirc(row[15].replaceAll("\"", ""));
				neuroBatteryBean.setCopyhand(row[18].replaceAll("\"", ""));
				neuroBatteryBean.setCopynum(row[17].replaceAll("\"", ""));
				neuroBatteryBean.setCopyscor(row[20].replaceAll("\"", ""));
				neuroBatteryBean.setCopysym(row[16].replaceAll("\"", ""));
				neuroBatteryBean.setCopytime(row[19].replaceAll("\"", ""));
				neuroBatteryBean.setLdelbegin(row[56].replaceAll("\"", ""));
				neuroBatteryBean.setLdelcue(row[58].replaceAll("\"", ""));
				neuroBatteryBean.setLdeltotal(row[57].replaceAll("\"", ""));
				neuroBatteryBean.setLimmend(row[23].replaceAll("\"", ""));
				neuroBatteryBean.setLimmtotal(row[22].replaceAll("\"", ""));
				neuroBatteryBean.setLmstory(row[21].replaceAll("\"", ""));
				neuroBatteryBean.setMintsemcue(row[73].replaceAll("\"", ""));
				neuroBatteryBean.setMinttotal(row[74].replaceAll("\"", ""));
				neuroBatteryBean.setMintuncued(row[75].replaceAll("\"", ""));
				neuroBatteryBean.setTraaerrcom(row[50].replaceAll("\"", ""));
				neuroBatteryBean.setTraaerrom(row[51].replaceAll("\"", ""));
				neuroBatteryBean.setTraascor(row[49].replaceAll("\"", ""));
				neuroBatteryBean.setTraberrcom(row[53].replaceAll("\"", ""));
				neuroBatteryBean.setTraberrom(row[54].replaceAll("\"", ""));
				neuroBatteryBean.setTrabscor(row[52].replaceAll("\"", ""));
				neuroBatteryBean.setRavlt_immediate(row[77].replaceAll("\"", ""));
				neuroBatteryBean.setRavlt_learning(row[78].replaceAll("\"", ""));
				neuroBatteryBean.setRavlt_forgetting(row[76].replaceAll("\"", ""));
				neuroBatteryBean.setRavlt_perc_forgetting(row[79].replaceAll("\"", ""));
				neuroBatteryBean.setBntspont(row[60].replaceAll("\"", ""));
				neuroBatteryBean.setBntstim(row[61].replaceAll("\"", ""));
				neuroBatteryBean.setBntcstim(row[62].replaceAll("\"", ""));
				neuroBatteryBean.setBntphon(row[63].replaceAll("\"", ""));
				neuroBatteryBean.setBntcphon(row[64].replaceAll("\"", ""));
				neuroBatteryBean.setBnttotal(row[65].replaceAll("\"", ""));
				neuroBatteryBean.setAvdelbegan(row[66].replaceAll("\"", ""));
				neuroBatteryBean.setAnartnd(row[71].replaceAll("\"", ""));
				neuroBatteryBean.setBntnd(row[59].replaceAll("\"", ""));
				neuroBatteryBean.setExamdate(row[8].replaceAll("\"", ""));
				neuroBatteryBean.setDspanfor(row[39].replaceAll("\"", ""));
				neuroBatteryBean.setDspanflth(row[40].replaceAll("\"", ""));
				neuroBatteryBean.setDspanbac(row[41].replaceAll("\"", ""));
				neuroBatteryBean.setDspanblth(row[42].replaceAll("\"", ""));
				neuroBatteryBean.setCatvegesc(row[46].replaceAll("\"", ""));
				neuroBatteryBean.setCatvgpers(row[47].replaceAll("\"", ""));
				neuroBatteryBean.setCatvgintr(row[48].replaceAll("\"", ""));
				neuroBatteryBean.setDigitscor(row[55].replaceAll("\"", ""));
				
				neuroBatteryBean.setSubjectDataBean(new SubjectDataBean());
				
				neuroBatteryBean.getSubjectDataBean().setRID(row[2].replaceAll("\"", "").replaceAll("\"", ""));

				neuroBatteryManager.insertInADNIOntology(neuroBatteryBean,count);
			}
			
			count++;
			
			LoadCsv.loadPercent = ((LoadCsv.PERCENT_NEUROBAT*count)/total) + LoadCsv.loadPast;
		}

		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}
