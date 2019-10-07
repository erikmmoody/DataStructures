package tree;

public class BinaryTree {
	
	class Node {
		int id;
		double data;
		Node leftChild;
		Node rightChild;
		
		public Node(int id, double data) {
			this.id = id;
			this.data = data;
			leftChild = null;
			rightChild = null;
			
		}
	}
	
	private Node root;
	
	public Node find(int key) {
		Node curr = root;
		while(curr.id != key) {
			if(curr.id < key)
				curr = curr.leftChild;
			else if(curr.id > key)
				curr = curr.rightChild;
			if(curr == null)
				return null;
		}
		return curr;
	}
	
	public void insert(int id, int data) {
		Node newNode = new Node(id, data);
		Node curr = root;
		if(curr == null) {
			root = newNode;
			return;
		}
		while(true) {
			if(id < curr.id) {
				if(curr.leftChild != null) {
					curr = curr.leftChild;
					continue;
				}
				else {
					curr.leftChild = newNode;
					return;
				}
			}
			else if(id > curr.id) {
				if(curr.rightChild != null) {
					curr = curr.rightChild;
					continue;
				}
				else {
					curr.rightChild = newNode;
					return;
				}
			}
			if(id == curr.id)
				return;
		}
		
	}
	
	public static void main(String args[]) {
		
	}

}
