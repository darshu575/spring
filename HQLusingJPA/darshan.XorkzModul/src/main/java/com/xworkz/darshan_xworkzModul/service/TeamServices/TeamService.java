package com.xworkz.darshan_xworkzModul.service.TeamServices;

import com.xworkz.darshan_xworkzModul.dto.teamDto.TeamDto;
import com.xworkz.darshan_xworkzModul.entity.teamEntity.TeamEntity;

import java.util.List;

public interface TeamService {
    boolean addTeamsAndSave(TeamDto teamDto);

    List<TeamDto> getAllteams();



}
