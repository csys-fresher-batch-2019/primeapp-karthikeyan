package com.chainsys.primevideos.method;

public class Categorys {
	public Categorys(int categoryId, String categoryName) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
	}
	public Categorys() {
		// TODO Auto-generated constructor stub
	}
	private int categoryId;
	private String categoryName;
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	@Override
	public String toString() {
		return "Categorys [categoryId=" + categoryId + ", categoryName=" + categoryName + "]";
	}
	
}