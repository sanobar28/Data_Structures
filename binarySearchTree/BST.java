/**
 * 
 * @author Sanobar Mujawar 
 * Created_On: 13.06.21
 * 
 * Purpose: To create Binary Search Tree to perform its basic operations
 * 
 */

package binarySearchTree;

public class BST {

	public Node root;

	public BST() {
		root = null;
	}

	/**
	 * UC-1 To insert node data in Binary search tree
	 * 
	 * @param data
	 */
	public void insert(int data) {
		// Create a new node
		Node newNode = new Node(data);

		// Check whether tree is empty
		if (root == null) {
			root = newNode;
			return;
		} else {
			// current node point to root of the tree
			Node current = root, parent = null;

			while (true) {
				// parent keep track of the parent node of current node.
				parent = current;

				// If data is less than current's data, node will be inserted to the left of
				// tree
				if (data < current.data) {
					current = current.left;
					if (current == null) {
						parent.left = newNode;
						return;
					}
				}
				// If data is greater than current's data, node will be inserted to the right of
				// tree
				else {
					current = current.right;
					if (current == null) {
						parent.right = newNode;
						return;
					}
				}
			}
		}
	}

	/**
	 * UC-2 Traverse BST to get correct position of node
	 * 
	 * @param node
	 */
	public void insertNodeAt(Node node) {

		// Check whether tree is empty
		if (root == null) {
			System.out.println("Tree is empty");
			return;
		} else {

			if (node.left != null)
				insertNodeAt(node.left);
			System.out.print(node.data + " ");
			if (node.right != null)
				insertNodeAt(node.right);

		}
	}

	// minNode() will find out the minimum node
	public Node minNode(Node root) {
		if (root.left != null)
			return minNode(root.left);
		else
			return root;
	}
	
	
	/**
	 * UC-3 To Recursively search node value in left and right subtrees
	 * @param key
	 * @return
	 */

	boolean search(int key) {
		root = search_Recursive(root, key);
		if (root != null)
			return true;
		else
			return false;
	}

	// recursive insert function
	Node search_Recursive(Node root, int key) {
		// Base Cases: root is null or key is present at root
		if (root == null || root.data == key)
			return root;
		// val is greater than root's key
		if (root.data > key)
			return search_Recursive(root.left, key);
		// val is less than root's key
		return search_Recursive(root.right, key);
	}

	// main
	public static void main(String[] args) {

		BST tree = new BST();
		tree.insert(56);
		tree.insert(30);
		tree.insert(70);
		tree.insert(22);
		tree.insert(40);
		tree.insert(60);
		tree.insert(95);
		tree.insert(11);
		tree.insert(65);
		tree.insert(3);
		tree.insert(16);
		tree.insert(63);
		tree.insert(67);

		System.out.println("Binary search tree after insertion:");
		// Displays the binary tree
		tree.insertNodeAt(tree.root);
		
		boolean search = tree.search(63);
		System.out.println("\nNode 63 found in tree " + search);

	}
}
