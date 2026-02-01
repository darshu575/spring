package com.xworkz.darshan_xworkzModul.dto.teamDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class TeamDto {
    private int teamId;
    private String teamName;
    private String teamHead;
    private long phone;
    private String email;


}
