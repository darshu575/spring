package com.xworkz.darshan_xworkzModul.util;
public class OtpUtil {

    public static String generateOtp() {
        return String.valueOf((int)(Math.random() * 900000) + 100000);
    }


}

