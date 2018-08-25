package com.cg.traineeapp.service;

import java.util.List;

import com.cg.traineeapp.beans.Trainee;

public interface TraineeService {
	public Trainee addTrainee(Trainee trainee);
	public Trainee deleteTrainee(int traineeId);
	public Trainee modifyTrainee(int traineeId);
	public Trainee updateTrainee(Trainee trainee);
	public Trainee retrieveTrainee(int traineeId);
	public List<Trainee> retrieveAllTrainees();
}
