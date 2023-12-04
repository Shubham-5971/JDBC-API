import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;


public class FirstJDBC {

	public static void main(String[] args) 
	{	
		try
		{
			String name2 = "amit";
			String email2 = "amit@gmail.com";
			String pass1 = "amit123";
			String gender1 = "male";
			String city1 = "nagpur";
			//load the driver :
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//crating a connection
			
			String url="jdbc:mysql://localhost:3306/college";
			String username="root";
			String password="Shu*7040";
			
			Connection con=DriverManager.getConnection(url,username,password);
			PreparedStatement ps = con.prepareStatement("insert into student values(?,?,?,?,?)");
			ps.setString(1, name2);
			ps.setString(2, email2);
			ps.setString(3, pass1);
			ps.setString(4, gender1);
			ps.setString(5, city1);
			
			int i = ps.executeUpdate();
			if(i>0) {
				System.out.println("success");
			}else {
				System.out.print("fail");
			}
			
			/* if(con.isClosed())
			{
				System.out.println("Connection is closed..");
			}
			else{
				System.out.println("Connection Created...");
			}
			*/
		}catch(Exception e)
		{
			e.printStackTrace();
		}
			
		}
		

	}

