package model;

public class Toy {
    private int iD;
    private String name;
    private Integer weight;

    public Toy(int iD, String name, int weight) {
        this.iD = iD;
        this.name = name;
        this.weight = weight;
    }

    public int getiD() {
        return iD;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "ID - " + getiD() + ", " + "Name - " + getName() + ", " + "Chance - " + getWeight() + "%";
    }

}
