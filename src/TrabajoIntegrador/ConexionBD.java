package TrabajoIntegrador;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConexionBD {
	public String servidor; // = "jdbc:mysql://localhost:3306/";
	public String DBnombre; //="integrador_bd";
	public String driver; // = "com.mysql.jdbc.Driver";
	public String username; // = "root";
	public String password; // = "123456";

	 ConexionBD(){
	 	 Properties properties= new Properties();
			    try {
			      properties.load(new FileInputStream(new File("ConexString.properties")));
			      this.servidor= (String) properties.get("servidor");
			      this.DBnombre= (String) properties.get("DBnombre");
			      this.driver= (String) properties.get("driver");
			      this.username= (String) properties.get("username");
			      this.password= (String) properties.get("password");
			     
			    } catch (FileNotFoundException e) {
			      // TODO Auto-generated catch block
			      e.printStackTrace();
			    } catch (IOException e) {
			      // TODO Auto-generated catch block
			      e.printStackTrace();
			    }	
	 }

	 private Connection con;

	 public void Conexion()
	 {
	     try {
	        
	         Class.forName(driver);

	        
	         con = DriverManager.getConnection(servidor + DBnombre , username, password);

	         System.out.println("Conexión realizada a la base de datos con éxito.");
	     } catch (ClassNotFoundException | SQLException e) {
	         System.out.println("Error!, conexión fallida a la base de datos.");
	     }
	 }

	 public Connection getConnection() {
	 	Conexion();
	     return con; 
	 }
	}

