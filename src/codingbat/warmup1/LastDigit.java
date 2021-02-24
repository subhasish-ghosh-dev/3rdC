package codingbat.warmup1;

/*
 * Given two non-negative int values, return true if they have the same last digit, 
 * such as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 10 is 7.
			lastDigit(7, 17) → true
			lastDigit(6, 17) → false
			lastDigit(3, 113) → true
 */


public class LastDigit {
	
	public boolean lastDigit(int a, int b) {
		String s1 = String.valueOf(a);
		String s2 = String.valueOf(b);
		if(s1.charAt(s1.length()-1)==s2.charAt(s2.length()-1)){
			return true;
		}
		else{
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
