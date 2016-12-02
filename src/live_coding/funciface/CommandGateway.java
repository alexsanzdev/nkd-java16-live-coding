package live_coding.funciface;

public class CommandGateway {

    public void submit(Command command) {
        System.out.println("Command accepted");
        command.execute(17);
        System.out.println("Command executed succesfully");
    }
}
