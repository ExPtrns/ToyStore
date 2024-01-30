package view.comandsMenu;

import view.ConsoleUI;

public class GetPrizesList extends Menu {
    public GetPrizesList(ConsoleUI consoleUI) {
        super("Посмотреть список призов ожидающих выдачи.", consoleUI);
    }

    public void action() {
        getConsoleUI().getPrizesList();
    }
}
