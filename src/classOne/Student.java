


package classOne;

public class Student extends Course{
	
	
	/*
	 * default Access Modifier
	 * public
	 * protected
	 * private
	 * 
	 */
	
	protected String name="SUbhasish";
	private String semester="1st";
	
	public Student(){
		//super.display();
		//System.out.println("CALLED FROM MAIN : Student Class"+super.rollNo);
	}
	

	protected void setSemester(String sem){
		this.semester = sem;
	}
	
	protected String getSemester(){
		return this.semester;
	}
}
