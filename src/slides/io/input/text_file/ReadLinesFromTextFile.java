package slides.io.input.text_file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadLinesFromTextFile {

    public static void main(String[] args) {

        try {
            File file = new File("/tmp/alkemisten.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine() ) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
