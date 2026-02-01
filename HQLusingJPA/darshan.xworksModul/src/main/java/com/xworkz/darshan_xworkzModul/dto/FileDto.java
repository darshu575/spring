package com.xworkz.darshan_xworkzModul.dto;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import javax.mail.Multipart;
@Data
public class FileDto {

    private String name;
    public MultipartFile file;


}
