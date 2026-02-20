package com.xworkz.darshan_xworkzModul.dao.memberDao;

import com.xworkz.darshan_xworkzModul.entity.memberEntity.MemberEntity;

import java.util.List;

public interface MemberDao {
    boolean saveMember(MemberEntity entity);

    List<MemberEntity> getAllMemberById(int teamId);

    List<MemberEntity> getAllMemberEmails();
}
