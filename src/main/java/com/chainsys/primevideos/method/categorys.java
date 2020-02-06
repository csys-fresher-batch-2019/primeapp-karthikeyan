package com.chainsys.primevideos.method;

public class Categorys {
	private int categoryId;
	private String categoryName;
	
	public Categorys(int categoryId, String categoryName) {
		super();
		this.setCategoryId(categoryId);
		this.setCategoryName(categoryName);
	}

	public Categorys() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "categorys [categoryId=" + getCategoryId() + ", categoryName=" + getCategoryName() + "]";
	}

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
	

}
