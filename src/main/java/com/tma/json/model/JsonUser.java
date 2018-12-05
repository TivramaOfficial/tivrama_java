package com.tma.json.model;

import java.math.BigDecimal;
import java.sql.Date;

public class JsonUser {

	private Integer userId;
	
	private String name;
	
	private String address;
	
	private String locality;
	
	private String city;
	
	private String state;
	
	private String country;
	
	private BigDecimal locality_lat;
	
	private BigDecimal locality_long;
	
	private String pincode;
	
	private String mobile;
	
	private Date datecreated;
	
	private Date dateupdated;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public BigDecimal getLocality_lat() {
		return locality_lat;
	}

	public void setLocality_lat(BigDecimal locality_lat) {
		this.locality_lat = locality_lat;
	}

	public BigDecimal getLocality_long() {
		return locality_long;
	}

	public void setLocality_long(BigDecimal locality_long) {
		this.locality_long = locality_long;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Date getDatecreated() {
		return datecreated;
	}

	public void setDatecreated(Date datecreated) {
		this.datecreated = datecreated;
	}

	public Date getDateupdated() {
		return dateupdated;
	}

	public void setDateupdated(Date dateupdated) {
		this.dateupdated = dateupdated;
	}
}
