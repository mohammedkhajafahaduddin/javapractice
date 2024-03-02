package com.careerit.jfs.iplcorestats;

import java.util.List;

public interface IplStatsService {

    List<String> teamNames();
    List<Player> playersByTeam(String teamName);
    List<TeamRoleCountDto> roleCountByTeam(String teamName);

}
