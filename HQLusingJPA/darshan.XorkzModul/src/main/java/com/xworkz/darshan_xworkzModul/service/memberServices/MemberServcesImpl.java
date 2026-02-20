package com.xworkz.darshan_xworkzModul.service.memberServices;

import com.xworkz.darshan_xworkzModul.dao.memberDao.MemberDao;
import com.xworkz.darshan_xworkzModul.dao.teamDao.TeamDao;
import com.xworkz.darshan_xworkzModul.dto.memberDto.MemberDto;
import com.xworkz.darshan_xworkzModul.entity.memberEntity.MemberEntity;
import com.xworkz.darshan_xworkzModul.entity.teamEntity.TeamEntity;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class MemberServcesImpl implements MemberServices {
    @Autowired
    MemberDao memberDao;
    @Autowired
    private TeamDao teamDao;

    @Override
    public boolean savememberDetails(MemberDto memberDto) {
        System.out.println("Member added Service");
        MemberEntity entity = new MemberEntity();
        BeanUtils.copyProperties(memberDto, entity);

        //this Line Write For ViewMember By Team ID
        TeamEntity team = teamDao.getId(memberDto.getTeamId());
        entity.setTeam(team);

        return memberDao.saveMember(entity);
    }

    @Override
    public List<MemberDto> getAllMemberById(int teamId) {

        List<MemberEntity> entities = memberDao.getAllMemberById(teamId);
        if (entities == null || entities.isEmpty()) {
            return null;
        }
        List<MemberDto> memberDtoList = new ArrayList<>();
        for (MemberEntity entity : entities) {

            MemberDto dto = new MemberDto();
            BeanUtils.copyProperties(entity, dto);
            memberDtoList.add(dto);
        }

        return memberDtoList;
    }

    @Override
    public List<MemberDto> getAllemails() {
        List<MemberEntity > entities=memberDao.getAllMemberEmails();

        if (entities==null || entities.isEmpty()){
            return null;
        }
List<MemberDto> memberDtoEmailList=new ArrayList<>();
        for (MemberEntity entity : entities){
            MemberDto memberDto=new MemberDto();
            BeanUtils.copyProperties(entity,memberDto);
            memberDtoEmailList.add(memberDto);
        }


        return memberDtoEmailList;
    }
}
