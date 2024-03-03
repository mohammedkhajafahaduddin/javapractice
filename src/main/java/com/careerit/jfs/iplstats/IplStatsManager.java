package com.careerit.jfs.iplstats;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class IplStatsManager {

    public static void main(String[] args) {
    String filename = "/Users/fahaduddin/Desktop/code/javacls/jfs-jan/src/main/resources/teams_data.json";
    JsonReaderUtil iplstats = new JsonReaderUtil();

    List<TeamDetails> teams = iplstats.loadTeamDetails(filename);
        for(TeamDetails team : teams) {
            System.out.println(team);
        }


    }
}
