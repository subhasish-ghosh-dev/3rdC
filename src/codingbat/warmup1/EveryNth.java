package codingbat.warmup1;

/*
 * Given a non-empty string and an int N, return the string made starting with char 0, 
 * and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.
		everyNth("Miracle", 2) → "Mrce"
		everyNth("abcdefg", 2) → "aceg"
		everyNth("abcdefg", 3) → "adg"
 */


public class EveryNth {
	
	public String everyNth(String str, int n) {
		String result="";
		StringBuilder strB = new StringBuilder();
		int idx = 0;
		
		while(idx<str.length()){
			strB.append(String.valueOf(str.charAt(idx)));			
			idx+=n;
		}
		
		return strB.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
