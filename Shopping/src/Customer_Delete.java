import java.sql.*;
public class Customer_Delete {
	public static void Customer_del() throws Exception {
		String url = "jdbc:mysql://127.0.0.1:3306/project";
		String username = "root";
		String password = "Sheeyam@1450";
		String Query = "delete from cus where customer_first_name='Gunu'";
		Connection conn = DriverManager.getConnection(url, username, password);
		PreparedStatement prep = conn.prepareStatement(Query);
		prep.executeUpdate();
		prep.close();
		
	}
	public static void main(String[] args) throws Exception {
		Customer_del();
	}

}
