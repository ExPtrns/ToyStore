package model;

public class ToyBuilder {
    private int iD = 1;

    public Toy build(String name, int weight) {
        return new Toy(iD++, name, weight);
    }
}
