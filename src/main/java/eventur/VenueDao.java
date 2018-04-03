package eventur;

//package bootcamp;
//
//import javax.annotation.PostConstruct;
//import javax.sql.DataSource;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Bean;
//import org.springframework.jdbc.core.JdbcTemplate;
//
//public class VenueDao {
//
//	@Autowired
//	private DataSource dataSource;
//	
//	private JdbcTemplate jdbcTemplate;
//	
//	@PostConstruct
//	public void initDataSource() { jdbcTemplate = new JdbcTemplate(dataSource); 
//	
//	Object obj = jdbcTemplate.queryForRowSet("select * from Venues");
//	
//	}
//	
//	public VenueDao() {}
//	
//	public void updater(DataSource dataSource) {
//		this.jdbcTemplate = new JdbcTemplate(dataSource);
//	}
//	
//	
//}
