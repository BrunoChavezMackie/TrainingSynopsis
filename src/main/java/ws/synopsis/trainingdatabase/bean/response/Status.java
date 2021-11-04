package ws.synopsis.trainingdatabase.bean.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Status {

	private String code;
	private String msg;
	
}
