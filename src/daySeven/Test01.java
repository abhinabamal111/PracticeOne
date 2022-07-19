package daySeven;

public class Test01 {
	
	public static void main(String[] args) {
		
		
		try {
			
			throw new OutOfMemoryError();
			
		}catch(Throwable t) {
			
			System.out.println("Inside Catch");
			System.out.println(5);
		}
		
		Test02 t2 = new Test02(10);
		
		
		
		
		
	}

}
