package arraylist;

import java.util.ArrayList;

/**
 * Created by Yaroslav on 21-May-17.
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("Hello world");
        MyArrayList<String> mylist = new MyArrayList<>();
        ArrayList<String> arrayList= new ArrayList<>();
        arrayList.add("arr");
        arrayList.add("arr");
        arrayList.add("arr");
        arrayList.add("arr");

        mylist.add("A");
        mylist.add("B");
        mylist.add("C");
        mylist.add("D");
        mylist.add("HH");
        mylist.add("GG");
        mylist.add("pH");
        mylist.add("du");
        mylist.add("fu");
        mylist.add("vi");
        mylist.add("I");
        mylist.add("fff");
        mylist.add("I");
        mylist.add("ddd");
        mylist.add("qqq");
        mylist.add("vv");
        mylist.remove(3);
        mylist.add(5,"55");
        mylist.add(5,"55");
        mylist.remove("fff");
        mylist.addAll(arrayList);

        System.out.println(mylist.capacity);
        System.out.println(mylist.size());
        System.out.println(mylist);

        mylist.clear();

        System.out.println(mylist.capacity);
        System.out.println(mylist.size());
        System.out.println(mylist);
    }
}
