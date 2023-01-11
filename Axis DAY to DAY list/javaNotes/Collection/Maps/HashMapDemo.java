package Collection.Maps;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapDemo {
    public static void main(String args[]) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(0, "surya");
        map.put(1, "sharath");
        map.put(2, "mohan");
        map.putIfAbsent(3, "rakesh");
        map.remove(2);
        // map.clear();
        map.replace(3, "shree");
        System.out.println(map.get(3));
        for (Entry<Integer, String> m : map.entrySet()) {
            System.out.println(m.getKey() + "  : " + m.getValue());
        }
    }

}
