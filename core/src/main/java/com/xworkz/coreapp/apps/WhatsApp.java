package com.xworkz.coreapp.apps;

import org.springframework.stereotype.Component;

@Component
public class WhatsApp {
  public   WhatsApp(){
      System.out.println("whatsapp class invoked");
    }

    private  int whatsAppId;
  private  String wName;

    public int getWhatsAppId() {
        return whatsAppId;
    }

    public void setWhatsAppId(int whatsAppId) {
        this.whatsAppId = whatsAppId;
    }

    public String getwName() {
        return wName;
    }

    public void setwName(String wName) {
        this.wName = wName;
    }

    @Override
    public String toString() {
        return "WhatsApp{" +
                "whatsAppId=" + whatsAppId +
                ", wName='" + wName + '\'' +
                '}';
    }
}
