import java.sql.*;
public class Delete_prod {
	public static void Product_del() throws Exception {
		String url = "jdbc:mysql://127.0.0.1:3306/product";
		String username = "root";
		String password = "Sheeyam@1450";
		String Query = "delete from detail where product_id='125'";
		Connection con = DriverManager.getConnection(url, username, password);
		PreparedStatement prep = con.prepareStatement(Query);
		prep.executeUpdate();
		prep.close();
		
	}
	public static void main(String[] args) throws Exception {
		Product_del();
	}


}
