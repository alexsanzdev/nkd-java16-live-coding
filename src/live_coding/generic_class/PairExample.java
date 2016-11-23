package live_coding.generic_class;

public class PairExample {

    public static void main(String[] args) {
        Pair<String, Integer> streetAddress = new Pair<>("Tomtebodavägen", 3);
        System.out.println(streetAddress.getLeft());
        System.out.println(streetAddress.getRight());
    }
}
