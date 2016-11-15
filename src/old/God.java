package old;

public class God {

    private static boolean godCreated = false;
    private static God theGod;

    private God() {
        System.out.println("GOD created!");
    }

    static God getInstance() {
        if (theGod == null) {
            theGod = new God();
            return theGod;
        } else {
            return theGod;
        }
    }
}
