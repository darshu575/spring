package com.xworkz.darshan_xworkzModul.dto.memberDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.Transient;

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

    @Transient
    private MultipartFile profileImage;

    private String profileImagePath;


}
