package live_coding.pass_by_value;

public class Robot {

    private Position currentPosition = new Position(0, 0);

    public void teleport(Position position) {
        position = new Position(1,2);
        //position.x = 2222;
        this.currentPosition = position;
    }

    public Position getCurrentPosition() {
        return this.currentPosition;
    }

}
