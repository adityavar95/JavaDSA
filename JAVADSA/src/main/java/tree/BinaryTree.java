package tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

	static Node root;
	
	
	/* A binary tree node has key, pointer to
    left child and a pointer to right child */
    static class Node {
        int key;
        Node left, right;
 
        // constructor
        Node(int key)
        {
            this.key = key;
            left = null;
            right = null;
        }
    }

    /* Inorder traversal of a binary tree*/
    static void inorder(Node temp)
    {
        if (temp == null)
            return;
 
        inorder(temp.left);
        System.out.print(temp.key + " ");
        inorder(temp.right);
    }
    
    /* Inorder traversal of a binary tree*/
    static void preorder(Node temp)
    {
        if (temp == null)
            return;
 
        
        System.out.print(temp.key + " ");
        inorder(temp.left);
        inorder(temp.right);
    }
    
    /* Inorder traversal of a binary tree*/
    static void postorder(Node temp)
    {
        if (temp == null)
            return;
 
        inorder(temp.left);
        inorder(temp.right);
        System.out.print(temp.key + " ");
    }

    public static void levelOrderQueue(Node root) {
		Queue<Node> q = new LinkedList<Node>();
		if (root == null)
			return;
		q.add(root);
		while (!q.isEmpty()) {
			Node n = (Node) q.remove();
			System.out.print(" " + n.key);
			if (n.left != null)
				q.add(n.left);
			if (n.right != null)
				q.add(n.right);
		}
	}
    
	public static void main(String[] args) {
		 root = new Node(10);
	        root.left = new Node(11);
	        root.left.left = new Node(7);
	        root.right = new Node(9);
	        root.right.left = new Node(15);
	        root.right.right = new Node(8);
		
		System.out.println(
	            "Inorder traversal before insertion:");
	        inorder(root);
	        System.out.println("");
	        System.out.println(
		            "preorder traversal before insertion:");
	        preorder(root);
	        System.out.println("");
	        System.out.println(
		            "postorder traversal before insertion:");
	        postorder(root);
	        
	        System.out.println("");
	        System.out.println("Breadth First Search : ");
			levelOrderQueue(root);
	        

	}

}
