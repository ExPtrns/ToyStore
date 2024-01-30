package presenter;

import model.Service;
import view.View;

public class Presenter {
    private View view;
    private Service service;

    public Presenter(View view) {
        this.view = view;
        service = new Service();
    }

    public void letsPlay(int choice) {
        service.getPrize(choice);
    }
    public void addToy(String name,int weight) {
        service.addToy(name,weight);
    }

    public void clearPrizesList() {
        service.clearPrizesList();
    }

    public void getPrizesList() {
        service.getPrizesList();
    }

    public void changeWeight(int iD, int weight) {
        service.changeWeight(iD,weight);
    }

    public void clearToysList() {
        service.clearToysList();
    }

    public void getToysList() {
        service.getToysList();
    }

    public void givePrizeToWinner(int winnerID) {
        service.givePrizeToWinner(winnerID);
    }
}
