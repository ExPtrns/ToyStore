package view.comandsMenu;

import view.ConsoleUI;

public class AddToy extends Menu {
    public AddToy(ConsoleUI consoleUI) {
        super("Добавить игрушку.", consoleUI);
    }

    public void action() {
        getConsoleUI().addToy();
    }
}