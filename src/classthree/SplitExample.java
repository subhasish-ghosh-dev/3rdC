package classthree;

public class SplitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Welcome to Java";
		String[] arr = str.split("\\s");
		
		for(String s : arr){
			System.out.println(s);
		}
	}

}
