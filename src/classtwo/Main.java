package classtwo;

import classOne.Course;
import classOne.Student;

public class Main extends Student {

	public void display1(){
		//super.setSemester("2nd");
		//System.out.println(super.getSemester());
		super.rollNo="";
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub			
		Main st = new Main();
		//Student st1 = new Student();
		st.display();
		
		Main.display1();
		
	}

}
