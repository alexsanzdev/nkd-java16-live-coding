package live_coding.hash_set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetExample {

    public static void main(String[] args) {

        Set<String> uniqueLastNames = new HashSet<>();
        //List<String> uniqueLastNames = new ArrayList<>();
        uniqueLastNames.add("Sanchez");
        uniqueLastNames.add("Blom");
        uniqueLastNames.add("Acosta");
        uniqueLastNames.add("Acosta");
        uniqueLastNames.add("Perez");
        uniqueLastNames.add("Levin");
        uniqueLastNames.add("Cirverius");
        uniqueLastNames.add("Nilsson");
        uniqueLastNames.add("Cirverius");

        System.out.println(uniqueLastNames);

    }
}
