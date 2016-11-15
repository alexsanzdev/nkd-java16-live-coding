package encapsulation;

public class Main {

    public static void main(String[] args) {

        Robot terminator = new Robot();

        terminator.setVelocity(-30);
        terminator.move(new Position(300, 400));

        Position currentPosition = terminator.getCurrentPosition();
        System.out.println(terminator.getCurrentPosition());
    }
}
