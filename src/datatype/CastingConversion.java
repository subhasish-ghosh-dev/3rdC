package datatype;

public class CastingConversion {
		
	int s = 32765;
	byte b = 122;
	short sh = b;
	long l = (int)135345345345356456L;
	
	void print(){
		System.out.println("Printed from Casting Conversion  class: "+l);
	}
	
	
	public static void main(String[] args){
		CastingConversion c =  new CastingConversion();
		c.print();
	}

}
