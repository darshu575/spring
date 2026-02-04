package com.xworkz.darshan_xworkzModul.entity.memberEntity;

import com.xworkz.darshan_xworkzModul.entity.teamEntity.TeamEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "members")
public class MemberEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int memberId;
    private String memberName;
    private int age;
    private String gender;
    private String email;
    private long phoneNumber;

    private String profileImagePath; // Store full path of file


    @ManyToOne
    @JoinColumn(name = "teamId")

    private TeamEntity team;
}
