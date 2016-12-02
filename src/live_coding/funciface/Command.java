package live_coding.funciface;

@FunctionalInterface
public interface Command {

    public void execute(int times);
}
