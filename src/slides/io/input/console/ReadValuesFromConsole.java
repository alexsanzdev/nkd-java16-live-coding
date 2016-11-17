package slides.io.input.console;

import java.util.Scanner;

public class ReadValuesFromConsole {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Hej!\nVad heter du? ");
        String name = scanner.nextLine();
        System.out.print("Hur gammal är du? ");
        int age = scanner.nextInt();
        System.out.printf("Du heter %s och är %d år gammal.", name, age);

    }
}
