package jp.co.internous.node.model.domain.dto;


import java.sql.Timestamp;


public class CartDto {
	private long id;
	private String productName;
	private String imageFullpath;
	private long price;
	private long productCount;
	private long subtotal;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public String getImageFullpath() {
		return imageFullpath;
	}
	public void setImageFullpath(String imageFullpath) {
		this.imageFullpath = imageFullpath;
	}
	
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	
	public long getProductCount() {
		return productCount;
	}
	public void setProductCount(long productCount) {
		this.productCount = productCount;
	}
	
	public long getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(long subtotal) {
		this.subtotal = subtotal;
	}
	
	public Timestamp getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
	
	public Timestamp getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	
	
}

