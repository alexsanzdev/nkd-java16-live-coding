package live_coding.exceptions;

public class IllegalPositionException extends RuntimeException {

    private int x;
    private int y;

    public IllegalPositionException(int x, int y) {
        super("Illegal position: (" + x + ":" + y + ")");
        this.x = x;
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

}
