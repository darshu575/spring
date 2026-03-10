package com.xworkz.delegatecontact.servies.delegateservice;

import com.xworkz.delegatecontact.dto.DelegateDto;
import com.xworkz.delegatecontact.dto.RespondDto;

public interface DelegateService {
    boolean saveDelegate(DelegateDto dto);

    void sendEmailToDelegate(int eventId);

    boolean saveRespond(RespondDto respondDto);
}
