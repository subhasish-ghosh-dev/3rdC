package innerclass;


public class UIResult {
	public static void main(String[] args){
		Student.Course[] courses = new Student.Course[3];
		
		Student.Course c = new Student.Course("CSE2104", 49);
		courses[0] = c;
		Student.Course c1 = new Student.Course("CSE2103", 41);
		courses[1] = c1;
		Student.Course c2 = new Student.Course("CSE2102", 42);
		courses[2] = c2;
		Student st = new Student("John","4th","2345678",courses);
		st.rs.calc();
		st.display();
	}
	

}
