import java.sql.*;
public class Insert_ProdDetails {
	public static void Product_Details() throws Exception {
		String url="jdbc:mysql://127.0.0.1:3306/product";
		String username="root";
		String password = "Sheeyam@1450";
		String Query="insert into detail values (?,?,?,?,?,?,?)";
		Connection con= DriverManager.getConnection(url,username,password);
		PreparedStatement prep = con.prepareStatement(Query);
		prep.setInt(1,234);
		prep.setString(2, "Realme");
		prep.setString(3, "Mobile Phone");
		prep.setString(4,"realme narzo N53");
		prep.setString(5,"Feather Gold,Feather Black");
		prep.setInt(6, 24);
		prep.setString(7, "₹7,999");
		
		prep.setInt(1,564);
		prep.setString(2, "ASICS");
		prep.setString(3, "Men's Foot Wear");
		prep.setString(4,"ASICS Mens Gel-Sonoma 7Running Shoe");
		prep.setString(5,"Deep Ocean/Gris Blue,Black/Bright Orange");
		prep.setInt(6, 34);
		prep.setString(7, "₹3,507");
		
		prep.setInt(1,76);
		prep.setString(2, "Noise");
		prep.setString(3, "Wrist Watch");
		prep.setString(4,"NoiseFit Halo Plus");
		prep.setString(5,"Elite Silver,Elite Blue,Forest green");
		prep.setInt(6, 12);
		prep.setString(7, "₹3,299");
		
		prep.setInt(1,125);
		prep.setString(2, "Lenova");
		prep.setString(3, "Laptop");
		prep.setString(4,"IdeaPad 3");
		prep.setString(5,"Black");
		prep.setInt(6, 18);
		prep.setString(7, "₹30,990");
		
		prep.executeUpdate();
		con.close();
		System.out.println("Product details inserted successfully");
	}
	
	public static void main(String[]args) throws Exception {
		Product_Details();
	}
	

}
