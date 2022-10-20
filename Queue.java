
/*
author Matthew Parsley
*/
public class Queue<T> implements QueueInterface{

	
	/*
	creates our linked list
	*/
	GenLinkedList<T> list = new GenLinkedList();
	
	@Override
	/*
	a method that adds an object to the head of our linked list
	@param newEntry that we want to add to our list 
	*/
	public void  enqueue(Object newEntry) {
		list.add(newEntry);
	}

	@Override
	/*
	a method that removes an object from the head of our linked list
	@return the rest of the linked list minus what we got rid of 
	*/
	public Object dequeue() {
		// TODO Auto-generated method stub
		T item = (T) list.get(0);
		list.head = list.head.getNext();
		return item;
		
	}

	@Override
	/*
	a method that shows us the first item in our linked list
	*/
	public Object getFront() {
		// TODO Auto-generated method stub
		return list.get(0);
	}

	@Override
	/*
	a method that shows us if our linked list is empty
	*/
	public boolean isEmpty() {
		
		if(list.get(0) == null) {
			return true;
		}
		else 
			return false;
		
	}

	@Override
	/*
	a method that clears our linked list for us
	*/
	public void clear() {
		if(list.length() != 0) {
			list.delete(list.head);
		}
	}
	
	/*
	a method that helps us to print our queue as we add and remove things from it
	public String toString() {
		Node<String> node = list.get(0);
		String str = "";

		for(int i = 0; i < list.length(); i++) {
			str += node.getData() + ",";
			node = node.getNext();
		}
		
		return str;
	}

}
