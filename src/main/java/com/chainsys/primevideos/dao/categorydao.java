package com.chainsys.primevideos.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.chainsys.primevideos.method.Categorys;

public interface CategoryDAO {
	//insert into categorys (category_id,category_name) values (1,'TVShows');
	void addCategorys(String category) throws Exception;
	//update categorys set category_name = ? where category_id = ?;
	void updatecategory(int categoryid,String categoryname) throws Exception;
	//delete categorys where category_id=?;
	void deleteupdatecategorys(int category_id) throws SQLException, Exception;
	//select * from categorys;
	ArrayList<Categorys> getcategorys() throws Exception;
	
	
}
