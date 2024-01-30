package model;

public class Service {
    private ToyBuilder tb;
    private Lottery lottery;

    public Service() {
       lottery = new Lottery();
       tb = new ToyBuilder();
    }

    public void addToy(String name,int weight) {
        Toy toy = tb.build(name,weight);
        lottery.add(toy);
    }

    public void getPrize(int count){
        for (int i = 0; i < count; i++) {
            lottery.getPrize();
        }
        lottery.getPrizesList();
    }
    public void changeWeight(int iD,int weight){
        lottery.changeWeight(iD,weight);
    }

    public void clearPrizesList() {
        lottery.clearPrizesList();
    }

    public void getPrizesList() {
        lottery.getPrizesList();
    }

    public void clearToysList() {
        lottery.clearToysList();
    }

    public void getToysList() {
        lottery.getToysList();
    }

    public void givePrizeToWinner(int winnerID) {
        lottery.givePrizeToWinner(winnerID);
    }
}
