package slides.io.output.text_file;

import java.io.*;

public class PrintToFile {

    public static void main(String[] args) {

        File file = new File("/tmp/print_to_file.txt");
        PrintWriter writer;
        try {
            writer = new PrintWriter(file, "UTF-8");
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            e.printStackTrace();
            return;
        }

        writer.print("Yo!");
        writer.print('\n');
        writer.println("Läget?");

        String name = "Alex";
        int birthYear = 1979;
        writer.printf("Jag heter %s och är född %d", name, birthYear);

        writer.close();

    }
}
