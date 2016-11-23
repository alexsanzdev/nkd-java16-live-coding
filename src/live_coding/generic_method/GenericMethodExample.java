package live_coding.generic_method;

import java.io.File;
import java.util.Collections;
import java.util.List;

public class GenericMethodExample {

    public static void main(String[] args) {
        Functions.passThrough(new StringBuilder());

        Collections.singletonList("NKD");

        Number highest = Functions.highestNumber(234, 1200L);
        System.out.println(highest);
    }
}
