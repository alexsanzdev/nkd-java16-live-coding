package live_coding.functions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static java.lang.Integer.max;
import static java.lang.Integer.sum;
import static java.lang.String.format;
import static java.lang.String.join;
import static java.util.Collections.singletonList;
import static live_coding.functions.NameFunctions.initials;

public class FunctionExample {

    public static void main(String[] args) {

        String name = "Peder";
        String message = format("Hello %s!!!", name);
        System.out.println(message);

        String listString = join(" ", "Alex", "Oscar", "Cesar");
        System.out.println(listString);

        Integer value = 100;
        printIntegers(singletonList(100));

        System.out.println(sum(3, 4));
        System.out.println(max(106, 43));

        Name oswald = new Name("Oswald", "Broström");
        System.out.println(initials(oswald));

    }

    public static void printIntegers(List<Integer> ints) {

    }
}
