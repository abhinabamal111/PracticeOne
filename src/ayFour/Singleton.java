package ayFour;

public class Singleton {
	
	
	private static Singleton singInstance = null;
	
	private Singleton()
	{
		
	}
	
	public static Singleton getSingletonClass() {
		
		if(singInstance == null) {
			
			
			singInstance= new Singleton();
		}
		
		
		return singInstance;
	}
//m
}
