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
	
	//Frequency of the symptom (1: Occasionally; 2: Often; 3: Frequently; 4: Very frequently) (146) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIK9A
	private String Npik9a;
	
	//Severity of the symptom (1: Mild; 2: Moderate; 3: Marked) (147) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIK9B
	private String Npik9b;
	
	//Distress experienced by Caregiver due to the symptom (0 :Not distressing at all;  1: Minimal; 2:Mild; 3 : Moderate; 4 : Severe 5 :Extreme or Very Severe) (148) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIK9C
	private String Npik9c;
	
	//Frequency x Severity (0-12) (149) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIKTOT
	private String Npiktot;
	
	//Has he/she had any change in appetite, weight, or eating habits (count as NA if the patient is incapacitated and 
	//has to be fed)? Has there been any change in type of food he/she prefers? (Yes/No) (150) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIL
	private String Npil;
	
	//Has he/she had a loss of appetite? (Yes/No) (151) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIL1
	private String Npil1;
	
	//Has he/she had an increase in appetite? (Yes/No) (152) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIL2
	private String Npil2;
	
	//Has he/she had a loss of weight? (Yes/No) (153) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIL3
	private String Npil3;
	
	//Has he/she gained weight? (Yes/No) (154) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIL4
	private String Npil4;
	
	//Has he/she had a change in eating behavior such as putting too much food in his/her mouth at once? (Yes/No) (155) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIL5
	private String Npil5;
	
	//Has he/she had a change in the kind of food he/she likes such as eating too many sweets or other specific types of food? (Yes/No) (156) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIL6
	private String Npil6;
	
	//Has he/she developed eating behaviors such as eating exactly the same types of food each day or eating the food in exactly the same order? (Yes/No) (157) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIL6
	private String Npil7;
	
	//Have there been any other changes in appetite or eating that I haven’t asked about? (Yes/No) (158) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIL8
	private String Npil8;
	
	//Frequency of the symptom (1: Occasionally; 2: Often; 3: Frequently; 4: Very frequently) (159) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIL9A
	private String Npil9a;
	
	//Severity of the symptom (1: Mild; 2: Moderate; 3: Marked) (160) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIL9B
	private String Npil9b;
	
	//Distress experienced by Caregiver due to the symptom (0 :Not distressing at all;  1: Minimal; 2:Mild; 3 : Moderate; 4 : Severe 5 :Extreme or Very Severe) (161) ADNI1 ADNIGO ADNI2 ADNI3
	//NPIL9C
	private String Npil9c;
	
	//Frequency x Severity (0-12) (162) ADNI1 ADNIGO ADNI2 ADNI3
	//NPILTOT
	private String Npiltot;
	
	//N.A. (N.A.) (10) ADNI1 ADNIGO ADNI2 ADNI3
	//NPISOURC
	private String Npisourc;
	
	//Sum of the  scores of the first 10 domain scores (0-144) (163) ADNI1 ADNIGO ADNI2 ADNI3
	//NPITOTAL
	private String Npitotal;
	
	//N.A. (N.A.) (11) ADNI1 ADNIGO ADNI2 ADNI3
	//SPID
	private String Spid;

	public String getNpia() {
		return Npia;
	}

	public void setNpia(String npia) {
		Npia = npia;
	}

	public String getNpia1() {
		return Npia1;
	}

	public void setNpia1(String npia1) {
		Npia1 = npia1;
	}

	public String getNpia10a() {
		return Npia10a;
	}

	public void setNpia10a(String npia10a) {
		Npia10a = npia10a;
	}

	public String getNpia10b() {
		return Npia10b;
	}

	public void setNpia10b(String npia10b) {
		Npia10b = npia10b;
	}

	public String getNpia10c() {
		return Npia10c;
	}

	public void setNpia10c(String npia10c) {
		Npia10c = npia10c;
	}

	public String getNpia2() {
		return Npia2;
	}

	public void setNpia2(String npia2) {
		Npia2 = npia2;
	}

	public String getNpia3() {
		return Npia3;
	}

	public void setNpia3(String npia3) {
		Npia3 = npia3;
	}

	public String getNpia4() {
		return Npia4;
	}

	public void setNpia4(String npia4) {
		Npia4 = npia4;
	}

	public String getNpia5() {
		return Npia5;
	}

	public void setNpia5(String npia5) {
		Npia5 = npia5;
	}

	public String getNpia6() {
		return Npia6;
	}

	public void setNpia6(String npia6) {
		Npia6 = npia6;
	}

	public String getNpia7() {
		return Npia7;
	}

	public void setNpia7(String npia7) {
		Npia7 = npia7;
	}

	public String getNpia8() {
		return Npia8;
	}

	public void setNpia8(String npia8) {
		Npia8 = npia8;
	}

	public String getNpia9() {
		return Npia9;
	}

	public void setNpia9(String npia9) {
		Npia9 = npia9;
	}

	public String getNpiatot() {
		return Npiatot;
	}

	public void setNpiatot(String npiatot) {
		Npiatot = npiatot;
	}

	public String getNpib() {
		return Npib;
	}

	public void setNpib(String npib) {
		Npib = npib;
	}

	public String getNpib1() {
		return Npib1;
	}

	public void setNpib1(String npib1) {
		Npib1 = npib1;
	}

	public String getNpib2() {
		return Npib2;
	}

	public void setNpib2(String npib2) {
		Npib2 = npib2;
	}

	public String getNpib3() {
		return Npib3;
	}

	public void setNpib3(String npib3) {
		Npib3 = npib3;
	}

	public String getNpib4() {
		return Npib4;
	}

	public void setNpib4(String npib4) {
		Npib4 = npib4;
	}

	public String getNpib5() {
		return Npib5;
	}

	public void setNpib5(String npib5) {
		Npib5 = npib5;
	}

	public String getNpib6() {
		return Npib6;
	}

	public void setNpib6(String npib6) {
		Npib6 = npib6;
	}

	public String getNpib7() {
		return Npib7;
	}

	public void setNpib7(String npib7) {
		Npib7 = npib7;
	}

	public String getNpib8a() {
		return Npib8a;
	}

	public void setNpib8a(String npib8a) {
		Npib8a = npib8a;
	}

	public String getNpib8b() {
		return Npib8b;
	}

	public void setNpib8b(String npib8b) {
		Npib8b = npib8b;
	}

	public String getNpib8c() {
		return Npib8c;
	}

	public void setNpib8c(String npib8c) {
		Npib8c = npib8c;
	}

	public String getNpibtot() {
		return Npibtot;
	}

	public void setNpibtot(String npibtot) {
		Npibtot = npibtot;
	}

	public String getNpic() {
		return Npic;
	}

	public void setNpic(String npic) {
		Npic = npic;
	}

	public String getNpic1() {
		return Npic1;
	}

	public void setNpic1(String npic1) {
		Npic1 = npic1;
	}

	public String getNpic2() {
		return Npic2;
	}

	public void setNpic2(String npic2) {
		Npic2 = npic2;
	}

	public String getNpic3() {
		return Npic3;
	}

	public void setNpic3(String npic3) {
		Npic3 = npic3;
	}

	public String getNpic4() {
		return Npic4;
	}

	public void setNpic4(String npic4) {
		Npic4 = npic4;
	}

	public String getNpic5() {
		return Npic5;
	}

	public void setNpic5(String npic5) {
		Npic5 = npic5;
	}

	public String getNpic6() {
		return Npic6;
	}

	public void setNpic6(String npic6) {
		Npic6 = npic6;
	}

	public String getNpic7() {
		return Npic7;
	}

	public void setNpic7(String npic7) {
		Npic7 = npic7;
	}

	public String getNpic8() {
		return Npic8;
	}

	public void setNpic8(String npic8) {
		Npic8 = npic8;
	}

	public String getNpic9a() {
		return Npic9a;
	}

	public void setNpic9a(String npic9a) {
		Npic9a = npic9a;
	}

	public String getNpic9b() {
		return Npic9b;
	}

	public void setNpic9b(String npic9b) {
		Npic9b = npic9b;
	}

	public String getNpic9c() {
		return Npic9c;
	}

	public void setNpic9c(String npic9c) {
		Npic9c = npic9c;
	}

	public String getNpictot() {
		return Npictot;
	}

	public void setNpictot(String npictot) {
		Npictot = npictot;
	}

	public String getNpid() {
		return Npid;
	}

	public void setNpid(String npid) {
		Npid = npid;
	}

	public String getNpid1() {
		return Npid1;
	}

	public void setNpid1(String npid1) {
		Npid1 = npid1;
	}

	public String getNpid2() {
		return Npid2;
	}

	public void setNpid2(String npid2) {
		Npid2 = npid2;
	}

	public String getNpid3() {
		return Npid3;
	}

	public void setNpid3(String npid3) {
		Npid3 = npid3;
	}

	public String getNpid4() {
		return Npid4;
	}

	public void setNpid4(String npid4) {
		Npid4 = npid4;
	}

	public String getNpid5() {
		return Npid5;
	}

	public void setNpid5(String npid5) {
		Npid5 = npid5;
	}

	public String getNpid6() {
		return Npid6;
	}

	public void setNpid6(String npid6) {
		Npid6 = npid6;
	}

	public String getNpid7() {
		return Npid7;
	}

	public void setNpid7(String npid7) {
		Npid7 = npid7;
	}

	public String getNpid8() {
		return Npid8;
	}

	public void setNpid8(String npid8) {
		Npid8 = npid8;
	}

	public String getNpid9a() {
		return Npid9a;
	}

	public void setNpid9a(String npid9a) {
		Npid9a = npid9a;
	}

	public String getNpid9b() {
		return Npid9b;
	}

	public void setNpid9b(String npid9b) {
		Npid9b = npid9b;
	}

	public String getNpid9c() {
		return Npid9c;
	}

	public void setNpid9c(String npid9c) {
		Npid9c = npid9c;
	}

	public String getNpidtot() {
		return Npidtot;
	}

	public void setNpidtot(String npidtot) {
		Npidtot = npidtot;
	}

	public String getNpie() {
		return Npie;
	}

	public void setNpie(String npie) {
		Npie = npie;
	}

	public String getNpie1() {
		return Npie1;
	}

	public void setNpie1(String npie1) {
		Npie1 = npie1;
	}

	public String getNpie2() {
		return Npie2;
	}

	public void setNpie2(String npie2) {
		Npie2 = npie2;
	}

	public String getNpie3() {
		return Npie3;
	}

	public void setNpie3(String npie3) {
		Npie3 = npie3;
	}

	public String getNpie4() {
		return Npie4;
	}

	public void setNpie4(String npie4) {
		Npie4 = npie4;
	}

	public String getNpie5() {
		return Npie5;
	}

	public void setNpie5(String npie5) {
		Npie5 = npie5;
	}

	public String getNpie6() {
		return Npie6;
	}

	public void setNpie6(String npie6) {
		Npie6 = npie6;
	}

	public String getNpie7() {
		return Npie7;
	}

	public void setNpie7(String npie7) {
		Npie7 = npie7;
	}

	public String getNpie8a() {
		return Npie8a;
	}

	public void setNpie8a(String npie8a) {
		Npie8a = npie8a;
	}

	public String getNpie8b() {
		return Npie8b;
	}

	public void setNpie8b(String npie8b) {
		Npie8b = npie8b;
	}

	public String getNpie8c() {
		return Npie8c;
	}

	public void setNpie8c(String npie8c) {
		Npie8c = npie8c;
	}

	public String getNpietot() {
		return Npietot;
	}

	public void setNpietot(String npietot) {
		Npietot = npietot;
	}

	public String getNpif() {
		return Npif;
	}

	public void setNpif(String npif) {
		Npif = npif;
	}

	public String getNpif1() {
		return Npif1;
	}

	public void setNpif1(String npif1) {
		Npif1 = npif1;
	}

	public String getNpif2() {
		return Npif2;
	}

	public void setNpif2(String npif2) {
		Npif2 = npif2;
	}

	public String getNpif3() {
		return Npif3;
	}

	public void setNpif3(String npif3) {
		Npif3 = npif3;
	}

	public String getNpif4() {
		return Npif4;
	}

	public void setNpif4(String npif4) {
		Npif4 = npif4;
	}

	public String getNpif5() {
		return Npif5;
	}

	public void setNpif5(String npif5) {
		Npif5 = npif5;
	}

	public String getNpif6() {
		return Npif6;
	}

	public void setNpif6(String npif6) {
		Npif6 = npif6;
	}

	public String getNpif7() {
		return Npif7;
	}

	public void setNpif7(String npif7) {
		Npif7 = npif7;
	}

	public String getNpif8a() {
		return Npif8a;
	}

	public void setNpif8a(String npif8a) {
		Npif8a = npif8a;
	}

	public String getNpif8b() {
		return Npif8b;
	}

	public void setNpif8b(String npif8b) {
		Npif8b = npif8b;
	}

	public String getNpif8c() {
		return Npif8c;
	}

	public void setNpif8c(String npif8c) {
		Npif8c = npif8c;
	}

	public String getNpiftot() {
		return Npiftot;
	}

	public void setNpiftot(String npiftot) {
		Npiftot = npiftot;
	}

	public String getNpig() {
		return Npig;
	}

	public void setNpig(String npig) {
		Npig = npig;
	}

	public String getNpig1() {
		return Npig1;
	}

	public void setNpig1(String npig1) {
		Npig1 = npig1;
	}

	public String getNpig2() {
		return Npig2;
	}

	public void setNpig2(String npig2) {
		Npig2 = npig2;
	}

	public String getNpig3() {
		return Npig3;
	}

	public void setNpig3(String npig3) {
		Npig3 = npig3;
	}

	public String getNpig4() {
		return Npig4;
	}

	public void setNpig4(String npig4) {
		Npig4 = npig4;
	}

	public String getNpig5() {
		return Npig5;
	}

	public void setNpig5(String npig5) {
		Npig5 = npig5;
	}

	public String getNpig6() {
		return Npig6;
	}

	public void setNpig6(String npig6) {
		Npig6 = npig6;
	}

	public String getNpig7() {
		return Npig7;
	}

	public void setNpig7(String npig7) {
		Npig7 = npig7;
	}

	public String getNpig8() {
		return Npig8;
	}

	public void setNpig8(String npig8) {
		Npig8 = npig8;
	}

	public String getNpig9a() {
		return Npig9a;
	}

	public void setNpig9a(String npig9a) {
		Npig9a = npig9a;
	}

	public String getNpig9b() {
		return Npig9b;
	}

	public void setNpig9b(String npig9b) {
		Npig9b = npig9b;
	}

	public String getNpig9c() {
		return Npig9c;
	}

	public void setNpig9c(String npig9c) {
		Npig9c = npig9c;
	}

	public String getNpigtot() {
		return Npigtot;
	}

	public void setNpigtot(String npigtot) {
		Npigtot = npigtot;
	}

	public String getNpih() {
		return Npih;
	}

	public void setNpih(String npih) {
		Npih = npih;
	}

	public String getNpih1() {
		return Npih1;
	}

	public void setNpih1(String npih1) {
		Npih1 = npih1;
	}

	public String getNpih2() {
		return Npih2;
	}

	public void setNpih2(String npih2) {
		Npih2 = npih2;
	}

	public String getNpih3() {
		return Npih3;
	}

	public void setNpih3(String npih3) {
		Npih3 = npih3;
	}

	public String getNpih4() {
		return Npih4;
	}

	public void setNpih4(String npih4) {
		Npih4 = npih4;
	}

	public String getNpih5() {
		return Npih5;
	}

	public void setNpih5(String npih5) {
		Npih5 = npih5;
	}

	public String getNpih6() {
		return Npih6;
	}

	public void setNpih6(String npih6) {
		Npih6 = npih6;
	}

	public String getNpih7() {
		return Npih7;
	}

	public void setNpih7(String npih7) {
		Npih7 = npih7;
	}

	public String getNpih8a() {
		return Npih8a;
	}

	public void setNpih8a(String npih8a) {
		Npih8a = npih8a;
	}

	public String getNpih8b() {
		return Npih8b;
	}

	public void setNpih8b(String npih8b) {
		Npih8b = npih8b;
	}

	public String getNpih8c() {
		return Npih8c;
	}

	public void setNpih8c(String npih8c) {
		Npih8c = npih8c;
	}

	public String getNpihtot() {
		return Npihtot;
	}

	public void setNpihtot(String npihtot) {
		Npihtot = npihtot;
	}

	public String getNpii() {
		return Npii;
	}

	public void setNpii(String npii) {
		Npii = npii;
	}

	public String getNpii1() {
		return Npii1;
	}

	public void setNpii1(String npii1) {
		Npii1 = npii1;
	}

	public String getNpii2() {
		return Npii2;
	}

	public void setNpii2(String npii2) {
		Npii2 = npii2;
	}

	public String getNpii3() {
		return Npii3;
	}

	public void setNpii3(String npii3) {
		Npii3 = npii3;
	}

	public String getNpii4() {
		return Npii4;
	}

	public void setNpii4(String npii4) {
		Npii4 = npii4;
	}

	public String getNpii5() {
		return Npii5;
	}

	public void setNpii5(String npii5) {
		Npii5 = npii5;
	}

	public String getNpii6() {
		return Npii6;
	}

	public void setNpii6(String npii6) {
		Npii6 = npii6;
	}

	public String getNpii7() {
		return Npii7;
	}

	public void setNpii7(String npii7) {
		Npii7 = npii7;
	}

	public String getNpii8a() {
		return Npii8a;
	}

	public void setNpii8a(String npii8a) {
		Npii8a = npii8a;
	}

	public String getNpii8b() {
		return Npii8b;
	}

	public void setNpii8b(String npii8b) {
		Npii8b = npii8b;
	}

	public String getNpii8c() {
		return Npii8c;
	}

	public void setNpii8c(String npii8c) {
		Npii8c = npii8c;
	}

	public String getNpiitot() {
		return Npiitot;
	}

	public void setNpiitot(String npiitot) {
		Npiitot = npiitot;
	}

	public String getNpij() {
		return Npij;
	}

	public void setNpij(String npij) {
		Npij = npij;
	}

	public String getNpij1() {
		return Npij1;
	}

	public void setNpij1(String npij1) {
		Npij1 = npij1;
	}

	public String getNpij2() {
		return Npij2;
	}

	public void setNpij2(String npij2) {
		Npij2 = npij2;
	}

	public String getNpij3() {
		return Npij3;
	}

	public void setNpij3(String npij3) {
		Npij3 = npij3;
	}

	public String getNpij4() {
		return Npij4;
	}

	public void setNpij4(String npij4) {
		Npij4 = npij4;
	}

	public String getNpij5() {
		return Npij5;
	}

	public void setNpij5(String npij5) {
		Npij5 = npij5;
	}

	public String getNpij6() {
		return Npij6;
	}

	public void setNpij6(String npij6) {
		Npij6 = npij6;
	}

	public String getNpij7() {
		return Npij7;
	}

	public void setNpij7(String npij7) {
		Npij7 = npij7;
	}

	public String getNpij8a() {
		return Npij8a;
	}

	public void setNpij8a(String npij8a) {
		Npij8a = npij8a;
	}

	public String getNpij8b() {
		return Npij8b;
	}

	public void setNpij8b(String npij8b) {
		Npij8b = npij8b;
	}

	public String getNpij8c() {
		return Npij8c;
	}

	public void setNpij8c(String npij8c) {
		Npij8c = npij8c;
	}

	public String getNpijtot() {
		return Npijtot;
	}

	public void setNpijtot(String npijtot) {
		Npijtot = npijtot;
	}

	public String getNpik() {
		return Npik;
	}

	public void setNpik(String npik) {
		Npik = npik;
	}

	public String getNpik1() {
		return Npik1;
	}

	public void setNpik1(String npik1) {
		Npik1 = npik1;
	}

	public String getNpik2() {
		return Npik2;
	}

	public void setNpik2(String npik2) {
		Npik2 = npik2;
	}

	public String getNpik3() {
		return Npik3;
	}

	public void setNpik3(String npik3) {
		Npik3 = npik3;
	}

	public String getNpik4() {
		return Npik4;
	}

	public void setNpik4(String npik4) {
		Npik4 = npik4;
	}

	public String getNpik5() {
		return Npik5;
	}

	public void setNpik5(String npik5) {
		Npik5 = npik5;
	}

	public String getNpik6() {
		return Npik6;
	}

	public void setNpik6(String npik6) {
		Npik6 = npik6;
	}

	public String getNpik7() {
		return Npik7;
	}

	public void setNpik7(String npik7) {
		Npik7 = npik7;
	}

	public String getNpik8() {
		return Npik8;
	}

	public void setNpik8(String npik8) {
		Npik8 = npik8;
	}

	public String getNpik9a() {
		return Npik9a;
	}

	public void setNpik9a(String npik9a) {
		Npik9a = npik9a;
	}

	public String getNpik9b() {
		return Npik9b;
	}

	public void setNpik9b(String npik9b) {
		Npik9b = npik9b;
	}

	public String getNpik9c() {
		return Npik9c;
	}

	public void setNpik9c(String npik9c) {
		Npik9c = npik9c;
	}

	public String getNpiktot() {
		return Npiktot;
	}

	public void setNpiktot(String npiktot) {
		Npiktot = npiktot;
	}

	public String getNpil() {
		return Npil;
	}

	public void setNpil(String npil) {
		Npil = npil;
	}

	public String getNpil1() {
		return Npil1;
	}

	public void setNpil1(String npil1) {
		Npil1 = npil1;
	}

	public String getNpil2() {
		return Npil2;
	}

	public void setNpil2(String npil2) {
		Npil2 = npil2;
	}

	public String getNpil3() {
		return Npil3;
	}

	public void setNpil3(String npil3) {
		Npil3 = npil3;
	}

	public String getNpil4() {
		return Npil4;
	}

	public void setNpil4(String npil4) {
		Npil4 = npil4;
	}

	public String getNpil5() {
		return Npil5;
	}

	public void setNpil5(String npil5) {
		Npil5 = npil5;
	}

	public String getNpil6() {
		return Npil6;
	}

	public void setNpil6(String npil6) {
		Npil6 = npil6;
	}

	public String getNpil7() {
		return Npil7;
	}

	public void setNpil7(String npil7) {
		Npil7 = npil7;
	}

	public String getNpil8() {
		return Npil8;
	}

	public void setNpil8(String npil8) {
		Npil8 = npil8;
	}

	public String getNpil9a() {
		return Npil9a;
	}

	public void setNpil9a(String npil9a) {
		Npil9a = npil9a;
	}

	public String getNpil9b() {
		return Npil9b;
	}

	public void setNpil9b(String npil9b) {
		Npil9b = npil9b;
	}

	public String getNpil9c() {
		return Npil9c;
	}

	public void setNpil9c(String npil9c) {
		Npil9c = npil9c;
	}

	public String getNpiltot() {
		return Npiltot;
	}

	public void setNpiltot(String npiltot) {
		Npiltot = npiltot;
	}

	public String getNpisourc() {
		return Npisourc;
	}

	public void setNpisourc(String npisourc) {
		Npisourc = npisourc;
	}

	public String getNpitotal() {
		return Npitotal;
	}

	public void setNpitotal(String npitotal) {
		Npitotal = npitotal;
	}

	public String getSpid() {
		return Spid;
	}

	public void setSpid(String spid) {
		Spid = spid;
	}
}
