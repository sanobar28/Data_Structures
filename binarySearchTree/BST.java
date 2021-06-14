package binarySearchTree;

public class BST{

	public Node root;

	public BST() {
		root = null;
	}

	/**
	 * UC-1 To insert node data in Binary search tree
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

	// minNode() will find out the minimum node
	public Node minNode(Node root) {
		if (root.left != null)
			return minNode(root.left);
		else
			return root;
	}

	// main
	public static void main(String[] args) {

		BST tree = new BST();
		tree.insert(56);
		tree.insert(30);
		tree.insert(70);
		
	}
}
