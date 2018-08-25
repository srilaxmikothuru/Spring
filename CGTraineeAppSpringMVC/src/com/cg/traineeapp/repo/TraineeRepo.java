package com.cg.traineeapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.cg.traineeapp.beans.Trainee;

public interface TraineeRepo extends JpaRepository<Trainee, Integer>,CrudRepository<Trainee, Integer>{

}
