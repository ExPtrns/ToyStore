package view;

import presenter.Presenter;
import java.util.Scanner;

public class ConsoleUI implements View {
    private Scanner scanner;
    private Presenter presenter;
    private MainMenu menu;
    private SubMenu subMenu;

    boolean fl1;
    boolean fl2;
    public ConsoleUI() {
        scanner = new Scanner(System.in);
        presenter = new Presenter(this);
        menu = new MainMenu(this);
        subMenu = new SubMenu(this);
    }
    @Override
    public void start() {
        fl1 = true;
        System.out.println("Беспроигрышная лоттерея!");
        while (fl1) {
            System.out.println("\nГлавное меню:");
            System.out.println(menu.menuElements());
            String choice = scanner.nextLine();
            try {
                int correctChoice = Integer.parseInt(choice);
                System.out.println(correctChoice);
                menu.action(correctChoice);
            } catch (NumberFormatException e) {
                System.out.println("Такой операции не существует.");
                ;
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Доступно только 3 операции.");
            }
        }

    }
    public void letsPlay() {
        System.out.println("Укажите количество участников:");
        String choice = scanner.nextLine();
            try {
                int correctChoice = Integer.parseInt(choice);
                presenter.letsPlay(correctChoice);
            } catch (NumberFormatException e) {
                System.out.println("Это не число.");
            }
    }
    public void settings() {
        fl2 = true;
        while (fl2) {
            System.out.println("\nНастройки розыгрыша:");
            System.out.println(subMenu.subMenuElements());
            String choice = scanner.nextLine();
            try {
                int correctChoice = Integer.parseInt(choice);
                System.out.println(correctChoice);
                subMenu.action(correctChoice);
            } catch (NumberFormatException e) {
                System.out.println("Такой операции не существует.");
                ;
            } catch (IndexOutOfBoundsException e) {
                System.out.println("В меню "+ subMenu.size() +" вариантов.");
            }
        }
    }
    public void addToy() {
//        presenter.addToy("Конструктор",20);
//        presenter.addToy("Кукла",20);
//        presenter.addToy("Воздушный шар",60);
        System.out.println("Введите наименование игрушки:");
        String name = scanner.nextLine();
        System.out.println("Укажите шанс выпадения игрушки:");
        String chance = scanner.nextLine();
        try{
            int weight = Integer.parseInt(chance);
            presenter.addToy(name,weight);
        } catch (NumberFormatException e) {
            System.out.println("Это не число.");
        }
    }
    public void returnBack() {
        fl2 = false;
    }

    public void changeWeight() {
        presenter.getToysList();
        int ID, weight;
        System.out.println("Введите ID игрушки:");
        String iD = scanner.nextLine();
        try{
            ID = Integer.parseInt(iD);
            System.out.println("Укажите шанс выпадения игрушки:");
            String w = scanner.nextLine();
            try{
                weight = Integer.parseInt(w);
                presenter.changeWeight(ID,weight);
            } catch (NumberFormatException e) {
                System.out.println("Шанс должен быть числом.");
            }
        } catch (NumberFormatException e) {
            System.out.println("ID - введено не число.");
        }
    }

    @Override
    public void printAnswer(String answer) {
        System.out.println(answer);
    }
    public void exit() {
        System.out.println("До свидания!");
        fl1 = false;
    }

    public void clearPrizesList() {
        presenter.clearPrizesList();
    }

    public void getPrizesList() {
        presenter.getPrizesList();
    }

    public void givePrizeToWinner() {
        getPrizesList();
        int winnerID;
        System.out.println("Укажите ID победителя:");
        String iD = scanner.nextLine();
        try{
            winnerID = Integer.parseInt(iD);
            presenter.givePrizeToWinner(winnerID);
        } catch (NumberFormatException e) {
            System.out.println("ID - введено не число.");
        }

    }

    public void getToysList() {
        presenter.getToysList();
    }

    public void clearToysList() {
        presenter.clearToysList();
    }
}