package live_coding.exceptions;

import java.io.FileNotFoundException;

public class ExceptionExample {

    public static void main(String[] args) {

        Robot r2d2 = new Robot();
        r2d2.loadProfile("/tmp/terminator.profile");

        r2d2.activate();

        r2d2.move(100, 300);
        r2d2.move(0, 50);

        try {
            r2d2.moveRight();
        } catch (IllegalPositionException e) {
            System.out.println("Unable to move right to x cordinate:"+e.getX());
        }

        System.out.println(r2d2);
    }

}
