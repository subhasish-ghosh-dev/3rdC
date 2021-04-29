package innerclasses;

public class UIWorkout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WorkOut w  = new WorkOut(2000,2);
		WorkOut.Person p = w.new Person(2000, 2, "Mohammed", "22", 56.7);
	   
		p.weightReduced();
	}

}
