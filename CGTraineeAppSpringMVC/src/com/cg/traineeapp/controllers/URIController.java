package com.cg.traineeapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cg.traineeapp.beans.Trainee;

@Controller
public class URIController {

	@RequestMapping(value="/")
	public String getloginPage() {
		return "loginPage";
	}
	
	@RequestMapping(value="/indexPage")
	public String getindexPage() {
		return "indexPage";
	}
	@ModelAttribute("trainee")
	public Trainee getTrainee() {
		return new Trainee();
	}
	@RequestMapping(value="/addTraineePage")
	public String getAddTraineePage() {
		return "addTraineePage";
	}
	
	@RequestMapping(value="/retrieveTraineePage")
	public String getretrieveTraineePage() {
		return "retrieveTraineePage";
	}
	@RequestMapping(value="/deleteTraineePage")
	public String getdeleTraineePage() {
		return "deleteTraineePage";
	}
	@RequestMapping(value="/retrieveAllTraineePage")
	public String getretrieveAllTraineePage() {
		return "retrieveAllTraineePage";
	}
	@RequestMapping(value="/modifyPage")
	public String getmodifyPage() {
		return "modifyPage";
	}
	@RequestMapping(value="/updatePage")
	public String getupdatePage() {
		return "updatePage";
	}
}
