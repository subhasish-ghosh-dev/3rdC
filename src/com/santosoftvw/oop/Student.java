package com.santosoftvw.oop;

public class Student {
	
	enum types {		 
		ADMISSION("");
	
		String type;
		
		private types(String t){
			this.type = t;
		}
		
	}
	/*
	public static final String TYPE = "STUDENT";
	public static final int AMOUNT = 12000;
	public static final float AGE = 20.5F;
	*/
	int admissionMarks;
	int sscMarks;
	int hscMarks;
	int levelOfUniversity;
	
	Student(int ad, int ss, int hs, types t){
		this.admissionMarks = ad;
		this.sscMarks = ss;
		this.hscMarks =  hs; 
		types.ADMISSION.type = t.type;
	}
	
	Student(int lvl, types t){
		this.levelOfUniversity = lvl;
		types.ADMISSION.type = t.type;
	}
	
	
	protected void processAdmission(){
		switch(types.ADMISSION.type){
			case "beginner":
				Admission ad  = new Admission();				
				System.out.println("FOR BEGINNER STUDENT: "+ad.isStudentEligible(this));
				break;
			case "credit transfer":
				IExternalAdmission iead = new Admission();
				System.out.println(iead.calculateEligibilty(this));
				break;
			default:
				System.out.println("NOT APPLICABLE");
		}
	}

}
