package slides.io.output.text_file;

import java.io.*;

public class WriteToFile {

    public static void main(String[] args) {

        File file = new File("/tmp/write_to_file.txt");
        OutputStreamWriter writer;
        try {
            FileOutputStream fos = new FileOutputStream(file);
            writer = new OutputStreamWriter(fos, "UTF-8");
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            e.printStackTrace();
            return;
        }

        try {
            writer.write("Dessa rader skrivs till fil\n");
            writer.write("Lägg märke till att du själv\n");
            writer.write("måste lägga till radbrytningar\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
