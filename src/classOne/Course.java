package classOne;

public class Course  {
	
	protected String name;
	protected String description;
	protected String code;
	protected String rollNo="123445";
	public Course(){
		//System.out.println("CALLED FROM MAIN: Course Class");
	}
	
	public Course(String n, String d, String c){
		this.name = n;
		this.description = d;
		this.code = c;
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
