package mySql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConexionMySql {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dbConexion();
	}
	
	public static void dbConexion() {
			
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try
		{
			
		Class.forName("com.mysql.jdbc.Driver");
		
		String connectionUrl = "jdbc:mysql://174.136.30.161:3306/utest_simple_invoice";
		String connectionUser = "utest_sysfactura";
		String connectionPassword = "utest_sysfactura@123";
		
		conn = DriverManager.getConnection(connectionUrl, connectionUser, connectionPassword);
		
		stmt = conn.createStatement();
			
						 rs = stmt.executeQuery ("select * from clientes");
					
					//System.out.println("antes while");
					 while (rs.next()){
			
						System.out.println (rs.getInt ("id_cliente") + "|" + rs.getString ("nombre_cliente") +
								"|" + rs.getString ("telefono_cliente") + "|" + rs.getString ("email_cliente") +
								"|" + rs.getString ("direccion_cliente") + "|" + rs.getInt("status_cliente")  + "|" 
								    + rs.getDate("date_added"));
						
						
					}
					rs.close();
					conn.close();
					
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try { if (rs != null) rs.close(); } catch (SQLException e) { e.printStackTrace(); }
			try { if (stmt != null) stmt.close(); } catch (SQLException e) { e.printStackTrace(); }
			try { if (conn != null) conn.close(); } catch (SQLException e) { e.printStackTrace(); }
		}
		}
			

}