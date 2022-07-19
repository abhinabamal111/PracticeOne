package dayTwo;

import java.util.LinkedList;

public class ListWithNodes<T> extends LinkedList<T>{
	
	
	
	private static final long serialVersionUID = 1L;
	static Node<String> first = null;
	static Node<String> last = null;

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final Node<String> l = last;
		
		final Node<String> n0 = new Node<String>(l/* null */, "a", null);
		
		last = n0;
		first = n0;
		
		Node<String> n1 = new Node<String>(n0, "b", null);
		n0.next = n1;
		last = n1;
		
		n0.displayData();
		n0.next.displayData();
		n1.prev.displayData();
		//n1.next.displayData();
		//n1.displayData();
		
		CustomLinkedList<Integer> iList =  new CustomLinkedList<Integer>();
		
		iList.addElement(90);
		iList.addElement(80);
		iList.addElement(70);
		iList.addElement(60);
		iList.addElement(50);
		
		iList.printReverse(iList.head);
		
		System.out.println("------------------------------------------");
		
		iList.print();
		System.out.println("------------------------------------------");
		LinkedList<Integer> lt = new LinkedList<Integer>();
		
		lt.push(50);
		lt.push(40);
		lt.push(30);
		lt.push(20);
		
		@SuppressWarnings("unchecked")
		LinkedList<Integer> ltCloned = (LinkedList<Integer>) lt.clone();
		
		System.out.println("lt hashcode: --"+ lt.hashCode());
		System.out.println("ltCloned hashcode: --"+ ltCloned.hashCode());
		ltCloned.remove();
		
		for (Integer integer : ltCloned) {
			
			System.out.println(integer);
			
		}
		
		
		System.out.println("-----------'lt'------------------------------");	
for (Integer integer : lt) {
			
			System.out.println(integer);
			
		}
		
		
		
		
		
	}

}
