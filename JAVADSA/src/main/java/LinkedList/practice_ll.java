package LinkedList;

import LinkedList.LinkedList.Node;

class practice_ll {

	Node head; // head of the list
	 
    /* Linked list Node*/
    class Node {
        int data;
        Node next;
 
        // Constructor to create a new node
        // Next is by default initialized
        // as null
        Node(int d) { data = d; }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		practice_ll list = new practice_ll();

		list.add(4);
		list.add(4);
		list.add(4);
		list.add(4);
		list.add(4);
		list.add(4);
		list.add(4);
		
		list.print();

	}

	private void print() {
		
		Node tnode = head;
		while (tnode != null)
		{
			System.out.print(tnode.data+" ");
			tnode = tnode.next;
		}
		
		
		
	}

	private void add(int new_data) {
		/* 1. Allocate the Node &
		2. Put in the data
		3. Set next as null */
		Node new_node = new Node(new_data);

		/* 4. If the Linked List is empty, then make the
			new node as head */
		if (head == null)
		{
			head = new_node;
			return;
		}

		/* 4. This new node is going to be the last node, so
			make next of it as null */
		new_node.next = null;

		/* 5. Else traverse till the last node */
		Node last = head; 
		while (last.next != null)
			last = last.next;

		/* 6. Change the next of last node */
		last.next = new_node;
		return;
	}

}
