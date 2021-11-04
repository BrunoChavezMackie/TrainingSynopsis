package ws.synopsis.trainingdatabase.service.impl;

import java.util.Optional;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import ws.synopsis.trainingdatabase.bean.entity.Client;
import ws.synopsis.trainingdatabase.exception.TrainingException;
import ws.synopsis.trainingdatabase.repository.ClientRepository;
import ws.synopsis.trainingdatabase.service.ClientService;

@Service
@AllArgsConstructor
public class ClientServiceImpl implements ClientService {

	private ClientRepository repository;

	@Override
	public void add(Client client) {
		repository.save(client);
	}

	@Override
	public Client find(Long id) {
		Optional<Client> client = repository.findById(id);
		if (!client.isPresent()) {
			new TrainingException("Cliente no existe.");
		}
		return client.get();
	}

	@Override
	public Iterable<Client> findAll() {
		return repository.findAll();
	}

	@Override
	public void update(Client client) {
		repository.save(client);
	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);
	}

}
