package com.test1;

public class BRMBookingLocationMap {
	private Integer brmld;
	private String bookingLoc;
	private String bookingLocName;
	private String bookingLocDesc;
	private boolean locationAvailable;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public BRMBookingLocationMap() {

	}

	public BRMBookingLocationMap(Integer brmld, String bookingLoc, String bookingLocName, String bookingLocDesc,
			boolean locationAvailable, String creationDate, String modifiedDate, String entityState) {
		super();
		this.brmld = brmld;
		this.bookingLoc = bookingLoc;
		this.bookingLocName = bookingLocName;
		this.bookingLocDesc = bookingLocDesc;
		this.locationAvailable = locationAvailable;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getBrmld() {
		return brmld;
	}

	public void setBrmld(Integer brmld) {
		this.brmld = brmld;
	}

	public String getBookingLoc() {
		return bookingLoc;
	}

	public void setBookingLoc(String bookingLoc) {
		this.bookingLoc = bookingLoc;
	}

	public String getBookingLocName() {
		return bookingLocName;
	}

	public void setBookingLocName(String bookingLocName) {
		this.bookingLocName = bookingLocName;
	}

	public String getBookingLocDesc() {
		return bookingLocDesc;
	}

	public void setBookingLocDesc(String bookingLocDesc) {
		this.bookingLocDesc = bookingLocDesc;
	}

	public boolean isLocationAvailable() {
		return locationAvailable;
	}

	public void setLocationAvailable(boolean locationAvailable) {
		this.locationAvailable = locationAvailable;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
