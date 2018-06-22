package com.eco.manager;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Sistema {
	
	private static Sistema instance = new Sistema();
	private EntityManager em;
	
	private Sistema() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("ProjetoEcomanager");
		this.em = factory.createEntityManager();
	}
	
	public static Sistema getInstance(){
		return instance;
	}
	
	public void cadastrarContato( Sala contato ){
		em.getTransaction().begin();
		em.persist(contato);
		em.getTransaction().commit();
	}
	
	@SuppressWarnings("unchecked")
	public List<Sala> obterContatos(){
		Query query = em.createQuery("Select c from Sala c");
		return query.getResultList();
	}
	
	public void removerContato( Sala contato ){
		em.getTransaction().begin();
		
		Sala aRemover = em.find(Sala.class, contato.getId());
		em.remove(aRemover);
		
		em.getTransaction().commit();
	}
	
	
	public void atualizarContato( Sala contato ){
		em.getTransaction().begin();
		em.merge(contato);
		em.getTransaction().commit();
	}
	
}
