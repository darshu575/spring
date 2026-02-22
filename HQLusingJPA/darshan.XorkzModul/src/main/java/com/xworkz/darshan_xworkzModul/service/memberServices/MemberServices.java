package com.xworkz.darshan_xworkzModul.service.memberServices;

import com.xworkz.darshan_xworkzModul.dto.memberDto.MemberDto;
import com.xworkz.darshan_xworkzModul.entity.memberEntity.MemberEntity;

import java.util.List;

public interface MemberServices {
    boolean savememberDetails(MemberDto memberDto);

    List<MemberDto> getAllMemberById(int teamId);


    List<MemberDto> getAllemails();

    void sendEmailToAllMembers();

    MemberEntity findById(int memberId);

}
