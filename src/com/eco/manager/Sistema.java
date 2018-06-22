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
	
	public synchronized void cadastrarSala( Sala sala ){
		em.getTransaction().begin();
		em.persist(sala);
		em.getTransaction().commit();
	}
	
	@SuppressWarnings("unchecked")
	public List<Sala> obterSalas(){
		Query query = em.createQuery("Select c from Sala c");
		return query.getResultList();
	}
	
	public synchronized void removerSala( Sala sala ){
		em.getTransaction().begin();
		
		Sala aRemover = em.find(Sala.class, sala.getId());
		em.remove(aRemover);
		
		em.getTransaction().commit();
	}
	
	
	public synchronized void atualizarSala( Sala sala, String nome, Consumo consumo, String kwh, String data){
		em.getTransaction().begin();
		sala = em.find(Sala.class, sala.getId());
		consumo = em.find(Consumo.class, consumo.getId());
		sala.setNome(nome);
		consumo.setKwh(kwh);
		consumo.setData(data);
		em.getTransaction().commit();
	}
	
}
