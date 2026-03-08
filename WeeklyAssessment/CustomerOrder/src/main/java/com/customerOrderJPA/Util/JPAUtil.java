package com.customerOrderJPA.Util;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JPAUtil {
	private static final EntityManagerFactory emf=Persistence.createEntityManagerFactory("customerOrderPU");
	
	public static EntityManagerFactory getFactory() {
		return emf;
	}

}
