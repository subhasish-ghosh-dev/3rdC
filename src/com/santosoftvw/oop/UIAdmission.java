package com.santosoftvw.oop;

public class UIAdmission extends Admission {

	public boolean calculateEligibility(Student student){
		
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Student.types t = 	Student.types.ADMISSION;
		t.type = "beginner";
		t.type="credit transfer";
		//Student st = new Student(89, 78, 76, t);
		Student st = new Student(1,t);
		st.processAdmission();
	}

}

/*
Visibilty Level:

0. private
1. package
2. protected
3. public


*/