package com.hibernatedemo;

//import java.util.List;

//import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(City.class)
								.buildSessionFactory();
		//Unit of Work
		Session session = factory.getCurrentSession();
		
		try {
			session.beginTransaction();
			//HQL --> Hibernate Query Language
			
			//TypedQuery<City> query = session.createQuery("from City",City.class);
			//TypedQuery<City> query = session.createQuery("from City c where c.countryCode='TUR' AND c.district='Balikesir'",City.class);
			//TypedQuery<City> query = session.createQuery("from City c where c.name LIKE '%ali%'",City.class);
			//List<City> cities = query.getResultList();
			//for (City city : cities) {
			//	System.out.println(city.getName() + " " +city.getPopulation());
			//}
			
			//INSERT QUERY
//			City city = new City();
//			city.setName("CÝTY NAME");
//			city.setCountryCode("CITY COUNTRY CODE");
//			city.setDistrict("CÝTY DÝSCTRÝCT");
//			city.setPopulation(CÝTY POPULATION);
//			session.save(city);
			
			//UPDATE QUERY
//			City city = session.get(City.class, 4085);
//			city.setPopulation(60000);
//			session.saveOrUpdate(city);
			
			//DELETE QUERY
//			City city = session.get(City.class, 4085);
//			session.delete(city);
			
			session.getTransaction().commit();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			factory.close();
		}
		
	}

}
