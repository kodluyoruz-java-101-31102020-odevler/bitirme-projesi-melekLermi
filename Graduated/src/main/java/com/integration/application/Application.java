package com.integration.application;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.integration.app.session.HibernateSessionFactoryManager;
import com.integration.app.config.AppConfig;

@SpringBootApplication
@Import(AppConfig.class)
public class Application {

	public static void main(String[] args) {
		
		SpringApplication.run(Application.class, args);

		
		SessionFactory factory = com.integration.app.session.HibernateSessionFactoryManager.getSessionFactory();
		
		Session session = factory.openSession();
		
		
	}

}
