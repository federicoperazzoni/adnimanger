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
import jena.adni.main.LoadCsv;
import jena.adni.manager.NPIManager;

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
		NPIManager npiManager = new NPIManager();
		int total = rows.size();

		for (String[] row : rows) {

			if (count > 0) {

				NPIBean npiBean = new NPIBean();
				
				npiBean.setNpia(row[11].replaceAll("\"", ""));
				npiBean.setNpia1(row[12].replaceAll("\"", ""));
				npiBean.setNpia10a(row[21].replaceAll("\"", ""));
				npiBean.setNpia10b(row[22].replaceAll("\"", ""));
				npiBean.setNpia10c(row[23].replaceAll("\"", ""));
				npiBean.setNpia2(row[13].replaceAll("\"", ""));
				npiBean.setNpia3(row[14].replaceAll("\"", ""));
				npiBean.setNpia4(row[15].replaceAll("\"", ""));
				npiBean.setNpia5(row[16].replaceAll("\"", ""));
				npiBean.setNpia6(row[17].replaceAll("\"", ""));
				npiBean.setNpia7(row[18].replaceAll("\"", ""));
				npiBean.setNpia8(row[19].replaceAll("\"", ""));
				npiBean.setNpia9(row[20].replaceAll("\"", ""));
				npiBean.setNpiatot(row[24].replaceAll("\"", ""));
				npiBean.setNpib(row[25].replaceAll("\"", ""));
				npiBean.setNpib1(row[26].replaceAll("\"", ""));
				npiBean.setNpib2(row[27].replaceAll("\"", ""));
				npiBean.setNpib3(row[28].replaceAll("\"", ""));
				npiBean.setNpib4(row[29].replaceAll("\"", ""));
				npiBean.setNpib5(row[30].replaceAll("\"", ""));
				npiBean.setNpib6(row[31].replaceAll("\"", ""));
				npiBean.setNpib7(row[32].replaceAll("\"", ""));
				npiBean.setNpib8a(row[33].replaceAll("\"", ""));
				npiBean.setNpib8b(row[34].replaceAll("\"", ""));
				npiBean.setNpib8c(row[35].replaceAll("\"", ""));
				npiBean.setNpibtot(row[36].replaceAll("\"", ""));
				npiBean.setNpic(row[37].replaceAll("\"", ""));
				npiBean.setNpic1(row[38].replaceAll("\"", ""));
				npiBean.setNpic2(row[39].replaceAll("\"", ""));
				npiBean.setNpic3(row[40].replaceAll("\"", ""));
				npiBean.setNpic4(row[41].replaceAll("\"", ""));
				npiBean.setNpic5(row[42].replaceAll("\"", ""));
				npiBean.setNpic6(row[43].replaceAll("\"", ""));
				npiBean.setNpic7(row[44].replaceAll("\"", ""));
				npiBean.setNpic8(row[45].replaceAll("\"", ""));
				npiBean.setNpic9a(row[46].replaceAll("\"", ""));
				npiBean.setNpic9b(row[47].replaceAll("\"", ""));
				npiBean.setNpic9c(row[48].replaceAll("\"", ""));
				npiBean.setNpictot(row[49].replaceAll("\"", ""));
				npiBean.setNpid(row[50].replaceAll("\"", ""));
				npiBean.setNpid1(row[51].replaceAll("\"", ""));
				npiBean.setNpid2(row[52].replaceAll("\"", ""));
				npiBean.setNpid3(row[53].replaceAll("\"", ""));
				npiBean.setNpid4(row[54].replaceAll("\"", ""));
				npiBean.setNpid5(row[55].replaceAll("\"", ""));
				npiBean.setNpid6(row[56].replaceAll("\"", ""));
				npiBean.setNpid7(row[57].replaceAll("\"", ""));
				npiBean.setNpid8(row[58].replaceAll("\"", ""));
				npiBean.setNpid9a(row[59].replaceAll("\"", ""));
				npiBean.setNpid9b(row[60].replaceAll("\"", ""));
				npiBean.setNpid9c(row[61].replaceAll("\"", ""));
				npiBean.setNpidtot(row[62].replaceAll("\"", ""));
				npiBean.setNpie(row[63].replaceAll("\"", ""));
				npiBean.setNpie1(row[64].replaceAll("\"", ""));
				npiBean.setNpie2(row[65].replaceAll("\"", ""));
				npiBean.setNpie3(row[66].replaceAll("\"", ""));
				npiBean.setNpie4(row[67].replaceAll("\"", ""));
				npiBean.setNpie5(row[68].replaceAll("\"", ""));
				npiBean.setNpie6(row[69].replaceAll("\"", ""));
				npiBean.setNpie7(row[70].replaceAll("\"", ""));
				npiBean.setNpie8a(row[71].replaceAll("\"", ""));
				npiBean.setNpie8b(row[72].replaceAll("\"", ""));
				npiBean.setNpie8c(row[73].replaceAll("\"", ""));
				npiBean.setNpietot(row[74].replaceAll("\"", ""));
				npiBean.setNpif(row[75].replaceAll("\"", ""));
				npiBean.setNpif1(row[76].replaceAll("\"", ""));
				npiBean.setNpif2(row[77].replaceAll("\"", ""));
				npiBean.setNpif3(row[78].replaceAll("\"", ""));
				npiBean.setNpif4(row[79].replaceAll("\"", ""));
				npiBean.setNpif5(row[80].replaceAll("\"", ""));
				npiBean.setNpif6(row[81].replaceAll("\"", ""));
				npiBean.setNpif7(row[82].replaceAll("\"", ""));
				npiBean.setNpif8a(row[83].replaceAll("\"", ""));
				npiBean.setNpif8b(row[84].replaceAll("\"", ""));
				npiBean.setNpif8c(row[85].replaceAll("\"", ""));
				npiBean.setNpiftot(row[86].replaceAll("\"", ""));
				npiBean.setNpig(row[87].replaceAll("\"", ""));
				npiBean.setNpig1(row[88].replaceAll("\"", ""));
				npiBean.setNpig2(row[89].replaceAll("\"", ""));
				npiBean.setNpig3(row[90].replaceAll("\"", ""));
				npiBean.setNpig4(row[91].replaceAll("\"", ""));
				npiBean.setNpig5(row[92].replaceAll("\"", ""));
				npiBean.setNpig6(row[93].replaceAll("\"", ""));
				npiBean.setNpig7(row[94].replaceAll("\"", ""));
				npiBean.setNpig8(row[95].replaceAll("\"", ""));
				npiBean.setNpig9a(row[96].replaceAll("\"", ""));
				npiBean.setNpig9b(row[97].replaceAll("\"", ""));
				npiBean.setNpig9c(row[98].replaceAll("\"", ""));
				npiBean.setNpigtot(row[99].replaceAll("\"", ""));
				npiBean.setNpih(row[100].replaceAll("\"", ""));
				npiBean.setNpih1(row[101].replaceAll("\"", ""));
				npiBean.setNpih2(row[102].replaceAll("\"", ""));
				npiBean.setNpih3(row[103].replaceAll("\"", ""));
				npiBean.setNpih4(row[104].replaceAll("\"", ""));
				npiBean.setNpih5(row[105].replaceAll("\"", ""));
				npiBean.setNpih6(row[106].replaceAll("\"", ""));
				npiBean.setNpih7(row[107].replaceAll("\"", ""));
				npiBean.setNpih8a(row[108].replaceAll("\"", ""));
				npiBean.setNpih8b(row[109].replaceAll("\"", ""));
				npiBean.setNpih8c(row[110].replaceAll("\"", ""));
				npiBean.setNpihtot(row[111].replaceAll("\"", ""));
				npiBean.setNpii(row[112].replaceAll("\"", ""));
				npiBean.setNpii1(row[113].replaceAll("\"", ""));
				npiBean.setNpii2(row[114].replaceAll("\"", ""));
				npiBean.setNpii3(row[115].replaceAll("\"", ""));
				npiBean.setNpii4(row[116].replaceAll("\"", ""));
				npiBean.setNpii5(row[117].replaceAll("\"", ""));
				npiBean.setNpii6(row[118].replaceAll("\"", ""));
				npiBean.setNpii7(row[119].replaceAll("\"", ""));
				npiBean.setNpii8a(row[120].replaceAll("\"", ""));
				npiBean.setNpii8b(row[121].replaceAll("\"", ""));
				npiBean.setNpii8c(row[122].replaceAll("\"", ""));
				npiBean.setNpiitot(row[123].replaceAll("\"", ""));
				npiBean.setNpij(row[124].replaceAll("\"", ""));
				npiBean.setNpij1(row[125].replaceAll("\"", ""));
				npiBean.setNpij2(row[126].replaceAll("\"", ""));
				npiBean.setNpij3(row[127].replaceAll("\"", ""));
				npiBean.setNpij4(row[128].replaceAll("\"", ""));
				npiBean.setNpij5(row[129].replaceAll("\"", ""));
				npiBean.setNpij6(row[130].replaceAll("\"", ""));
				npiBean.setNpij7(row[131].replaceAll("\"", ""));
				npiBean.setNpij8a(row[132].replaceAll("\"", ""));
				npiBean.setNpij8b(row[133].replaceAll("\"", ""));
				npiBean.setNpij8c(row[134].replaceAll("\"", ""));
				npiBean.setNpijtot(row[135].replaceAll("\"", ""));
				npiBean.setNpik(row[136].replaceAll("\"", ""));
				npiBean.setNpik1(row[137].replaceAll("\"", ""));
				npiBean.setNpik2(row[138].replaceAll("\"", ""));
				npiBean.setNpik3(row[139].replaceAll("\"", ""));
				npiBean.setNpik4(row[140].replaceAll("\"", ""));
				npiBean.setNpik5(row[141].replaceAll("\"", ""));
				npiBean.setNpik6(row[142].replaceAll("\"", ""));
				npiBean.setNpik7(row[143].replaceAll("\"", ""));
				npiBean.setNpik8(row[144].replaceAll("\"", ""));
				npiBean.setNpik9a(row[145].replaceAll("\"", ""));
				npiBean.setNpik9b(row[146].replaceAll("\"", ""));
				npiBean.setNpik9c(row[147].replaceAll("\"", ""));
				npiBean.setNpiktot(row[148].replaceAll("\"", ""));
				npiBean.setNpil(row[149].replaceAll("\"", ""));
				npiBean.setNpil1(row[150].replaceAll("\"", ""));
				npiBean.setNpil2(row[151].replaceAll("\"", ""));
				npiBean.setNpil3(row[152].replaceAll("\"", ""));
				npiBean.setNpil4(row[153].replaceAll("\"", ""));
				npiBean.setNpil5(row[154].replaceAll("\"", ""));
				npiBean.setNpil6(row[155].replaceAll("\"", ""));
				npiBean.setNpil7(row[156].replaceAll("\"", ""));
				npiBean.setNpil8(row[157].replaceAll("\"", ""));
				npiBean.setNpil9a(row[158].replaceAll("\"", ""));
				npiBean.setNpil9b(row[159].replaceAll("\"", ""));
				npiBean.setNpil9c(row[160].replaceAll("\"", ""));
				npiBean.setNpiltot(row[161].replaceAll("\"", ""));
				npiBean.setNpisourc(row[9].replaceAll("\"", ""));
				npiBean.setNpitotal(row[162].replaceAll("\"", ""));
				npiBean.setSpid(row[10].replaceAll("\"", ""));
				
				npiBean.setSubjectDataBean(new SubjectDataBean());
				
				npiBean.getSubjectDataBean().setRID(row[2].replaceAll("\"", "").replaceAll("\"", ""));
				
				npiManager.insertInADNIOntology(npiBean, count);
			}
		
			LoadCsv.loadPercent = ((LoadCsv.PERCENT_NPI*count)/total) + LoadCsv.loadPast;
			
			count++;
		}

		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}
