package com.xworkz.coreapp.autowired;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component("airport")
@ToString
public class Aiport {

    @Autowired
    Terminal terminal;

    public Aiport() {
        System.out.println("default construction");
    }
    @Autowired
    public Aiport(@Value("1") int airportId, @Value("darshu") String airPortName,@Value("12 sqrft") String airportarea){
         this.airportId=airportId;
         this.airPortName=airPortName;
         this.airportarea=airportarea;


    }

    private int airportId;
    public  String  airPortName;
    public String  airportarea;


}
