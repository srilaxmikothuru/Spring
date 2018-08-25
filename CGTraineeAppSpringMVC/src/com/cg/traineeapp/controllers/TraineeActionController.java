package com.cg.traineeapp.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import com.cg.traineeapp.beans.Trainee;
import com.cg.traineeapp.repo.TraineeRepo;
import com.cg.traineeapp.service.TraineeService;


@Controller
public class TraineeActionController {

	
	@Autowired	
	TraineeService traineeService;
	@Autowired	
	TraineeRepo traineeRepo;
		@RequestMapping(value="/loginTrainee")
		public ModelAndView loginTrainee(@RequestParam("name") String username,@RequestParam("password")String password) {
			if(username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin"))
				return  new ModelAndView("indexPage");
			
			return new ModelAndView("loginPage");
				
		}
		@RequestMapping(value="/addTrainee")
		public ModelAndView addTrainee(@ModelAttribute("trainee")Trainee trainee) {
			trainee = traineeService.addTrainee(trainee);
			return new ModelAndView("indexPage","trainee",trainee);
				
		}
		@RequestMapping(value="/deleteTrainee")
		public ModelAndView deleteTrainee(@RequestParam("traineeId") int traineeId) {
			Trainee trainee = traineeService.deleteTrainee(traineeId);
			return new ModelAndView("deleteTraineePage","trainee",trainee);
				
		}
		@RequestMapping(value="/modifyTrainee")
		public ModelAndView modifyTrainee(@RequestParam("traineeId") int traineeId) {
			Trainee trainee = traineeService.modifyTrainee(traineeId);
			return new ModelAndView("updatePage","trainee",trainee);
				
		}
		@RequestMapping(value="/updateTrainee")
		public ModelAndView updateTrainee(@ModelAttribute("trainee") Trainee trainee1) {
			Trainee trainee = traineeService.updateTrainee(trainee1);
		return new ModelAndView("indexPage","trainee",trainee);
				
		}
		@RequestMapping(value="/retrieveTrainee")
		public ModelAndView retrieveTrainee(@RequestParam("traineeId") int traineeId) {
			Trainee trainee = traineeService.retrieveTrainee(traineeId);
			return new ModelAndView("retrieveTraineePage","trainee",trainee);
				
		}
		@RequestMapping(value="/retrieveAllTrainee")
		public ModelAndView retrieveAllTrainee() {
			List<Trainee> trainee = traineeService.retrieveAllTrainees();
			return new ModelAndView("retrieveAllTraineePage","trainee",trainee);
				
		}
}
