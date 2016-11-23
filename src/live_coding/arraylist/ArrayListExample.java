package live_coding.arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Alex");
        names.add("Alex");
        names.add("Christian");
        names.add("Linus");
        names.add(1, "Siran");
        names.set(2, "Micke");
        names.add("Alex");
        names.remove("Alex");

        System.out.println(names.size());

        System.out.println(names);
        Iterator<String> it = names.iterator();

        Iterable<String> itr = names;

        for (String name : itr) {
            System.out.println(name);
        }
        for (String name : itr) {
            System.out.println(name);
        }
    }
}
