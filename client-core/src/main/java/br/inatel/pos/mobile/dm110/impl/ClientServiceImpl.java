package br.inatel.pos.mobile.dm110.impl;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;

import br.inatel.pos.mobile.dm110.api.ClientService;
import br.inatel.pos.mobile.dm110.interfaces.ClientRemote;

@RequestScoped
public class ClientServiceImpl implements ClientService {

	@EJB(lookup = "java:app/client-ejb-1.0.0-SNAPSHOT/ClientBean!br.inatel.pos.mobile.dm110.interfaces.ClientRemote")
    private ClientRemote clientBean;

	@Override
	public void addNewclient(String clientName,String clientEmail) {
		clientBean.addNewClient(clientName, clientEmail);
	}

	@Override
	public String[] listclient() {
		return clientBean.listClient();
	}

	@Override
	public void deleteClient(int clientId) 
	{
		
		clientBean.deleteClient(clientId);
	}

	@Override
	public void listClientById(int id) 
	{
		
		clientBean.listClientById(id);
	}

	
	
	

	

}
