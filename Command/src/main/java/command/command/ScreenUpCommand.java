package command.command;

public class ScreenUpCommand implements Command {

    private Screen screen;

    public ScreenUpCommand(Screen light) {
        this.screen = light;
    }

    @Override // Command
    public void execute() {
        screen.screenUp();
    }
}
