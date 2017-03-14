//Program that will print the binary tree by using recursion.
// Time Complexity : O(n)
class Node{
	int item;
	Node left = null, right = null;
	Node (int val){
		item = val;
	}
}


public class PrintBinaryTree{
	
	Node root;
	public static void main(String args[]){

		PrintBinaryTree pbt = new PrintBinaryTree();
		pbt.root = new Node(10);
		pbt.root.left = new Node(8);
		pbt.root.right = new Node(2);
		pbt.root.left.left = new Node(3);
		pbt.root.left.right = new Node(5);
		pbt.root.right.left = new Node(2);

		pbt.printPath(pbt.root);
	}

	int pathLen = 0;
		
	//function that will initialize path array and then call the recursive function
	void printPath(Node node){
		int[] path = new int[6];
		printPathRec(node,path,pathLen);
	}

	//function that will recursively run and call printArray later
	void printPathRec(Node node, int[] path, int pathLen){

		//if node is null
		if(node == null){
			//System.out.println("Control enters node == null condition");
			return;
		}
		
		path[pathLen++] = node.item;
		//System.out.println("Control enters else, added item = "+node.item);
		//incase of leaf node
		if(node.left == null && node.right == null){
			
			//System.out.println("Control enters leaf node condition");
			printArray(path,pathLen);
		}
		//incase of non-leaf node try recursively printing them
		printPathRec(node.left,path,pathLen);
		printPathRec(node.right,path,pathLen);
	}

	void printArray(int[] path, int len){
		//int count = 0;
		for(int i = 0; i < len; i++){
			System.out.print(path[i]+" ");
			//count += 1;
		}
		//System.out.println("count = "+count);
		System.out.println("");
	}


}//end of class