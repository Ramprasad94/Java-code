/* Program to add two numbers represented in reverse in different linked lists and give the result in a linked list.*/
import java.util.*;
//ListNode definition
class ListNode{
	int val;
	ListNode next;
	ListNode(int x){
	val = x;
	}
}

//Class to perform intended operation
public class Solution{

	public ListNode addTwoNumbers(ListNode l1, ListNode l2){
		int carry = 0, result = 0, temp;
		ListNode result_list = null;
		while(l1 != null && l2 != null){
				temp= l1.val + l2.val+ carry;
				if(temp >= 10){
			        	result = temp % 10;
					carry = 1;
				}
				else{
					result = temp;
				} 	
				if(result_list == null){
					result_list = new ListNode(result);	
					System.out.println("Stored "+result+" in the result list"+"\t"+"Address = "+result_list);
				}
				else{
					result_list.next = new ListNode(result);
					System.out.println("Stored "+result+" in the result list"+"\t"+"Address = "+result_list.next);
				}	

				if((l1.next != null) && (l2.next != null)){
					l1 = l1.next;
					l2 = l2.next;
				}
				else if((l1.next == null) && (l2.next != null)){
					l1.next = new ListNode(0);
					l2 = l2.next;
				}		
				else if((l1.next != null) && (l2.next == null)){
					l2.next = new ListNode(0);
					l1 = l1.next;
				}
				else if((l1.next == null) && (l2.next == null) && (carry > 0)){
					result_list.next = new ListNode(carry);
					System.out.println("Stored "+carry+" in the result list"+"\t"+"Address = "+result_list.next);
					l1 = l1.next;
					l2 = l2.next;
				}
				else if((l1.next == null) && (l2.next == null)){
					l1 = l1.next;
					l2 = l2.next;
				} 
			}
			System.out.println("Address of the result list = "+result_list );
	int counter = 0;
	while(result_list != null){
		counter+=1;
		result_list = result_list.next;
	}
	System.out.println("Number of elements in result node: "+counter);

	return result_list;			
	}

	public void printList(ListNode ln){
	
		System.out.println("The elements of the linked list are: ");
		while(ln != null){
			System.out.print(ln.val+"  ");
			ln = ln.next;

		}	
		System.out.println(" ");
	}

	public static void main(String args[]){
	
	Solution sl = new Solution();
	ListNode l1=null,l2=null, resultNode = null;
	l1 = new ListNode(2);
	l1.next = new ListNode(3);
	l1.next.next = new ListNode(4);
	sl.printList(l1);	
	System.out.println(l1+"->"+l1.next+"->"+l1.next.next);
	l2 = new ListNode(6);
	l2.next = new ListNode(7);
	l2.next.next = new ListNode(8);
	sl.printList(l2);
	System.out.println(l2+"->"+l2.next+"->"+l2.next.next);
	resultNode = sl.addTwoNumbers(l1,l2);
	System.out.println("Address of result node = "+ resultNode);
	sl.printList(resultNode);
	int counter = 0;
	while(resultNode != null){
		counter+=1;
		resultNode = resultNode.next;
	}
	System.out.println("Number of elements in result node: "+counter);

	}

}



