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
	
	VenueService venueService = new VenueService();

	@GetMapping("/testing")
	public String testingconnection() {
		return venueService.venueDao.testingconnection();
	}
	
	@GetMapping("/showTable")
	public List showTable() {
		return venueService.venueDao.showTable();
	}
	
	
}

