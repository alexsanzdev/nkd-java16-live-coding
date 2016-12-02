package live_coding.funciface;

public class FuncInterfaceExample {

    public static void main(String[] args) {

        CommandGateway gateway = new CommandGateway();

        gateway.submit(
                (times) -> System.out.println("Executing command!!! "+times)
        );

    }
}
