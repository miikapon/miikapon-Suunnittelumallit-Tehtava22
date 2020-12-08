package command.command;

public class ScreenDownCommand implements Command {

    private Screen screen;

    public ScreenDownCommand(Screen light) {
        this.screen = light;
    }

    @Override // Command
    public void execute() {
        screen.screenDown();
    }
}
