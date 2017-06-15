package linkedlist;

public class ListIterator {
      private Node current;
      public ListIterator(Node l){
    	  current=l;
      }
      public Node getCurrent(){
    	  return current;
      }
      public Node nextLink(){
    	  current=current.next;
    	  return current; 
      }
}
