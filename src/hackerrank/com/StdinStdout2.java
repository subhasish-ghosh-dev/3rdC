package hackerrank.com;

import java.util.Scanner;

public class StdinStdout2 {
	
	 public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        int i = scan.nextInt();
	        double d = scan.nextDouble();
	        String s = "";
	        while(scan.hasNextLine()){
	        	String q = "";
	            q = scan.nextLine();
	            if(q.equals("-10000")){
	            	break;
	            }
	            else{
	            	s = q;
	            }
	        } 
	        /*
	        while(scan.hasNextLine()){	
	        	s= scan.next()+" ";
	        	System.out.println("String: " + s);
	        }
	        */

	        System.out.println("String: " + s);
	        System.out.println("Double: " + d);
	        System.out.println("Int: " + i);
	    }

}
