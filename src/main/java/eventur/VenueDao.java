package eventur;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class VenueDao {

	String table = "Venues";

	@Autowired
	private DataSource dataSource;
	
	private JdbcTemplate jdbcTemplate;
	
	@PostConstruct
	public void initDataSource() { jdbcTemplate = new JdbcTemplate(dataSource); }
	
	public List<?> showTable() {
		return jdbcTemplate.queryForList("select * from " + table);
		}
	
	public void createVenue(Venue venue) {
		String SQL = "INSERT INTO venues VALUES(?,?,?,?,?,?)";
		jdbcTemplate.update(SQL, new Object[] {venue.getVenueId() , 
				venue.getVenueName() , venue.getAddress() ,venue.getCapacity()
				, venue.getTransitInfo() , venue.getAvailability()});
	}
	
	public Venue getVenueByID(int id) {
		String SQL= "SELECT venueId, venueName, address, capacity, transitInfo, availability FROM venues WHERE venueId=" + id;
		List<Venue> venue = jdbcTemplate.query(SQL, new BeanPropertyRowMapper<>(Venue.class));
		return venue.get(0);
	}
	
	public void updateVenue(int id, String field, String updatedValue) {
		String SQL = "";
		switch (field) {
			case "venueName":
				SQL = "UPDATE VENUES SET venueName = \'" + updatedValue + "\'" + "WHERE venueId = " + id;
			case "address":
				SQL = "UPDATE VENUES SET address = \'" + updatedValue + "\'" + "WHERE venueId = " + id;
			case "capacity":
				SQL = "UPDATE VENUES SET capacity = \'" + updatedValue + "\'" + "WHERE venueId = " + id;				
			case "transitInfo":
				SQL = "UPDATE VENUES SET transitInfo = \'" + updatedValue + "\'" + "WHERE venueId = " + id;
		}
		
		jdbcTemplate.update(SQL);
	}
	
	public void deleteVenue(int id) {
		String SQL = "delete from venues where venueId = " + id;
		jdbcTemplate.update(SQL);
	}
	
}