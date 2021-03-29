package assignment_1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Library {
	
	private String acc_num;
	private String title;
	private String author;
	private Date borrowDate;
	private double fine;
	
	protected void input(){
		System.out.println("Please Enter accession number, book title, authorname and borrow date serially\n");
		Scanner sc = new Scanner(System.in);
		String[] inputs = new String[4];
		int i=0;
		while(i<=3 && sc.hasNext()){
			if(i<=3){
				
				String st = sc.nextLine();
				inputs[i++] = st;
			}				
			else{
				sc.close();
				break;
			}				
		}
		
		acc_num = inputs[0];
		title = inputs[1];
		author = inputs[2];
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			borrowDate  = sdf.parse(inputs[3]);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	protected void compute(int late){
		fine = late *2;		
	}
	
	
	protected void compute(){
		Date date = new Date();
		
		if(borrowDate.before(date)){
			
			Calendar cal = Calendar.getInstance();
			cal.setTime(borrowDate);
			cal.add(Calendar.DAY_OF_MONTH,30);
			
			int late = 0;
			if(date.compareTo(cal.getTime())>0){
				int month = cal.get(Calendar.MONTH);
				month+=1;
				Calendar curDate = Calendar.getInstance();
				int curMonth = curDate.get(Calendar.MONTH);
				curMonth+=1;
				System.out.println("CURRENT:"+curMonth);
				System.out.println("DUE:"+month);
				if(month==curMonth){
					int dueDate = cal.get(Calendar.DAY_OF_MONTH);
					//System.out.println(dueDate);
					int curDay = curDate.get(Calendar.DAY_OF_MONTH);
					//System.out.println(curDay);
					late = Math.abs(curDay - dueDate);
				}
				else if(month<curMonth){
					int dueDate = cal.get(Calendar.DAY_OF_MONTH);
					//System.out.println(dueDate);
					int curDay = curDate.get(Calendar.DAY_OF_MONTH);
					//System.out.println(curDay);
					late = ((curMonth-month)*30)+Math.abs(curDay - dueDate);
				}
				fine = late *2;
				//System.out.println("FINE: "+late);
			}
				
		}			
	}
	
	public void display(){
		System.out.println(this);		
	}
	
public String toString(){
		
		StringBuilder strc = new StringBuilder();
		strc.append("ACCESSION Number: ");
		strc.append(acc_num);
		strc.append("\n");
		strc.append("TITLE: ");
		strc.append(title);
		strc.append("\n");
		strc.append("AUTHOR: ");
		strc.append(author);
		strc.append("\n");
		strc.append("LATE FINE: ");
		strc.append(fine);
		strc.append("\n");
		
		return strc.toString();
		
	}
	
	
}
