package com.xworkz.darshan_xworkzModul.service.TeamServices;

import com.xworkz.darshan_xworkzModul.dao.teamDao.TeamDao;
import com.xworkz.darshan_xworkzModul.dto.teamDto.TeamDto;
import com.xworkz.darshan_xworkzModul.entity.teamEntity.TeamEntity;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeamServiceImpl implements TeamService {
    @Autowired
    TeamDao teamDao;


    @Override
    public boolean addTeamsAndSave(TeamDto teamDto) {

        TeamEntity teamEntity = new TeamEntity();
        BeanUtils.copyProperties(teamDto, teamEntity);
        return teamDao.save(teamEntity);
    }

    @Override
    public List<TeamDto> getAllteams() {
        System.out.println("get all Teams is Service");
        List<TeamEntity> entities = teamDao.getAllTeams();
        if (entities == null || entities.isEmpty()) {
            return null;
        }
        List<TeamDto> teamDtoList = new ArrayList<>();
        for (TeamEntity entity : entities) {
            TeamDto teamDto = new TeamDto();
            BeanUtils.copyProperties(entity, teamDto);
            teamDtoList.add(teamDto);
        }

        return teamDtoList;
    }


}
