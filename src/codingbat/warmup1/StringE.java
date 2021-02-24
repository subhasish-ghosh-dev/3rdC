package codingbat.warmup1;

/*
 * 
Return true if the given string contains between 1 and 3 'e' chars.


stringE("Hello") → true
stringE("Heelle") → true
stringE("Heelele") → false
 */

public class StringE {
	
	public boolean stringE(String str) {
		boolean result = false;
		if(str.length()<1){
		    return result;
		  }
		int count = 0;
		int idx = 0;
		do{
			if(str.charAt(idx)=='e'){
				count++;
			}
			idx++;
		}while(idx<str.length());
		
		if(count>=1 && count<=3){
			result=true;
		}
		
		return result;  
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
