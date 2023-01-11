package Collection.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String args[]) {
        HashSet<Integer> set = new HashSet<Integer>();
        LinkedHashSet set1 = new LinkedHashSet<>();
        TreeSet treeset = new TreeSet<>();
        treeset.add(3);
        treeset.add(3);
        set.add(2);
        set.add(2);
        set.add(3);
        set.add(4);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        set.remove(2);
        Iterator it1 = set.iterator();
        while (it1.hasNext()) {
            System.out.println(it1.next());
        }

    }

}
