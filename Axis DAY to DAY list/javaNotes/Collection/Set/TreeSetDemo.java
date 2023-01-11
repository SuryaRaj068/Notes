package Collection.Set;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String args[]) {
        TreeSet<Integer> set = new TreeSet<Integer>();
        set.add(3);
        set.add(4);
        set.add(1);
        set.add(5);
        set.add(0);
        System.out.println(set);
        System.out.println(set.descendingSet());

        // 3
        // 1 4
        // 0 5

        System.out.println(set.headSet(4, true));
        System.out.println(set.subSet(2, 6));

    }

}
