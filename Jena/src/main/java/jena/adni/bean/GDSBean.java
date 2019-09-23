package jena.adni.bean;

public class GDSBean extends ADNIBean {

	//(18)
	//(Yes / No)
	//Are you afraid that something bad is going to happen to you?
	//GDAFRAID
	private String Gdafraid;
	
	//(23)
	//(Yes / No)
	//Do you think its wonderful to be alive now? 
	//GDALIVE
	private String Gdalive;
	
	//(27)
	//(Yes / No)
	//Do you think that most people are better off than you are?
	//GDBETTER
	private String Gdbetter;
	
	//(16)
	//(Yes / No)
	//Do you often get bored?
	//GDBORED
	private String Gdbored;
	
	//(14)
	//(Yes / No)
	//Have you dropped many of your activities and interests? 
	//GDDROP
	private String Gddrop;
	
	//(15)
	//(Yes / No)
	//Do you feel that your life is empty?
	//GDEMPTY
	private String Gdempty;
	
	//(25)
	//(Yes / No)
	//Do you feel full of energy?
	//GDENERGY
	private String Gdenergy;
	
	//(19)
	//(Yes / No)
	//Do you feel happy most of the time?
	//GDHAPPY
	private String Gdhappy;
	
	//(20)
	//(Yes / No)
	//Do you often feel helpless?
	//GDHELP
	private String Gdhelp;
	
	//(21)
	//(Yes / No)
	//Do you prefer to stay at home, rather than going out and doing new things?
	//GDHOME
	private String Gdhome;
	
	//(26)
	//(Yes / No)
	//Do you feel that your situation is hopeless?
	//GDHOPE
	private String Gdhope;
	
	//(22)
	//(Yes / No)
	//Do you feel you have more problems with memory than most?
	//GDMEMORY
	private String Gdmemory;
	
	//(13)
	//(Yes / No)
	//Are you basically satisfied with your life?
	//GDSATIS
	private String Gdsatis;
	
	//(17)
	//(Yes / No)
	//Are you in good spirits most of the time?
	//GDSPIRIT
	private String Gdspirit;
	
	//(28)
	//(0 - 14)
	//Total score
	//GDTOTAL
	private String Gdtotal;
	
	//(11)
	//(Box checked ;  Box not checked ;)
	//Participant is unable to complete the GDS based on the clinician's best judgement. 
	//GDUNABL
	private String Gdunabl;
	
	//(12)
	//(Written response)
	//If unable, explain
	//GDUNABSP
	private String Gdunabsp;
	
	//(24)
	//(Yes / No)
	//Do you feel pretty worthless the way you are now?
	//GDWORTH
	private String Gdworth;
	
	//(10)
	//(Participant visit; Telephone call)
	//Participant visit or Telephone call
	//SOURCE
	private String Source;
	
	//(9)
	//(date)
	//Exam date
	//EXAMDATE
	private String Examdate;
	
	//(10)
	//(Participant visit; Telephone call)
	//Participant visit or Telephone call
	//GDSOURCE
	private String Gdsource;
	
	//(N.A.)
	//(N.A.)
	//N.A.
	//ORIGPROT
	private String Origprot;
	
	//(5)
	//(Visit code)
	//Visit code
	//VISCODE
	private String Viscode;

	public String getGdafraid() {
		return Gdafraid;
	}

	public void setGdafraid(String gdafraid) {
		Gdafraid = gdafraid;
	}

	public String getGdalive() {
		return Gdalive;
	}

	public void setGdalive(String gdalive) {
		Gdalive = gdalive;
	}

	public String getGdbetter() {
		return Gdbetter;
	}

	public void setGdbetter(String gdbetter) {
		Gdbetter = gdbetter;
	}

	public String getGdbored() {
		return Gdbored;
	}

	public void setGdbored(String gdbored) {
		Gdbored = gdbored;
	}

	public String getGddrop() {
		return Gddrop;
	}

	public void setGddrop(String gddrop) {
		Gddrop = gddrop;
	}

	public String getGdempty() {
		return Gdempty;
	}

	public void setGdempty(String gdempty) {
		Gdempty = gdempty;
	}

	public String getGdenergy() {
		return Gdenergy;
	}

	public void setGdenergy(String gdenergy) {
		Gdenergy = gdenergy;
	}

	public String getGdhappy() {
		return Gdhappy;
	}

	public void setGdhappy(String gdhappy) {
		Gdhappy = gdhappy;
	}

	public String getGdhelp() {
		return Gdhelp;
	}

	public void setGdhelp(String gdhelp) {
		Gdhelp = gdhelp;
	}

	public String getGdhome() {
		return Gdhome;
	}

	public void setGdhome(String gdhome) {
		Gdhome = gdhome;
	}

	public String getGdhope() {
		return Gdhope;
	}

	public void setGdhope(String gdhope) {
		Gdhope = gdhope;
	}

	public String getGdmemory() {
		return Gdmemory;
	}

	public void setGdmemory(String gdmemory) {
		Gdmemory = gdmemory;
	}

	public String getGdsatis() {
		return Gdsatis;
	}

	public void setGdsatis(String gdsatis) {
		Gdsatis = gdsatis;
	}

	public String getGdspirit() {
		return Gdspirit;
	}

	public void setGdspirit(String gdspirit) {
		Gdspirit = gdspirit;
	}

	public String getGdtotal() {
		return Gdtotal;
	}

	public void setGdtotal(String gdtotal) {
		Gdtotal = gdtotal;
	}

	public String getGdunabl() {
		return Gdunabl;
	}

	public void setGdunabl(String gdunabl) {
		Gdunabl = gdunabl;
	}

	public String getGdunabsp() {
		return Gdunabsp;
	}

	public void setGdunabsp(String gdunabsp) {
		Gdunabsp = gdunabsp;
	}

	public String getGdworth() {
		return Gdworth;
	}

	public void setGdworth(String gdworth) {
		Gdworth = gdworth;
	}

	public String getSource() {
		return Source;
	}

	public void setSource(String source) {
		Source = source;
	}

	public String getExamdate() {
		return Examdate;
	}

	public void setExamdate(String examdate) {
		Examdate = examdate;
	}

	public String getGdsource() {
		return Gdsource;
	}

	public void setGdsource(String gdsource) {
		Gdsource = gdsource;
	}

	public String getOrigprot() {
		return Origprot;
	}

	public void setOrigprot(String origprot) {
		Origprot = origprot;
	}

	public String getViscode() {
		return Viscode;
	}

	public void setViscode(String viscode) {
		Viscode = viscode;
	}
}
