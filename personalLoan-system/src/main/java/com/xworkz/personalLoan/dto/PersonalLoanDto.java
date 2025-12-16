package com.xworkz.personalLoan.dto;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonalLoanDto implements Serializable {

    private String fullName;
    private Long phoneNumber;
    private  String panNumber;
    private Long aaddarNumber;
    private Integer age;
    private Integer creditScore;


//    @PostConstruct
//    void init(){
//        System.out.println("init");
//    }
//    @PreDestroy
//    void destroy(){
//        System.out.println("destroy");
//    }


}
