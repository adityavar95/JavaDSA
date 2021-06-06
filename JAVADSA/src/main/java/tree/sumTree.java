package tree;

import tree.BinaryTree.Node;

public class sumTree {
	static Node root;

	static class Node {
		int key;
		Node left;
		Node right;

		Node(int d) {
			this.key = d;
			left = right = null;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		root = new Node(10);
		root.left = new Node(11);
		root.left.left = new Node(7);
		root.right = new Node(9);
		root.right.left = new Node(15);
		root.right.right = new Node(8);

	inorder(root);
		
//		int sum = findsum(root);
//		System.out.println(sum);

//		boolean a = findNode(root, 9);

//		if (a)
		System.out.println("YES");
//		else
//			System.out.println("NO");
		
		
		Node node=reversebinary(root);
		
		inorder(node);
	
	
}
	
	/* Inorder traversal of a binary tree*/
    static void inorder(Node root)
    {
        if (root == null)
            return;
 
        inorder(root.left);
        System.out.print(root.key + " ");
        inorder(root.right);
    }

	private static Node reversebinary(Node root) {
		
		if(root==null) {
			return root;
		}
		
		Node left=reversebinary(root.left);
		Node right=reversebinary(root.right);
		
		root.left=right;
		root.right=left;
		
		
		return root;
		
		
	}

	private static boolean findNode(Node node, int key) {
		if (node == null)
			return false;

		if (node.key == key)
			return true;

		// then recur on left sutree /
		boolean res1 = findNode(node.left, key);

		// node found, no need to look further
		if (res1)
			return true;

		// node is not found in left,
		// so recur on right subtree /
		boolean res2 = findNode(node.right, key);

		return res2;
	}

	// Recursive function to insert a key into a BST
	public static Node insert(Node root, int key) {
		// if the root is null, create a new node and return it
		if (root == null) {
			return new Node(key);
		}

		// if the given key is less than the root node, recur for the left subtree
		if (key < root.key) {
			root.left = insert(root.left, key);
		}

		// if the given key is more than the root node, recur for the right subtree
		else {
			root.right = insert(root.right, key);
		}

		return root;
	}

	private static int findsum(Node root) {

		if (root == null) {
			return 0;
		}
		return root.key + findsum(root.left) + findsum(root.right);

	}

	
	
}
