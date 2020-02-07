package com.chainsys.primevideos.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.chainsys.primevideos.method.Categorys;

public interface CategoryDAO {

	void addCategorys(String category) throws Exception;

	void updateCategory(int categoryid,String categoryname) throws Exception;

	void deleteUpdateCategorys(int categoryId) throws SQLException, Exception;

	ArrayList<Categorys> getcategorys() throws Exception;
	
	
}
