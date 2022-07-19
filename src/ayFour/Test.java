package ayFour;

public class Test {
	
	
	public static void main(String[] args) {
		
		Singleton s = Singleton.getSingletonClass();
		Singleton s1 = Singleton.getSingletonClass();
		
		//System.out.println("s hashCode : -- "+ s.hashCode());
		//System.out.println("s1 hashCode: -- "+s1.hashCode());
		
		someMethod(null);
		
		Object o = null;
		
	}
	public static void someMethod(Object o){

		System.out.println("Object method Invoked");

		}

		 

	public static void someMethod(String s){

		System.out.println("String method Invoked");

		}
	
	
	
	
	
	
	
	
	

}
