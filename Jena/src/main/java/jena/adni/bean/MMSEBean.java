package jena.adni.bean;

public class MMSEBean extends ADNIBean {
	
	//Figure copying Scoring Corect Incorrect BD (56)
	//MMDRAW
	private String Clock_Drawing;

	//Backward_Spelling_Letter Verbatim Response BG - BM (59 - 65)
	//MMLTR1 - MMLTR7
	private String Backward_Spelling_Letter_1;
	private String Backward_Spelling_Letter_2;
	private String Backward_Spelling_Letter_3;
	private String Backward_Spelling_Letter_4;
	private String Backward_Spelling_Letter_5;
	private String Backward_Spelling_Letter_6;
	private String Backward_Spelling_Letter_7;
	
	//Scoring Corect Incorrect AI, AK, AM, AO, AQ (35, 37, 39, 41, 43)
	//MMD - MMW
	private String Backward_Spelling_Letter_D;
	private String Backward_Spelling_Letter_L;
	private String Backward_Spelling_Letter_R;
	private String Backward_Spelling_Letter_O;
	private String Backward_Spelling_Letter_W;
	
	//Verbatim Answer AJ, AL, AN, AP, AR (36, 38, 40, 42, 44)
	//MMDLTR - MMWLTR
	private String Backward_Spelling_Letter_D_V;
	private String Backward_Spelling_Letter_L_V;
	private String Backward_Spelling_Letter_R_V;
	private String Backward_Spelling_Letter_O_V;
	private String Backward_Spelling_Letter_W_V;
	
	//List used for the memory assessment (standard; alternative) AD (30)
	//MMRECALL
	private String Mm_Recall;
	
	//Number of trials number of trials AH (34)
	//MMTRIALS
	private String Mm_Trials;
	
	//List used for the memory assessment (standard; alternative) BT (72)
	//WORDLIST
	private String Wordlist;
	
	//Folds paper in half 0= Incorrect; 1= Correct ADNI3 1= Correct; 2= Incorrect ADNI1, ADNI2, ADNIGO AZ (52)
	//MMFOLD
	private String Mm_Fold;
	
	//Takes paper in right hand 0= Incorrect; 1= Correct ADNI3 1= Correct; 2= Incorrect ADNI1, ADNI2, ADNIGO (51)
	//MMHAND
	private String Mm_Hand;
	
	//Puts paper on floor 0= Incorrect; 1= Correct ADNI3 1= Correct; 2= Incorrect ADNI1, ADNI2, ADNIGO (53)
	//MMONFLR
	private String Mm_Onflr;
	
	//Read and Follow a written order 0= Incorrect; 1= Correct ADNI3 1= Correct; 2= Incorrect ADNI1, ADNI2, ADNIGO (54)
	//MMREAD
	private String Mm_Read;
	
	//Naming - Pencil 0= Incorrect; 1= Correct ADNI3 1= Correct; 2= Incorrect ADNI1, ADNI2, ADNIGO (49)
	//MMPENCIL
	private String Mm_Pencil;
	
	//Naming - Watch 0= Incorrect; 1= Correct ADNI3 1= Correct; 2= Incorrect ADNI1, ADNI2, ADNIGO (48)
	//MMWATCH
	private String Mm_Watch;
	
	//Repetition of a sentence 0= Incorrect; 1= Correct ADNI3 1= Correct; 2= Incorrect ADNI1, ADNI2, ADNIGO (50)
	//MMREPEAT
	private String Mm_Repeat;
	
	//Writing a sentence 0= Incorrect; 1= Correct ADNI3 1= Correct; 2= Incorrect ADNI1, ADNI2, ADNIGO (55)
	//MMWRITE
	private String Mm_Write;
	
	//Immediate Recall - Ball / Apple 0= Incorrect; 1= Correct ADNI3 1= Correct; 2= Incorrect ADNI1, ADNI2, ADNIGO (31)
	//MMBALL
	private String Mm_Ball;
	
	//Immediate Recall - Flag / Penny 0= Incorrect; 1= Correct ADNI3 1= Correct; 2= Incorrect ADNI1, ADNI2, ADNIGO (32)
	//MMFLAG
	private String Mm_Flag;
	
	//Immediate Recall - Tree / Table 0= Incorrect; 1= Correct ADNI3 1= Correct; 2= Incorrect ADNI1, ADNI2, ADNIGO (33)
	//MMTREE
	private String Mm_Tree;
	
	//Immediate Recall - Ball / Apple 0= Incorrect; 1= Correct ADNI3 1= Correct; 2= Incorrect ADNI1, ADNI2, ADNIGO (66)
	//WORD1
	private String Word1;
	
	//Immediate Recall - Flag / Penny 0= Incorrect; 1= Correct ADNI3 1= Correct; 2= Incorrect ADNI1, ADNI2, ADNIGO (68)
	//WORD2
	private String Word2;
	
	//Immediate Recall - Tree / Table 0= Incorrect; 1= Correct ADNI3 1= Correct; 2= Incorrect ADNI1, ADNI2, ADNIGO (70)
	//WORD3
	private String Word3;
	
	//Delayed Recall - Ball / Apple 0= Incorrect; 1= Correct ADNI3 1= Correct; 2= Incorrect ADNI1, ADNI2, ADNIGO (45)
	//MMBALLDL
	private String Mm_Ball_Dl;
	
	//Delayed Recall - Flag / Penny 0= Incorrect; 1= Correct ADNI3 1= Correct; 2= Incorrect ADNI1, ADNI2, ADNIGO (46)
	//MMFLAGDL
	private String Mm_Flag_Dl;
	
	//Delayed Recall - Tree / Table 0= Incorrect; 1= Correct ADNI3 1= Correct; 2= Incorrect ADNI1, ADNI2, ADNIGO (47)
	//MMTREEDL
	private String Mm_Tree_Dl;
	
	//Delayed Recall - Ball / Apple 0= Incorrect; 1= Correct ADNI3 1= Correct; 2= Incorrect ADNI1, ADNI2, ADNIGO (67)
	//WORD1DL
	private String Word1_Dl;
	
	//Delayed Recall - Flag / Penny 0= Incorrect; 1= Correct ADNI3 1= Correct; 2= Incorrect ADNI1, ADNI2, ADNIGO (69)
	//WORD2DL
	private String Word2_Dl;
	
	//Delayed Recall - Tree / Table 0= Incorrect; 1= Correct ADNI3 1= Correct; 2= Incorrect ADNI1, ADNI2, ADNIGO (71)
	//WORD3DL
	private String Word3_Dl;
	
	//County 0= Incorrect; 1= Correct ADNI3 1= Correct; 2= Incorrect ADNI1, ADNI2, ADNIGO (26)
	//MMAREA
	private String Mm_Area;
	
	//County - Answer Verbatim response (27)
	//MMAREACM
	private String Mm_Area_Cm;
	
	//City - 0= Incorrect; 1= Correct ADNI3 1= Correct; 2= Incorrect ADNI1, ADNI2, ADNIGO (24)
	//MMCITY
	private String Mm_City;
	
	//City - Answer Verbatim response (25)
	//MMCITYCM
	private String Mm_City_Cm;
	
	//Date - 0= Incorrect; 1= Correct ADNI3 1= Correct; 2= Incorrect ADNI1, ADNI2, ADNIGO (10)
	//MMDATE
	private String Mm_Date;
	
	//Date - Answer Verbatim response (11)
	//MMDATECM
	private String Mm_Date_Cm;
	
	//Day - 0= Incorrect; 1= Correct ADNI3 1= Correct; 2= Incorrect ADNI1, ADNI2, ADNIGO (16)
	//MMDAY
	private String Mm_Day;
	
	//Day - Answer Verbatim response (17)
	//MMDAYCM
	private String Mm_Day_Cm;
	
	//Month - 0= Incorrect; 1= Correct ADNI3 1= Correct; 2= Incorrect ADNI1, ADNI2, ADNIGO (14)
	//MMMONTH
	private String Mm_Month;
	
	//Month - Answer Verbatim response (15)
	//MMMONTHCM
	private String Mm_Month_Cm;
	
	//Year - 0= Incorrect; 1= Correct ADNI3 1= Correct; 2= Incorrect ADNI1, ADNI2, ADNIGO (12)
	//MMYEAR
	private String Mm_Year;
	
	//Year - Answer Verbatim response (13)
	//MMYEARCM
	private String Mm_Year_Cm;
	
	//Floor - 0= Incorrect; 1= Correct ADNI3 1= Correct; 2= Incorrect ADNI1, ADNI2, ADNIGO (22)
	//MMFLOOR
	private String Mm_Floor;
	
	//Floor - Answer Verbatim response (23)
	//MMFLRCM
	private String Mm_Flr_Cm;
	
	//Hospital - 0= Incorrect; 1= Correct ADNI3 1= Correct; 2= Incorrect ADNI1, ADNI2, ADNIGO (20)
	//MMHOSPIT
	private String Mm_Hospit;
	
	//Hospital Answer Verbatim response (21)
	//MMHOSPCM
	private String Mm_Hosp_Cm;
	
	//Season - 0= Incorrect; 1= Correct ADNI3 1= Correct; 2= Incorrect ADNI1, ADNI2, ADNIGO (18)
	//MMSEASON
	private String Mm_Season;
	
	//Season Answer Verbatim response (19)
	//MMSESNCM
	private String Mm_Sesn_Cm;
	
	//State - 0= Incorrect; 1= Correct ADNI3 1= Correct; 2= Incorrect ADNI1, ADNI2, ADNIGO (28)
	//MMSTATE
	private String Mm_State;
	
	//State Answer Verbatim response (29)
	//MMSTCM
	private String Mm_St_Cm;
	
	//Total score 0 - 30 (57)
	//MMSCORE
	private String Mm_Score;
	
	//World score 0 - 5 (73)
	//WORLDSCORE
	private String Worldscore;
	
	//Mm Score Edc 0 - 30 (N.A.)
	//MMSCORE_EDC
	private String Mm_score_Edc;
	
	//World Score Edc 0 - 5 (N.A.)
	//WORLDSCORE_EDC
	private String Worldscore_Edc;

	public String getClock_Drawing() {
		return Clock_Drawing;
	}

	public void setClock_Drawing(String clock_Drawing) {
		Clock_Drawing = clock_Drawing;
	}

	public String getBackward_Spelling_Letter_1() {
		return Backward_Spelling_Letter_1;
	}

	public void setBackward_Spelling_Letter_1(String backward_Spelling_Letter_1) {
		Backward_Spelling_Letter_1 = backward_Spelling_Letter_1;
	}

	public String getBackward_Spelling_Letter_2() {
		return Backward_Spelling_Letter_2;
	}

	public void setBackward_Spelling_Letter_2(String backward_Spelling_Letter_2) {
		Backward_Spelling_Letter_2 = backward_Spelling_Letter_2;
	}

	public String getBackward_Spelling_Letter_3() {
		return Backward_Spelling_Letter_3;
	}

	public void setBackward_Spelling_Letter_3(String backward_Spelling_Letter_3) {
		Backward_Spelling_Letter_3 = backward_Spelling_Letter_3;
	}

	public String getBackward_Spelling_Letter_4() {
		return Backward_Spelling_Letter_4;
	}

	public void setBackward_Spelling_Letter_4(String backward_Spelling_Letter_4) {
		Backward_Spelling_Letter_4 = backward_Spelling_Letter_4;
	}

	public String getBackward_Spelling_Letter_5() {
		return Backward_Spelling_Letter_5;
	}

	public void setBackward_Spelling_Letter_5(String backward_Spelling_Letter_5) {
		Backward_Spelling_Letter_5 = backward_Spelling_Letter_5;
	}

	public String getBackward_Spelling_Letter_6() {
		return Backward_Spelling_Letter_6;
	}

	public void setBackward_Spelling_Letter_6(String backward_Spelling_Letter_6) {
		Backward_Spelling_Letter_6 = backward_Spelling_Letter_6;
	}

	public String getBackward_Spelling_Letter_7() {
		return Backward_Spelling_Letter_7;
	}

	public void setBackward_Spelling_Letter_7(String backward_Spelling_Letter_7) {
		Backward_Spelling_Letter_7 = backward_Spelling_Letter_7;
	}

	public String getBackward_Spelling_Letter_D() {
		return Backward_Spelling_Letter_D;
	}

	public void setBackward_Spelling_Letter_D(String backward_Spelling_Letter_D) {
		Backward_Spelling_Letter_D = backward_Spelling_Letter_D;
	}

	public String getBackward_Spelling_Letter_L() {
		return Backward_Spelling_Letter_L;
	}

	public void setBackward_Spelling_Letter_L(String backward_Spelling_Letter_L) {
		Backward_Spelling_Letter_L = backward_Spelling_Letter_L;
	}

	public String getBackward_Spelling_Letter_R() {
		return Backward_Spelling_Letter_R;
	}

	public void setBackward_Spelling_Letter_R(String backward_Spelling_Letter_R) {
		Backward_Spelling_Letter_R = backward_Spelling_Letter_R;
	}

	public String getBackward_Spelling_Letter_O() {
		return Backward_Spelling_Letter_O;
	}

	public void setBackward_Spelling_Letter_O(String backward_Spelling_Letter_O) {
		Backward_Spelling_Letter_O = backward_Spelling_Letter_O;
	}

	public String getBackward_Spelling_Letter_W() {
		return Backward_Spelling_Letter_W;
	}

	public void setBackward_Spelling_Letter_W(String backward_Spelling_Letter_W) {
		Backward_Spelling_Letter_W = backward_Spelling_Letter_W;
	}

	public String getBackward_Spelling_Letter_D_V() {
		return Backward_Spelling_Letter_D_V;
	}

	public void setBackward_Spelling_Letter_D_V(String backward_Spelling_Letter_D_V) {
		Backward_Spelling_Letter_D_V = backward_Spelling_Letter_D_V;
	}

	public String getBackward_Spelling_Letter_L_V() {
		return Backward_Spelling_Letter_L_V;
	}

	public void setBackward_Spelling_Letter_L_V(String backward_Spelling_Letter_L_V) {
		Backward_Spelling_Letter_L_V = backward_Spelling_Letter_L_V;
	}

	public String getBackward_Spelling_Letter_R_V() {
		return Backward_Spelling_Letter_R_V;
	}

	public void setBackward_Spelling_Letter_R_V(String backward_Spelling_Letter_R_V) {
		Backward_Spelling_Letter_R_V = backward_Spelling_Letter_R_V;
	}

	public String getBackward_Spelling_Letter_O_V() {
		return Backward_Spelling_Letter_O_V;
	}

	public void setBackward_Spelling_Letter_O_V(String backward_Spelling_Letter_O_V) {
		Backward_Spelling_Letter_O_V = backward_Spelling_Letter_O_V;
	}

	public String getBackward_Spelling_Letter_W_V() {
		return Backward_Spelling_Letter_W_V;
	}

	public void setBackward_Spelling_Letter_W_V(String backward_Spelling_Letter_W_V) {
		Backward_Spelling_Letter_W_V = backward_Spelling_Letter_W_V;
	}

	public String getMm_Recall() {
		return Mm_Recall;
	}

	public void setMm_Recall(String mm_Recall) {
		Mm_Recall = mm_Recall;
	}

	public String getMm_Trials() {
		return Mm_Trials;
	}

	public void setMm_Trials(String mm_Trials) {
		Mm_Trials = mm_Trials;
	}

	public String getWordlist() {
		return Wordlist;
	}

	public void setWordlist(String wordlist) {
		Wordlist = wordlist;
	}

	public String getMm_Fold() {
		return Mm_Fold;
	}

	public void setMm_Fold(String mm_Fold) {
		Mm_Fold = mm_Fold;
	}

	public String getMm_Hand() {
		return Mm_Hand;
	}

	public void setMm_Hand(String mm_Hand) {
		Mm_Hand = mm_Hand;
	}

	public String getMm_Onflr() {
		return Mm_Onflr;
	}

	public void setMm_Onflr(String mm_Onflr) {
		Mm_Onflr = mm_Onflr;
	}

	public String getMm_Read() {
		return Mm_Read;
	}

	public void setMm_Read(String mm_Read) {
		Mm_Read = mm_Read;
	}

	public String getMm_Pencil() {
		return Mm_Pencil;
	}

	public void setMm_Pencil(String mm_Pencil) {
		Mm_Pencil = mm_Pencil;
	}

	public String getMm_Watch() {
		return Mm_Watch;
	}

	public void setMm_Watch(String mm_Watch) {
		Mm_Watch = mm_Watch;
	}

	public String getMm_Repeat() {
		return Mm_Repeat;
	}

	public void setMm_Repeat(String mm_Repeat) {
		Mm_Repeat = mm_Repeat;
	}

	public String getMm_Write() {
		return Mm_Write;
	}

	public void setMm_Write(String mm_Write) {
		Mm_Write = mm_Write;
	}

	public String getMm_Ball() {
		return Mm_Ball;
	}

	public void setMm_Ball(String mm_Ball) {
		Mm_Ball = mm_Ball;
	}

	public String getMm_Flag() {
		return Mm_Flag;
	}

	public void setMm_Flag(String mm_Flag) {
		Mm_Flag = mm_Flag;
	}

	public String getMm_Tree() {
		return Mm_Tree;
	}

	public void setMm_Tree(String mm_Tree) {
		Mm_Tree = mm_Tree;
	}

	public String getWord1() {
		return Word1;
	}

	public void setWord1(String word1) {
		Word1 = word1;
	}

	public String getWord2() {
		return Word2;
	}

	public void setWord2(String word2) {
		Word2 = word2;
	}

	public String getWord3() {
		return Word3;
	}

	public void setWord3(String word3) {
		Word3 = word3;
	}

	public String getMm_Ball_Dl() {
		return Mm_Ball_Dl;
	}

	public void setMm_Ball_Dl(String mm_Ball_Dl) {
		Mm_Ball_Dl = mm_Ball_Dl;
	}

	public String getMm_Flag_Dl() {
		return Mm_Flag_Dl;
	}

	public void setMm_Flag_Dl(String mm_Flag_Dl) {
		Mm_Flag_Dl = mm_Flag_Dl;
	}

	public String getMm_Tree_Dl() {
		return Mm_Tree_Dl;
	}

	public void setMm_Tree_Dl(String mm_Tree_Dl) {
		Mm_Tree_Dl = mm_Tree_Dl;
	}

	public String getWord1_Dl() {
		return Word1_Dl;
	}

	public void setWord1_Dl(String word1_Dl) {
		Word1_Dl = word1_Dl;
	}

	public String getWord2_Dl() {
		return Word2_Dl;
	}

	public void setWord2_Dl(String word2_Dl) {
		Word2_Dl = word2_Dl;
	}

	public String getWord3_Dl() {
		return Word3_Dl;
	}

	public void setWord3_Dl(String word3_Dl) {
		Word3_Dl = word3_Dl;
	}

	public String getMm_Area() {
		return Mm_Area;
	}

	public void setMm_Area(String mm_Area) {
		Mm_Area = mm_Area;
	}

	public String getMm_Area_Cm() {
		return Mm_Area_Cm;
	}

	public void setMm_Area_Cm(String mm_Area_Cm) {
		Mm_Area_Cm = mm_Area_Cm;
	}

	public String getMm_City() {
		return Mm_City;
	}

	public void setMm_City(String mm_City) {
		Mm_City = mm_City;
	}

	public String getMm_City_Cm() {
		return Mm_City_Cm;
	}

	public void setMm_City_Cm(String mm_City_Cm) {
		Mm_City_Cm = mm_City_Cm;
	}

	public String getMm_Date() {
		return Mm_Date;
	}

	public void setMm_Date(String mm_Date) {
		Mm_Date = mm_Date;
	}

	public String getMm_Date_Cm() {
		return Mm_Date_Cm;
	}

	public void setMm_Date_Cm(String mm_Date_Cm) {
		Mm_Date_Cm = mm_Date_Cm;
	}

	public String getMm_Day() {
		return Mm_Day;
	}

	public void setMm_Day(String mm_Day) {
		Mm_Day = mm_Day;
	}

	public String getMm_Day_Cm() {
		return Mm_Day_Cm;
	}

	public void setMm_Day_Cm(String mm_Day_Cm) {
		Mm_Day_Cm = mm_Day_Cm;
	}

	public String getMm_Month() {
		return Mm_Month;
	}

	public void setMm_Month(String mm_Month) {
		Mm_Month = mm_Month;
	}

	public String getMm_Month_Cm() {
		return Mm_Month_Cm;
	}

	public void setMm_Month_Cm(String mm_Month_Cm) {
		Mm_Month_Cm = mm_Month_Cm;
	}

	public String getMm_Year() {
		return Mm_Year;
	}

	public void setMm_Year(String mm_Year) {
		Mm_Year = mm_Year;
	}

	public String getMm_Year_Cm() {
		return Mm_Year_Cm;
	}

	public void setMm_Year_Cm(String mm_Year_Cm) {
		Mm_Year_Cm = mm_Year_Cm;
	}

	public String getMm_Floor() {
		return Mm_Floor;
	}

	public void setMm_Floor(String mm_Floor) {
		Mm_Floor = mm_Floor;
	}

	public String getMm_Flr_Cm() {
		return Mm_Flr_Cm;
	}

	public void setMm_Flr_Cm(String mm_Flr_Cm) {
		Mm_Flr_Cm = mm_Flr_Cm;
	}

	public String getMm_Hospit() {
		return Mm_Hospit;
	}

	public void setMm_Hospit(String mm_Hospit) {
		Mm_Hospit = mm_Hospit;
	}

	public String getMm_Hosp_Cm() {
		return Mm_Hosp_Cm;
	}

	public void setMm_Hosp_Cm(String mm_Hosp_Cm) {
		Mm_Hosp_Cm = mm_Hosp_Cm;
	}

	public String getMm_Season() {
		return Mm_Season;
	}

	public void setMm_Season(String mm_Season) {
		Mm_Season = mm_Season;
	}

	public String getMm_Sesn_Cm() {
		return Mm_Sesn_Cm;
	}

	public void setMm_Sesn_Cm(String mm_Sesn_Cm) {
		Mm_Sesn_Cm = mm_Sesn_Cm;
	}

	public String getMm_State() {
		return Mm_State;
	}

	public void setMm_State(String mm_State) {
		Mm_State = mm_State;
	}

	public String getMm_St_Cm() {
		return Mm_St_Cm;
	}

	public void setMm_St_Cm(String mm_St_Cm) {
		Mm_St_Cm = mm_St_Cm;
	}

	public String getMm_Score() {
		return Mm_Score;
	}

	public void setMm_Score(String mm_Score) {
		Mm_Score = mm_Score;
	}

	public String getWorldscore() {
		return Worldscore;
	}

	public void setWorldscore(String worldscore) {
		Worldscore = worldscore;
	}

	public String getMm_score_Edc() {
		return Mm_score_Edc;
	}

	public void setMm_score_Edc(String mm_score_Edc) {
		Mm_score_Edc = mm_score_Edc;
	}

	public String getWorldscore_Edc() {
		return Worldscore_Edc;
	}

	public void setWorldscore_Edc(String worldscore_Edc) {
		Worldscore_Edc = worldscore_Edc;
	}
}
