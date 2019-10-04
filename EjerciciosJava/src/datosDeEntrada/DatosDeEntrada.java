package datosDeEntrada;

import java.io.File;
import jxl.Sheet;
import jxl.Workbook;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatosDeEntrada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		datosDeEntrada ();

	}
			

	public static void datosDeEntrada () {
		
		//variables de de dtos de entrada 
		
		String nombreMetodo = "";
		String Leer = "";
		String Nombre,telefono,Email,Direccion,Estatus,Fecha ="";
		String guardaErrorCampos ="";
		int fila = 1;
		
		boolean isNombreCliente = false;
		boolean isTelefonoCliente = false;
		boolean isEmailCliente = false;
		boolean isDireccion = false;
		boolean isEstatus = false;
		boolean isFecha = false;
		
		// variables de conexion de la base de datos 
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		// abrir  el archivo de excel 
		
	
		
		
		//try de conexion de la base de datos 
		try
		{
			Workbook workbook  = Workbook.getWorkbook(new File("C:\\Automation\\nombres.xls")); //Pasamos el excel que vamos a leer
			Sheet sheet = workbook.getSheet("DatosDeEntrada");
			
		Class.forName("com.mysql.jdbc.Driver");
		
		String connectionUrl = "jdbc:mysql://174.136.30.161:3306/utest_simple_invoice";
		String connectionUser = "utest_sysfactura";
		String connectionPassword = "utest_sysfactura@123";
		
		conn = DriverManager.getConnection(connectionUrl, connectionUser, connectionPassword);
		
		stmt = conn.createStatement();
			
						 rs = stmt.executeQuery ("select * from clientes");
					
					//System.out.println("antes while");
					 while (rs.next() && fila < sheet.getRows()){
			/*
						System.out.println (rs.getInt ("id_cliente") + "|" + rs.getString ("nombre_cliente") +
								"|" + rs.getString ("telefono_cliente") + "|" + rs.getString ("email_cliente") +
								"|" + rs.getString ("direccion_cliente") + "|" + rs.getInt("status_cliente")  + "|" 
								    + rs.getDate("date_added"));*/
						 
						 Leer = sheet.getCell(6, fila).getContents();
						 
						// System.out.println(Leer);
						 //System.out.println(rs.getString("nombre_cliente"));
						// System.out.println (sheet.getCell(0, fila).getContents());
						  
							if (Leer.equals("SI")) {
								
								//Nombre  = sheet.getCell(1, fila).getContents(); //celda leída
								telefono  = sheet.getCell(1, fila).getContents(); //celda leída
								Email  = sheet.getCell(2, fila).getContents(); //celda leída
								Direccion  = sheet.getCell(3, fila).getContents(); //celda leída
								Estatus  = sheet.getCell(4, fila).getContents(); //celda leída
								Fecha  = sheet.getCell(5, fila).getContents(); //celda leída
								
								System.out.println("BD " + rs.getString ("nombre_cliente") +" "+ "Excel " +sheet.getCell(0, fila).getContents()  );
								
								 // con el signo ! es una negacion de la condiccion para ahorrarnos el ELSE
								 if (!rs.getString ("nombre_cliente").equals(sheet.getCell(0, fila).getContents())&& isNombreCliente == false) {// forma directa 
									 
									 guardaErrorCampos += "nombre_cliente";
									 isNombreCliente = true;
									 
											 
								 } 
								 if ( !rs.getString ("telefono_cliente").equals(telefono)&& isTelefonoCliente== false) {
									 guardaErrorCampos +="telefono_cliente";
									 isTelefonoCliente = true;
								 } 
								  if (!rs.getString ("email_cliente").equals(Email)&& isEmailCliente== false){
									  guardaErrorCampos +="email_cliente";
									  isEmailCliente = true;
									  
								  }
								 if (!rs.getString ("direccion_cliente").equals(Direccion)&& isDireccion== false){
									 guardaErrorCampos +="direccion_cliente";
									 isDireccion = true;
									 
								 }
								  if (!Integer.toString(rs.getInt("status_cliente")).equals(Estatus)&& isEstatus== false) {
									  guardaErrorCampos +="status_cliente";
									  isEstatus = true;
								  }
									
								 
															
						}
						 
							 fila ++;	
							//if( (rs.getDate("date_added"));
						
						
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
		
		
		
	System.out.println(guardaErrorCampos);

	
	
	
	}		
}
	
	

