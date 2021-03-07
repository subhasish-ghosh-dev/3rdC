package codingbat.warmup2;

public class StringMatch {
	
	
	
	public int stringMatch(String a, String b) {
			if(a.length()>1 && b.length()>1){
		      	  
				  String[] fstr = new String[a.length()];
				  String[] sstr = new String[b.length()];
				  int fcount=0;				 
				  int scount=0;
				  
				  //"welcome" "well"
				  for(int i=0; i<a.length()-2; i++){
				    fstr[fcount++]=a.substring(i,i+2);				   
				  }
				  fstr[fcount++]=a.substring(a.length()-2);
				  
				  
				  for(int i=0; i<b.length()-2; i++){
				    sstr[scount++]=b.substring(i,i+2);				    
				  }
				  sstr[scount++]=b.substring(b.length()-2);
				  
				 
				  int count=0;
				  for(int i=0; i<(fcount<scount?fcount: scount); i++){
					  if(fstr[i].equals(sstr[i])){
						  count++;
					  }
				  }
				  
				  return count;
		    }
		    else{
		      return 0;
		    }		  
		  
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringMatch o= new StringMatch();
		o.stringMatch("abc", "axc");
	}

}
