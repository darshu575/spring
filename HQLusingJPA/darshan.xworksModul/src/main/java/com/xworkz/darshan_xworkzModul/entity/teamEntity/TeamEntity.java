package com.xworkz.darshan_xworkzModul.entity.teamEntity;

import com.xworkz.darshan_xworkzModul.entity.memberEntity.MemberEntity;
import jdk.internal.dynalink.linker.LinkerServices;
import lombok.*;
import org.w3c.dom.stylesheets.LinkStyle;

import javax.persistence.*;
import java.lang.reflect.Member;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Teams")
public class TeamEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int teamId;
    private String teamName;
    private String teamHead;
    private long phone;
    private String email;

    @OneToMany(mappedBy = "team",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude

    private List<MemberEntity> members;


}
