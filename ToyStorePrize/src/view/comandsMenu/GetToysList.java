package view.comandsMenu;

import view.ConsoleUI;

public class GetToysList extends Menu {
    public GetToysList(ConsoleUI consoleUI) {
        super("Посмотреть список игрушек участвующих в лоттерее.", consoleUI);
    }

    public void action() {
        getConsoleUI().getToysList();
    }
}