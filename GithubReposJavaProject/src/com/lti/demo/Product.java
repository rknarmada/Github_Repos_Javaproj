package com.lti.demo;

public class Product {
	
	public int prdId;
	public String prdName;
	public float prdCost;
	@Override
	public String toString() {
		return "Product [prdId=" + prdId + ", prdName=" + prdName + ", prdCost=" + prdCost + "]";
	}
	public int getPrdId() {
		return prdId;
	}
	public void setPrdId(int prdId) {
		this.prdId = prdId;
	}
	public String getPrdName() {
		return prdName;
	}
	public void setPrdName(String prdName) {
		this.prdName = prdName;
	}
	public float getPrdCost() {
		return prdCost;
	}
	public void setPrdCost(float prdCost) {
		this.prdCost = prdCost;
	}
	public Product() {
		super();
	}
	public Product(int prdId, String prdName, float prdCost) {
		super();
		this.prdId = prdId;
		this.prdName = prdName;
		this.prdCost = prdCost;
	}
	

}
