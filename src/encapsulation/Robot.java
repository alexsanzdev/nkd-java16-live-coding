package encapsulation;

public class Robot {

    private Position currentPosition;
    private int velocity;

    public Robot() {
        currentPosition = new Position(0, 0);
        velocity = 0;
    }

    public void move(Position position) {
        currentPosition = position;
    }

    public Position getCurrentPosition() {
        return currentPosition;
    }

    public void setVelocity(int velocity) {
        if (velocity >= 0) {
            this.velocity = velocity;
        } else {
            throw new IllegalArgumentException("Illegal velocity value");
        }
    }
}
