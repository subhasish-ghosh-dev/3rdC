package datatype;

import java.util.ArrayList;
import java.util.List;

public class D$tExample_1 {
	//primitive data types
	//instance variable
	//Identifier rule (class name, variable name, method name) :  first character alphabetic letter, alphaneumeric letter _ , no space, u can use $ after your first character
	//variable declaration
	boolean flag$;//1 bit true or false
	char code;//16 bit    '\u0000' (or 0) to '\uffff' (or 65,535 inclusive)
	byte b;//8 bit range -128 to 127
	short s;//16 bit  minimum value is -32,768 and maximum value is 32,767
	int i;//32 bit    - 2,147,483,648 (-2^31) to 2,147,483,647 (2^31 -1)
	long l;//64 bit    -9,223,372,036,854,775,808(-2^63) to 9,223,372,036,854,775,807(2^63 -1)
	float j;//32bit single precision  decimal values up to 7 digits of precision 0.1234567
	double d;//64 bit double precision    decimal values up to 16 digits of precision 0.123456789012345
	
	//class type or wrapper type
	String txt;
	
	Integer i2 = new Integer(9);
	Integer j2 = new Integer(9);
	
	String st1 = new String("welcome");
	String st2 = new String("welcome");
	
	static Integer example;
	
	//inner class
	class Guardian{
		short s = (short) 32769;
		void print(){
			System.out.println("Printed from Guardian Inner class: "+s);
		}
		
	}
	
	//inner class
	static class Guardian2{
		
	}
	
	//constructor
	/*public D$tExample_1(){
		
	}*/
	//constructor overloading
	public D$tExample_1(boolean f, float j, byte k){
		
		Guardian g = new Guardian();
		Object g2 = new Guardian2();
		g.print();
		
		int i = 0;//local variable
		flag$ = f;
		this.j=  j; // 3.4534534534534533E18 = 3.4534534534534533 * 10^18
		b = k;
		
		int x=1,y=1;
		x+=y;
		boolean res= x==y;
		System.out.println("is equal "+res);
		
		txt = "main";
		String t = "main";
		//txt =t;
		boolean strRes = txt==t;  
		System.out.println("is equal "+strRes);
		
		
		
		/*
		boolean intRes = i2==j2;  
		System.out.println("is equal "+intRes);
		*/
		
		boolean newStrRes = st1==st2;  
		System.out.println("is equal "+newStrRes);
		
		System.out.println("is equal "+st1.equals(st2));
		boolean insRes= false;
		
		/*if(g instanceof Guardian2){
			insRes = true;
		}
		System.out.println("is equal "+insRes);*/
	}
	
	public D$tExample_1(boolean flag$){
		
	}
	
	
	
	public int[] shortestToChar(String s, char c) {
        List<Integer> idx = new ArrayList<Integer>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==c){
                idx.add(i);    
            }           
        }
        int answer[] = new int[s.length()];
       
        
        int min = 0;
        for(int i=0; i<s.length(); i++){
        	List<Integer>  diff = new ArrayList<Integer>();
            for(int j : idx){
                diff.add(Math.abs(i-j));
            }
            min = diff.get(0);
            for(int l : diff){
                if(l<min){
                    min = l;
                }
            }
            answer[i]=min;
        }
        
        return answer;
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D$tExample_1 ex = new D$tExample_1(true, (long)3453453453453453453L, (byte)129);
		/*ex.flag$ = true;
		ex.code='\u0986';
		String st = "1299889";
		int t = Integer.valueOf(st);
		ex.d=3.123456789876655444333333222222;
		System.out.println(ex.flag$ + "   " + ex.d + "   " + ex.b +" "+t+"   "+ex.code);
		example = 12;*/
		
		String s = "loveleetcode";
		char c = 'e';
		System.out.println(ex.shortestToChar(s, c)[4]);
	}

}
