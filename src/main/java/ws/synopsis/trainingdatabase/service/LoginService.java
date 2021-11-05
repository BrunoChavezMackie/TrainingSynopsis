package ws.synopsis.trainingdatabase.service;

import ws.synopsis.trainingdatabase.bean.request.LoginRequest;
import ws.synopsis.trainingdatabase.exception.TrainingException;

public interface LoginService
{
    public void login(LoginRequest request) throws TrainingException;
}
