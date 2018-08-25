package com.cg.traineeapp.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.traineeapp.beans.Trainee;
import com.cg.traineeapp.repo.TraineeRepo;
@Component(value="traineeService")
public class TraineeServiceImpl implements TraineeService {
	@Autowired(required=true)
	private TraineeRepo traineeRepo;
	private EntityManager entityManager;

	@Override
	public Trainee addTrainee(Trainee trainee) {
		trainee= traineeRepo.save(trainee);
		return trainee;
	}

	@Override
	public Trainee deleteTrainee(int traineeId) {
		Trainee trainee = traineeRepo.findOne(traineeId);
		traineeRepo.delete(traineeId);
		return trainee;
	}

	@Override
	public Trainee modifyTrainee(int traineeId) {
		Trainee trainee = traineeRepo.findOne(traineeId);
		return trainee;
	}

	@Override
	public Trainee retrieveTrainee(int traineeId) {

		return traineeRepo.findOne(traineeId);
	}

	@Override
	public ArrayList<Trainee> retrieveAllTrainees() {

		return (ArrayList<Trainee>) traineeRepo.findAll();
	}

	@Override
	public Trainee updateTrainee(Trainee trainee) {
	 
		return traineeRepo.save(trainee);
	}

}
