package innerclasses;

public class Gym {
	interface Factory{
		String create(char[] vals);
	}

	
	//Factory factory = String::new;
	static char[] chars = {'a',' ','g','o','o','d',' ','c','l','s','s'};
	
	
	public static void calculateDuration(Object o){
		//String str = new String(chars);
		Factory factory = String::new;
		//Factory factory = str -> new String(chars);
		
		/*Factory factory = new Factory(){
			public String create(char[] vals){
				return new String(vals);
			}
		};*/
		
		WorkOut.Person p = (WorkOut.Person) o;
		System.out.println("Name: "+p.name+" weight: "+p);
		
		String str1 = "to";
		String str2 = "Welcome to Java. Welcome to CSE";
		
		System.out.println(str2.indexOf(str1));
		System.out.println(str2.lastIndexOf(str1));
		
		
		System.out.println(factory.create(chars));
	}
	
	
	
}
