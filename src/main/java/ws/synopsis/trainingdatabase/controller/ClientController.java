package ws.synopsis.trainingdatabase.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import ws.synopsis.trainingdatabase.bean.entity.Client;
import ws.synopsis.trainingdatabase.bean.response.Status;
import ws.synopsis.trainingdatabase.bean.response.TrainingResponse;
import ws.synopsis.trainingdatabase.service.ClientService;

@RestController
@RequestMapping("/client/v1")
@AllArgsConstructor
public class ClientController {

	private ClientService service;

	@PostMapping("/add")
	public ResponseEntity<TrainingResponse<?>> add(@RequestBody Client client) {
		service.add(client);
		return ResponseEntity.ok(
				TrainingResponse.<String>builder()
					.status(
						Status.builder().code("0000").msg("Exito.").build()
					)
				.build()
			);
	}

	@GetMapping("/list")
	public ResponseEntity<TrainingResponse<?>> list() {
		Iterable<Client> list = service.findAll();
		return ResponseEntity.ok(TrainingResponse.<Iterable<Client>>builder()
				.data(list)
				.status(Status.builder().code("0000").msg("Exito.").build())
			.build());
	}

}
