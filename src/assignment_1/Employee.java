package assignment_1;

import java.util.Scanner;

public class Employee {
	
	private String account;
	private String name;
	private double tax;
	private double incomeTax;
	
	public Employee(){
		
	}
	
	protected void input(){
		System.out.println("Please Enter account, name, tax serially");
		Scanner sc = new Scanner(System.in);
		String[] inputs = new String[3];
		int i=0;
		while(sc.hasNext()){
			if(i<=2){
				String st = sc.next();
				inputs[i++] = st;
				System.out.println(st);
			}				
			else
				break;
		}
		
		account = inputs[0];
		name = inputs[1];
		tax = Double.valueOf(inputs[2]);
		
		sc.close();
	}
	
	protected void calc(){
		if(tax<=100000){
			incomeTax = 0;
		}
		else if(tax>=100001 && tax<=150000){
			incomeTax = tax*0.1;
		}
		else if(tax>=150001 && tax<=250000){
			incomeTax = 5000+tax*0.2;
		}
		else if(tax>=250001){
			incomeTax = 25000+tax*0.3;
		}
	}
	
	public void display(){
		System.out.println(this);		
	}
	
	public String toString(){
		
		StringBuilder strc = new StringBuilder();
		strc.append("ACCOUNT Name: ");
		strc.append(name);
		strc.append("\n");
		strc.append("ANNUAL TAXABLE INCOME: ");
		strc.append(tax);
		strc.append("\n");
		strc.append("ACOUNT NUMBER: ");
		strc.append(account);
		strc.append("\n");
		strc.append("INCOME TAX: ");
		strc.append(incomeTax);
		strc.append("\n");
		return strc.toString();
		
	}

}
