package com.cg.sms.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.sms.beans.ScheduledSessions;
import com.cg.sms.exceptions.ScheduledSessionNotFoundException;
import com.cg.sms.reposervices.SessionsServicesDAO;
@Component(value="service")
public class SessionsServiceImpl implements SessionsServices{
   @Autowired
	SessionsServicesDAO servicedao;
   
	@Override
	public List<ScheduledSessions> viewAll() {
		List<ScheduledSessions> list=servicedao.findAll();
		if(list.isEmpty())
			throw new ScheduledSessionNotFoundException("No scheduled sessions available");
		return list;
	}

}
