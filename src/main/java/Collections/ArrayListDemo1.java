package Collections;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList(); //Heterogeneous Data declaration
//ArrayList <String> al = new ArrayList <String>();//Homogeneous
        al.add("kshitija");
        al.add(2);
        al.add('A');
        al.add(true);
        al.add("Gaikwad");

        System.out.println(al);//It stores all types of Data

        //Size()
        System.out.println(al.size());

        //remove()
        al.remove(4);//By providing specific Index
        al.remove("Gaikwad");//By Providing actual value
        System.out.println(al);

        //Insert a new element
        al.add(2,"z");//By providing value with index
        System.out.println(al);

        //retrieve specific element
        System.out.println(al.get(2));

        //To change element/replace
        al.set(2,"sainath");
        System.out.println("After replacing element :"+al);

        //Search element
        System.out.println(al.contains("kshitija")); //It will return true or false

        //isEmpty()
        System.out.println(al.isEmpty());//It will return true or false

        //to read Data there are two ways -

        //for loop -------------->
        System.out.println("Reading elements using For loop");
        for(int i=0; i<al.size(); i++){
            System.out.println(al.get(i));
        }

        //foreach loop ------------>
        System.out.println("Reading elements using foreach loop");
        for(Object e:al){ //When there is Heterogeneous data is present use Object Type so it will store all types of data
            System.out.println(e);
        }

        //iterator()
        System.out.println("Reading element using iterator method");
        Iterator it = al.iterator();
        while ((it.hasNext())){
            System.out.println(it.next());
        }





    }
}
