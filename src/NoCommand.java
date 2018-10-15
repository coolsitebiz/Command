
public class NoCommand implements Command {

    public NoCommand() {

    }

    @Override
    public void execute() {
        System.out.println("No command set");
    }
}
