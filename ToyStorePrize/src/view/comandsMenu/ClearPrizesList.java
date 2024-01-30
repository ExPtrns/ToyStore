package view.comandsMenu;

import view.ConsoleUI;

public class ClearPrizesList extends Menu {
    public ClearPrizesList(ConsoleUI consoleUI) {
        super("Очистить список призов.", consoleUI);
    }

    public void action() {
        getConsoleUI().clearPrizesList();
    }
}
