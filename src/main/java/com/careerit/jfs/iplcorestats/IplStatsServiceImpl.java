package com.careerit.jfs.iplcorestats;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IplStatsServiceImpl implements IplStatsService {

    private List<Player> players;

    public IplStatsServiceImpl() {
        players = PlayerDataReaderUtil.loadPlayersData();
    }

    @Override
    public List<String> teamNames() {
        /*List<String> teamNames = new ArrayList<>();
        for (Player player : players) {
            if(!teamNames.contains(player.getTeam())) {
                teamNames.add(player.getTeam());
            }
        }
        return teamNames;*/

        return players.stream()
                .map(Player::getTeam)
                .distinct()
                .toList();
    }

    @Override
    public List<Player> playersByTeam(String teamName) {
        /*List<Player> teamPlayers = new ArrayList<>();
        for (Player player : players) {
            if(player.getTeam().equalsIgnoreCase(teamName)) {
                teamPlayers.add(player);
            }
        }
        return teamPlayers;*/
        return players.stream()
                .filter(player -> player.getTeam().equalsIgnoreCase(teamName))
                .toList();
    }

    @Override
    public List<TeamRoleCountRecord> roleCountByTeam(String teamName) {
        List<Player> teamPlayers = playersByTeam(teamName);
        Map<String,Integer> roleCountMap = new HashMap<>();
        for (Player player : teamPlayers) {
            String role = player.getRole();
            roleCountMap.put(role,roleCountMap.getOrDefault(role,0)+1);
        }
        return getTeamRoleCountRecords(teamName, roleCountMap);
    }

    @Override
    public List<TeamRoleAmountRecord> roleAmountByTeam(String teamName) {
        return null;
    }

    @Override
    public List<TeamAmountRecord> amountByTeam() {
        return null;
    }

    @Override
    public List<TeamCountRecord> playerCountOfEachTeam() {
        return null;
    }

    @Override
    public Map<String, List<Player>> getTopPaidPlayersOfEachTeam() {
        return null;
    }

    @Override
    public List<Player> getTopPaidPlayers() {
        return null;
    }

    @Override
    public List<Player> getTopPaidPlayers(int n) {
        return null;
    }

    private static List<TeamRoleCountRecord> getTeamRoleCountRecords(String teamName, Map<String, Integer> roleCountMap) {
        List<TeamRoleCountRecord> teamRoleCountList =  new ArrayList<>();
        for (Map.Entry<String, Integer> entry : roleCountMap.entrySet()) {
            String roleName = entry.getKey();
            int count = entry.getValue();
            TeamRoleCountRecord teamRoleCountDto = new TeamRoleCountRecord(teamName, roleName, count);
            teamRoleCountList.add(teamRoleCountDto);
        }
        return teamRoleCountList;
    }
}
