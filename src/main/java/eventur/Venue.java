package eventur;

public class Venue {
	
	private int venueId;
	private String venueName;
	private String address;
	private int capacity;
	private String transitInfo;
	private boolean availability;
	
	public Venue() {
		venueId = 99;
		venueName = "default name";
		address = "default address";
		capacity = 0;
		transitInfo = "default transit info";
		availability = false;
	}

	public int getVenueId() {
		return venueId;
	}

	public void setVenueId(int venueId) {
		this.venueId = venueId;
	}

	public String getVenueName() {
		return venueName;
	}

	public void setVenueName(String venueName) {
		this.venueName = venueName;
	}

	public String getAddress() {
		return address;
	}
	

	public void setAddress(String address) {
		this.address = address;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getTransitInfo() {
		return transitInfo;
	}

	public void setTransitInfo(String transitInfo) {
		this.transitInfo = transitInfo;
	}

	public boolean isAvailability() {
		return availability;
	}

	public void setAvailability(boolean availability) {
		this.availability = availability;
	}

}
