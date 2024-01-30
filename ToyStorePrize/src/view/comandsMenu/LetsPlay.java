package view.comandsMenu;

import view.ConsoleUI;

public class LetsPlay extends Menu{
    public LetsPlay(ConsoleUI consoleUI) {
        super("Провести лоттерею.", consoleUI);
    }

    public void action() {
        getConsoleUI().letsPlay();
    }
}
