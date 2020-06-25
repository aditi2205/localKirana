package com.selfproject.localKirana.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="KiranaProduct")
public class KiranaProduct {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer pid;
	@Column
	private String productName;
	@Column
	private Integer quantity;
	@Column
	private Float cost;
	@Column
	private String category;
	
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Float getCost() {
		return cost;
	}
	public void setCost(Float cost) {
		this.cost = cost;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "KiranaProduct [pid=" + pid + ", productName=" + productName + ", quantity=" + quantity + ", cost="
				+ cost + ", category=" + category + "]";
	}
	
	
}
