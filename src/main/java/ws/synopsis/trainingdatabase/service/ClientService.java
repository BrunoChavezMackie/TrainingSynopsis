package ws.synopsis.trainingdatabase.service;

import ws.synopsis.trainingdatabase.bean.entity.Client;

public interface ClientService {
	
	public void add(Client client);
	public Client find(Long id);
	public Iterable<Client> findAll();
	public void update(Client client);
	public void delete(Long id);
	
}
