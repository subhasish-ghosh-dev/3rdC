import java.util.Calendar;
import java.util.Date;

public class DateEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		System.out.println(date);
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());
		cal.add(Calendar.DAY_OF_MONTH, -3);
		
		if(date.after(cal.getTime())){
			System.out.println("AFTER");
		}
		else{
			System.out.println("BEFORE");
		}
		
		
		
		
		
		
	}

}
