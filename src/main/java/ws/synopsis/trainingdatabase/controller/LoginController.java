package ws.synopsis.trainingdatabase.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import ws.synopsis.trainingdatabase.bean.request.LoginRequest;
import ws.synopsis.trainingdatabase.bean.response.Status;
import ws.synopsis.trainingdatabase.bean.response.TrainingResponse;
import ws.synopsis.trainingdatabase.exception.TrainingException;
import ws.synopsis.trainingdatabase.service.LoginService;

@RestController
@AllArgsConstructor
@RequestMapping("/login/v1")
public class LoginController
{
    
    private LoginService service;
    
    @PostMapping("/access")
    public ResponseEntity<TrainingResponse<?>> add(@RequestBody LoginRequest client) throws TrainingException {
        service.login(client);
        return ResponseEntity.ok(
                TrainingResponse.<String>builder()
                    .status(
                        Status.builder().code("0000").msg("Login exitoso.").build()
                    )
                .build()
            );
    }

}
