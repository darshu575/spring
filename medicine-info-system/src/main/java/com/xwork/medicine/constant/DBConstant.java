package com.xwork.medicine.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor@Getter


public enum DBConstant {
    URL("jdbc:mysql://localhost:3306/springmvc"),
    USERNAME("root"),
    PASSWORD("Darshu@9019");


    private String prop;

    void DBConstant(String prop){
        this.prop=prop;
        System.out.println("Running DBConstant.....");
    }



    public void  close() throws Exception{
        System.out.println("Closed jdbc connection");
    }
}
