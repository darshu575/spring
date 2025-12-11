package com.xworkz.coreapp.internet;

import org.springframework.stereotype.Component;

@Component
public class Internet {

    public Internet(){
        System.out.println("internet class invloked");


    }
    private int internetID;
    private  String name;

    public void setInternetID(int internetID) {
        this.internetID = internetID;
    }

    public int getInternetID() {
        return internetID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Internet{" +
                "internetID=" + internetID +
                ", name='" + name + '\'' +
                '}';
    }
}
