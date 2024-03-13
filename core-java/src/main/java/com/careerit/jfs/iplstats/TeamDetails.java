package com.careerit.jfs.iplstats;

import lombok.Getter;

import java.util.List;

public class TeamDetails {

    public String city;

    public String coach;

    public String homeGround;

    public String name;

    public String label;

    public List<Player> players;

    public  TeamDetails()
    {

    }

    public TeamDetails(String name, String city, String coach, String homeGround, String label, List<Player> players) {
        this.name = name;
        this.city = city;
        this.coach = coach;
        this.homeGround = homeGround;
        this.label = label;
        this.players = players;
    }

    @Override
    public String toString() {
        return "TeamDetails{" +
                "city='" + city + '\'' +
                ", coach='" + coach + '\'' +
                ", homeGround='" + homeGround + '\'' +
                ", name='" + name + '\'' +
                ", label='" + label + '\'' +
                ", players=" + players +
                '}';
    }
}

