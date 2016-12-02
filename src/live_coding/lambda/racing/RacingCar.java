package live_coding.lambda.racing;

public class RacingCar {

    private String brand;
    private int maxSpeed;
    private Driver driver;

    public RacingCar(String brand, int maxSpeed) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "RacingCar{" +
                "brand='" + brand + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", driver=" + driver +
                '}';
    }
}
