package live_coding.exceptions;

import java.io.FileNotFoundException;

public class Robot {

    private int positionX;
    private int positionY;

    public void move(int x, int y) {
        if (x < 0 || y < 0)
            throw new IllegalPositionException(x, y);
        positionX = x;
        positionY = y;
    }

    public void moveRight() {
        move(positionX-1, positionY);
    }

    public void loadProfile(String filepath) {
        try {
            loadProfileFromFile(filepath);
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Could not load profile from file");
        }
    }

    private void loadProfileFromFile(String filepath) throws FileNotFoundException {
        if (false)
            throw new FileNotFoundException();
    }

    public void loadProfile(Profile profile)  {

    }

    public void activate() {

    }

    @Override
    public String toString() {
        return "Robot{" +
                "positionX=" + positionX +
                ", positionY=" + positionY +
                '}';
    }
}
