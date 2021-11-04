package ws.synopsis.trainingdatabase.bean.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClientRequest {
	
	private Long idClient;
	private String email;
	private String name;
	private String lastName;
	private String phone;

}
