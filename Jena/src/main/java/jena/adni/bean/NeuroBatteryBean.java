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
}
