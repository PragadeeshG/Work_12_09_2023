package com.test1;

public class BRMCodeRelation {
	private Integer brmId;
	private String brmName;
	private String bookingLoc;
	private String departmentId;
	private String operatingUnitId;
	private String employeeId;
	private String creationDate;
	private String modifiedDate;
	private String entityState;
	private String effectiveStatus;

	public BRMCodeRelation() {

	}

	public BRMCodeRelation(Integer bmld, String bmName, String bookingLoc, String departmentId, String operatingUnitId,
			String employeeId, String creationDate, String modifiedDate, String entityState, String effectiveStatus) {
		super();
		this.brmId = bmld;
		this.brmName = bmName;
		this.bookingLoc = bookingLoc;
		this.departmentId = departmentId;
		this.operatingUnitId = operatingUnitId;
		this.employeeId = employeeId;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
		this.effectiveStatus = effectiveStatus;
	}

	public Integer getBrmId() {
		return brmId;
	}

	public void setBrmld(Integer brmId) {
		this.brmId = brmId;
	}

	public String getBmName() {
		return brmName;
	}

	public void setBmName(String bmName) {
		this.brmName = bmName;
	}

	public String getBookingLoc() {
		return bookingLoc;
	}

	public void setBookingLoc(String bookingLoc) {
		this.bookingLoc = bookingLoc;
	}

	public String getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	public String getOperatingUnitId() {
		return operatingUnitId;
	}

	public void setOperatingUnitId(String operatingUnitId) {
		this.operatingUnitId = operatingUnitId;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
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

	public String getEffectiveStatus() {
		return effectiveStatus;
	}

	public void setEffectiveStatus(String effectiveStatus) {
		this.effectiveStatus = effectiveStatus;
	}

}
