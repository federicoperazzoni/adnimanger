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
	
	//Frequency of the symptom (1: Occasionally; 2: Often; 3: Frequently; 4: Very frequently) (60) ADNI1 ADNIGO ADNI2 ADNI3
	//NPID9A
	private String Npid9a;
	
	//Severity of the symptom (1: Mild; 2: Moderate; 3: Marked) (61) ADNI1 ADNIGO ADNI2 ADNI3
	//NPID9B
	private String Npid9b;
	
	//Distress experienced by Caregiver due to the symptom (0 :Not distressing at all;  1: Minimal; 2:Mild; 3 : Moderate; 4 : Severe 5 :Extreme or Very Severe) (62) ADNI1 ADNIGO ADNI2 ADNI3
	//NPID9C
	private String Npid9c;
	
	//Frequency x Severity (0-12) (63) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIDTOT
	private String Npidtot;
	
	//Is the patient very nervous, worried, or frightened for no apparent reason? Does he/she seem (Yes/No) (64) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIE
	private String Npie;
	
	//Does the patient say that he/she is worried about planned events? (Yes/No) (65) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIE1
	private String Npie1;
	
	//Does the patient have periods of feeling shaky, unable to relax, or feeling excessively (Yes/No) (66) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIE2
	private String Npie2;
	
	//Does the patient have periods of [or complain of] shortness of breath, gasping, or
	//sighing for no apparent reason other than nervousness? (Yes/No) (67) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIE3
	private String Npie3;
	
	//Does the patient complain of butterflies in his/her stomach, or of racing or pounding
	//of the heart in association with nervousness? [Symptoms not explained by ill health (Yes/No) (68) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIE4
	private String Npie4;
	
	//Does the patient avoid certain places or situations that make him/her more nervous
	//such as riding in the car, meeting with friends, or being in crowds? (Yes/No) (69) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIE5
	private String Npie5;
	
	//Does the patient become nervous and upset when separated from you [or his/her
	//caregiver]? [Does he/she cling to you to keep from being separated? (Yes/No) (70) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIE6
	private String Npie6;
	
	//Does the patient show any other signs of anxiety? (Yes/No) (71) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIE7
	private String Npie7;
	
	//Frequency of the symptom (1: Occasionally; 2: Often; 3: Frequently; 4: Very frequently) (72) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIE8A
	private String Npie8a;
	
	//Severity of the symptom (1: Mild; 2: Moderate; 3: Marked) (73) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIE8B
	private String Npie8b;
	
	//Distress experienced by Caregiver due to the symptom (0 :Not distressing at all;  1: Minimal; 2:Mild; 3 : Moderate; 4 : Severe 5 :Extreme or Very Severe) (74) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIE8C
	private String Npie8c;
	
	//Frequency x Severity (0-12) (75) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIETOT
	private String Npietot;
	
	//Presence of Elation/Euphoria (Yes/No) (76) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIF
	private String Npif;
	
	//Does the patient appear to feel too good or to be too happy, different from his/her usual self? (Yes/No) (77) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIF1
	private String Npif1;
	
	//Does the patient find humor and laugh at things that others do not find funny? (Yes/No) (78) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIF2
	private String Npif2;
	
	//Does the patient seem to have a childish sense of humor with a tendency to giggle or laugh 
	//inappropriately (such as when something unfortunate happens to others)? (Yes/No) (79) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIF3
	private String Npif3;
	
	//Does the patient tell jokes or make remarks that have little humor for others but seem funny to him/her? (Yes/No) (80) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIF4
	private String Npif4;
	
	//Does he/she play childish pranks such as pinching or playing “keep away” for the fun of it? (Yes/No) (81) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIF5
	private String Npif5;
	
	//Does the patient “talk big” or claim to have more abilities or wealth than is true? (Yes/No) (82) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIF6
	private String Npif6;
	
	//Does the patient show any other signs of feeling too good or being too happy? (Yes/No) (83) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIF7
	private String Npif7;
	
	//Frequency of the symptom (1: Occasionally; 2: Often; 3: Frequently; 4: Very frequently) (84) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIF8A
	private String Npif8a;
	
	//Severity of the symptom (1: Mild; 2: Moderate; 3: Marked) (85) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIF8B
	private String Npif8b;
	
	//Distress experienced by Caregiver due to the symptom (0 :Not distressing at all;  1: Minimal; 2:Mild; 3 : Moderate; 4 : Severe 5 :Extreme or Very Severe) 
	//(86) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIF8C
	private String Npif8c;
	
	//Frequency x Severity (0-12) (87) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIFTOT
	private String Npiftot;
	
	//Has the patient lost interest in the world around him/her? Has he/she lost interest in doing things or does 
	//he/she lack motivation for starting new activities? Is he/she more difficult to engage in conversation or in doing chores? 
	//Is the patient apathetic or indifferent? 
	//(Yes/No) (88) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIG
	private String Npig;
	
	//Does the patient seem less spontaneous and less active than usual? (Yes/No) (89) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIG1
	private String Npig1;
	
	//Is the patient less likely to initiate a conversation? (Yes/No) (90) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIG2
	private String Npig2;
	
	//Is the patient less affectionate or lacking in emotions when compared to his/her usual self? (Yes/No) (91) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIG3
	private String Npig3;
	
	//Does the patient contribute less to household chores? (Yes/No) (92) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIG4
	private String Npig4;
	
	//Does the patient seem less interested in the activities and plans of others? (Yes/No) (93) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIG5
	private String Npig5;
	
	//Has the patient lost interest in friends and family members? (Yes/No) (94) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIG6
	private String Npig6;
	
	//Is the patient less enthusiastic about his/her usual interests? (Yes/No) (95) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIG7
	private String Npig7;
	
	//Does the patient show any other signs that he/she doesn’t care about doing new things? (Yes/No) (96) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIG8
	private String Npig8;
	
	//Frequency of the symptom (1: Occasionally; 2: Often; 3: Frequently; 4: Very frequently) (97) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIG9A
	private String Npig9a;
	
	//Severity of the symptom (1: Mild; 2: Moderate; 3: Marked) (98) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIG9B
	private String Npig9b;
	
	//Distress experienced by Caregiver due to the symptom 
	//(0 :Not distressing at all;  1: Minimal; 2:Mild; 3 : Moderate; 4 : Severe 5 :Extreme or Very Severe) (99) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIG9C
	private String Npig9c;
	
	//Frequency x Severity (0-12) (100) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIGTOT
	private String Npigtot;
	
	//Does the patient seem to act impulsively without thinking? Does he/she do or say things that are not usually 
	//done or said in public? Does he/she do things that are embarrassing to you or others? (Yes/No) (101) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIH
	private String Npih;
	
	//Does the patient act impulsively without appearing to consider the consequences? (Yes/No) (102) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIH1
	private String Npih1;
	
	//Does the patient talk to total strangers as if he/she knew them? (Yes/No) (103) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIH2
	private String Npih2;
	
	//Does the patient say things to people that are insensitive or hurt their feelings? (Yes/No) (104) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIH3
	private String Npih3;
	
	//Does the patient say crude things or make sexual remarks that he/she would not usually have said? (Yes/No) (105) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIH4
	private String Npih4;
	
	//Does the patient talk openly about very personal or private matters not usually discussed in public? (Yes/No) (106) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIH5
	private String Npih5;
	
	//Does the patient take liberties or touch or hug others in way that is out of character for him/her? (Yes/No) (107) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIH6
	private String Npih6;
	
	//Does the patient show any other signs of loss of control of his/her impulses? (Yes/No) (108) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIH7
	private String Npih7;
	
	//Frequency of the symptom (1: Occasionally; 2: Often; 3: Frequently; 4: Very frequently) (109) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIH8A
	private String Npih8a;
	
	//Severity of the symptom (1: Mild; 2: Moderate; 3: Marked) (110) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIH8B
	private String Npih8b;
	
	//Distress experienced by Caregiver due to the symptom (0 :Not distressing at all;  1: Minimal; 2:Mild; 3 : Moderate; 4 : Severe 5 :Extreme or Very Severe) (111) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIH8C
	private String Npih8c;
	
	//Frequency x Severity (0-12) (112) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIHTOT
	private String Npihtot;
	
	//Does the patient get irritated and easily disturbed? Are his/her moods very changeable? Is he/she abnormally 
	//impatient? We do not mean frustration over memory loss or inability 
	//to perform usual tasks; we are interested to know if the patient has abnormal irritability, impatience, or rapid emotional 
	//changes different from his/her usual self. (Yes/No) (113) ADNI1 ADNIGO ADNI2 ADNI3
	//NPII
	private String Npii;
	
	//Does the patient have a bad temper, flying “off the handle” easily over little things? (Yes/No) (114) ADNI1 ADNIGO ADNI2 ADNI3
	//NPII1
	private String Npii1;
	
	//Does the patient rapidly change moods from one to another, being fine one minute and angry the next? (Yes/No) (115) ADNI1 ADNIGO ADNI2 ADNI3
	//NPII2
	private String Npii2;
	
	//Does the patient have sudden flashes of anger? (Yes/No) (116) ADNI1 ADNIGO ADNI2 ADNI3
	//NPII3
	private String Npii3;
	
	//Is the patient impatient, having trouble coping with delays or waiting for planned activities? (Yes/No) (117) ADNI1 ADNIGO ADNI2 ADNI3
	//NPII4
	private String Npii4;
	
	//Is the patient cranky and irritable? (Yes/No) (118) ADNI1 ADNIGO ADNI2 ADNI3
	//NPII5
	private String Npii5;
	
	//Is the patient argumentative and difficult to get along with? (Yes/No) (119) ADNI1 ADNIGO ADNI2 ADNI3
	//NPII6
	private String Npii6;
	
	//Does the patient show any other signs of irritability? (Yes/No) (120) ADNI1 ADNIGO ADNI2 ADNI3
	//NPII7
	private String Npii7;
	
	//Frequency of the symptom (1: Occasionally; 2: Often; 3: Frequently; 4: Very frequently) (121) ADNI1 ADNIGO ADNI2 ADNI3
	//NPII8A
	private String Npii8a;
	
	//Severity of the symptom (1: Mild; 2: Moderate; 3: Marked) (122) ADNI1 ADNIGO ADNI2 ADNI3
	//NPII8B
	private String Npii8b;
	
	//Distress experienced by Caregiver due to the symptom (0 :Not distressing at all;  1: Minimal; 2:Mild; 3 : Moderate; 4 : Severe 5 :Extreme or Very Severe) (123) ADNI1 ADNIGO ADNI2 ADNI3
	//NPII8C
	private String Npii8c;
	
	//Frequency x Severity (0-12) (124) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIITOT
	private String Npiitot;
	
	//Does the patient pace, do things over and over such as opening closets or drawers, or repeatedly pick at things or wind string or threads? (Yes/No) (125) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIJ
	private String Npij;
	
	//Does the patient pace around the house without apparent purpose? (Yes/No) (126) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIJ1
	private String Npij1;
	
	//Does the patient rummage around opening and unpacking drawers or closets? (Yes/No) (127) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIJ2
	private String Npij2;
	
	//Does the patient repeatedly put on and take off clothing? (Yes/No) (128) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIJ3
	private String Npij3;
	
	//Does the patient have repetitive activities or "habits" that he/she performs over and over? (Yes/No) (129) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIJ4
	private String Npij4;
	
	//Does the patient engage in repetitive activities such as handling buttons, picking, wrapping string, etc? (Yes/No) (130) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIJ5
	private String Npij5;
	
	//Does the patient fidget excessively, seem unable to sit still, or bounce his/her feet or tap his/her fingers a lot? (Yes/No) (131) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIJ6
	private String Npij6;
	
	//Does the patient do any other activities over and over? (Yes/No) (132) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIJ7
	private String Npij7;
	
	//Frequency of the symptom (1: Occasionally; 2: Often; 3: Frequently; 4: Very frequently) (133) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIJ8A
	private String Npij8a;
	
	//Severity of the symptom (1: Mild; 2: Moderate; 3: Marked) (134) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIJ8B
	private String Npij8b;
	
	//Distress experienced by Caregiver due to the symptom (0 :Not distressing at all;  1: Minimal; 2:Mild; 3 : Moderate; 4 : Severe 5 :Extreme or Very Severe) (135) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIJ8C
	private String Npij8c;
	
	//Frequency x Severity (0-12) (136) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIJTOT
	private String Npijtot;
	
	//Does the patient have difficulty sleeping (do not count as present if the patient simply gets up once or twice per night only to go to the bathroom 
	//and falls back asleep immediately)? Is he/she up at night? Does he/she wander at night, 
	//get dressed, or disturb your sleep? (Yes/No) (137) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIK
	private String Npik;
	
	//Does the patient have difficulty falling asleep? (Yes/No) (138) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIK1
	private String Npik1;
	
	//Does the patient get up during the night (do not count if the patient gets up once or twice per night 
	//only to go to the bathroom and falls back asleep immediately)? (Yes/No) (139) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIK2
	private String Npik2;
	
	//Does the patient wander, pace, or get involved in inappropriate activities at night? (Yes/No) (140) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIK3
	private String Npik3;
	
	//Does the patient awaken you during the night? (Yes/No) (141) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIK4
	private String Npik4;
	
	//Does the patient awaken at night, dress, and plan to go out thinking that it is morning and time to start the day? (Yes/No) (142) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIK5
	private String Npik5;
	
	//Does the patient awaken too early in the morning (earlier that was his/her habit)? (Yes/No) (143) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIK6
	private String Npik6;
	
	//Does the patient sleep excessively during the day? (Yes/No) (144) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIK7
	private String Npik7;
	
	//Does the patient have any other nighttime behaviors that bother you that we haven't talked about? (Yes/No) (145) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIK8
	private String Npik8;
}
