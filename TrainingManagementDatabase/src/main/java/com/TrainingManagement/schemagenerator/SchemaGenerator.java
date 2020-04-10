package com.TrainingManagement.schemagenerator;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class SchemaGenerator {
	
	public static void main(String[] args) {
		   
		    StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate-mysql.cfg.xml").build();  
		    Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
		  
		  SessionFactory factory = meta.getSessionFactoryBuilder().build();  
		  Session session = factory.openSession();  
		  Transaction t = session.beginTransaction();  
		 t.commit();
		 factory.close();  
		    session.close();    
	       
		   
	 
	       
	   }

}
