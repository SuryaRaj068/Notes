package Collection.LinkedLists;

import java.util.Iterator;
import java.util.LinkedList;

public class ListListDemo {

    ListListDemo lisstlistDemo() {
        return new ListListDemo();
    }

    public static void main(String args[]) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.set(0, 2);
        // [10,1,2,3]
        list.addFirst(10);
        list.addLast(20);
        list.clear();
        list.contains(2);
        list.indexOf(2);
        list.peek();
        list.peekLast();
        list.get(0);
        list.poll();
        // [1,2,3,4,5];
        // 5
        // [1,2,3,4]
        list.pollFirst();
        list.remove(0);
        list.pollLast();
        list.size();
        // [1,2,3,4,2,6]
        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        Iterator it1 = list.descendingIterator();
        while (it1.hasNext()) {
            System.out.println(it1.next());
        }
        list.lastIndexOf(2);
        list.pop();
        list.push(2);
    }

}
