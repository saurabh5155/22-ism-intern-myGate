package ism.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PgAdmin4_myGate {
	static String userName = "postgres";
	static String passwod = "root";
	static String url = "jdbc:postgresql://localhost:5432/ism2022_myGate";
	static String driver = "org.postgresql.Driver";

	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, userName, passwod);
			if (con != null) {
				System.out.println("----Database Connected----");
			}
		} catch (SQLException e) {
			System.out.println("PgAdmin4_myGate -> SQLException");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("PgAdmin4_myGate -> ClassNotFoundException");
			e.printStackTrace();
		}
		return con;
	}
	
}
