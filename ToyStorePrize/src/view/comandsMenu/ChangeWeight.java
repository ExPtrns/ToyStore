package view.comandsMenu;

import view.ConsoleUI;

public class ChangeWeight extends Menu {
    public ChangeWeight(ConsoleUI consoleUI) {
        super("Изменить шанс выпадения игрушки.", consoleUI);
    }

    public void action() {
        getConsoleUI().changeWeight();
    }
}