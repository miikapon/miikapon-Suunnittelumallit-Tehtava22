
package command.command;


public class Main {
    public static void main(String[] args) {
        Screen screen = new Screen();
        Command ScreenUp = new ScreenUpCommand(screen);
        Command ScreenDown = new ScreenDownCommand(screen);
        WallButton upBtn = new WallButton(ScreenUp);
        WallButton downBtn = new WallButton(ScreenDown);
        upBtn.push();
        downBtn.push();
    }
    
}
