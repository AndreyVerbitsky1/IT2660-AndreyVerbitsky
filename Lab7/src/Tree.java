public class Tree {

	Node root;

	public void addNode(int key, String name) {

		Node newNode = new Node(key, name);
		if (root == null) {

			root = newNode;

		} else {

			Node focusNode = root;

			Node parent;

			while (true) {

				parent = focusNode;

				if (key < focusNode.key) {

					focusNode = focusNode.leftChild;

					if (focusNode == null) {
						parent.leftChild = newNode;
						return;

					}

				} else { 

					focusNode = focusNode.rightChild;
					if (focusNode == null) {
						parent.rightChild = newNode;
						return; 

					}

				}

			}
		}

	}

	public void inOrderTraverseTree(Node focusNode) {

		if (focusNode != null) {

			inOrderTraverseTree(focusNode.leftChild);

			System.out.println(focusNode);

			inOrderTraverseTree(focusNode.rightChild);

		}

	}


	public void postOrderTraverseTree(Node focusNode) {

		if (focusNode != null) {

			postOrderTraverseTree(focusNode.leftChild);
			postOrderTraverseTree(focusNode.rightChild);
			System.out.println(focusNode);

		}

	}

	public Node findNode(int key) {

		Node focusNode = root;

		while (focusNode.key != key) {

			if (key < focusNode.key) {

				focusNode = focusNode.leftChild;

			} else {

				focusNode = focusNode.rightChild;

			}

			if (focusNode == null)
				return null;

		}

		return focusNode;
		}
	class Node {

		int key;
		String name;

		Node leftChild;
		Node rightChild;

		Node(int key, String name) {

			this.key = key;
			this.name = name;

		}

		public String toString() {

			return name + " Node  " + key;
		}
	}
	

public static void main(String[] args) {

		Tree theTree = new Tree();

		theTree.addNode(1, "Student1");

		theTree.addNode(2, "Student2");

		theTree.addNode(3, "Student3");

		theTree.addNode(4, "Student4");

		theTree.addNode(5, "Student5");

		theTree.addNode(6, "Student6");


		System.out.println("In Order");
		theTree.inOrderTraverseTree(theTree.root);
		
		 System.out.println("\nFrom largest to smallest");
		theTree.postOrderTraverseTree(theTree.root);


		System.out.println("\nFind Students by nodes");

		System.out.println(theTree.findNode(1));
		System.out.println(theTree.findNode(2));
		System.out.println(theTree.findNode(3));
		
		System.out.println(theTree.findNode(6));
		System.out.println(theTree.findNode(5));
		System.out.println(theTree.findNode(4));
	}
}