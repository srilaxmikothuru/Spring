package com.cg.sms.services;

import java.util.List;

import com.cg.sms.beans.ScheduledSessions;
import com.cg.sms.exceptions.ScheduledSessionNotFoundException;

public interface SessionsServices {
public List<ScheduledSessions> viewAll() throws ScheduledSessionNotFoundException; 

}
