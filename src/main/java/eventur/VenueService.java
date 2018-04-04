package eventur;

import org.springframework.beans.factory.annotation.Autowired;

public class VenueService {
	@Autowired
	VenueDao venueDao = new VenueDao();
	
	
}
