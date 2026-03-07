package com.xworkz.delegatecontact.util;

public class CodeGeneratorUtil {
    public static  String generateCode() {
        return "DCS" + (int)(Math.random()*9000 + 1000);
    }
}
