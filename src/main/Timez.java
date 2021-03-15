package main;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;
import java.util.TimeZone;
import switchstndenum.*;


public class Timez implements IMyInterface {

	public int u=0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat  sdf=new SimpleDateFormat("hh:mm:ss a");		
		System.out.println(TimeZone.getTimeZone("Australia/NSW").getRawOffset());
		System.out.println(TimeZone.getDefault().getRawOffset());
		System.out.println((TimeZone.getDefault().getRawOffset()-TimeZone.getTimeZone("Australia/NSW").getRawOffset())/(3600*1000));
		Date now = new Date();	
		
		/*Map<Integer, String> table = new HashMap<Integer, String>();

		if(table instanceof HashMap){
			System.out.println("table is a type Map");
		}
		
		*/
		//System.out.println(now.getTime());
	    Date dt1 = new Date(now.getTime() - (TimeZone.getDefault().getRawOffset()-TimeZone.getTimeZone("Australia/NSW").getRawOffset()));
		String time1 = sdf.format(dt1);			
		System.out.println("AEST TIME: "+time1);
		
		int i = IMyInterface.AMOUNT*89;
		Timez t = new Timez();
		t.request();
		
	}

	@Override
	public void request() {
		// TODO Auto-generated method stub
		
	}
	
	

}
