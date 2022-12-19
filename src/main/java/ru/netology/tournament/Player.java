package ru.netology.tournament;

public class Player {
    private int id;
    private String name;
    private int strength;
    private static int count = 0;

    public Player(int id, String name, int strength) {
        this.name = name;
        this.strength = strength;
        count++;
        this.id = count;

    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
