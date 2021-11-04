package ws.synopsis.trainingdatabase.bean.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "CLIENT")
@Getter
@Setter
public class Client {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CLIENT_ID")
	private Long idClient;
	
	@Column(name = "CLIENT_EMAIL")
	private String email;
	
	@Column(name = "CLIENT_NAME")
	private String name;
	
	@Column(name = "CLIENT_LASTNAME")
	private String lastName;
	
	@Column(name = "CLIENT_PHONE")
	private String phone;

}
