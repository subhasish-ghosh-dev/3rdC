package innerclass;

public class Student {
	
	private String name;
	private String semester;
	private String rollNo;
	private Course[] courses;
	private double result;
		
	Student(String n, String s, String  r,Course[] c){
		name = n;
		semester = s;
		rollNo = r;
		courses = c;
	}
	
	static class Course{
		private String code;
		private double mark;
		
		Course(String c, double m){
			code = c;
			mark = m;
		}
	}
	
	interface IResult{
		void calc();
	}
	
	IResult rs = new IResult(){

		@Override
		public void calc() {
			// TODO Auto-generated method stub
			for(Course c:courses){
				//System.out.println(c.mark);
				result += c.mark;
			}		
			result /=courses.length;	
		}
		
	};
	
	
	
	public void display(){
		int idx = 0;
		
		System.out.println("Course Code"+"    "+"Mark");
		System.out.println("----------"+"   "+"-----");
		for(Course c : courses){
			System.out.println(c.code+"   "+c.mark);			
		}
		System.out.println("----------------------------");
		System.out.println("Average:   "+result);
	}
	
}
