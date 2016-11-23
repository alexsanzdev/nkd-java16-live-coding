package live_coding.hash_map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {

        Map<String, Country> countriesById = new HashMap<>();
        countriesById.put("NO", new Country("NO", "Norge", "Oslo"));
        countriesById.put("CL", new Country("CL", "Chile", "Santiago"));
        countriesById.put("FI", new Country("FI", "Finland", "Helsingfors"));
        countriesById.put("SE", new Country("SE", "Sverige", "Stockholm"));

        countriesById.remove("CL");
        System.out.println(countriesById.containsValue(new Country("NO", "Norge", "Oslo") ));

        for (Country country : countriesById.values()) {
            System.out.println(country);
        }
    }
}
