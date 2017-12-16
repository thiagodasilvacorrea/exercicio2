package br.inatel.pos.mobile.dm110.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import br.inatel.pos.mobile.dm110.entities.Client;

@Stateless
public class ClientDAO {

	@PersistenceContext(unitName = "clientdb-ds")
	private EntityManager em;

	public void insert(Client client) {
		em.persist(client);
	}

	public List<Client> findAll() {
		return em.createQuery("from Client c", Client.class).getResultList();
	}
    
	
	@SuppressWarnings("unchecked")
	public List<Client> findById(int clientid)
	{
		return em.createQuery(" SELECT c from Client c where c.id =:id")
				.setParameter("id",clientid).getResultList();
	}
	private Client GetClientById(int id)
	{
		return em.find(Client.class,id);
	}
	
	public void deleteClient(int clientId) 
	{   Client clientremove = new Client();
	    clientremove  = GetClientById(clientId);
		em.remove(clientremove);
	}
	

}
