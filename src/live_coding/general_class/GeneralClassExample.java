package live_coding.general_class;

import java.io.File;

public class GeneralClassExample {

    public static void main(String[] args) {
        String name = "Alex";
        File fileName = new File("/tmp/myfile");

        GenericDataContainer<String> container = new GenericDataContainer<>();
        container.put(name);

        passTheWrappedString(container);
    }

    public static void passTheWrappedString(GenericDataContainer<String> container) {
        String name = container.get();
        System.out.println(name);
    }
}

