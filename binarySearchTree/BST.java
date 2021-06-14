package binarySearchTree;

public class BST<T extends Comparable<T>> {

	Node<T> root;
	Node<T> left;
	Node<T> right;

	/**
	 * UC-1 This method inserts new node in tree
	 * 
	 * @param value
	 */
	public void insert(T value) {
		if (isEmpty())
			root = new Node<T>(value); // root node added
	}

	/**
	 * Checks if tree is empty or not
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		return (root == null) ? true : false;
	}

	
	private void printTree(Node<T> node) {
		System.out.println("Node is " + node.getValue());
		if (node.getValue() != null)
			printTree(node.getNext());
	}

	public void show() {
		printTree(root);
	}

	//main
	public static void main(String[] args) {

		BST<Integer> tree = new BST<>();
		tree.insert(56);
		tree.insert(30);
		tree.insert(70);
		
		tree.show();

	}
}