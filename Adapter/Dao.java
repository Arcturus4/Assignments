package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.*;

import entity.*;
import java.util.*;

public class Dao {
	
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("Harj1PU");
	
	public void fetchSalesEventsUnder(Double limit) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
        String statement = "SELECT e FROM SalesEvent e WHERE amount <=" + limit;
        Query query = em.createQuery(statement);
        List<SalesEvent> result = query.getResultList();
        
        for (SalesEvent s : result) {
        	System.out.println("HERE BEGINS PRINTING OF SALESEVENTS");
        	System.out.println(s.toString());
        }
        
        
        em.getTransaction().commit();
        em.close();
	}
	
	public void getSalesInfo() {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		String statement1 = "FROM SalesEvent";
        Query query1 = em.createQuery(statement1);
        List<SalesEvent> result1 = query1.getResultList();
        
        System.out.println("HERE BEGINS PRINTING OF ALTERED SALESEVENT");
        for (SalesEvent s : result1) {
        	
        	System.out.println(s.toString());
        }
	}
	
	
	public void addSaleseventServiceFee(double amount) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		String statement1 = "FROM SalesEvent";
        Query query1 = em.createQuery(statement1);
        List<SalesEvent> result1 = query1.getResultList();
        
        System.out.println("HERE BEGINS PRINTING OF ORIGINAL SALESEVENT");
        for (SalesEvent s : result1) {
        	
        	System.out.println(s.toString());
        }
		
        String statement = "UPDATE SalesEvent SET amount = amount +"+amount;
        Query query = em.createQuery(statement);
        //query.setParameter("increment", amount);
        int result = query.executeUpdate();
        
        
       /* String statement2= "FROM SalesEvent";
        Query query2 = em.createQuery(statement2);
        List<SalesEvent> result2 = query2.getResultList();
        
        System.out.println("HERE BEGINS PRINTING OF ALTERED SALESEVENT");
        for (SalesEvent s : result2) {
       
        	System.out.println(s.toString());
        }
        /*for (Object s : result) {
        	System.out.println("HERE BEGINS PRINTING OF ALTERED SALESEVENTS");
        	System.out.println(s.toString());
        }*/
        
        
        em.getTransaction().commit();
        em.close();
	}
	
	
	public int deleteRecordsCrit() {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		CriteriaBuilder crit = em.getCriteriaBuilder();
		CriteriaDelete<SalesEvent> s = crit.createCriteriaDelete(SalesEvent.class);
		Root<SalesEvent> se = s.from(SalesEvent.class);
		int deletedObjects = em.createQuery(s).executeUpdate();
		
		em.getTransaction().commit();
        em.close();
        return deletedObjects;
	}
	
	
	
	public int deleteRecords() {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		String statement = "DELETE FROM SalesEvent e";
		Query q = em.createQuery(statement);
		int deletedObjects = q.executeUpdate();
		
		/*for(int i : values) {
        SalesEvent object = em.find(SalesEvent.class, i);
        em.remove(object);
        em.getTransaction().commit();
        
		}*/
		em.getTransaction().commit();
        em.close();
        return deletedObjects;
	}
	
	
	public void addRegister(Register reg) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
        em.persist(reg);
        
        em.getTransaction().commit();
        em.close();
	}
	
	public void addEvent(int eventNumber, int regNumber, double amount) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
        Register reg = em.find(Register.class, regNumber);
        SalesEvent evt = new SalesEvent(eventNumber, reg, amount);
        
        em.persist(evt);
        
        em.getTransaction().commit();
        em.close();	
	}
	
	public List<SalesEvent> retrieveSmallSales(double limit) {
		
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		List<SalesEvent> result = null;
		// logic goes here
		
		
		em.getTransaction().commit();
		em.close();
		return result;
	}
	
}
