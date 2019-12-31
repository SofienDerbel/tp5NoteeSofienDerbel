package fr.ensim.tpSofienDerbel.Model;

public class DarkSky {
	 private float latitude;
	 private float longitude;
	 private String timezone;
	 Currently CurrentlyObject;
	 private float offset;
	public float getLatitude() {
		return latitude;
	}
	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}
	public float getLongitude() {
		return longitude;
	}
	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}
	public String getTimezone() {
		return timezone;
	}
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
	public Currently getCurrentlyObject() {
		return CurrentlyObject;
	}
	public void setCurrentlyObject(Currently currentlyObject) {
		CurrentlyObject = currentlyObject;
	}
	public float getOffset() {
		return offset;
	}
	public void setOffset(float offset) {
		this.offset = offset;
	}
	
}
