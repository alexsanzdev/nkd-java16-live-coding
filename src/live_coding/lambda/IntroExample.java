package live_coding.lambda;

import java.util.ArrayList;
import java.util.List;

public class IntroExample {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Robin");
        names.add("Nicole");
        names.add("Oswald");

        //for (String name : names) {
        //    System.out.println(name);
        //}

        //names.forEach(name -> System.out.println(name));
        //names.forEach(System.out::println);
        String name = "Ola";
        Thread thread = new Thread(
            new Runnable() {

                @Override
                public void run() {
                    System.out.println("Hello "+name+"!");
                }
            }
        );
        thread.start();

    }
}
