package com.xworkz.delegatecontact.servies.tposervice;

import com.xworkz.delegatecontact.dto.EventDTO;

import java.util.List;

public interface TpoService {
    boolean tpoLoginPortal(String email, String loginCode);

    List<EventDTO> getAssignedEvents(String email);

}
