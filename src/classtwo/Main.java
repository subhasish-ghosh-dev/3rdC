package classtwo;

import classOne.Course;
import classOne.Student;

public class Main extends Student {

	public void display(){
		super.setSemester("2nd");		
		super.rollNo="19320021";
		super.name="Minhaj";		
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub			
		Main st = new Main();
		st.display();
		System.out.println(st.name +"  "+st.rollNo+ "   " +st.getSemester());
		if(st instanceof Student){
			System.out.println("Student object");
		}
		else{
			System.out.println("Not Student object");
		}
	}
}
