package com.xworkz.products.Example1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Institute {
    @Autowired
  private   Traine traine;


    @Value("1")
    private int id;
    @Value("X-workz")
    private String name;

public void addInstitution(){
    System.out.println(traine.getId);
}




}
