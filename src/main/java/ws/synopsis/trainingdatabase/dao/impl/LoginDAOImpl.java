
package ws.synopsis.trainingdatabase.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import lombok.AllArgsConstructor;
import ws.synopsis.trainingdatabase.bean.entity.Client;
import ws.synopsis.trainingdatabase.bean.request.LoginRequest;
import ws.synopsis.trainingdatabase.dao.LoginDAO;
import ws.synopsis.trainingdatabase.dao.sp.SPLogin;

@Repository
@AllArgsConstructor
public class LoginDAOImpl implements LoginDAO
{

    private SPLogin sp;

    @Override
    @SuppressWarnings("unchecked")
    public List<Client> login(LoginRequest bean)
    {
        //@formatter:off
        SqlParameterSource in = new MapSqlParameterSource()
            .addValue(SPLogin.IN_EMAIL, bean.getEmail())
            .addValue(SPLogin.IN_PASSWORD, bean.getPassword());
        //@formatter:on
        Map<String, Object> result = sp.execute(in);
        List<Client> list = (List<Client>) result.get(SPLogin.OUT_CURSOR);
        return list;
    }

}
