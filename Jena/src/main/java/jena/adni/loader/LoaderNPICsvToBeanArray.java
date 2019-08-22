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
				
				npiBean.setNpia(row[11]);
				npiBean.setNpia1(row[12]);
				npiBean.setNpia10a(row[21]);
				npiBean.setNpia10b(row[22]);
				npiBean.setNpia10c(row[23]);
				npiBean.setNpia2(row[13]);
				npiBean.setNpia3(row[14]);
				npiBean.setNpia4(row[15]);
				npiBean.setNpia5(row[16]);
				npiBean.setNpia6(row[17]);
				npiBean.setNpia7(row[18]);
				npiBean.setNpia8(row[19]);
				npiBean.setNpia9(row[20]);
				npiBean.setNpiatot(row[24]);
				npiBean.setNpib(row[25]);
				npiBean.setNpib1(row[26]);
				npiBean.setNpib2(row[27]);
				npiBean.setNpib3(row[28]);
				npiBean.setNpib4(row[29]);
				npiBean.setNpib5(row[30]);
				npiBean.setNpib6(row[31]);
				npiBean.setNpib7(row[32]);
				npiBean.setNpib8a(row[33]);
				npiBean.setNpib8b(row[34]);
				npiBean.setNpib8c(row[35]);
				npiBean.setNpibtot(row[36]);
				npiBean.setNpic(row[37]);
				npiBean.setNpic1(row[38]);
				npiBean.setNpic2(row[39]);
				npiBean.setNpic3(row[40]);
				npiBean.setNpic4(row[41]);
				npiBean.setNpic5(row[42]);
				npiBean.setNpic6(row[43]);
				npiBean.setNpic7(row[44]);
				npiBean.setNpic8(row[45]);
				npiBean.setNpic9a(row[46]);
				npiBean.setNpic9b(row[47]);
				npiBean.setNpic9c(row[48]);
				npiBean.setNpictot(row[49]);
				npiBean.setNpid(row[50]);
				npiBean.setNpid1(row[51]);
				npiBean.setNpid2(row[52]);
				npiBean.setNpid3(row[53]);
				npiBean.setNpid4(row[54]);
				npiBean.setNpid5(row[55]);
				npiBean.setNpid6(row[56]);
				npiBean.setNpid7(row[57]);
				npiBean.setNpid8(row[58]);
				npiBean.setNpid9a(row[59]);
				npiBean.setNpid9b(row[60]);
				npiBean.setNpid9c(row[61]);
				npiBean.setNpidtot(row[62]);
				npiBean.setNpie(row[63]);
				npiBean.setNpie1(row[64]);
				npiBean.setNpie2(row[65]);
				npiBean.setNpie3(row[66]);
				npiBean.setNpie4(row[67]);
				npiBean.setNpie5(row[68]);
				npiBean.setNpie6(row[69]);
				npiBean.setNpie7(row[70]);
				npiBean.setNpie8a(row[71]);
				npiBean.setNpie8b(row[72]);
				npiBean.setNpie8c(row[73]);
				npiBean.setNpietot(row[74]);
				npiBean.setNpif(row[75]);
				npiBean.setNpif1(row[76]);
				npiBean.setNpif2(row[77]);
				npiBean.setNpif3(row[78]);
				npiBean.setNpif4(row[79]);
				npiBean.setNpif5(row[80]);
				npiBean.setNpif6(row[81]);
				npiBean.setNpif7(row[82]);
				npiBean.setNpif8a(row[83]);
				npiBean.setNpif8b(row[84]);
				npiBean.setNpif8c(row[85]);
				npiBean.setNpiftot(row[86]);
				npiBean.setNpig(row[87]);
				npiBean.setNpig1(row[88]);
				npiBean.setNpig2(row[89]);
				npiBean.setNpig3(row[90]);
				npiBean.setNpig4(row[91]);
				npiBean.setNpig5(row[92]);
				npiBean.setNpig6(row[93]);
				npiBean.setNpig7(row[94]);
				npiBean.setNpig8(row[95]);
				npiBean.setNpig9a(row[96]);
				npiBean.setNpig9b(row[97]);
				npiBean.setNpig9c(row[98]);
				npiBean.setNpigtot(row[99]);
				npiBean.setNpih(row[100]);
				npiBean.setNpih1(row[101]);
				npiBean.setNpih2(row[102]);
				npiBean.setNpih3(row[103]);
				npiBean.setNpih4(row[104]);
				npiBean.setNpih5(row[105]);
				npiBean.setNpih6(row[106]);
				npiBean.setNpih7(row[107]);
				npiBean.setNpih8a(row[108]);
				npiBean.setNpih8b(row[109]);
				npiBean.setNpih8c(row[110]);
				npiBean.setNpihtot(row[111]);
				npiBean.setNpii(row[112]);
				npiBean.setNpii1(row[113]);
				npiBean.setNpii2(row[114]);
				npiBean.setNpii3(row[115]);
				npiBean.setNpii4(row[116]);
				npiBean.setNpii5(row[117]);
				npiBean.setNpii6(row[118]);
				npiBean.setNpii7(row[119]);
				npiBean.setNpii8a(row[120]);
				npiBean.setNpii8b(row[121]);
				npiBean.setNpii8c(row[122]);
				npiBean.setNpiitot(row[123]);
				npiBean.setNpij(row[124]);
				npiBean.setNpij1(row[125]);
				npiBean.setNpij2(row[126]);
				npiBean.setNpij3(row[127]);
				npiBean.setNpij4(row[128]);
				npiBean.setNpij5(row[129]);
				npiBean.setNpij6(row[130]);
				npiBean.setNpij7(row[131]);
				npiBean.setNpij8a(row[132]);
				npiBean.setNpij8b(row[133]);
				npiBean.setNpij8c(row[134]);
				npiBean.setNpijtot(row[135]);
				npiBean.setNpik(row[136]);
				npiBean.setNpik1(row[137]);
				npiBean.setNpik2(row[138]);
				npiBean.setNpik3(row[139]);
				npiBean.setNpik4(row[140]);
				npiBean.setNpik5(row[141]);
				npiBean.setNpik6(row[142]);
				npiBean.setNpik7(row[143]);
				npiBean.setNpik8(row[144]);
				npiBean.setNpik9a(row[145]);
				npiBean.setNpik9b(row[146]);
				npiBean.setNpik9c(row[147]);
				npiBean.setNpiktot(row[148]);
				npiBean.setNpil(row[149]);
				npiBean.setNpil1(row[150]);
				npiBean.setNpil2(row[151]);
				npiBean.setNpil3(row[152]);
				npiBean.setNpil4(row[153]);
				npiBean.setNpil5(row[154]);
				npiBean.setNpil6(row[155]);
				npiBean.setNpil7(row[156]);
				npiBean.setNpil8(row[157]);
				npiBean.setNpil9a(row[158]);
				npiBean.setNpil9b(row[159]);
				npiBean.setNpil9c(row[160]);
				npiBean.setNpiltot(row[161]);
				npiBean.setNpisourc(row[9]);
				npiBean.setNpitotal(row[162]);
				npiBean.setSpid(row[10]);
				
				npiBean.setSubjectDataBean(new SubjectDataBean());
				
				npiBean.getSubjectDataBean().setRID(row[2].replaceAll("\"", ""));
				
				npiManager.insertInADNIOntology(npiBean, count);
			}
		
			LoadCsv.loadPercent = ((LoadCsv.PERCENT_CDR*count)/total) + LoadCsv.PERCENT_PRE;
			
			count++;
		}

		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}
