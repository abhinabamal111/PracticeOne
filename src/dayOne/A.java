package dayOne;

public class A {
	
	public transient int k;
	
	int i;
	
	/*
	 * public A(int b){
	 * 
	 * this.k =b;
	 * 
	 * System.out.println("Hey in A"); }
	 */
	
	static {
		System.out.println("Hi in static block in A");
	}

	public static void m1() {
		
		System.out.println("inside class A, m1 method");
	}
	
	public void m3() {
		this.k++;
		System.out.println("Inside A m3 method.."+k);
	}
	
	public void m4() {
		System.out.println("Inside A m4 method..");
	}
	
}
