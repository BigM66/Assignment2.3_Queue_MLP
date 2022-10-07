/*
author Matthew Parsley
*/

public class Application {

	public static void main(String[] args) {
		
		/*
		creates our queue
		*/
		Queue<String> list = new Queue();
		
		/*
		creates all of our customers
		*/
		String customer1 = "Bill";
		String customer2 = "Alice";
		String customer3 = "Bob";
		String customer4 = "Jane";
		String customer5 = "Hamad";
		String customer6 = "Jim";
		
		/*
		handles all of our customers
		*/
		list.enqueue(customer1);
		System.out.println("the line after one customers arrive is:" + list.toString());
		list.enqueue(customer2);
		System.out.println("the line after two customers arrive is:" + list.toString());
		list.enqueue(customer3);
		System.out.println("the line after three customers arrive is:" + list.toString());
		list.dequeue();
		System.out.println("The line after one customer is served is now:" + list.toString());
		list.enqueue(customer4);
		System.out.println("the line after a fourth customers arrive is:" + list.toString());
		list.enqueue(customer5);
		System.out.println("the line after a fifth customers arrive is:" + list.toString());
		list.dequeue();
		System.out.println("The line after a second customer is served is now:" + list.toString());
		list.dequeue();
		System.out.println("The line after a third customer is served is now:" + list.toString());
		list.enqueue(customer6);
		System.out.println("the line after a sixth customers arrive is:" + list.toString());
		list.dequeue();
		System.out.println("The line after a fourth customer is served is now:" + list.toString());
		list.dequeue();
		System.out.println("The line after a fifth customer is served is now:" + list.toString());
		
		System.out.println("The line after it has gained and served customers is now:" + list.toString());
		
		
		

	}

}
