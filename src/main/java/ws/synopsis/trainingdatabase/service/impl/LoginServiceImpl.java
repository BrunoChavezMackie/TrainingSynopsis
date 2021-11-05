package ws.synopsis.trainingdatabase.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import ws.synopsis.trainingdatabase.bean.entity.Client;
import ws.synopsis.trainingdatabase.bean.request.LoginRequest;
import ws.synopsis.trainingdatabase.dao.LoginDAO;
import ws.synopsis.trainingdatabase.exception.ClientNotExistException;
import ws.synopsis.trainingdatabase.exception.TrainingException;
import ws.synopsis.trainingdatabase.service.LoginService;

@Service
@AllArgsConstructor
public class LoginServiceImpl implements LoginService
{

    private LoginDAO dao;
    
    @Override
    public void login(LoginRequest request) throws TrainingException
    {
        List<Client> client = dao.login(request);
        if(client.isEmpty()) {
            throw new ClientNotExistException("Credenciales invalidas.");
        }
    }

}
