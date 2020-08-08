package jp.co.internous.node.model.domain;

import java.sql.Timestamp;

public class MstProduct {
	private long id;
	private String productName;
	private String productNamekana;
	private String productDescription;
	private long categoryId;
	private long price;
	private String imageFullpath;
	private String releaseDate;
	private String releaseCompany;
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
	
	public String getProductNamekana() {
		return productNamekana;
	}
	public void setProductNamekana(String productNamekana) {
		this.productNamekana = productNamekana;
	}
	
	public String getProductDescription(){
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	
	public long getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}
	
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	
	public String getImageFullpath() {
		return imageFullpath;
	}
	public void setImageFullpath(String imageFullpath) {
		this.imageFullpath = imageFullpath;
	}
	
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setRealeaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	
	public String getReleaseCompany() {
		return releaseCompany;
	}
	public void setReleaseCompany(String releaseCompany) {
		this.releaseCompany = releaseCompany;
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
