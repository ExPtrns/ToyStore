package view.comandsMenu;

import view.ConsoleUI;

public class ClearToysList extends Menu {
    public ClearToysList(ConsoleUI consoleUI) {
        super("Очистить список игрушек.", consoleUI);
    }

    public void action() {
        getConsoleUI().clearToysList();
    }
}