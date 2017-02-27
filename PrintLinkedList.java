import java.util.*;
class ListNode{
	int val;
	ListNode next;
	ListNode(int x){
	this.val = x;
	next = null;
	}
	ListNode getNext(){
		return this.next;
	}


}

public class PrintLinkedList{
	public void printList(ListNode ln){
	
		ListNode currentNode = ln;
		System.out.println("Starting currentNode Address: "+currentNode+"\tValue at Address: "+currentNode.val);
		while(currentNode != null){
			System.out.println("currentNode address: "+currentNode+"\tValue at Address: "+currentNode.val);
			currentNode = currentNode.next;
		}
		System.out.println("");
}

	public static void main(String args[]){
	
	PrintLinkedList sl = new PrintLinkedList();
	ListNode l1=null,l2=null;
	l1 = new ListNode(2);
	l1.next = new ListNode(3);
	l1.next.next = new ListNode(4);
	sl.printList(l1);	
	l2 = new ListNode(6);
	l2.next = new ListNode(7);
	l2.next.next = new ListNode(8);
	sl.printList(l2);
	}

}

