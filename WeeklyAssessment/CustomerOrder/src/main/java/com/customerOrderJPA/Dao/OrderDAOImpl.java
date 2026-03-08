package com.customerOrderJPA.Dao;

import com.customerOrderJPA.Entity.Order;
import com.customerOrderJPA.Util.JPAUtil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class OrderDAOImpl {
	public Order getOrderById(int id) {
		EntityManager em=JPAUtil.getFactory().createEntityManager();
		Order o=em.find(Order.class, id);
		em.close();
		return o;
	}
	public void updateOrder(int id, String productName) {
		EntityManager em=JPAUtil.getFactory().createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		Order o=em.find(Order.class, id);
		o.setProductName(productName);
		et.commit();
		em.close();
	}
}
