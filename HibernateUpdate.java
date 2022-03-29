package com.te.hibernatedummy.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.te.hibernatedummy.dto.Employee;

public class HibernateUpdate {
	public static void main(String[] args) {
		/*
		 * Employee employee=new Employee(); employee.setEmpId(200);
		 * employee.setEmpName("deepthi"); employee.setEmpAddress("banglore");
		 * employee.setEmpPassword("abc111");
		 */
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("emp");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Employee employee =manager.find(Employee.class, 100);
		if(employee!=null) {
			employee.setEmpName("Alia");
		}
		transaction.commit();
	}
}
