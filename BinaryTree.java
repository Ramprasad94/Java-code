//practice to print all the paths in a binary tree recursively

class TreeNode{
	int item;
	TreeNode left = null, right = null;
	TreeNode(int val){
		this.item = val;
	}
}

public class BinaryTree{

	TreeNode root; //declare this here so that it is accessible to the printPath function too

	public static void main(String args[]){
		BinaryTree bt = new BinaryTree();
		bt.root = new TreeNode(10);
		bt.root.left = new TreeNode(5);
		bt.root.right = new TreeNode(8);
		bt.root.left.left = new TreeNode(2);
		bt.root.left.right = new TreeNode(6);
		bt.root.right.left = new TreeNode(4);
		bt.root.right.right = new TreeNode(12);
		bt.printPath(bt.root);
	}

	void printPath(TreeNode node){
		int[] path = new int[100];
		int pathLen = 0;
		printPathRec(node,path,pathLen);
	}

	void printPathRec(TreeNode node, int[] path, int pathLen){
		if(node == null){
			return;
		}
		path[pathLen++] = node.item;

		//if leaf node
		if(node.left == null && node.right == null){
			printArray(path,pathLen);
		}
	
		//if non-leaf node, call recursively
		printPathRec(node.left, path, pathLen);
		printPathRec(node.right, path, pathLen);
	}

	void printArray(int[] path, int pathLen){
		for(int i = 0 ; i < pathLen; i++){
			System.out.print(path[i]);
			if(i != pathLen-1){
				System.out.print("->");
			}
		}
	System.out.println("");
	}

}//end of BinaryTree class


