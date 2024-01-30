package view.comandsMenu;

import view.ConsoleUI;

public class Return extends Menu {
    public  Return(ConsoleUI consoleUI) {
        super("Назад.", consoleUI);
    }

    public void action() {
        getConsoleUI().returnBack();
    }
}