package model.account;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import klassenDB.User;

public class UserPM {
	
	@PersistenceContext
	EntityManager em;
	
	public User login(String email, String passwort){
		
		
		List<User> resultList = em.createQuery("Select u FROM users", User.class).getResultList();
		
		
	}
}
