package com.cg.sms.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cg.sms.beans.ScheduledSessions;
import com.cg.sms.exceptions.ScheduledSessionNotFoundException;
import com.cg.sms.services.SessionsServices;

@Controller
public class URIControllers {
	@Autowired
	SessionsServices service;
	
//	@RequestMapping(value="/")
//	public String getIndexPage() {
//		return "indexPage";
//	}
	@RequestMapping(value="/")
	public ModelAndView getList() {
			try{ 
				List<ScheduledSessions> list=service.viewAll();
			return new ModelAndView("ScheduledSessionPage","list", list);

			}
		catch(ScheduledSessionNotFoundException e) {
			return new ModelAndView("ScheduledSessionPage","errorMessage",e.getMessage());
		}
	}
	@RequestMapping(value="/EnrollMe/{name}",method=RequestMethod.GET)
	public ModelAndView getSuccessPage(@PathVariable("name") String name) {
		
		return new ModelAndView("Success","name",name);
	}
}
	

