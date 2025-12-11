package com.xworkz.coreapp.apps;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter
@Setter
@ToString
@Component

public class Instragram {


    public Instragram(){
        System.out.println("Defult constractor");
    }
    public  Instragram(int id,String name){
        System.out.println("par constractor");

        this.id=id;
        this.name=name;
    }



    private int id;
    private String name;

}
