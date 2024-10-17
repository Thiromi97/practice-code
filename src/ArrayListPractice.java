import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPractice {
    /*
    ArrayList - Duplicates allowed, multiple nulls allowed, Have an insertion order,
    Allowed both heterogeneous and homogeneous data
    Difference from Arrays - Arrays are in fixed size and only allowed
    homogeneous data
     */

    public static void main(String[] args) {

        //List list = new ArrayList<>();

        // for homogeneous data
//        ArrayList <Integer> list2 = new ArrayList<Integer>();
//        List list = new ArrayList<>();

// Declaration for heterogeneous data
        ArrayList <Object> list1 = new ArrayList<>();
        list1.add("A");
        list1.add(9);
        list1.add(null);
        list1.add(78);
        list1.add("thiromi");
        list1.add(true);
        System.out.println(list1);
        System.out.println(list1.size());
        list1.remove(3);
        System.out.println(list1);
        //insertion
        list1.add(3,78);
        System.out.println("my list"+ list1);
        //modify element
        list1.set(3,"Dsa");
        System.out.println(list1);
        System.out.println(list1.get(2));
        System.out.println(list1.isEmpty());

        for(int i=0;i<list1.size();i++){
            System.out.println(list1.get(i));
        }

        for(Object x:list1){
            System.out.println(x);
        }

        ArrayList <Object> list2 = new ArrayList<>();
        list2.add(78);
        list2.add(9);
        list2.add("Dsa");
        list1.removeAll(list2);
        System.out.println(list1);


    }


}
