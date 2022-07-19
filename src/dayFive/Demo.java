package dayFive;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Demo {
	
	
	
	/*
	 * public static float display(String... a) {
	 * 
	 * for (String string : a) {
	 * 
	 * System.out.println(string);
	 * 
	 * }
	 * 
	 * return 0.0; }
	 */
  public static int display(String[] a) {
		
		for (String string : a) {
			
			System.out.println(string);
			
		}
		
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	List<Integer> arr = new ArrayList<Integer>();
	
	
	
	Instant startTime = Instant.ofEpochSecond(0);
	arr.add(24)
		;
	Instant endTime = Instant.now();
	System.out.println("Time taken to add an element in arrayList: -"+ (endTime.getNano() - startTime.getNano()));

	}

}
