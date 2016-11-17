package slides.io.serialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SaveObjectToFile {

    public static void main(String[] args) {

        CarData data = new CarData();
        data.setBrand("Audi");
        data.setModel("A3");
        data.setYear(2010);
        data.setRegistrationId("PWH838");

        File file = new File("/tmp/car.data");
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(data);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
