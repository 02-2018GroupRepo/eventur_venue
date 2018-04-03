package eventur;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VenueController {
	

	@Autowired
	private DataSource dataSource;
	
	private JdbcTemplate jdbcTemplate;
//	VenueService venueService = new VenueService();
	
	@PostConstruct
	public void initDataSource() { jdbcTemplate = new JdbcTemplate(dataSource); }
	
	@GetMapping("/testing")
	public String testingconnection() {
		return jdbcTemplate.queryForRowSet("select * from venues").toString();
	}
	
	@GetMapping("/showTable")
	public List showTable() {
		return jdbcTemplate.queryForList("select * from venues");		
	}
	
	
	
}

