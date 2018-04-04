package eventur;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class VenueDao {


	@Autowired
	private DataSource dataSource;
	
	private JdbcTemplate jdbcTemplate;
	
	@PostConstruct
	public void initDataSource() { jdbcTemplate = new JdbcTemplate(dataSource); }
	
	
	public String testingconnection() {
		return jdbcTemplate.queryForRowSet("select * from venues").toString();
	}
	
	public List showTable() {
		return jdbcTemplate.queryForList("select * from venues");
		}
	
}