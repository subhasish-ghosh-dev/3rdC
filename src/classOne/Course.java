package classOne;

public class Course  {
	
	 String rollNo="1092321";
	
	public Course(){
		System.out.println("CALLED FROM MAIN: Course Class");
	}
	
	
	protected void display(){
		Student st = new Student();
		st.name="bijoy";
		System.out.println(st.name);
	}
	
	
	public int numberOfCourses(){
		
		return 0;
		
	}

}
