package com.santosoftvw.oop;

public class Admission implements IExternalAdmission{
	
		
	
	protected boolean calculateEligibility(Student student){
		if((student.admissionMarks*0.3+student.sscMarks*0.25+student.hscMarks*0.45)>80){
			return true;
		}
		else {
			return false;
		}
		
	}


	@Override
	public boolean calculateEligibilty(Student stduent) {
		// TODO Auto-generated method stub
		if(stduent.levelOfUniversity>=MINIMUMLEVELOFUNIVERSITY){
			return true;
		}
		else{
			return false;
		}		
	}
	
	public boolean isStudentEligible(Student student){
		
		return calculateEligibility(student);
		
	}
	
}
