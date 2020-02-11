package com.chainsys.primevideos.dao;

import java.util.ArrayList;

import com.chainsys.primevideos.method.Categorys;

import exception.DbException;

public interface CategoryDAO {


	void updateCategory(int categoryid,String categoryname) throws DbException;

	void deleteUpdateCategorys(int categoryId) throws  DbException;

	ArrayList<Categorys> getcategorys() throws DbException;
	
	
}
