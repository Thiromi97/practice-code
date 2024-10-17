import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class HashSetPractice {

    /*
    HashSets - No duplications allowed, no insertion order, no multiple nulls allowed,
    allow both heterogeneous and homogeneous data
    cannot access specific element
     */

    public static void main(String[] args) {

        //For Heterogeneous data declaration
        HashSet<Object> hsh = new HashSet<>();
//        Set<Object> hsh1 = new HashSet<>();

        //For Homogeneous data
//        HashSet<Integer> hsh3 = new HashSet<>();

        hsh.add(23);
        hsh.add(null);
        hsh.add("yo");
        hsh.add("true");
        hsh.add(true);
        hsh.add(23);
        hsh.add(90);
        hsh.add(false);
        System.out.println(hsh);
        hsh.remove(true);
        System.out.println(hsh);

        /* way to access specific element in HashSet is
        converting it to ArrayList
         */

        ArrayList<Object> list = new ArrayList<>(hsh);
        System.out.println(list);
        System.out.println(list.get(2));

        //in hashset to read data
        for(Object x:hsh){
            System.out.println(x);
        }
    }
}
