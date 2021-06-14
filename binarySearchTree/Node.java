package binarySearchTree;

class Node<T> {
	
	T value; // value of node
	Node<T> right, left; // pointer to left and right sub-tree
	
	
	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public Node<T> getRight() {
		return right;
	}

	public void setRight(Node<T> right) {
		this.right = right;
	}

	public Node<T> getLeft() {
		return left;
	}

	public void setLeft(Node<T> left) {
		this.left = left;
	}

	Node(T value) {
		this.value = value;
	}
}
