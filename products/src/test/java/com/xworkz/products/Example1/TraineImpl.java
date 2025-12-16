package com.xworkz.products.Example1;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class TraineImpl implements Traine{


    @Override
    public void addTraine(int id, String name) {

        System.out.println(id+ " " +name);


    }
}
