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
	
	// Total correct without a cue (0-30) (61) ADNI1 ADNIGO ADNI2
	//BNTSPONT
	private String Bntspont;
	
	// Total semantic cues given (0-30) (62) ADNI1 ADNIGO ADNI2
	//BNTSTIM
	private String Bntstim;
	
	// Total correct with a semantic cue (0-30) (63) ADNI1 ADNIGO ADNI2
	//BNTCSTIM
	private String Bntcstim;
	
	// Total phonemic cues given (0-30) (64) ADNI1 ADNIGO ADNI2
	//BNTPHON
	private String Bntphon;
	
	// Total correct with phonemic cues (0-30) (65) ADNI1 ADNIGO ADNI2
	//BNTCPHON
	private String Bntcphon;
	
	// Total correct = sum of 1 + 3 above (0-30) (66) ADNI1 ADNIGO ADNI2
	//BNTTOTAL
	private String Bnttotal;
	
	// - (-) (67) ADNI1 ADNIGO ADNI2
	//AVDELBEGAN
	private String Avdelbegan;
	
	// - (-) (72) ADNI1 ADNIGO ADNI2
	//ANARTND
	private String Anartnd;
	
	// - (-) (60) ADNI1
	//BNTND
	private String Bntnd;
	
	// - (data) (9) ADNI1
	//EXAMDATE
	private String Examdate;
	
	// Total score (0-12) (40) ADNI1
	//DSPANFOR
	private String Dspanfor;
	
	// Lenght of span (0-9) (41) ADNI1
	//DSPANFLTH
	private String Dspanflth;
	
	// Total score (0-12) (42) ADNI1
	//DSPANBAC
	private String Dspanbac;
	
	// Lenght of span (0-9) (43) ADNI1
	//DSPANBLTH
	private String Dspanblth;
	
	// Number of correct unique vegetables names produced within the one-minute time limit (0-60) (47) ADNI1
	//CATVEGESC
	private String Catvegesc;
	
	// Number of intrusions (non-vegetables names) (0-51) (48) ADNI1
	//CATVGPERS
	private String Catvgpers;
	
	// Number of perseverations (repeated names) (0-30) (49) ADNI1
	//CATVGINTR
	private String Catvgintr;
	
	// Total Score of test (0-83) (56) ADNI1
	//DIGITSCOR
	private String Digitscor;

	public String getLdelbegin() {
		return Ldelbegin;
	}

	public void setLdelbegin(String ldelbegin) {
		Ldelbegin = ldelbegin;
	}

	public String getLdelcue() {
		return Ldelcue;
	}

	public void setLdelcue(String ldelcue) {
		Ldelcue = ldelcue;
	}

	public String getLdeltotal() {
		return Ldeltotal;
	}

	public void setLdeltotal(String ldeltotal) {
		Ldeltotal = ldeltotal;
	}

	public String getLimmend() {
		return Limmend;
	}

	public void setLimmend(String limmend) {
		Limmend = limmend;
	}

	public String getLimmtotal() {
		return Limmtotal;
	}

	public void setLimmtotal(String limmtotal) {
		Limmtotal = limmtotal;
	}

	public String getLmstory() {
		return Lmstory;
	}

	public void setLmstory(String lmstory) {
		Lmstory = lmstory;
	}

	public String getMintsemcue() {
		return Mintsemcue;
	}

	public void setMintsemcue(String mintsemcue) {
		Mintsemcue = mintsemcue;
	}

	public String getMinttotal() {
		return Minttotal;
	}

	public void setMinttotal(String minttotal) {
		Minttotal = minttotal;
	}

	public String getMintuncued() {
		return Mintuncued;
	}

	public void setMintuncued(String mintuncued) {
		Mintuncued = mintuncued;
	}

	public String getTraaerrcom() {
		return Traaerrcom;
	}

	public void setTraaerrcom(String traaerrcom) {
		Traaerrcom = traaerrcom;
	}

	public String getTraaerrom() {
		return Traaerrom;
	}

	public void setTraaerrom(String traaerrom) {
		Traaerrom = traaerrom;
	}

	public String getTraascor() {
		return Traascor;
	}

	public void setTraascor(String traascor) {
		Traascor = traascor;
	}

	public String getTraberrcom() {
		return Traberrcom;
	}

	public void setTraberrcom(String traberrcom) {
		Traberrcom = traberrcom;
	}

	public String getTraberrom() {
		return Traberrom;
	}

	public void setTraberrom(String traberrom) {
		Traberrom = traberrom;
	}

	public String getTrabscor() {
		return Trabscor;
	}

	public void setTrabscor(String trabscor) {
		Trabscor = trabscor;
	}

	public String getRavlt_immediate() {
		return Ravlt_immediate;
	}

	public void setRavlt_immediate(String ravlt_immediate) {
		Ravlt_immediate = ravlt_immediate;
	}

	public String getRavlt_learning() {
		return Ravlt_learning;
	}

	public void setRavlt_learning(String ravlt_learning) {
		Ravlt_learning = ravlt_learning;
	}

	public String getRavlt_forgetting() {
		return Ravlt_forgetting;
	}

	public void setRavlt_forgetting(String ravlt_forgetting) {
		Ravlt_forgetting = ravlt_forgetting;
	}

	public String getRavlt_perc_forgetting() {
		return Ravlt_perc_forgetting;
	}

	public void setRavlt_perc_forgetting(String ravlt_perc_forgetting) {
		Ravlt_perc_forgetting = ravlt_perc_forgetting;
	}

	public String getExamdate() {
		return Examdate;
	}

	public void setExamdate(String examdate) {
		Examdate = examdate;
	}

	public String getDspanfor() {
		return Dspanfor;
	}

	public void setDspanfor(String dspanfor) {
		Dspanfor = dspanfor;
	}

	public String getDspanflth() {
		return Dspanflth;
	}

	public void setDspanflth(String dspanflth) {
		Dspanflth = dspanflth;
	}

	public String getDspanbac() {
		return Dspanbac;
	}

	public void setDspanbac(String dspanbac) {
		Dspanbac = dspanbac;
	}

	public String getDspanblth() {
		return Dspanblth;
	}

	public void setDspanblth(String dspanblth) {
		Dspanblth = dspanblth;
	}

	public String getAnart_Nd() {
		return Anart_Nd;
	}

	public void setAnart_Nd(String anart_Nd) {
		Anart_Nd = anart_Nd;
	}

	public String getAnart_Err() {
		return Anart_Err;
	}

	public void setAnart_Err(String anart_Err) {
		Anart_Err = anart_Err;
	}

	public String getAvdel30_Min() {
		return Avdel30_Min;
	}

	public void setAvdel30_Min(String avdel30_Min) {
		Avdel30_Min = avdel30_Min;
	}

	public String getAvdel_Err1() {
		return Avdel_Err1;
	}

	public void setAvdel_Err1(String avdel_Err1) {
		Avdel_Err1 = avdel_Err1;
	}

	public String getAvdel_Err2() {
		return Avdel_Err2;
	}

	public void setAvdel_Err2(String avdel_Err2) {
		Avdel_Err2 = avdel_Err2;
	}

	public String getAvdel_Tot() {
		return Avdel_Tot;
	}

	public void setAvdel_Tot(String avdel_Tot) {
		Avdel_Tot = avdel_Tot;
	}

	public String getAvended() {
		return Avended;
	}

	public void setAvended(String avended) {
		Avended = avended;
	}

	public String getAverr1() {
		return Averr1;
	}

	public void setAverr1(String averr1) {
		Averr1 = averr1;
	}

	public String getAverr2() {
		return Averr2;
	}

	public void setAverr2(String averr2) {
		Averr2 = averr2;
	}

	public String getAverr3() {
		return Averr3;
	}

	public void setAverr3(String averr3) {
		Averr3 = averr3;
	}

	public String getAverr4() {
		return Averr4;
	}

	public void setAverr4(String averr4) {
		Averr4 = averr4;
	}

	public String getAverr5() {
		return Averr5;
	}

	public void setAverr5(String averr5) {
		Averr5 = averr5;
	}

	public String getAverr6() {
		return Averr6;
	}

	public void setAverr6(String averr6) {
		Averr6 = averr6;
	}

	public String getAverrB() {
		return AverrB;
	}

	public void setAverrB(String averrB) {
		AverrB = averrB;
	}

	public String getAvtot1() {
		return Avtot1;
	}

	public void setAvtot1(String avtot1) {
		Avtot1 = avtot1;
	}

	public String getAvtot2() {
		return Avtot2;
	}

	public void setAvtot2(String avtot2) {
		Avtot2 = avtot2;
	}

	public String getAvtot3() {
		return Avtot3;
	}

	public void setAvtot3(String avtot3) {
		Avtot3 = avtot3;
	}

	public String getAvtot4() {
		return Avtot4;
	}

	public void setAvtot4(String avtot4) {
		Avtot4 = avtot4;
	}

	public String getAvtot5() {
		return Avtot5;
	}

	public void setAvtot5(String avtot5) {
		Avtot5 = avtot5;
	}

	public String getAvtot6() {
		return Avtot6;
	}

	public void setAvtot6(String avtot6) {
		Avtot6 = avtot6;
	}

	public String getAvtotB() {
		return AvtotB;
	}

	public void setAvtotB(String avtotB) {
		AvtotB = avtotB;
	}

	public String getCatanimsc() {
		return Catanimsc;
	}

	public void setCatanimsc(String catanimsc) {
		Catanimsc = catanimsc;
	}

	public String getCatanintr() {
		return Catanintr;
	}

	public void setCatanintr(String catanintr) {
		Catanintr = catanintr;
	}

	public String getCatanpers() {
		return Catanpers;
	}

	public void setCatanpers(String catanpers) {
		Catanpers = catanpers;
	}

	public String getClockcirc() {
		return Clockcirc;
	}

	public void setClockcirc(String clockcirc) {
		Clockcirc = clockcirc;
	}

	public String getClockhand() {
		return Clockhand;
	}

	public void setClockhand(String clockhand) {
		Clockhand = clockhand;
	}

	public String getClocknum() {
		return Clocknum;
	}

	public void setClocknum(String clocknum) {
		Clocknum = clocknum;
	}

	public String getClockscor() {
		return Clockscor;
	}

	public void setClockscor(String clockscor) {
		Clockscor = clockscor;
	}

	public String getClocksym() {
		return Clocksym;
	}

	public void setClocksym(String clocksym) {
		Clocksym = clocksym;
	}

	public String getClocktime() {
		return Clocktime;
	}

	public void setClocktime(String clocktime) {
		Clocktime = clocktime;
	}

	public String getCopycirc() {
		return Copycirc;
	}

	public void setCopycirc(String copycirc) {
		Copycirc = copycirc;
	}

	public String getCopyhand() {
		return Copyhand;
	}

	public void setCopyhand(String copyhand) {
		Copyhand = copyhand;
	}

	public String getCopynum() {
		return Copynum;
	}

	public void setCopynum(String copynum) {
		Copynum = copynum;
	}

	public String getCopyscor() {
		return Copyscor;
	}

	public void setCopyscor(String copyscor) {
		Copyscor = copyscor;
	}

	public String getCopysym() {
		return Copysym;
	}

	public void setCopysym(String copysym) {
		Copysym = copysym;
	}

	public String getCopytime() {
		return Copytime;
	}

	public void setCopytime(String copytime) {
		Copytime = copytime;
	}

	public String getBntspont() {
		return Bntspont;
	}

	public void setBntspont(String bntspont) {
		Bntspont = bntspont;
	}

	public String getBntstim() {
		return Bntstim;
	}

	public void setBntstim(String bntstim) {
		Bntstim = bntstim;
	}

	public String getBntcstim() {
		return Bntcstim;
	}

	public void setBntcstim(String bntcstim) {
		Bntcstim = bntcstim;
	}

	public String getBntphon() {
		return Bntphon;
	}

	public void setBntphon(String bntphon) {
		Bntphon = bntphon;
	}

	public String getBntcphon() {
		return Bntcphon;
	}

	public void setBntcphon(String bntcphon) {
		Bntcphon = bntcphon;
	}

	public String getBnttotal() {
		return Bnttotal;
	}

	public void setBnttotal(String bnttotal) {
		Bnttotal = bnttotal;
	}

	public String getAvdelbegan() {
		return Avdelbegan;
	}

	public void setAvdelbegan(String avdelbegan) {
		Avdelbegan = avdelbegan;
	}

	public String getAnartnd() {
		return Anartnd;
	}

	public void setAnartnd(String anartnd) {
		Anartnd = anartnd;
	}

	public String getBntnd() {
		return Bntnd;
	}

	public void setBntnd(String bntnd) {
		Bntnd = bntnd;
	}

	public String getCatvegesc() {
		return Catvegesc;
	}

	public void setCatvegesc(String catvegesc) {
		Catvegesc = catvegesc;
	}

	public String getCatvgpers() {
		return Catvgpers;
	}

	public void setCatvgpers(String catvgpers) {
		Catvgpers = catvgpers;
	}

	public String getCatvgintr() {
		return Catvgintr;
	}

	public void setCatvgintr(String catvgintr) {
		Catvgintr = catvgintr;
	}

	public String getDigitscor() {
		return Digitscor;
	}

	public void setDigitscor(String digitscor) {
		Digitscor = digitscor;
	}
}
