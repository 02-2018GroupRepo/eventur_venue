package eventur;

import java.util.List;

import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class VenueService {
	@Autowired
	VenueDao venueDao;
	
	public VenueService(VenueDao venueDao) {
		this.venueDao = venueDao;
	}
	
	public List showTable() {
		return venueDao.showTable();
	}
	
	public void createVenue(Venue venue) {
		venueDao.createVenue(venue);
	}
	
	public Venue getVenueById(int id) {
		return venueDao.getVenueByID(id);
	}
	
	public void updateVenue(JSONObject jsonObj) throws ParseException {
		venueDao.updateVenue((int)jsonObj.get("venueId"), (String)jsonObj.get("field"), 
				(String)jsonObj.get("updatedValue"));
	}
	
	public void deleteVenue(int id) {
		venueDao.deleteVenue(id);
	}
	
	
}
