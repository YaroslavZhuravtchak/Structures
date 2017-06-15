package stack;

import java.util.Arrays;

public class MyStack {
	public int[] arr;
	public int pointer;
	
    public MyStack(int size){
    	pointer=-1;
    	arr=new int[size];
    }
    public void push(int i){
    	if(!IsFull())
    	arr[++pointer]=i;
    	else{
    		System.out.println("Can not push it. Steck is full!");
        }
    }
    public int pop(){
    	if(!IsEmpty())
    	return arr[pointer--];
    	else{
    		System.out.println("Can not pop it. Steck is empty!");
    		return -1;
    	}
    }
    public int peek(){
    	if(!IsEmpty())
	   return arr[pointer];
    	else{
    		System.out.println("Can not peek it. Steck is empty!");
    		return -1;
    	}
   }
	public boolean IsEmpty(){
		 return (pointer==-1);
	}
	public boolean IsFull(){
		 return (pointer==arr.length-1);
	}

   public static void main(String[] args) {
	   MyStack steck = new MyStack(10);
         steck.push(10);
         steck.push(10);
         steck.push(10);
         steck.peek();
         steck.pop();
         steck.push(7);
         System.out.println(Arrays.toString(steck.arr));
         System.out.println(steck.pointer);
         System.out.println(steck.pop());
         System.out.println(steck.pointer);
	}
}
