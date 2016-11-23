package live_coding.linked_list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList();
        cars.add("Audi");
        cars.add("BMW");
        cars.add("Aston Martin");
        cars.addFirst("Volvo");
        cars.addLast("Saab");

        LinkedList<String> q = new LinkedList<>();
        q.add("Alex");
        q.add("Micke");
        q.add("Ola");
        q.add("Gabriel");
        q.add("Nicole");

        System.out.println(q.pop());

        System.out.println(cars);
        System.out.println(q);

    }
}
