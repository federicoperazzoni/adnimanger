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
	
	//Folds paper in half 0= Incorrect; 1= Correct AZ (52)
	//MMFOLD
	private String Mm_Fold;
	
	//Takes paper in right hand 0= Incorrect; 1= Correct (51)
	//MMHAND
	private String Mm_Hand;
	
	//Puts paper on floor 0= Incorrect; 1= Correct (53)
	//MMONFLR
	private String Mm_Onflr;
	
	//Read and Follow a written order 0= Incorrect; 1= Correct (54)
	//MMREAD
	private String Mm_Read;
	
	//Naming - Pencil 0= Incorrect; 1= Correct (49)
	//MMPENCIL
	private String Mm_Pencil;
	
	//Naming - Watch 0= Incorrect; 1= Correct (48)
	//MMWATCH
	private String Mm_Watch;
	
	//Repetition of a sentence 0= Incorrect; 1= Correct (50)
	//MMREPEAT
	private String Mm_Repeat;
	
	//Writing a sentence 0= Incorrect; 1= Correct (55)
	//MMWRITE
	private String Mm_Write;
	
	//Immediate Recall - Ball / Apple 1= Correct; 2= Incorrect (31)
	//MMBALL
	private String Mm_Ball;
	
	//Immediate Recall - Flag / Penny 1= Correct; 2= Incorrect (32)
	//MMFLAG
	private String Mm_Flag;
	
	//Immediate Recall - Tree / Table 1= Correct; 2= Incorrect (33)
	//MMTREE
	private String Mm_Tree;
	
	//Immediate Recall - Ball / Apple 0= Incorrect; 1= Correct (66)
	//WORD1
	private String Word1;
	
	//Immediate Recall - Flag / Penny 0= Incorrect; 1= Correct (68)
	//WORD2
	private String Word2;
	
	//Immediate Recall - Tree / Table 0= Incorrect; 1= Correct (70)
	//WORD3
	private String Word3;
	
	//Delayed Recall - Ball / Apple 1= Correct; 2= Incorrect (45)
	//MMBALLDL
	private String Mm_Ball_Dl;
	
	//Delayed Recall - Flag / Penny 1= Correct; 2= Incorrect (46)
	//MMFLAGDL
	private String Mm_Flag_Dl;
	
	//Delayed Recall - Tree / Table 1= Correct; 2= Incorrect (47)
	//MMTREEDL
	private String Mm_Tree_Dl;
	
	//Delayed Recall - Ball / Apple 0= Incorrect; 1= Correct (67)
	//WORD1DL
	private String Word1_Dl;
	
	//Delayed Recall - Flag / Penny 0= Incorrect; 1= Correct (69)
	//WORD2DL
	private String Word2_Dl;
	
	//Delayed Recall - Tree / Table 0= Incorrect; 1= Correct (71)
	//WORD3DL
	private String Word3_Dl;
	
	//County 1= Correct; 2= Incorrect (26)
	//MMAREA
	private String Mm_Area;
	
	//County - Answer Verbatim response (27)
	//MMAREACM
	private String Mm_Area_Cm;
	
	//City - 1= Correct; 2= Incorrect (24)
	//MMCITY
	private String Mm_City;
	
	//City - Answer Verbatim response (25)
	//MMCITYCM
	private String Mm_City_Cm;
	
	//Date - 1= Correct; 2= Incorrect (10)
	//MMDATE
	private String Mm_Date;
	
	//Date - Answer Verbatim response (11)
	//MMDATECM
	private String Mm_Date_Cm;
	
	//Day - 1= Correct; 2= Incorrect (16)
	//MMDAY
	private String Mm_Day;
	
	//Day - Answer Verbatim response (17)
	//MMDAYCM
	private String Mm_Day_Cm;
	
	//Month - 1= Correct; 2= Incorrect (14)
	//MMMONTH
	private String Mm_Month;
	
	//Month - Answer Verbatim response (15)
	//MMMONTHCM
	private String Mm_Month_Cm;
	
	//Year - 1= Correct; 2= Incorrect (12)
	//MMYEAR
	private String Mm_Year;
	
	//Year - Answer Verbatim response (13)
	//MMYEARCM
	private String Mm_Year_Cm;
}
