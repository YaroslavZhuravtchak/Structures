package linkedlist;

public class MyLinkedList<E> {
	public Node<E> first;
	public Node<E> last;

	public void addFirst(Node l){
		if(first==null){
			first=l;
			last=l;
		}
		else{
			first.prev=l;
			l.next=first;
			first=l;
		}
	}
	public void addLast(Node l){
		if(first==null){
			first=l;
			last=l;
		}
		else{
			last.next=l;
			l.prev=last;
			last=l;
		}
	}
	public void deleteLast(){
		if(first==null){
			throw new RuntimeException();
		}
		else{
		last=last.prev;
		last.next=null;
		}
	}
	public void deleteFirst(){
		if(first==null){
			throw new RuntimeException();
		}
		else{
			first=first.next;
			first.prev=null;
		}
	}
	public void display(){
		Node current = first;
		while(current!=null){
			System.out.print(current.id+" ");
			current=current.next;
		}
		System.out.println();
	}
	public void displayOut(){
		Node current = last;
		while(current!=null){
			System.out.print(current.id+" ");
			current=current.prev;
		}
		System.out.println();
	}
	public void delete(E key){
		Node current =first;
		if(((E)first.id).equals(key)){
			deleteFirst();
			return;
		}
		else if(last.id==key){
			deleteLast();
			return;
		}
		else{
		while(current!=null){
			if(current.id==key){
				current.prev.next=current.next;
				current.next.prev=current.prev;
				return;
			}
			current=current.next;
		}
		}
		throw new RuntimeException();
	}
	public Node find(E key){
		Node current =first;
		while(current!=null){
			if(current.id.equals(key)) return current;
			current=current.next;
		}
		throw new RuntimeException();
	}
	public ListIterator getIterator(){
		return new ListIterator(first);
	}
	public static void main(String[] args) {
		MyLinkedList<String> myList= new MyLinkedList<String>();
		myList.addLast(new Node<String>("ggg"));
		myList.addLast(new Node<String>("yy"));
		myList.addLast(new Node<String>("kk"));
		myList.addLast(new Node<String>("gvg"));
		myList.addFirst(new Node<String>("fcf"));
		myList.display();
		myList.displayOut();
		myList.delete("kk");
		myList.display();
		myList.displayOut();
	}
}
