package test;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DeleteBookDAO {

	public int k=0;
	
	public int delete(String bc) {
		try {
			Connection con=DBConnection.getConnection();
			PreparedStatement ps=con.prepareStatement("DELETE FROM book64 where bcode=?");
            
			ps.setString(1, bc);
			k=ps.executeUpdate();	
		}
		catch(Exception e) {e.printStackTrace();}
		return k;
		
	}
}
