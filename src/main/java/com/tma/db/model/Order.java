package com.tma.db.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "ordermenu")
public class Order implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name="order_id")
	private Integer orderId;
	
	@Transient
	private Integer motherId;
	
	@ManyToOne
    @JoinColumn(name = "mother_id")
	private Mother mother;
	
	@Transient
	private Integer userId;
	
	@ManyToOne
    @JoinColumn(name="user_id")
	private User user;
	
	@Column(name="order_amount")
	private BigDecimal order_amount;
	
	@Column(name="discount_amount")
	private BigDecimal discount_amount;
	
	@Column(name="discount_percentage")
	private BigDecimal discount_percentage;
	
	@Column(name="final_amount")
	private BigDecimal final_amount;
	
	@Column(name="total_qty")
	private Integer total_qty;
	
	@Column(name="shipping_charge")
	private BigDecimal shipping_charge;
	
	@Column(name="shipping_address")
	private String shipping_address;
	
	@Column(name="billing_address")
	private String billing_address;
	
	@Column(name="ship_zip")
	private String ship_zip;
	
	@Column(name="ship_city")
	private String ship_city;
	
	@Column(name="ship_locality")
	private String ship_locality;
	
	@Column(name="order_status")
	private String order_status;
	
	@Column(name="datecreated")
	private Date datecreated;
	
	@Column(name="dateupdated")
	private Date dateupdated;
	
	public Order() {
		
	}
	
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public Integer getMotherId() {
		return motherId;
	}
	public void setMotherId(Integer motherId) {
		this.motherId = motherId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public BigDecimal getOrder_amount() {
		return order_amount;
	}
	public void setOrder_amount(BigDecimal order_amount) {
		this.order_amount = order_amount;
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
	public Integer getTotal_qty() {
		return total_qty;
	}
	public void setTotal_qty(Integer total_qty) {
		this.total_qty = total_qty;
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
	public String getShip_locality() {
		return ship_locality;
	}
	public void setShip_locality(String ship_locality) {
		this.ship_locality = ship_locality;
	}
	public String getOrder_status() {
		return order_status;
	}
	public void setOrder_status(String order_status) {
		this.order_status = order_status;
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
