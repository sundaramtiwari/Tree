package main;

public class PrintTopView {

	public static void main(String[] args) {
		Node root = populateBinaryTree();

		printTopView(root, null, true);
	}

	private static void printTopView(Node root, Node parent, boolean flag) {
		if (root != null) {
			if (flag) {
				// Print Left sub-tree
				if (root.getLeft() != null) {
					printTopView(root.getLeft(), root, true);
				}
			} else {
				// If this is root node, print Right sub-tree
				if (root.getRight() != null) {
					System.out.print(root.getData() + " ");
					printTopView(root.getRight(), root, false);
					return;
				}
			}
			System.out.print(root.getData() + " ");
			if (parent == null) {
				printTopView(root.getRight(), root, false);
			}
		}
	}

	private static Node populateBinaryTree() {
		Node L2R1 = new Node(6);
		Node L2 = new Node(10, null, L2R1);
		Node L1 = new Node(1, L2, null);

		Node R2L1 = new Node(5);
		Node R2 = new Node(11, R2L1);
		Node R1 = new Node(2, null, R2);

		Node root = new Node(5, L1, R1);
		return root;
	}

}

class Node {
	private Object data;
	private Node left;
	private Node right;

	public Node() {
		super();
	}

	public Node(Object data) {
		this.data = data;
	}

	public Node(Object data, Node left, Node right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}

	public Node(Object data, Node left) {
		this.data = data;
		this.left = left;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

}