package codingbat.warmup1;

/*
 * Given a string, return a new string where the first and last chars have been exchanged.


frontBack("code") → "eodc"
frontBack("a") → "a"
frontBack("ab") → "ba"
 */

public class FrontBack {
	public String frontBack(String str) {
		if(str.length()>1){
		    char[] firstCh = {str.charAt(0)};
				char[] lastCh = {str.charAt(str.length()-1)};
				String str2 = str.substring(1, str.length()-1);
				/*
				String str1 = "Hello"+"World"+"\n";
				*/
				return new String(lastCh).concat(str2).concat(new String(firstCh));
		  }
		  else{
		    return str;
		  }
		  /*
		  if(str.length()>0){
		      char[] ch = new char[str.length()];
		  
		      int first = 0;
		      int last = str.length()-1;
		      
		      ch[first] = str.charAt(last);
		      ch[last]  = str.charAt(first);
		      
		      for(int i=1; i<str.length()-1; i++){
		        ch[i] = str.charAt(i);
		      }
		      
		      return new String(ch);
		    
		  }
		  
		  else{
		    return str;
		  }
		  */
		
	}
	

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
