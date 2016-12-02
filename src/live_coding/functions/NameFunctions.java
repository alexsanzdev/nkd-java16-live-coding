package live_coding.functions;

public class NameFunctions {

    public static String initials(Name name) {
        return initials(name.getFirstName(), name.getLastName());
    }

    public static String initials(String firstName, String lastName) {
        return firstName.charAt(0) + "." + lastName.charAt(0) + ".";
    }
}
