package dayTwo;

public class Node<T> {
	
	T data;
	Node<T> prev;
	Node<T> next;
	
	public Node(Node<T> prev, T data, Node<T> next) {
		this.data = data;
		this.prev = prev;
		this.next = next;
	}

	
	
	public void displayData() {
		
		System.out.println(data);
		
	}
	
	
}
