/*
 * LinkedList.java
 */
/* LinkedList code implemented from Data Structures and Algorithms made easy in JAVA by Narasimha Karumanchi

/* Business Class for the implementation of the linkedlist */

	import java.util.*;
	public class LinkedList{
		
		public LinkedList(){
			length = 0;
		}
		
		ListNode head;
		private int length = 0;
		
		public synchronized ListNode getHead(){
			return head;
		}
		
		public synchronized void insertAtBegin(ListNode node){			//function to insert node at beginning
			node.setNext(head);
			head = node;
			length++;
		}
		
		public synchronized void insertAtEnd(ListNode node){			// function to insert node at end
			if(head == null)
				head = node;
			else {
				ListNode p,q;
				for(p = head; (q = p.getNext())!= null; p=q);
					p.setNext(node);
			}
			length++;
		}
		
		public void insert(int data, int position){						//function to insert node at a particular position
			if(position < 0){
				position = 0;
			}
			if(position > length){
				position = length;
			}
			
			if(head == null){
				head = new ListNode(data);
			}
			
			else if(position ==0){
				ListNode temp = new ListNode(data);
				temp.next = head;
				head = temp;
			}
			
			
			else{
				ListNode temp = head;
				for(int i =1; i < position; i++){
					temp = temp.getNext();
				}
				ListNode newNode = new ListNode(data);
				newNode.next = temp.next;
				temp.setNext(newNode);
			}
			length++;
		}
		
		public synchronized ListNode removeFromBegin(){					// remove node from beginning
		ListNode node = head;
		if(node!= null){
			head = node.getNext();
			node.setNext(null);
		}
		return node;
	}
	
	public synchronized ListNode removeFromEnd(){						// remove from the end
		if(head == null){
			return null;
		}
		ListNode p = head, q = null, next = head.getNext();
		if(next == null){
			head = null;
			return p;
		}
		while((next = p.getNext()) != null){
			q =p;
			p = next;
		}
		q.setNext(null);
		return p;
	}
	
	public synchronized void removeMatched(ListNode node){				// remove a node matching a specified node from the list
		if(head == null)
		return;
		if(node.equals(head)){
			head = head.getNext();
			return;
		}
		ListNode p = head, q = null;
		while((q=p.getNext()) != null){
			if(node.equals(q)){
				p.setNext(q.getNext());
				return;
			}
			p = q;
		}
	}
	
	public void remove(int position){									// remove at a particular position
		if(position < 0){
			position = 0;
		}
		if(position >= length){
			position = length -1;
		}
		if(head == null){
			return;
		}
		if(position ==0){
			head = head.getNext();
		}
		else{
			ListNode temp = head;
			for(int i =1; i < position; i++){
				temp = temp.getNext();
			}
			temp.setNext(temp.getNext().getNext());
		}
		length -=1;
	}
	
	public String toString(){											// return a string representation of the data
		String result = "[";
		if(head == null){
			return result+"]";
		}
		result = result + head.getData();
		ListNode temp = head.getNext();
		while(temp!=null){
			result = result + "," + temp.getData();
			temp = temp.getNext();
		}
		return result + "]";
	}
	public int length(){												// return the current length of the list
		return length;
	}
	
	public int getPosition(int data){									//  for a given data, find the exact position
		ListNode temp = head;
		int pos = 0;
		while(temp!=null){
			if(temp.getData() == data){
				return pos;
			}
			pos +=1;
			temp = temp.getNext();
		}
		return Integer.MIN_VALUE;
	}
	public void clearList(){
		head = null;
		length = 0;
	}

	public static void main(String args[]){
		
		LinkedList ls = new LinkedList();
		System.out.println("Hello, welcome to the LinkedList implementer");
		System.out.println("\nPlease enter \"Exit\" to Quit or any other key to continue");
		Scanner st = new Scanner(System.in);
		String choice = st.nextLine();
		 
		while(choice.equals("exit")!=true){
	
		
			System.out.println("\nThank You. The following are your options");
			System.out.println("1. Insert a value in the linked list at the beginning");
			System.out.println("2. Insert a value in the linked list at the end");
			System.out.println("3. Insert a value in the linked list at a given position");
			System.out.println("4. Check the length of the linked list");
			System.out.println("5. Display the linked list");
			System.out.println("6. Remove a value in the linked list at the beginning");
			System.out.println("7. Remove a value in the linked list at the end");
			System.out.println("8. Remove a node from the linked list");
			System.out.println("9. Find the exact position of a particular linked list element");
			System.out.println("10.Clear the entire list\n\n");
		
		
		int selection;
		Scanner sc = new Scanner(System.in);
		selection = sc.nextInt();
		switch(selection){
			/*case 1:
					System.out.println("Enter the value to be entered at the beginning");
					ls.getHead();
					ls.insertAtBegin(node2);
					break;
			case 2: 
					System.out.println("Enter the value to be entered at the end");
					ls.getHead();
					ls.insertAtEnd(node3);
					break; */ 
			case 3:
					System.out.println("Enter the value to be entered at a particular position");
					Scanner in3 = new Scanner(System.in);
					int value3 = in3.nextInt();
					int pos = in3.nextInt();
					ls.insert(value3,pos);
					break;
			case 4: 
					System.out.println("The length of the linked list is: "+ ls.length());
					break;
			case 5: 
					System.out.println("The data in linked list is as follows: "+ls.toString());
					break;
			case 6: 
					
					System.out.println("Removing the node from the beginning");
					ls.removeFromBegin();
					break;
			case 7:
					System.out.println("Removing the node from the end");
					ls.removeFromEnd();
					break;
					
			case 8: System.out.println("Enter the position of the node to be removed");
					Scanner in4 = new Scanner(System.in);
					int value4 = in4.nextInt();
					ls.remove(value4);
					break;
			case 9: 
					System.out.println("Enter the list element whose position has to be known");
					Scanner in5 = new Scanner(System.in);
					int value5 = in5.nextInt();
					System.out.println("The position is: "+ ls.getPosition(value5));
					break;
			case 10: 
					ls.clearList();
					break;
					
			default:
					System.out.println("Please select from among the given options");
					break;
		
		
			}//switch statement ends here	
	System.out.println("\n Enter any key to continue or \"exit\" to quit the program");	
	Scanner newscan = new Scanner(System.in);
	String next_option = newscan.nextLine();
	choice = next_option;
	
		
		}// while ends here			
		
		System.out.println("\nThank you for using the Linked List implementer\n\n");
	
	
	
		
		}// end of main
	
	
	}	
			
				
		
			
				
		
		

