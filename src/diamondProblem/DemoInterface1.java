package diamondProblem;

public interface DemoInterface1 extends DemoInterface {
	
	public default void display() {
		
		System.out.println("Inside DemoIn1");
	}

}
