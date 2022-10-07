/*
author Matthew Parsley
*/
public class Node <T>{
	
	/*
	creates our data and nodes that our list will use
	*/
	private T data;
	private Node previous;
	private Node next;
	
	/*
	a method to create a node filled with data
	@param the data that we want to add
	*/
	public Node(T data) {
		super();
		this.data = data;
	}
	
	/*
	a method that gets the data in a node
	*/
	public T getData() {
		return data;
	}
	
	/*
	a method that sets the data of a node in our list
	@param- the data that we want to set
	*/
	public void setData(T data) {
		this.data = data;
	}
	
	/*
	a method that returns the previous node
	@return- the previous node
	*/
	public Node getPrevious() {
		return previous;
	}
	
	/*
	A method that sets the previous node
	*/
	public void setPrevious(Node previous) {
		this.previous = previous;
	}
	
	/*
	a method that gets the next node
	@return the next node
	*/
	public Node getNext() {
		return next;
	}
	
	/*
	a method that sets the next node in the list
	*/
	public void setNext(Node next) {
		this.next = next;
	}
	
	@Override
	/*
	a method to help and print the data in the node
	*/
	public String toString() {
		return "Node [data =" + data + ", next =" + next + "]";
	}
}
