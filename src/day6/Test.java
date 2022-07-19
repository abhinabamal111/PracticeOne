package day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

	public static double factorial(int n) {
		
		if(n==1) {
			
			return 1;
		}
		
		else {
			return n*factorial(n-1);
		}
		
	}
	
	public static double combination(int n,int r) {
		
		double denominator = factorial(r)*factorial(n-r);
		double nominator = factorial(n);
		
		System.out.println("Denominator:-  "+denominator);
		System.out.println("Nominator:-  "+nominator);
		
		return (nominator/denominator);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.out.println(combination(4,2));
		
		List<Integer> ll = new ArrayList<>(Arrays.asList(4,5,8,9));
		
		int llSize = ll.size();
		
		int r=1;
		
		for (int i = 0; i <combination(llSize,r) ; i++) {
			
			List<Integer> m = new ArrayList<>();
			//m.
			//r++;
		}
		
		List<Integer> l = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
		
		int leftToShift = 25;
		
		for(int i =0;i<leftToShift;i++) {
		
			int m = l.remove(0);
			l.add(m);
		}
    
		
		System.out.println(l.toString());

	}

}
