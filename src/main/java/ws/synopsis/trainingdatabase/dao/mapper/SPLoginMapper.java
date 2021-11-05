
package ws.synopsis.trainingdatabase.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import ws.synopsis.trainingdatabase.bean.entity.Client;

public class SPLoginMapper implements RowMapper<Client>
{

    private static final String IN_CLIENT_ID = "client_id";
    private static final String IN_EMAIL = "client_email";
    private static final String IN_LASTNAME = "client_lastname";
    private static final String IN_NAME = "client_name";
    private static final String IN_PHONE = "client_phone";

    @Override
    public Client mapRow(ResultSet rs, int rowNum) throws SQLException
    {
        //@formatter:off
		Client loadRole = Client.builder()
				.idClient(rs.getLong(IN_CLIENT_ID))
				.email(rs.getString(IN_EMAIL))
				.lastName(rs.getString(IN_LASTNAME))
				.name(rs.getString(IN_NAME))
				.phone(rs.getString(IN_PHONE))
			.build()
			;
		//@formatter:on
        return loadRole;
    }

}
