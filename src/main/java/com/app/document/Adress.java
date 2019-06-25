package com.app.document;

public class Adress {
	private String village;
	private String mandal;
	private String distict;
	private String state;
	private Integer pincode;
	public Adress() {
		super();
	}
	public Adress(String village, String mandal, String distict, String state, Integer pincode) {
		super();
		this.village = village;
		this.mandal = mandal;
		this.distict = distict;
		this.state = state;
		this.pincode = pincode;
	}
	public String getVillage() {
		return village;
	}
	public void setVillage(String village) {
		this.village = village;
	}
	public String getMandal() {
		return mandal;
	}
	public void setMandal(String mandal) {
		this.mandal = mandal;
	}
	public String getDistict() {
		return distict;
	}
	public void setDistict(String distict) {
		this.distict = distict;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Integer getPincode() {
		return pincode;
	}
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Adress [village=" + village + ", mandal=" + mandal + ", distict=" + distict + ", state=" + state
				+ ", pincode=" + pincode + "]";
	}
	

}
