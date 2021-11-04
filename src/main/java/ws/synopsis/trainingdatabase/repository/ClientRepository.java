package ws.synopsis.trainingdatabase.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ws.synopsis.trainingdatabase.bean.entity.Client;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {
	
	public Optional<Client> findByEmail(String email);
	public Optional<Client> findByEmailOrPhone(String email, String phone);
	
}
