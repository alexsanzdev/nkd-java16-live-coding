package live_coding.pass_by_value;

public class PassByValueExample {

    public static void main(String[] args) {

        Robot t800 = new Robot();
        System.out.println(t800.getCurrentPosition());

        Position newPosition = new Position(200, 500);
        t800.teleport(newPosition);
        System.out.println(newPosition);
        //System.out.println(t800.getCurrentPosition());

    }
}
