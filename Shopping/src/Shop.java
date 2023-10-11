import java.sql.*;
public class Shop {
	public static void customer() throws Exception {
		String url = "jdbc:mysql://127.0.0.1:3306/project";
		String username = "root";
		String password = "Sheeyam@1450";
		String Query = "insert into cus values (?,?,?,?,?,?,?)";
		Connection con = DriverManager.getConnection(url, username, password);
		PreparedStatement prep = con.prepareStatement(Query);
		prep.setString(1,"264587");
		prep.setString(2, "Sheeyam");
		prep.setString(3, "Murugesan");
		prep.setInt(4,21);
		prep.setString(5, "sheeyam.muru15@gmail.com");
		prep.setString(6, "191/1 indira nagar north,Palani");
		prep.setString(7,"9791205900");
		
		prep.setString(1,"619828");
		prep.setString(2, "Jeevan");
		prep.setString(3, "Murugesan");
		prep.setInt(4,25);
		prep.setString(5, "jeevankals@gmail.com");
		prep.setString(6, "191/1 indira nagar north,Palani");
		prep.setString(7,"8610887488");
		
		prep.setString(1,"465523");
		prep.setString(2, "Kuberan");
		prep.setString(3, "-");
		prep.setInt(4,21);
		prep.setString(5, "kubevels@gmail.com");
		prep.setString(6, "Ramalingapuram near ambathkar college,Thiruvallur");
		prep.setString(7,"6369381558");
		prep.setString(1,"565624");
		
		prep.setString(2, "Deepak");
		prep.setString(3, "Prabakar");
		prep.setInt(4,21);
		prep.setString(5, "deepak18tamilnadu@gmail.com");
		prep.setString(6, "ICF colony,villivakam,Chennai");
		prep.setString(7,"7871130280");
		prep.setString(1,"158963");
		
		prep.setString(2, "Gunu");
		prep.setString(3, "Sekar");
		prep.setInt(4,21);
		prep.setString(5, "gunusekar32@gmail.com");
		prep.setString(6, "Veltech junction,avadi,Chennai");
		prep.setString(7,"9884176870");
		prep.executeUpdate();
		con.close();
		System.out.println("Details inserted successfully");
	}
	public static void main (String[] args) throws Exception {
		customer();
	}

}
