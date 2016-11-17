package slides.io.input.url;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class ReadLinesFromTextFileOnTheInternet {

    public static void main(String[] args) {

        try {
            URL url = new URL("http://www.textfiles.com/programming/abacus.txt");
            Scanner scanner = new Scanner(url.openStream());
            while (scanner.hasNextLine() ) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
