package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLIstDemo2 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("X");
        al.add("y");
        al.add("z");
        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");

        //To adding all elements
        ArrayList al_dup = new ArrayList();
        al_dup.addAll(al);
        System.out.println(al_dup);

        //To removing all elements
        al_dup.removeAll(al);
        System.out.println(al_dup);

        //Sort ------------Collects.sort();
        System.out.println("Elements in the array list :"+al);
        Collections.sort(al);
        System.out.println("Elements in the array after sorting :" +al);

        //Sort with reverse order
        Collections.sort(al,Collections.reverseOrder());
        System.out.println("Elements in the arrayList after sorting reverse order :"+al);

        //Shuffling elements
        Collections.shuffle(al);
        System.out.println("After shuffling elements are :"+al);



    }
}
