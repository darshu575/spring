package com.xworkz.coreapp.autowired;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ToString
public class Terminal {

    public Terminal(){
        System.out.println("Defalut constartctor");
    }
@Autowired
    public  Terminal(@Value("1") int id,@Value("srujan") String name, @Value("10 sqrft") String area){
        this.id=id;
        this.name=name;
        this.area=area;



    }
    private int id;
    private  String name;
    private String  area;

}
