import java.util.HashMap;

public class HashMapPractice {

    /*
    key and values, keys can not be duplicated
     */

    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"obj");
        map.put(2,"hash");
        map.put(3,"opp");
        map.put(4,"io");
        System.out.println(map);
        map.remove(3);
        System.out.println(map);
        System.out.println(map.get(1));
        //get all keys
        System.out.println(map.keySet());
        System.out.println(map.values());

        //reading values from hash map
        for (String x : map.values()){
            System.out.println(x);
        }
    }
}
