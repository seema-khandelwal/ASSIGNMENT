package com.te.hibernatedummy.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.te.hibernatedummy.dto.Employee;

public class HibernateDelete {
	
	  public static void main(String[] args) {
		  //Employee employee=new Employee();
	  EntityManagerFactory factory=Persistence.createEntityManagerFactory("emp");
	  EntityManager manager = factory.createEntityManager(); EntityTransaction
	  transaction = manager.getTransaction(); transaction.begin();
	  Employee employee = manager.find(Employee.class, 100); 
	  manager.remove(employee);
	  transaction.commit(); }
	 
}
