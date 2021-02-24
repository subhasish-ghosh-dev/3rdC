package hackerrank.com;

import java.util.Scanner;

public class StdinStdout {

	Scanner scanner = new Scanner(System.in);
	int a;
	
	public StdinStdout(){
		
	}
	
	
	public void readInteger(){
		
		while(scanner.hasNext()){
			a = scanner.nextInt();
			System.out.println(a);
			if(a==0){
				scanner.close();
			}
		}
		
		
		
	}
	
	
	public static void main(String[] args){
		StdinStdout o = new StdinStdout();
		System.out.println("(\r\n|[\n\r\u2028\u2029\u0085])?");
		o.readInteger();
	}
	
}
