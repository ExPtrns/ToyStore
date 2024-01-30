package model;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Lottery {
    private ArrayList<Toy> toyList;
    private ArrayList prizesList;
    private int counter;

    public Lottery() {
        toyList = new ArrayList();
        prizesList = new ArrayList();
        counter = 0;
    }

    public void add(Toy toy) {

        toyList.add(toy);
    }

    public void getPrize() {
        int full = 0;
        int check = 0;
        for (Toy toy : toyList) {
            full += toy.getWeight();
        }
        int random = (int) (Math.random() * full);
        for (int i = 0; i < toyList.size(); i++) {
            check += toyList.get(i).getWeight();
            if (random >= check - toyList.get(i).getWeight() && random < check) {
                prizesList.add(toyList.get(i).getiD());
                prizesList.add(++counter);
            }
        }
    }

    public void getToysList() {
        String answer;
        if (toyList.size() < 1) {
            answer = "Список игрушек пуст.";
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < toyList.size(); i++) {
                sb.append(toyList.get(i));
                if (i == toyList.size() - 1) {
                    sb.append(".");
                } else {
                    sb.append(";\n");
                }
            }
            answer = sb.toString();
        }
        System.out.println(answer);
    }

    public void getPrizesList() {
        if (prizesList.size() < 1) {
            System.out.println("Список призов пуст. Добавьте игрушки для розыгрыша в настройках.");
        } else {
            counter = 0;
//            Collections.sort(prizesList);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < prizesList.size(); i++) {
                if (i % 2 == 0) {
                    for (Toy toy : toyList) {
                        if ((int) prizesList.get(i) == toy.getiD()) {
                            sb.append(++counter);
                            sb.append(". Приз - ");
                            sb.append(toy.getName());
                        }
                    }
                } else {
                    sb.append(". \n\tID победителя - ");
                    sb.append(prizesList.get(i));
                    sb.append(".\n");
                }
            }
            sb.append("Поздравляем победителей!");
            System.out.println(sb);
        }
    }

    public void changeWeight(int iD, int weight) {

        String answer = "По указанному ID ничего не найдено.";
        for (Toy toy : toyList) {
            if (toy.getiD() == iD) {
                toy.setWeight(weight);
                answer = "Изменено.";
            }

        }
        System.out.println(answer);
    }

    public void clearPrizesList() {
        prizesList.clear();
        counter = 0;
        System.out.println("Список призов очищен.");
    }

    public void clearToysList() {
        toyList.clear();
        System.out.println("Список игрушек очищен.");
    }

    public void givePrizeToWinner(int winnerID) {
        if (prizesList.size() > 1) {
            int prize = 0;
            int forDel = 0;
            for (int i = 1; i < prizesList.size(); i += 2) {
                if (winnerID == (int) prizesList.get(i)) {
                    prize = (int) prizesList.get(i - 1);
                    forDel = i;
                }
            }
            String path = "Winners.txt";
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(path, true))) {
                for (Toy toy : toyList) {
                    if (toy.getiD() == prize) {
                        writer.write("Игрушка - \"");
                        writer.write(toy.getName());
                        writer.write("\" выдана игроку с ID ");
                        writer.write(String.valueOf(winnerID));
                        writer.write(".\n");
                        System.out.println("Игрушка - \"" + toy.getName() + "\" выдана игроку с ID " + winnerID);
                        System.out.println("Сохранено в файл." + path);
                    }
                }
                prizesList.remove(forDel);
                prizesList.remove(forDel - 1);

            } catch (IOException e) {
                System.out.println("Данные не записаны, не удалось создать файл.");
            }

        }
        else {
            System.out.println("ID c таким номером не участвовал в лотерее.");
        }
    }
}
