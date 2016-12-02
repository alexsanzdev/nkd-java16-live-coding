package live_coding.lambda.racing;

import live_coding.functions.NameFunctions;

import java.util.ArrayList;
import java.util.List;

import static live_coding.functions.NameFunctions.initials;

public class RacingExample {

    public static void main(String[] args) {
        List<RacingCar> competingRacingCars = getCompetingRacingCars();
        //System.out.println(competingRacingCars);

        competingRacingCars.stream()
                .filter(car -> car.getMaxSpeed() >= 300)
                .sorted((car1, car2) -> Integer.compare(car2.getMaxSpeed(), car1.getMaxSpeed()))
                .limit(3)
                .map(c -> c.getDriver())
                .map(d -> initials(d.getFirstName(), d.getLastName()))
                .forEach(initials -> System.out.printf("Fastest driver: %s!\n", initials));

    }

    public static List<RacingCar> getCompetingRacingCars() {
        RacingCar rc1 = new RacingCar("Mercedez", 320);
        rc1.setDriver(new Driver("Martina", "Levin"));
        RacingCar rc2 = new RacingCar("Ferrari", 430);
        rc2.setDriver(new Driver("Nikolay", "Zinin"));
        RacingCar rc3 = new RacingCar("Porsche", 360);
        rc3.setDriver(new Driver("Sam", "Lindley"));
        RacingCar rc4 = new RacingCar("Lamborghini", 760);
        rc4.setDriver(new Driver("Nicole", "Sandberg"));
        RacingCar rc5 = new RacingCar("BMW", 260);
        rc5.setDriver(new Driver("Robin", "Oscarsson"));

        List<RacingCar> cars = new ArrayList<>();
        cars.add(rc1);
        cars.add(rc2);
        cars.add(rc3);
        cars.add(rc4);
        cars.add(rc5);

        return cars;
    }
}
