package view.comandsMenu;

import view.ConsoleUI;

public class GivePrizeToWinner extends Menu {
    public GivePrizeToWinner(ConsoleUI consoleUI) {
        super("Выдать приз победителю.", consoleUI);
    }

    public void action() {
        getConsoleUI().givePrizeToWinner();
    }
}
