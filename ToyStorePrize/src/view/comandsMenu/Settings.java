package view.comandsMenu;

import view.ConsoleUI;

public class Settings extends Menu {
    public Settings(ConsoleUI consoleUI) {
        super("Настроить розыгрыш.", consoleUI);
    }

    public void action() {
        getConsoleUI().settings();
    }
}
