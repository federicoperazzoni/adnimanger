package jena.adni.bean;

public class NeuroBatteryBean extends ADNIBean {

	//Was ANARTND conducted? (tutti a -4?!) (72) ADNI1 ADNIGO ADNI2
	//ANARTND
	private String Anart_Nd;
	
	//ANART word reading total score (0-50) (73) ADNI1 ADNIGO ADNI2 ADNI3
	//ANARTERR
	private String Anart_Err;
	
	//Rey Auditory Verbal Learning Test - Repitition after 30 minutes (0-30) (68) ADNI1 ADNIGO ADNI2 ADNI3
	//AVDEL30MIN
	private String Avdel30_Min;
	
	//intrusions (0-16) (69) ADNI1 ADNIGO ADNI2 ADNI3
	//AVDELERR1
	private String Avdel_Err1;
	
	//errors (0-17) (71) ADNI1 ADNIGO ADNI2 ADNI3
	//AVDELERR2
	private String Avdel_Err2;
	
	//yes/no recognition trial of 50 words included List A, B and other words (0-15) (70) ADNI1 ADNIGO ADNI2 ADNI3
	//AVDELTOT
	private String Avdel_Tot;
	
	// N.A. (39) ADNI2 ADNI3
	//AVENDED
	private String Avended;
	
	//Intrusions in immediate recall of List A (0-15) (26) ADNI1 ADNIGO ADNI2 ADNI3
	//AVERR1
	private String Averr1;
	
	//Intrusions in immediate recall of List A (0-15) (28) ADNI1 ADNIGO ADNI2 ADNI3
	//AVERR2
	private String Averr2;
	
	//Intrusions in immediate recall of List A (0-15) (30) ADNI1 ADNIGO ADNI2 ADNI3
	//AVERR3
	private String Averr3;
	
	//Intrusions in immediate recall of List A (0-15) (32) ADNI1 ADNIGO ADNI2 ADNI3
	//AVERR4
	private String Averr4;
	
	//Intrusions in immediate recall of List A (0-15) (34) ADNI1 ADNIGO ADNI2 ADNI3
	//AVERR5
	private String Averr5;
	
	//Intrusions in immediate recall of List A (0-15) (36) ADNI1 ADNIGO ADNI2 ADNI3
	//AVERR6
	private String Averr6;
	
	//Intrusions in immediate recall of List B (0-15) (38) ADNI1 ADNIGO ADNI2 ADNI3
	//AVERRB
	private String AverrB;
	
	//Number of words in immediate recall of List A (0-15) (25) ADNI1 ADNIGO ADNI2 ADNI3
	//AVTOT1
	private String Avtot1;
	
	//Number of words in immediate recall of List A (0-15) (27) ADNI1 ADNIGO ADNI2 ADNI3
	//AVTOT2
	private String Avtot2;
	
	//Number of words in immediate recall of List A (0-15) (29) ADNI1 ADNIGO ADNI2 ADNI3
	//AVTOT3
	private String Avtot3;
	
	//Number of words in immediate recall of List A (0-15) (31) ADNI1 ADNIGO ADNI2 ADNI3
	//AVTOT4
	private String Avtot4;
	
	//Number of words in immediate recall of List A (0-15) (33) ADNI1 ADNIGO ADNI2 ADNI3
	//AVTOT5
	private String Avtot5;
	
	//Number of words in immediate recall of List A (0-15) (35) ADNI1 ADNIGO ADNI2 ADNI3
	//AVTOT6
	private String Avtot6;
	
	//Number of words in immediate recall of List B (0-15) (37) ADNI1 ADNIGO ADNI2 ADNI3
	//AVTOTB
	private String AvtotB;
	
	//Number of correct unique animal names produced within the one-minute time limit (0-60) (44) ADNI1 ADNIGO ADNI2 ADNI3
	//CATANIMSC
	private String Catanimsc;
	
	//Number of intrusions (non-animal names) (0-51) (46) ADNI1 ADNIGO ADNI2 ADNI3
	//CATANINTR
	private String Catanintr;
	
	//Number of perseverations (repeated names) (0-30) (45) ADNI1 ADNIGO ADNI2 ADNI3
	//CATANPERS
	private String Catanpers;
	
	//Approximately circular face (0 incorrect 1 Correct) (10) ADNI1 ADNIGO ADNI2 ADNI3
	//CLOCKCIRC
	private String Clockcirc;
	
	//Presence of the two hands (0 incorrect 1 Correct) (13) ADNI1 ADNIGO ADNI2 ADNI3
	//CLOCKHAND
	private String Clockhand;
	
	//Correctness of numbers (0 incorrect 1 Correct) (12) ADNI1 ADNIGO ADNI2 ADNI3
	//CLOCKNUM
	private String Clocknum;
	
	//Total score (0-5) (15) ADNI1 ADNIGO ADNI2 ADNI3
	//CLOCKSCOR
	private String Clockscor;
	
	//Symmetry of number placement (0 incorrect 1 Correct) (11) ADNI1 ADNIGO ADNI2 ADNI3
	//CLOCKSYM
	private String Clocksym;
	
	//Presence of the two hands, set to ten after eleven (0 incorrect 1 Correct) (14) ADNI1 ADNIGO ADNI2 ADNI3
	//CLOCKTIME
	private String Clocktime;
	
	//Approximately circular face (0 incorrect 1 Correct) (16) ADNI1 ADNIGO ADNI2 ADNI3
	//COPYCIRC
	private String Copycirc;
	
	//Presence of the two hands (0 incorrect 1 Correct) (19) ADNI1 ADNIGO ADNI2 ADNI3
	//COPYHAND
	private String Copyhand;
	
	//Correctness of numbers (0 incorrect 1 Correct) (18) ADNI1 ADNIGO ADNI2 ADNI3
	//COPYNUM
	private String Copynum;
	
	//Total Score (0-5) (21) ADNI1 ADNIGO ADNI2 ADNI3
	//COPYSCOR
	private String Copyscor;
	
	//Symmetry of number placement (0 incorrect 1 Correct) (17) ADNI1 ADNIGO ADNI2 ADNI3
	//COPYSYM
	private String Copysym;
	
	//Presence of the two hands, set to ten after eleven  (0 incorrect 1 Correct) (20) ADNI1 ADNIGO ADNI2 ADNI3
	//COPYTIME
	private String Copytime;
	
	//Time of beginning (Ora) (57) ADNI2 ADNI3
	//LDELBEGIN
	private String Ldelbegin;
	
	//Reminder givenReminder given (Yes/No)(0 incorrect 1 Correct)? (59) ADNI1 ADNIGO ADNI2 ADNI3
	//LDELCUE
	private String Ldelcue;
	
	//Total number of story units recalled (0-25) (58) ADNI1 ADNIGO ADNI2 ADNI3
	//LDELTOTAL
	private String Ldeltotal;
	
	//Time fo ending (Ora) (24) ADNI2 ADNI3
	//LIMMEND
	private String Limmend;
	
	//Total number of story units recalled (0-25) (23) ADNI1 ADNIGO ADNI2 ADNI3
	//LIMMTOTAL
	private String Limmtotal;
	
	//Which story was used (0-2)? (22) ADNI2 ADNI3
	//LMSTORY
	private String Lmstory;
	
	//Correct names with semantic cue (0-32)? (74) ADNI3
	//MINTSEMCUE
	private String Mintsemcue;
	
	//Correct names uncued + semantic cue (0-32)? (75) ADNI3
	//MINTTOTAL
	private String Minttotal;
	
	//Correct names uncued (0-32)? (76) ADNI3
	//MINTUNCUED
	private String Mintuncued;
	
	//Errors occurring when the participant connects two circles in the incorrect sequence (0-25)? (51) ADNI1 ADNIGO ADNI2 ADNI3
	//TRAAERRCOM
	private String Traaerrcom;
	
	// Errors occurring because the participant failed to draw a connecting line to a given circle in the correct sequence (0-25)? (52) ADNI1 ADNIGO ADNI2 ADNI3
	//TRAAERROM
	private String Traaerrom;
	
	// Total number of seconds to complete Part A (Seconds) (50) ADNI1 ADNIGO ADNI2 ADNI3
	//TRAASCOR
	private String Traascor;
	
	// Errors occurring when the participant connects two circles in the incorrect sequence (0-25) (54) ADNI1 ADNIGO ADNI2 ADNI3
	//TRABERRCOM
	private String Traberrcom;
	
	// Errors occurring because the participant failed to draw a connecting line to a given circle in the correct sequence (0-25) (55) ADNI1 ADNIGO ADNI2 ADNI3
	//TRABERROM
	private String Traberrom;
	
	// Total number of seconds to complete Part B (Seconds) (53) ADNI1 ADNIGO ADNI2 ADNI3
	//TRABSCOR
	private String Trabscor;	
	
	// Sum of scores from five first trials (0-75) (78) ADNI3
	//RAVLT_immediate
	private String Ravlt_immediate;
	
	// Score of Trial 5 minus score of trial 1 (-2-15) (79) ADNI3
	//RAVLT_learning
	private String Ravlt_learning;
	
	// Score of trial 5 minus score of the delayed recall (-33-15) (77) ADNI3
	//RAVLT_forgetting
	private String Ravlt_forgetting;
	
	// RAVTL forgettng divided by the score of Trial 5 (percent) (80) ADNI3
	//RAVLT_perc_forgetting
	private String Ravlt_perc_forgetting;
}
