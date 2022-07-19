package dayTwo;

import java.util.LinkedList;

public class CustomLinkedList<T> {
	
	 Node<T> head;
	
	//private int size;

	/*
	 * public CustomLinkedList(int capacity) { //super(); this.size = capacity; }
	 */	
	
	class Node<K> {
		
		K data;
		Node<K> next;
		public Node(K data) {
			super();
			this.data = data;
			this.next = null;
		}
		
		
		
		
	}
	public void addElement(T t) {
		
		Node<T> newNode =  new Node<T>(t);
		
		
		newNode.next = head;
		head = newNode;
		
	}
	
	public void printReverse(Node<T> head)
	{
		if(head == null) return;
		
		printReverse(head.next);
		
		System.out.println(head.data+" ");
		
	}
	
	public void print() {
		
		while(head!=null) {
		
		System.out.println(head.data);
		head = head.next;
		}

		
	}
	
}
