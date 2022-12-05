package ArrayLists;

import java.util.ArrayList;

public class ArrayListBasic {
    public static void main(String[] args){
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);

        System.out.println(al);
        System.out.println(al.size());
        System.out.println(al.get(2));
//        al.set(2,500);
        al.add(2,500);
        al.remove(3);
        System.out.println(al);

    }
}
