package slides.io.output.console;

public class PrintToConsole {

    public static void main(String[] args) {

        System.out.print("Hej");
        System.out.print("!");
        System.out.print('\n');
        System.out.println("Det är information");
        System.err.println("Det här är ett felmeddelande");

        String name = "Alex";
        int birthYear = 1979;
        System.out.printf("Jag heter %s och är född %d", name, birthYear);

    }
}
