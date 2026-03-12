package com.xworkz.delegatecontact.servies;

import java.util.List;

public interface AdminService {
    boolean validateAdmin(String email, String password);

    int getTotalEvents();

    int getTotalDelegates();

    int getTotalResponses();

    List<Object[]> getEventResponseCount();

}


