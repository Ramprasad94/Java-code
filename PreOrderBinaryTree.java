import java.util.*;

class BinaryTreeNode{
	int data;
	BinaryTreeNode left, right;
	BinaryTreeNode(int data){
		this.data = data;
		left = null;
		right = null;
	}

	int getData(){
		return data;
	}

	void setData(int data){
		this.data = data;
	}

	BinaryTreeNode getLeft(){
		return left;
	}

	void setLeft(BinaryTreeNode left){
		this.left = left;
	}

	BinaryTreeNode right(){
		return right;
	}

	void setRight(BinaryTreeNode right){
		this.right = right;
	}
}

public class PreOrderBinaryTree{

	BinaryTreeNode root,n1,n2;
	public static void main(String[] args){
		PreOrderBinaryTree pbt = new PreOrderBinaryTree();
		pbt.root = new BinaryTreeNode(1);
		pbt.root.setLeft(new BinaryTreeNode(2));
		pbt.root.setRight(new BinaryTreeNode(3));
		pbt.root.left.setLeft(new BinaryTreeNode(4));
		pbt.root.left.setRight(new BinaryTreeNode(5));
		pbt.root.right.setLeft(new BinaryTreeNode(6));
		pbt.root.right.setRight(new BinaryTreeNode(8));
		//pbt.printPath(pbt.root);
		ArrayList<Integer> result = pbt.preOrderTraversal(pbt.root);
		for(Integer iter : result){
			System.out.println(iter);
		}
	} 

	ArrayList<Integer> preOrderTraversal(BinaryTreeNode root){
		ArrayList<Integer> res = new ArrayList<Integer>();
		if(root == null){
			return res;
		}
		Stack<BinaryTreeNode> s = new Stack<BinaryTreeNode>();
		s.push(root);
		while(!s.isEmpty()){
			BinaryTreeNode tmp = s.pop();
			res.add(tmp.data);
			if(tmp.right != null){
				s.push(tmp.right);
			}
			if(tmp.left != null ){
				s.push(tmp.left);
			}
		}
		return res;
	}


/*
void printPath(BinaryTreeNode node){
		int[] path = new int[100];
		int pathLen = 0;
		printPathRec(node,path,pathLen);
	}

	void printPathRec(BinaryTreeNode node, int[] path, int pathLen){
		if(node == null){ //if node is null
			return;
		}
	
		path[pathLen++] = node.data;

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
*/
}


