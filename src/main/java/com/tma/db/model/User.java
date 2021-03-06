package com.tma.db.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name="user_id")
	private Integer userId;
	
	@Column(name="password")
	private String password;
	
	@Column(name="name")
	private String name;
	
	@Column(name="address")
	private String address;
	
	@Column(name="locality")
	private String locality;
	
	@Column(name="city")
	private String city;
	
	@Column(name="state")
	private String state;
	
	@Column(name="country")
	private String country;
	
	@Column(name="locality_lat")
	private BigDecimal locality_lat;
	
	@Column(name="locality_long")
	private BigDecimal locality_long;
	
	@Column(name="pincode")
	private String pincode;
	
	@Column(name="mobile")
	private String mobile;
	
	@Column(name="datecreated")
	private Date datecreated;
	
	@Column(name="dateupdated")
	private Date dateupdated;
	
	@Column(name = "registration_date")
	private Date registrationDate;

	@Column(name = "facebook_id")
	private String facebookId;

	@Column(name = "gmail_id")
	private String gmailId;
	
	@Column(name = "status")
	private int status;

	@Column(name = "last_login_time")
	private Date lastLoginTime;
	
	public User() {
		
	}
	
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
	public Date getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}
	public String getGmailId() {
		return gmailId;
	}
	public void setGmailId(String gmailId) {
		this.gmailId = gmailId;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Date getLastLoginTime() {
		return lastLoginTime;
	}
	public void setLastLoginTime(Date date) {
		this.lastLoginTime = date;
	}
	public String getFacebookId() {
		return facebookId;
	}
	public void setFacebookId(String facebookId) {
		this.facebookId = facebookId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
