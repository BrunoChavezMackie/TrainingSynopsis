package ws.synopsis.trainingdatabase.bean.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TrainingResponse<T> {

	private Status status;
	private T data;
	
}
