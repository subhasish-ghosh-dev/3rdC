


package classOne;

import switchstndenum.ITimeCalculator;

public class Student extends Course implements ITimeCalculator{
	
	
	/*
	 * default Access Modifier
	 * public
	 * protected
	 * private
	 * 
	 */
	//instance variables
	protected String name="SUbhasish";
	private String semester="1st";
	
	private Course[] courses = new Course[6];
	
	protected String rollNo;
	
	public Student(){
		//super.display();
		//System.out.println("CALLED FROM MAIN : Student Class"+super.rollNo);
	}
	
	public Student(String s){//method signature
		this.semester = s;
	}
	
	//instance method
	protected void setSemester(String sem){
		this.semester = sem;
	}
	
	//instance method
	protected void setSemester(String sem, String n){
		this.semester = sem;
	}
	
	protected String getSemester(){
		return this.semester;
	}
	
	public void setRollNo(String r){//class level methods
		rollNo = r;
	}
	
	public void addCourse(){
		switch(this.semester){
		case "1st":
			
		case "2nd":
			
		case "3rd":
			Course c1 = new Course("Java","Java programming basics", "2104");
			Course c2 = new Course("DLD","Digital Logic Design", "2101");
			courses[0] = c1;
			courses[1] = c2;
		}
		
	}
	
	
	public void listCourses(){
		for(Course c : courses){
			if(c!=null)System.out.println(c.code);
		}
	}
	
	
	
	public static void main(String[] args){
		Student st = new Student();
		st.rollNo= "123334";
		st.semester = "3rd";
		
		st.addCourse();
		st.listCourses();
	}
	
	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		System.out.println("I calculate attendance");
	}
	
	@Override
	public int numberOfCourses(){		
		return courses.length;		
	}
}
