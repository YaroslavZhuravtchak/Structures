package arraylist;

import java.util.*;

/**
 * Created by Yaroslav on 22-May-17.
 */
public class MyArrayList<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, java.io.Serializable{
     Object[] elementData;
    private int size =0;
    private static final int DEFAULT_CAPACITY = 10;
     int capacity;
    public MyArrayList(){
        this.capacity=DEFAULT_CAPACITY;
        elementData = new Object[DEFAULT_CAPACITY];
    }
    public MyArrayList(int capacity){
        this.capacity=capacity;
        elementData = new Object[capacity];
    }
    public void ensureCapacity(int sizeToAdd){
        if((size+sizeToAdd)<=elementData.length)
            ;
        else {
            capacity = (capacity * 3) / 2 + 1;
            Object[] newElementData=new Object[capacity];
            System.arraycopy(elementData,0,newElementData,0, size);
            elementData=newElementData;
        }
    }
    public boolean add(E e){
        ensureCapacity(  1);
        elementData[size++]=e;
        return true;
    }
    public void add(int index, E element) {
        ensureCapacity(1);
        System.arraycopy(elementData, index, elementData, index + 1,size - index);
        elementData[index] = element;
        size++;
    }
    public boolean addAll(Collection<? extends E> c) {
        Object[] a = c.toArray();
        int numNew = a.length;
        ensureCapacity( numNew);
        System.arraycopy(a, 0, elementData, size, numNew);
        size += numNew;
        return numNew != 0;
    }
    public E get(int index) {
        if (index >= size)
            throw new IndexOutOfBoundsException("Index: "+index+", Size: "+size);
        return (E)elementData[index];
    }
    public  int size(){
        return size;
    }
    public E remove(int index){
        E removingValue=(E)elementData[index];
        int numMoved = size - index - 1;
        System.arraycopy(elementData, index + 1, elementData, index, numMoved);
        elementData[--size]= null;
        return removingValue;
    }
    public boolean remove(Object o) {
            for (int index = 0; index < size; index++)
                if (o.equals(elementData[index])) {
                    remove(index);
                    return true;
                }
        return false;
    }
    public Object[] toArray() {
        return Arrays.copyOf(elementData, size);
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public void clear() {
        for (int i = 0; i < size; i++)
            elementData[i] = null;
        size = 0;
    }
}
