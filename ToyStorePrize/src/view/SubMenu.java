package view;

import view.comandsMenu.*;

import java.util.ArrayList;
import java.util.List;

public class SubMenu {
    private List<Menu> commandsMenu;

    public SubMenu(ConsoleUI consoleUI) {
        commandsMenu = new ArrayList<>();
        commandsMenu.add(new AddToy(consoleUI));
        commandsMenu.add(new ChangeWeight(consoleUI));
        commandsMenu.add(new GetToysList(consoleUI));
        commandsMenu.add(new ClearToysList(consoleUI));
        commandsMenu.add(new Return(consoleUI));
    }

    public String subMenuElements() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < commandsMenu.size(); i++) {
            stringBuilder.append(i + 1);
            stringBuilder.append(". ");
            stringBuilder.append(commandsMenu.get(i).getDescription());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public void action(int choice) {
        Menu menu = commandsMenu.get(choice - 1);
        menu.action();
    }

    public int size() {
        return commandsMenu.size();
    }
}