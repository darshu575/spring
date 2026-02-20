package com.xworkz.darshan_xworkzModul.service.memberServices;

import com.xworkz.darshan_xworkzModul.dto.memberDto.MemberDto;

import java.util.List;

public interface MemberServices {
    boolean savememberDetails(MemberDto memberDto);

    List<MemberDto> getAllMemberById(int teamId);


    List<MemberDto> getAllemails();
}
