package categorys;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public interface categorydao {
	//insert into categorys (category_id,category_name) values (1,'TVShows');
	void addCategorys(String category) throws Exception;
	//update categorys set category_name = ? where category_id = ?;
	void updatecategory(int categoryid,String categoryname) throws Exception;
	//delete categorys where category_id=?;
	void deleteupdatecategorys(int category_id) throws SQLException, Exception;
	//select * from categorys;
	ArrayList<categorys> getcategorys() throws Exception;
	
	
}
