import java.sql.*;
public class Update_Customer {
	public static void Customer_update() throws Exception {
		String url = "jdbc:mysql://127.0.0.1:3306/project";
		String username = "root";
		String password = "Sheeyam@1450";
		String Query = "update cus set customer_last_name='Nagaiah' where customer_id=465523";
		Connection con = DriverManager.getConnection(url, username, password);
		PreparedStatement prep = con.prepareStatement(Query);
		prep.executeUpdate();
		con.close();
	}
	public static void main(String[] args) throws Exception {
		Customer_update();
	}
}
