package dayOne;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class C extends A {
	
	/*
	 * public C(int b) { super(b); //++; }
	 */

int s;



	public static int i = 10;
	//public static int m1 = 10;

	    {
	    	
	    	i++;
		  System.out.println("Hey in C");	
		}
        public static void m1() {
			
			//i = 20;
			
			System.out.println("inside class C, m1 method:-- "/* +i */);
		}
		
		static {
			i++;
			System.out.println("Hi in static block in C:-- "+ i);
		}

		public void m2() {
			System.out.println("Inside C m2 method.."+super.k);
		}
		
		public void m5() {
			System.out.println("Inside C m2 method..");
			
			super.m3();
		}
		  
		
		
       
		
		public static void main(String[] args) {
			
			//C.m1();
			
			//C c = new C(40);
			
			A a = new C();
			
			
			A a1 = new A();// Parent Class
			C c  = new C(); // Child Class
			
			B b = new B();
			
			A c1= new C();
			
			//c=a1;
			//a1=c;
			//a1=b;
			
			a1=c1;
			//c=c1;
			c1.m1();
			
			
			
			 System.out.println("a1 instanceof A: - "+(a1 instanceof A));
			 System.out.println("c instanceof A: - "+(c instanceof A));
			 System.out.println("a1 instanceof C: - "+(a1 instanceof C));
			 System.out.println("c instanceof C: - "+(c instanceof C));
			 System.out.println("c1 instanceof C: - "+(c1 instanceof C));
			 System.out.println("c1 instanceof A : - "+(c1 instanceof A));
			//A a1 = new A(50);
			
			//c.m1();
			//c.m4();
			
			//a.m1();
			//a.m
			
			String ab = "anjhkhg";
			
			String[] aArray = ab.split("");
			
			List<String> aList = Arrays.asList(aArray);
			
			List<String> sList = new LinkedList<String>();
			
			
			
			for (String string : aList) {
				
				//System.out.println(string);
			}
			
		}
	
}
