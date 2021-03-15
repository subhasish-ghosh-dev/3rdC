package switchstndenum;

import java.util.TimeZone;

import classOne.Student;

import java.util.*;
import java.text.*;

public class SwitchEx implements ITimeCalculator {
	
	
	private /*static*/  void switchOnIntegers(byte size) {
		System.out.println(size);
		  switch(size) {

		    case 0  : { System.out.println("size is small");  break;  }
		    case 1  : { System.out.println("size is medium");   }
		    case 2  : { System.out.println("size is large");    }
		    case 3  : { System.out.println("size is X-large"); break; }

		    default : { System.out.println("size is not S,M,L or XL: " + size); }
		  }
	}
	
	
	private /*static*/  void switchOnChars(char size) {
		  switch(size) {

		    case 's'  : { System.out.println("size is small");  break;  }
		    case 'm'  : { System.out.println("size is medium");   }
		    case 'l'  : { System.out.println("size is large");  break;  }
		    case 'x'  : { System.out.println("size is X-large"); break; }

		    default : { System.out.println("size is not S,M,L or XL: " + size); }
		  }
	}

	
	//method overloading
	private /*static*/  void switchOnChars(String size) {
		switch(size) {

		    case "small"  : { System.out.println("size is small");  break;  }
		    case "medium"  : { System.out.println("size is medium");   }
		    case "large"  : { System.out.println("size is large");  break;  }
		    case "x-large"  : { System.out.println("size is X-large"); break; }
	
		    default : { System.out.println("size is not S,M,L or XL: " + size); }
		}
	}
	
	
	private void adjustClock(String tz){
		
		String[] ids = TimeZone.getAvailableIDs();
		
		for(String t : ids){
			System.out.println(t);
		}
		SimpleDateFormat  sdf=new SimpleDateFormat("hh:mm:ss a");
		
		switch(tz){
			case "BST":
				Date dt = new Date();			
				String time = sdf.format(dt);			
				System.out.println("BST TIME: "+time);
				break;
				
			case "EST":
				Calendar c = Calendar.getInstance();
				c.add(Calendar.HOUR, -11);
				
				Date dt1 = c.getTime();			
				time = sdf.format(dt1);
				
				System.out.println("EST TIME: "+time);
				break;
			
			default:
				System.out.println("TimeZone not matched");
			
		}
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//SwitchEx.switchOnIntegers((byte)0);
		
		SwitchEx s = new SwitchEx();
		//s.switchOnIntegers((byte)7); // byte -127 to 128
		//s.switchOnChars("medium");
		
		SwitchEx s1 = new SwitchEx();
		s1.adjustClock("EST");
		
		//type casting example
		ITimeCalculator swtch = new SwitchEx();
		ITimeCalculator student = new Student();
		
		swtch.calculate();
		student.calculate();
	}


	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		System.out.println("I calculate time");
	}

}
