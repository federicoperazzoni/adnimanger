package jena.adni.bean;

public class NPIBean extends ADNIBean {

	//Does the patient have beliefs that you know are not true (for example, insisting that people are trying to harm him/her or steal from him/her)? 
	//Has he/she said that family members are not who they say they are or that the house is not their home? I’m not asking about mere suspiciousness; 
	//I am interested if the patient is convinced that these things are happening to him/her. (Yes/No) (12) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIA
	private String Npia;
	
	//Does the patient believe that he/she is in danger - that others are planning to hurt him/her? (Yes/No) (13) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIA1
	private String Npia1;
	
	//Frequency of the symptom (1: Occasionally; 2: Often; 3: Frequently; 4: Very frequently) (22) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIA10A
	private String Npia10a;
	
	//Severity of the symptom (1: Mild; 2: Moderate; 3: Marked) (23) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIA10B
	private String Npia10b;
	
	//DISTRESS experienced by Caregiver due to the symptom  (0 :Not distressing at all;  1: Minimal; 2:Mild; 3 : Moderate; 4 : Severe 5 :Extreme or Very Severe) (24) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIA10C
	private String Npia10c;
	
	//Does the patient believe that others are stealing from him/her? (Yes/No) (14) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIA2
	private String Npia2;
	
	//Does the patient believe that his/her spouse is having an affair? (Yes/No) (15) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIA3
	private String Npia3;
	
	//Does the patient believe that unwelcome guests are living in his/her house? (Yes/No) (16) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIA4
	private String Npia4;
	
	//Does the patient believe that his/her spouse or others are not who they claim to be? (Yes/No) (17) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIA5
	private String Npia5;
	
	//Does the patient believe that his/her house is not his/her home? (Yes/No) (18) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIA6
	private String Npia6;
	
	//Does the patient believe that family members plan to abandon him/her? (Yes/No) (19) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIA7
	private String Npia7;
	
	//Does the patient believe that television or magazine figures are actually present in the home?  [Does he/she try to talk to or interact with them?] (Yes/No) (20) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIA8
	private String Npia8;
	
	//Does the patient believe any other unusual things that I haven't asked about? (Yes/No) (21) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIA9
	private String Npia9;
	
	//Frequency x Severity (0-12) (25) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIATOT
	private String Npiatot;
	
	//Does the patient have hallucinations such as seeing false visions or hearing imaginary voices? Does he/she seem to see, hear 
	//or experience things that are not present? By this question we do not mean just mistaken beliefs such as stating that someone who has died 
	//is still alive; rather we are asking if the patient actually has abnormal experiences of sounds or visions. (Yes/No) (26) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIB
	private String Npib;
	
	//Hallucinations - Question 1 (Yes/No) (27) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIB1
	private String Npib1;
	
	//Hallucinations - Question 2 (Yes/No) (28) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIB2
	private String Npib2;
	
	//Hallucinations - Question 3 (Yes/No) (29) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIB3
	private String Npib3;
	
	//Hallucinations - Question 4 (Yes/No) (30) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIB4
	private String Npib4;
	
	//Hallucinations - Question 5 (Yes/No) (31) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIB5
	private String Npib5;
	
	//Hallucinations - Question 6 (Yes/No) (32) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIB6
	private String Npib6;
	
	//Hallucinations - Question 7 (Yes/No) (33) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIB7
	private String Npib7;
	
	//Hallucinations - Frequency (1: Occasionally; 2: Often; 3: Frequently; 4: Very frequently) (34) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIB8A
	private String Npib8a;
	
	//Hallucinations -  Severity - Severity of the symptom (1: Mild; 2: Moderate; 3: Marked) (35) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIB8B
	private String Npib8b;
	
	//Distress experienced by Caregiver due to the symptom (0 :Not distressing at all;  1: Minimal; 2:Mild; 3 : Moderate; 4 : Severe 5 :Extreme or Very Severe) 
	//(36) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIB8C
	private String Npib8c;
	
	//Frequency x Severity (0-12) (37) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIBTOT
	private String Npibtot;
	
	//Does the patient have periods when he/she refuses to cooperate or won’t let people help him/her? Is he/she hard to handle? (Yes/No) (38) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIC
	private String Npic;
	
	//Does the patient get upset with those trying to care for him/her or resist activities such as bathing or changing clothes? (Yes/No) (39) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIC1
	private String Npic1;
	
	//Is the patient stubborn, having to have things his/her way? (Yes/No) (40) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIC2
	private String Npic2;
	
	//Is the patient uncooperative, resistive to help from others? (Yes/No) (41) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIC3
	private String Npic3;
	
	//Does the patient have any other behaviors that make him/her hard to handle? (Yes/No) (42) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIC4
	private String Npic4;
	
	//Does the patient shout or curse angrily? (Yes/No) (43) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIC5
	private String Npic5;
	
	//Does the patient slam doors, kick furniture, throw things? (Yes/No) (44) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIC6
	private String Npic6;
	
	//Does the patient attempt to hurt or hit others? (Yes/No) (45) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIC7
	private String Npic7;
	
	//Does the patient have any other aggressive or agitated behaviors? (Yes/No) (46) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIC8
	private String Npic8;
	
	//Frequency of the symptom (1: Occasionally; 2: Often; 3: Frequently; 4: Very frequently) (47) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIC9A
	private String Npic9a;
	
	//Severity of the symptom (1: Mild; 2: Moderate; 3: Marked) (48) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIC9B
	private String Npic9b;
	
	//Distress experienced by Caregiver due to the symptom (0 :Not distressing at all;  1: Minimal; 2:Mild; 3 : Moderate; 4 : Severe 5 :Extreme or Very Severe) (49) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIC9C
	private String Npic9c;
	
	//Frequency x Severity (0-12) (50) ADNI1 ADNIGO ADNI2 ADNI3
	//NPICTOT
	private String Npictot;
	
	//Does the patient seem sad or depressed? Does he/she say that he/she feels sad or depressed? (Yes/No) (51) ADNI1 ADNIGO ADNI2 ADNI3
	//NPID
	private String Npid;
	
	//Does the patient have periods of tearfulness or sobbing that seem to indicate sadness? (Yes/No) (52) ADNI1 ADNIGO ADNI2 ADNI3
	//NPID1
	private String Npid1;
	
	//Does the patient say or act as if he/she is sad or in low spirits? (Yes/No) (53) ADNI1 ADNIGO ADNI2 ADNI3
	//NPID2
	private String Npid2;
	
	//Does the patient put him/herself down or say that he/she feels like a failure? (Yes/No) (54) ADNI1 ADNIGO ADNI2 ADNI3
	//NPID3
	private String Npid3;
	
	//Does the patient say that he/she is a bad person or deserves to be punished? (Yes/No) (55) ADNI1 ADNIGO ADNI2 ADNI3
	//NPID4
	private String Npid4;
	
	//Does the patient seem very discouraged or say that he/she has no future? (Yes/No) (56) ADNI1 ADNIGO ADNI2 ADNI3
	//NPID5
	private String Npid5;
	
	//Does the patient say he/she is a burden to the family or that the family would be better (Yes/No) (57) ADNI1 ADNIGO ADNI2 ADNI3
	//NPID6
	private String Npid6;
	
	//Does the patient express a wish for death or talk about killing him/herself? (Yes/No) (58) ADNI1 ADNIGO ADNI2 ADNI3
	//NPID7
	private String Npid7;
	
	//Does the patient show any other signs of depression or sadness? (Yes/No) (59) ADNI1 ADNIGO ADNI2 ADNI3
	//NPID8
	private String Npid8;
}
