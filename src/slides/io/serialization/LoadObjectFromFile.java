package slides.io.serialization;

import java.io.*;

public class LoadObjectFromFile {

    public static void main(String[] args) {

        File file = new File("/tmp/car.data");
        CarData carData = null;
        try {
            FileInputStream is = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(is);
            carData = (CarData) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        if (carData != null) {
            System.out.println("Brand: " + carData.getBrand());
            System.out.println("Model: " + carData.getModel());
            System.out.println("Year: " + carData.getYear());
            System.out.println("Registration id: " + carData.getRegistrationId());
        }

    }
}
