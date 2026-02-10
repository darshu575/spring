package com.xworkz.darshan_xworkzModul.dto.teamDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.Transient;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class TeamDto {
    private int teamId;
    private String teamName;
    private String teamHead;
    private long phone;
    private String email;
@Transient
    private MultipartFile teamProfileImage;

    private String teamProfileImagePath;


}
