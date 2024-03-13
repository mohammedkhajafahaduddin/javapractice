package com.careerit.jfs.iplstats;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class JsonReaderUtil {


    public List<TeamDetails> loadTeamDetails(String fileName) {
        File jsonFile = new File(fileName);
        ObjectMapper objectMapper = new ObjectMapper();


        List<TeamDetails> teams = null;
        try {
            teams = objectMapper.readValue(jsonFile,
                    new TypeReference<List<TeamDetails>>() {
                    });
        } catch (Exception e) {
           e.printStackTrace();
        }
        return teams;
    }
}