package binarytree;

public class Tree {
	public Node root;
	
	public Node find(int key){
		Node current = root;
		while(true){
		if(current==null) return null;
		if(key==current.data) return current;
		else if(key<current.data) current =current.leftChild;
		else if(key>current.data) current =current.rightChild;
		}
	}
	public void insert(int key){
	Node node = new Node(key);
	if(root==null)
		root=node;
	else{
		Node current=root;
		Node parent;
		while(true){
			parent=current;
			if(key<current.data){
				current=current.leftChild;
				if(current==null){
					parent.leftChild=node;
					return;
				}	
			}
			else{
				current=current.rightChild;
				if(current==null){
					parent.rightChild=node;
					return;
				}
			}
		}
	}
	}
	public void inOrder(Node root){
		if(root!=null){
		inOrder(root.leftChild);
		System.out.println(root.data);
		inOrder(root.rightChild);
		}
	}
	public Node min(){
		Node current, last=null;
		current=root;
		while(current!=null){
			last=current;
			current=current.leftChild;
		}
		return last;
	}
	public Node max(){
		Node current, last=null;
		current=root;
		while(current!=null){
			last=current;
			current=current.rightChild;
		}
		return last;
	}
}
