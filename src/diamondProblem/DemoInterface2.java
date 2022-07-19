package diamondProblem;

public interface DemoInterface2 extends DemoInterface {
	
	public default void display() {
		
		System.out.println("Inside DemoIn2");
	}

}
