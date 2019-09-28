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
import jena.adni.main.LoadCsv;
import jena.adni.manager.MMSEManager;

public class LoaderMMSECsvToBeanArray {

	public void load(String pathCsv) {

		Path myPath = Paths.get(pathCsv);

		CSVParser parser = new CSVParserBuilder().withSeparator(';').build();
		
		int count = 0;

		try { BufferedReader br = Files.newBufferedReader(myPath, 
				StandardCharsets.UTF_8);
		CSVReader reader = new CSVReaderBuilder(br).withCSVParser(parser)
				.build();

		List<String[]> rows = reader.readAll();
		MMSEManager mmseManager = new MMSEManager();
		int total = rows.size();

		for (String[] row : rows) {

			if (count > 0) {

				MMSEBean mmseBean = new MMSEBean();

				mmseBean.setClock_Drawing(row[55].replaceAll("\"", ""));
				mmseBean.setBackward_Spelling_Letter_1(row[58].replaceAll("\"", ""));
				mmseBean.setBackward_Spelling_Letter_2(row[59].replaceAll("\"", ""));
				mmseBean.setBackward_Spelling_Letter_3(row[60].replaceAll("\"", ""));
				mmseBean.setBackward_Spelling_Letter_4(row[61].replaceAll("\"", ""));
				mmseBean.setBackward_Spelling_Letter_5(row[62].replaceAll("\"", ""));
				mmseBean.setBackward_Spelling_Letter_6(row[63].replaceAll("\"", ""));
				mmseBean.setBackward_Spelling_Letter_7(row[64].replaceAll("\"", ""));
				mmseBean.setBackward_Spelling_Letter_D(row[34].replaceAll("\"", ""));
				mmseBean.setBackward_Spelling_Letter_L(row[36].replaceAll("\"", ""));
				mmseBean.setBackward_Spelling_Letter_R(row[38].replaceAll("\"", ""));
				mmseBean.setBackward_Spelling_Letter_O(row[40].replaceAll("\"", ""));
				mmseBean.setBackward_Spelling_Letter_W(row[42].replaceAll("\"", ""));
				mmseBean.setBackward_Spelling_Letter_D_V(row[35].replaceAll("\"", ""));
				mmseBean.setBackward_Spelling_Letter_L_V(row[37].replaceAll("\"", ""));
				mmseBean.setBackward_Spelling_Letter_R_V(row[39].replaceAll("\"", ""));
				mmseBean.setBackward_Spelling_Letter_O_V(row[41].replaceAll("\"", ""));
				mmseBean.setBackward_Spelling_Letter_W_V(row[43].replaceAll("\"", ""));
				mmseBean.setMm_Recall(row[29].replaceAll("\"", ""));
				mmseBean.setMm_Trials(row[33].replaceAll("\"", ""));
				mmseBean.setWordlist(row[71].replaceAll("\"", ""));
				mmseBean.setMm_Fold(row[51].replaceAll("\"", ""));
				mmseBean.setMm_Hand(row[50].replaceAll("\"", ""));
				mmseBean.setMm_Onflr(row[52].replaceAll("\"", ""));
				mmseBean.setMm_Read(row[53].replaceAll("\"", ""));
				mmseBean.setMm_Pencil(row[48].replaceAll("\"", ""));
				mmseBean.setMm_Watch(row[47].replaceAll("\"", ""));
				mmseBean.setMm_Repeat(row[49].replaceAll("\"", ""));
				mmseBean.setMm_Write(row[54].replaceAll("\"", ""));
				mmseBean.setMm_Ball(row[30].replaceAll("\"", ""));
				mmseBean.setMm_Flag(row[31].replaceAll("\"", ""));
				mmseBean.setMm_Tree(row[32].replaceAll("\"", ""));
				mmseBean.setWord1(row[65].replaceAll("\"", ""));
				mmseBean.setWord2(row[67].replaceAll("\"", ""));
				mmseBean.setWord3(row[69].replaceAll("\"", ""));
				mmseBean.setMm_Ball_Dl(row[44].replaceAll("\"", ""));
				mmseBean.setMm_Flag_Dl(row[45].replaceAll("\"", ""));
				mmseBean.setMm_Tree_Dl(row[46].replaceAll("\"", ""));
				mmseBean.setWord1_Dl(row[66].replaceAll("\"", ""));
				mmseBean.setWord2_Dl(row[68].replaceAll("\"", ""));
				mmseBean.setWord3_Dl(row[70].replaceAll("\"", ""));
				mmseBean.setMm_Area(row[25].replaceAll("\"", ""));
				mmseBean.setMm_Area_Cm(row[26].replaceAll("\"", ""));
				mmseBean.setMm_City(row[23].replaceAll("\"", ""));
				mmseBean.setMm_City_Cm(row[24].replaceAll("\"", ""));
				mmseBean.setMm_Date(row[9].replaceAll("\"", ""));
				mmseBean.setMm_Date_Cm(row[10].replaceAll("\"", ""));
				mmseBean.setMm_Day(row[15].replaceAll("\"", ""));
				mmseBean.setMm_Day_Cm(row[16].replaceAll("\"", ""));
				mmseBean.setMm_Month(row[13].replaceAll("\"", ""));
				mmseBean.setMm_Month_Cm(row[14].replaceAll("\"", ""));
				mmseBean.setMm_Year(row[11].replaceAll("\"", ""));
				mmseBean.setMm_Year_Cm(row[12].replaceAll("\"", ""));
				mmseBean.setMm_Floor(row[21].replaceAll("\"", ""));
				mmseBean.setMm_Flr_Cm(row[22].replaceAll("\"", ""));
				mmseBean.setMm_Hospit(row[19].replaceAll("\"", ""));
				mmseBean.setMm_Hosp_Cm(row[20].replaceAll("\"", ""));
				mmseBean.setMm_Season(row[17].replaceAll("\"", ""));
				mmseBean.setMm_Sesn_Cm(row[18].replaceAll("\"", ""));
				mmseBean.setMm_State(row[27].replaceAll("\"", ""));
				mmseBean.setMm_St_Cm(row[28].replaceAll("\"", ""));
				mmseBean.setMm_Score(row[56].replaceAll("\"", ""));
				mmseBean.setWorldscore(row[72].replaceAll("\"", ""));

				mmseBean.setPhase(row[0].replaceAll("\"", ""));
				mmseBean.setSubjectDataBean(new SubjectDataBean());
				mmseBean.getSubjectDataBean().setRID(row[2].replaceAll("\"", "").replaceAll("\"", ""));

				mmseManager.insertInADNIOntology(mmseBean,count);
			}

			count++;
			
			LoadCsv.loadPercent = ((LoadCsv.PERCENT_MMSE*count)/total) + LoadCsv.loadPast;
		}

		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}
