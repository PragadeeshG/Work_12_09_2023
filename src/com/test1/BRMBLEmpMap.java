package com.test1;

public class BRMBLEmpMap {
private Integer brmId;
private String employeeId;
private String managerId;
private Integer psHrRefld;
private String costCenter;
private String lastWorkingDay;
private String creationDate;
private String modifiedDate;
private String entityState;

public BRMBLEmpMap() {
	
}

public BRMBLEmpMap(Integer brmId, String employeeId, String managerId, Integer psHrRefld, String costCenter,
		String lastWorkingDay, String creationDate, String modifiedDate, String entityState) {
	super();
	this.brmId = brmId;
	this.employeeId = employeeId;
	this.managerId = managerId;
	this.psHrRefld = psHrRefld;
	this.costCenter = costCenter;
	this.lastWorkingDay = lastWorkingDay;
	this.creationDate = creationDate;
	this.modifiedDate = modifiedDate;
	this.entityState = entityState;
}

public Integer getBrmId() {
	return brmId;
}

public void setBrmId(Integer brmId) {
	this.brmId = brmId;
}

public String getEmployeeId() {
	return employeeId;
}

public void setEmployeeId(String employeeId) {
	this.employeeId = employeeId;
}

public String getManagerId() {
	return managerId;
}

public void setManagerId(String managerId) {
	this.managerId = managerId;
}

public Integer getPsHrRefld() {
	return psHrRefld;
}

public void setPsHrRefld(Integer psHrRefld) {
	this.psHrRefld = psHrRefld;
}

public String getCostCenter() {
	return costCenter;
}

public void setCostCenter(String costCenter) {
	this.costCenter = costCenter;
}

public String getLastWorkingDay() {
	return lastWorkingDay;
}

public void setLastWorkingDay(String lastWorkingDay) {
	this.lastWorkingDay = lastWorkingDay;
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
