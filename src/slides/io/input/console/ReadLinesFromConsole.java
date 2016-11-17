package slides.io.input.console;

import java.util.Scanner;

public class ReadLinesFromConsole {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Var god mata in något:");
        while (scanner.hasNextLine() ) {
            String line = scanner.nextLine();
            System.out.println("Din senaste inmatning var:\n" + line);
        }

    }
}
