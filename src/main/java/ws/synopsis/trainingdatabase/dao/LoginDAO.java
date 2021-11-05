package ws.synopsis.trainingdatabase.dao;

import java.util.List;

import ws.synopsis.trainingdatabase.bean.entity.Client;
import ws.synopsis.trainingdatabase.bean.request.LoginRequest;

public interface LoginDAO
{
    public List<Client> login(LoginRequest request);
}
