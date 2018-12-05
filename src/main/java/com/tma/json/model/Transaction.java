package com.tma.json.model;

import java.math.BigDecimal;
import java.util.Date;

public class Transaction {
	
	private Integer txnId;
	
	private Integer orderId;
	
	private Integer userId;
	
	private Integer motherId;
	
	private Integer item_amount;
	
	private BigDecimal discount_amount;
	
	private BigDecimal discount_percentage;
	
	private BigDecimal final_amount;
	
	private BigDecimal shipping_charge;
	
	private String shipping_address;
	
	private String billing_address;
	
	private String ship_zip;
	
	private String ship_city;
	
	private String ship_state;
	
	private String ship_country;
	
	private Integer qty;
	
	private Integer ten_status;
	
	private Date datecreated;
	
	private Date dateupdated;
	
	private String user_special_request;
	
	public Integer getTxnId() {
		return txnId;
	}
	public void setTxnId(Integer txnId) {
		this.txnId = txnId;
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getMotherId() {
		return motherId;
	}
	public void setMotherId(Integer motherId) {
		this.motherId = motherId;
	}
	public Integer getItem_amount() {
		return item_amount;
	}
	public void setItem_amount(Integer item_amount) {
		this.item_amount = item_amount;
	}
	public BigDecimal getDiscount_amount() {
		return discount_amount;
	}
	public void setDiscount_amount(BigDecimal discount_amount) {
		this.discount_amount = discount_amount;
	}
	public BigDecimal getDiscount_percentage() {
		return discount_percentage;
	}
	public void setDiscount_percentage(BigDecimal discount_percentage) {
		this.discount_percentage = discount_percentage;
	}
	public BigDecimal getFinal_amount() {
		return final_amount;
	}
	public void setFinal_amount(BigDecimal final_amount) {
		this.final_amount = final_amount;
	}
	public BigDecimal getShipping_charge() {
		return shipping_charge;
	}
	public void setShipping_charge(BigDecimal shipping_charge) {
		this.shipping_charge = shipping_charge;
	}
	public String getShipping_address() {
		return shipping_address;
	}
	public void setShipping_address(String shipping_address) {
		this.shipping_address = shipping_address;
	}
	public String getBilling_address() {
		return billing_address;
	}
	public void setBilling_address(String billing_address) {
		this.billing_address = billing_address;
	}
	public String getShip_zip() {
		return ship_zip;
	}
	public void setShip_zip(String ship_zip) {
		this.ship_zip = ship_zip;
	}
	public String getShip_city() {
		return ship_city;
	}
	public void setShip_city(String ship_city) {
		this.ship_city = ship_city;
	}
	public String getShip_state() {
		return ship_state;
	}
	public void setShip_state(String ship_state) {
		this.ship_state = ship_state;
	}
	public String getShip_country() {
		return ship_country;
	}
	public void setShip_country(String ship_country) {
		this.ship_country = ship_country;
	}
	public Integer getQty() {
		return qty;
	}
	public void setQty(Integer qty) {
		this.qty = qty;
	}
	public Integer getTen_status() {
		return ten_status;
	}
	public void setTen_status(Integer ten_status) {
		this.ten_status = ten_status;
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
	public String getUser_special_request() {
		return user_special_request;
	}
	public void setUser_special_request(String user_special_request) {
		this.user_special_request = user_special_request;
	}

}
