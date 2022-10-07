/*
author Matthew Parsley
*/
public class GenLinkedList<T> {
	public Node head;
	public Node tail;
	public int length;
	
	/*
	a method that creates our base linked list
	*/
	public GenLinkedList(){

		head=null;

		length=0;

		tail=head;

	}//end empty-argument constructor
	
	/*
	A method that adds an object to the linked list
	@param newEntry- the object that we want to add to our list
	*/
	public void add(Object newEntry) {
		Node newNode = new Node(newEntry);
		if(head == null) {
			head = newNode;
			tail = newNode;
		}
		
		else {
			tail.setNext(newNode);
			newNode.setPrevious(newNode);
		}
		
		tail = newNode;
		
	}
	
	/*
	a method that shows us what is located in the node that we want
	@param an integer for showing us what index we want to return
	@return the data of the node
	*/
	public Node get(int i) {
		Node current = head;
		Integer counter = 0;
		
		while(counter != i) {
			current = current.getNext();
			counter++;
		}
		
		return current;
	}

	
	/*
	a method to find out if something is our linked list
	@param the data that we want to know if it is in our list 
	@ retrun the location at which the data is
	*/
	
	public Node find(T data) {
		Node current = head;
		
		while(current.getData() != data) {
			current = current.getNext();
		}
		
		return current;
			
	}
	
	/*
	a method that adds a new node to our linked list
	@param the node that we want to add
	*/
	public void insert(Node nextToNewNode, Node newNode) {
		Node previousToNewNode = nextToNewNode.getPrevious();
		
		previousToNewNode.setNext(newNode);
		
		newNode.setPrevious(previousToNewNode);
		
		nextToNewNode.setPrevious(newNode);
		
		newNode.setNext(nextToNewNode);
		
	}
	
	/*
	a method that we want to delete a node from our list
	@param the node that we want to delet
	*/
	public void delete(Node nodeToDelete) {
		Node nodeToDeletePrevious = nodeToDelete.getPrevious();
		Node nodeToDeleteNext = nodeToDelete.getNext();
		
		if(nodeToDeletePrevious != null)
			nodeToDeletePrevious.setNext(nodeToDeleteNext);
		
		nodeToDeleteNext.setPrevious(nodeToDeletePrevious);
	}
	
	/*
	A method to determine how long our list is
	@ returns the lentgh of our list
	*/
	public int length() {
		Node temp = this.head;
		
		int count = 0;
		
		while(temp != null) {
			count++;
			temp = temp.getNext();
			
		}
		
		return count;
	}

}
