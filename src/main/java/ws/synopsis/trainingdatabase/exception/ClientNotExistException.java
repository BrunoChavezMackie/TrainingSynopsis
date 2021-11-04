package ws.synopsis.trainingdatabase.exception;

@SuppressWarnings("serial")
public class ClientNotExistException extends TrainingException {

	public ClientNotExistException(String message, Throwable cause) {
		super(message, cause);
	}

	public ClientNotExistException(String message) {
		super(message);
	}

}
