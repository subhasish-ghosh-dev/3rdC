package innerclasses;

public class WorkOut {
	
	private float stepNo;
	private float speed;
	private float calorieBurned;
	 
	
	public WorkOut(float s, float sp){
		this.speed = sp;
		this.stepNo = s;
	}
	
	private void calculateCalorieBurned(){
		this.calorieBurned = (stepNo*speed)/IWorkoutResult.RATEOFCALORIESBURNBYSTEP;
	}
	
	private void countWeight(){	
		
		class Weight{
			
		}
	}
	
	interface IWorkoutResult{
		float RATEOFCALORIESBURNBYSTEP = 987.65F;
		void displayFitness(Person p);
	}
	
	class Person{
		String name;
		String age;
		double weight;
		WorkOut wt;
		
		Person(float steps, float spd, String n, String a, double w){
			name = n;
			age = a;
			weight = w;
			wt = new WorkOut(steps, spd);
		}
		
		void weightReduced(){
			wt.calculateCalorieBurned();
			weight = weight - wt.calorieBurned * 0.15;
			obj.displayFitness(this);
			//wt.display(this);
		}
		
		public String toString(){
			return String.valueOf(this.weight);
		}
	}
	
	/*public void display(Person p){
		System.out.println(p.weight);
	}*/
	
	/*
	IWorkoutResult obj = new IWorkoutResult(){
		public void displayFitness(Person p){
			System.out.println(p.weight);
		}
	};
	*/
	//Functional Interface 
	//IWorkoutResult obj = p -> {
	//	System.out.println(p.weight);
	//};
	IWorkoutResult obj =  Gym::calculateDuration; 

}
