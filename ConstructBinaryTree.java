//Given an array of numbers, implement a binary tree
import java.util.*;


class TreeNode{
	int item;
	TreeNode(int value){
		this.item = value;
	}
	TreeNode left = null, right = null;
}//end of class TreeNode

public class ConstructBinaryTree{
	
	TreeNode root = null; 

	void addNode(int v){
		//if root is not defined, create one		
		int value = v;
		TreeNode focusNode;
		if(this.root == null){
			this.root = new TreeNode(value);
			 return;
		}
		else{ //if the root node is already defined
				focusNode = this.root; //set the focusNode to root always to start traversing from top to insert elements
				TreeNode parent;
				while(true){
					parent = focusNode;
					if(value < focusNode.item){
						focusNode = focusNode.left;

						if(focusNode == null){
							parent.left = new TreeNode(value);
							return;
						}

					}
					else{
						focusNode = focusNode.right;
						if(focusNode == null){
							parent.right = new TreeNode(value);
							return;
						}
					}

				}//end of while

		}//end of else
	}//end of addNode



	void printPath(TreeNode node){
		int[] path = new int[100];
		int pathLen = 0;
		printPathRec(node,path,pathLen);
	}

	void printPathRec(TreeNode node, int[] path, int pathLen){
		if(node == null){ //if node is null
			return;
		}
	
		path[pathLen++] = node.item;

		//if node is a leaf, send control to printArray only if it is a leaf node, or else keep recursively looping through all nodes
		if(node.left == null && node.right == null){
			printArray(path,pathLen);
		}

		//if it is a non leaf node
		printPathRec(node.left, path, pathLen);
		printPathRec(node.right, path, pathLen);
	}

	//function to print all paths from root to leaf recursively.
	void printArray(int[] path, int pathLen){
		for(int i = 0; i < pathLen; i++){
			System.out.print(path[i]);
		
		if(i != pathLen-1){
				System.out.print("->");
			}
	}	
	System.out.println("");
	}

	public static void main(String args[]){
		//System.out.println("Enter the count of total nodes");
		//Scanner sc = new Scanner(System.in);
		ConstructBinaryTree cbt = new ConstructBinaryTree();
		//int node_count = sc.nextInt();
		//int[] node_array = new int[100];
		//cbt.root = new TreeNode(10);
		cbt.addNode(10);
		cbt.addNode(4);
		cbt.addNode(12);
		cbt.addNode(15);
		cbt.addNode(11);
		cbt.addNode(5);
		cbt.addNode(2);
		cbt.addNode(8);
		cbt.printPath(cbt.root);		
		//sc.close();
	}// end of main
}//end of class ConstructBinaryTree