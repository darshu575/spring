package com.xworkz.delegatecontact.servies.delegateservice;

import com.xworkz.delegatecontact.dto.DelegateDto;
import com.xworkz.delegatecontact.dto.RespondDto;

import java.util.List;

public interface DelegateService {
    boolean saveDelegate(DelegateDto dto);

    void sendEmailToDelegate(int eventId, String tpoEmail);

    boolean saveRespond(RespondDto respondDto);

    List<RespondDto> getResponsesByTpo(String tpoEmail);

    int countEmailsSent(String email);

    int countResponses(String email);
}
