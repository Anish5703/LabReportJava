//Program to connect with database and retrieve data from the database

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCexample {

	public static void main(String[] args) {
		String tableName = "mytable";
		String url = "jdbc:postgresql://localhost:5432/postgres";
		String user = "postgres";
		String password = "YourStrong@Passw0rd";
		Connection connection = null;
		Statement statement = null;
		
		try {
			
			connection = DriverManager.getConnection(url,user,password);
			if(connection!=null) System.out.println("connection Successful");
			else System.out.println("Connection Unsuccessful");
			
			statement = connection.createStatement();
			String query = "SELECT * FROM "+tableName;
			ResultSet result = statement.executeQuery(query);
			while(result.next())
			{
				System.out.println("\nId: "+result.getInt("id"));
				System.out.println("Name: "+result.getString("name"));
				System.out.println("Age: "+result.getInt("age"));
				System.out.println("Address: "+result.getString("address"));
			}
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		

	}

}
