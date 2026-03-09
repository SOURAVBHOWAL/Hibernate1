package com.customerOrderJPA.Dao;

import java.util.List;

import com.customerOrderJPA.Entity.Customer;
import com.customerOrderJPA.Util.JPAUtil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class CustomerDAOImpl {
	public void insertCustomer(Customer customer) {
		EntityManager em=JPAUtil.getFactory().createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.persist(customer);
		et.commit();
		em.close();
	}
	public Customer getCustomerById(int id) {
		EntityManager em=JPAUtil.getFactory().createEntityManager();
		Customer c=em.find(Customer.class,id);
		em.close();
		return c;
	}
	public List<Customer> getAllCustomers(){
		EntityManager em=JPAUtil.getFactory().createEntityManager();
		List<Customer> list=em.createQuery("Select c from Customer c").getResultList();
		em.close();
		return list;
	}
	public void updateCustomer(int id,String name) {
		EntityManager em=JPAUtil.getFactory().createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		Customer c=em.find(Customer.class,id);
		c.setCustomerName(name);
		et.commit();
		em.close();
	}
	public void deleteCustomer(int id) {
        EntityManager em = JPAUtil.getFactory().createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        Customer c = em.find(Customer.class, id);
        em.remove(c);
        tx.commit();
        em.close();
    }
	//JPQL query
	public Customer getCustomerByEmail(String email) {
		EntityManager em=JPAUtil.getFactory().createEntityManager();
		Customer c=em.createQuery("Select c from Customer c where c.email=:email",Customer.class)
				.setParameter("email", email)
				.getSingleResult();
		em.close();
		return c;
	}
}
