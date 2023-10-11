import java.sql.*;
public class Update_prod {
	public static void Product_update() throws Exception {
		String url = "jdbc:mysql://127.0.0.1:3306/product";
		String username = "root";
		String password = "Sheeyam@1450";
		String Query = "update detail set product_price='₹3,200' where product_id='564'";
		Connection con = DriverManager.getConnection(url, username, password);
		PreparedStatement prep = con.prepareStatement(Query);
		prep.executeUpdate();
		con.close();
	}
	public static void main(String[] args) throws Exception {
		Product_update();
	}
}

