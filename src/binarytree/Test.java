package binarytree;

public class Test {
	public static void main(String[] args) {
		Tree tree = new Tree();
		tree.insert(10);
		tree.insert(12);
		tree.insert(7);
		tree.insert(45);
		tree.insert(1);
		tree.insert(33);
		tree.insert(5);
		tree.insert(3);
		tree.insert(1);
		//System.out.println(tree.find(5).rightChild.data);
		tree.inOrder(tree.root);
		System.out.println();
		System.out.println(tree.min().data);
		int x=10;
		if(51 < x ){	
		}
	}
}
