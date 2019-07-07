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
				
				mmseBean.setClock_Drawing(row[55]);
				mmseBean.setBackward_Spelling_Letter_1(row[58]);
				mmseBean.setBackward_Spelling_Letter_2(row[59]);
				mmseBean.setBackward_Spelling_Letter_3(row[60]);
				mmseBean.setBackward_Spelling_Letter_4(row[61]);
				mmseBean.setBackward_Spelling_Letter_5(row[62]);
				mmseBean.setBackward_Spelling_Letter_6(row[63]);
				mmseBean.setBackward_Spelling_Letter_7(row[64]);
				mmseBean.setBackward_Spelling_Letter_D(row[34]);
				mmseBean.setBackward_Spelling_Letter_L(row[36]);
				mmseBean.setBackward_Spelling_Letter_R(row[38]);
				mmseBean.setBackward_Spelling_Letter_O(row[40]);
				mmseBean.setBackward_Spelling_Letter_W(row[42]);
				mmseBean.setBackward_Spelling_Letter_D_V(row[35]);
				mmseBean.setBackward_Spelling_Letter_L_V(row[37]);
				mmseBean.setBackward_Spelling_Letter_R_V(row[39]);
				mmseBean.setBackward_Spelling_Letter_O_V(row[41]);
				mmseBean.setBackward_Spelling_Letter_W_V(row[43]);
				mmseBean.setMm_Recall(row[29]);
				mmseBean.setMm_Trials(row[33]);
				mmseBean.setWordlist(row[71]);
				mmseBean.setMm_Fold(row[51]);
				mmseBean.setMm_Hand(row[50]);
				mmseBean.setMm_Onflr(row[52]);
				mmseBean.setMm_Read(row[53]);
				mmseBean.setMm_Pencil(row[48]);
				mmseBean.setMm_Watch(row[47]);
				mmseBean.setMm_Repeat(row[49]);
				mmseBean.setMm_Write(row[54]);
				mmseBean.setMm_Ball(row[30]);
				mmseBean.setMm_Flag(row[31]);
				mmseBean.setMm_Tree(row[32]);
				mmseBean.setWord1(row[65]);
				mmseBean.setWord2(row[67]);
				mmseBean.setWord3(row[69]);
				mmseBean.setMm_Ball_Dl(row[44]);
				mmseBean.setMm_Flag_Dl(row[45]);
				mmseBean.setMm_Tree_Dl(row[46]);
				mmseBean.setWord1_Dl(row[66]);
				mmseBean.setWord2_Dl(row[68]);
				mmseBean.setWord3_Dl(row[70]);
				mmseBean.setMm_Area(row[25]);
				mmseBean.setMm_Area_Cm(row[26]);
				mmseBean.setMm_City(row[23]);
				mmseBean.setMm_City_Cm(row[24]);
				mmseBean.setMm_Date(row[9]);
				mmseBean.setMm_Date_Cm(row[10]);
				mmseBean.setMm_Day(row[15]);
				mmseBean.setMm_Day_Cm(row[16]);
				mmseBean.setMm_Month(row[13]);
				mmseBean.setMm_Month_Cm(row[14]);
				mmseBean.setMm_Year(row[11]);
				mmseBean.setMm_Year_Cm(row[12]);
				mmseBean.setMm_Floor(row[21]);
				mmseBean.setMm_Flr_Cm(row[22]);
				mmseBean.setMm_Hospit(row[19]);
				mmseBean.setMm_Hosp_Cm(row[20]);
				mmseBean.setMm_Season(row[17]);
				mmseBean.setMm_Sesn_Cm(row[18]);
				mmseBean.setMm_State(row[27]);
				mmseBean.setMm_St_Cm(row[28]);
				mmseBean.setMm_Score(row[56]);
				mmseBean.setWorldscore(row[72]);
				
				mmseBean.setPhase(row[0]);
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
