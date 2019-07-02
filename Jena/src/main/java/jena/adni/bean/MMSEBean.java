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
	
	//Number of trials AH (34)
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
}
