package live_coding.old;

public class Main {

    public static void main(String[] args) {

        run();

        Name name1 = new Name("Alex");
        Name name2 = name1;
        name1 = null;
        name2 = new Name("Charlie");
    }

    public static void run() {
        Name tempName = new Name("Bianca");

    }

}
