package com.xworkz.darshan_xworkzModul.dto.memberDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class MemberDto {

    private int memberId;
    private String memberName;
    private int age;
    private String gender;
    private String email;
    private long phoneNumber;

    private int teamId;


}
