package view.comandsMenu;

import view.ConsoleUI;

public class Exit extends Menu{
    public Exit(ConsoleUI consoleUI) {
        super("Выход.", consoleUI);
    }

    public void action() {
        getConsoleUI().exit();
    }
}
