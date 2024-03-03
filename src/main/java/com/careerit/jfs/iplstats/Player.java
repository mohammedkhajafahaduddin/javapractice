package com.careerit.jfs.iplstats;



public class Player {
    public String name;
    public double amount;
    public String role;

    public  Player(){

    }

    public Player(String name, long amount, String role) {
        this.name = name;
        this.amount = amount;
        this.role = role;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                ", role='" + role + '\'' +
                '}';
    }
}
