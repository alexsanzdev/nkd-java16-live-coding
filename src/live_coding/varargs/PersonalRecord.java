package live_coding.varargs;

public class PersonalRecord {

    private int id;
    private String[] firstNames;
    private String[] lastNames;

    public PersonalRecord(int id) {
        this.id = id;
    }

    public void setFirstNames(String... names) {
        for (String name : names) {
            System.out.printf("Förnamn: %s\n", name);
        }
    }

}
