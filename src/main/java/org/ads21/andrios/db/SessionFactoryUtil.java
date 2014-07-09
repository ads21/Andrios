package org.ads21.andrios.conexao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryUtil {
	
	
	private static SessionFactory sessionFactory;
	
	static {
		
		try {
			
			sessionFactory = new Configuration().configure().buildSessionFactory();	
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static SessionFactory getSessionFactory(){
		
		return sessionFactory;
	}
	
	public static void main(String[] args) {
		System.out.println(sessionFactory);
	}
}