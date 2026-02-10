package com.xworkz.darshan_xworkzModul.dao.teamDao;

import com.xworkz.darshan_xworkzModul.entity.teamEntity.TeamEntity;

import java.util.List;
import java.util.Optional;

public interface TeamDao {
    boolean save(TeamEntity teamEntity);

    List<TeamEntity> getAllTeams();




    TeamEntity getId(int teamId);
}
