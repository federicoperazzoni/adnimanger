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
				neuroBatteryBean.setAvtot4(row[30]);
				neuroBatteryBean.setAvtot5(row[32]);
				neuroBatteryBean.setAvtot6(row[34]);
				neuroBatteryBean.setAvtotB(row[36]);
				neuroBatteryBean.setCatanimsc(row[43]);
				neuroBatteryBean.setCatanintr(row[45]);
				neuroBatteryBean.setCatanpers(row[44]);
				neuroBatteryBean.setClockcirc(row[9]);
				neuroBatteryBean.setClockhand(row[12]);
				neuroBatteryBean.setClocknum(row[11]);
				neuroBatteryBean.setClockscor(row[14]);
				neuroBatteryBean.setClocktime(row[13]);
				neuroBatteryBean.setCopycirc(row[15]);
				neuroBatteryBean.setCopyhand(row[18]);
				neuroBatteryBean.setCopynum(row[17]);
				neuroBatteryBean.setCopyscor(row[20]);
				neuroBatteryBean.setCopysym(row[16]);
				neuroBatteryBean.setCopytime(row[19]);
				neuroBatteryBean.setLdelbegin(row[56]);
				neuroBatteryBean.setLdelcue(row[58]);
				neuroBatteryBean.setLdeltotal(row[57]);
				neuroBatteryBean.setLimmend(row[23]);
				neuroBatteryBean.setLimmtotal(row[22]);
				neuroBatteryBean.setLmstory(row[21]);
				neuroBatteryBean.setMintsemcue(row[73]);
				neuroBatteryBean.setMinttotal(row[74]);
				neuroBatteryBean.setMintuncued(row[75]);
				neuroBatteryBean.setTraaerrcom(row[50]);
				neuroBatteryBean.setTraaerrom(row[51]);
				neuroBatteryBean.setTraascor(row[49]);
				neuroBatteryBean.setTraberrcom(row[53]);
				neuroBatteryBean.setTraberrom(row[54]);
				neuroBatteryBean.setTrabscor(row[52]);
				neuroBatteryBean.setRavlt_immediate(row[77]);
				neuroBatteryBean.setRavlt_learning(row[78]);
				neuroBatteryBean.setRavlt_forgetting(row[76]);
				neuroBatteryBean.setRavlt_perc_forgetting(row[79]);
				neuroBatteryBean.setBntspont(row[60]);
				neuroBatteryBean.setBntstim(row[61]);
				neuroBatteryBean.setBntcstim(row[62]);
				neuroBatteryBean.setBntphon(row[63]);
				neuroBatteryBean.setBntcphon(row[64]);
				neuroBatteryBean.setBnttotal(row[65]);
				neuroBatteryBean.setAvdelbegan(row[66]);
				neuroBatteryBean.setAnartnd(row[71]);
				neuroBatteryBean.setBntnd(row[59]);
				neuroBatteryBean.setExamdate(row[8]);
				neuroBatteryBean.setDspanfor(row[39]);
				neuroBatteryBean.setDspanflth(row[40]);
				neuroBatteryBean.setDspanbac(row[41]);
				neuroBatteryBean.setDspanblth(row[42]);
				neuroBatteryBean.setCatvegesc(row[46]);
				neuroBatteryBean.setCatvgpers(row[47]);
				neuroBatteryBean.setCatvgintr(row[48]);
				neuroBatteryBean.setDigitscor(row[55]);
				
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
