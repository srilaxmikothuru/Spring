package com.capgemini.core.repo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.capgemini.core.beans.Customer;
import com.capgemini.core.beans.Transactions;
import com.capgemini.core.exception.InvalidInputException;


@Component(value="walletRepo")
public class WalletRepoImpl implements WalletRepo{
    
	@Autowired(required=true)
	private EntityManagerFactory entityManagerFactory;
	
	@Override
	public boolean save(Customer customer) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(customer);
			entityManager.getTransaction().commit();
		}
		catch(Exception e)
		{
			entityManager.getTransaction().rollback();
			return false;
		}
		
		return true;
	}

	@Override
	public Customer findOne(String mobileNo) throws InvalidInputException {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		Customer customer = entityManager.find(Customer.class, mobileNo);
		entityManager.getTransaction().commit();
		return customer;
	}

	@Override
	public void update(Customer customer) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.merge(customer);
		entityManager.getTransaction().commit();
		
		
	}

	@Override
	public List<Transactions> getAllTrasactions(String mobileNo) {
		List<Transactions> history = new ArrayList<>();
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		String str =  "select trans from Transactions trans where mobileNo =:mob";
		Query query = entityManager.createQuery(str,Transactions.class);
		query.setParameter("mob", mobileNo);
		history=query.getResultList();
		entityManager.getTransaction().commit();		
		return 	history;	
	}

	@Override
	public boolean save(Transactions transaction) throws InvalidInputException {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(transaction);
			entityManager.getTransaction().commit();
		}
		catch(Exception e)
		{
			entityManager.getTransaction().rollback();
			return false;
		}
		
		return true;
	}

}
