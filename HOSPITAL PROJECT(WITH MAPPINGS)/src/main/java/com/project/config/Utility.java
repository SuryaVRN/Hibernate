package com.project.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Utility {
	
	public static SessionFactory utility() {
		
		Configuration configuration=new Configuration().configure();
		SessionFactory sessionFactory=configuration.buildSessionFactory()
;		
		
		return sessionFactory;
		
		
		
	}

}
