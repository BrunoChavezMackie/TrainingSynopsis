package ws.synopsis.trainingdatabase.dao.sp;

import java.sql.Types;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.stereotype.Component;

import ws.synopsis.trainingdatabase.dao.mapper.SPLoginMapper;

@Component
public class SPLogin extends SPAbstract {

	private static final String SP_NAME = "SPLogin";
	public static final String IN_EMAIL = "@email";
	public static final String IN_PASSWORD = "@password";
	public static final String OUT_CURSOR = "cursor";

	@Autowired
	public SPLogin(JdbcTemplate jdbcTemplate) {
		super(jdbcTemplate, SP_NAME);
	}

	@Override
	public void configSP() {
		//@formatter:off
		getSimpleJdbcCall()
			.useInParameterNames(
					IN_EMAIL,
					IN_PASSWORD
			)
			.declareParameters(
					new SqlParameter(IN_EMAIL, Types.VARCHAR),
					new SqlParameter(IN_PASSWORD, Types.VARCHAR)
		)
		.returningResultSet(OUT_CURSOR, new SPLoginMapper());
		//@formatter:on
	}
}
