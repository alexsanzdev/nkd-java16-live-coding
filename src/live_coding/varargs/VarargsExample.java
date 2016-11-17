package live_coding.varargs;

public class VarargsExample {

    public static void main(String... args) {

        PersonalRecord record = new PersonalRecord(872389289);
        record.setFirstNames(args);
    }
}
