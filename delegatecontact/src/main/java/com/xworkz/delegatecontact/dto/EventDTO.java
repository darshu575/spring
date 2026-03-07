package com.xworkz.delegatecontact.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.Transient;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EventDTO {
    private int id;
    private String organizerName;
    private String officialEmail;
    private String organizationName;
    private String eventTitle;
    private String eventType;
    private String delegateType;
    private int targetCount;
    private List<String> tpoEmailList;
    private String eventMode;
    private String eventDate;
    private String eventLocation;
    private String meetingLink;
    private String eventDescription;
    @Transient
    private MultipartFile brochure;
    private String brochurePath;
    private Boolean emailSent;
}
