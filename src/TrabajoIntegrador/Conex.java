package TrabajoIntegrador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conex {
	public static void conexionBD(int Operacion ) {
		try {
			ConexionBD conn = new ConexionBD();
			Connection conexion = conn.getConnection();
			if (Operacion == 1) {
			ResultSet rs= SelectPersonas(conexion);
			while (rs.next()) {
				System.out.println( rs.getRow() +"| " + rs.getString("Nombre")+ " | " + rs.getString("Puntos"));
	}
			}
			if (Operacion == 2) {
				CalcularPuntaje(conexion) ;
				ResultSet rs= SelectPersonas(conexion);
				while (rs.next()) {
					System.out.println( rs.getRow() +"| " + rs.getString("Nombre")+ " | " + rs.getString("Puntos"));
		}
				}
			
		
		} catch (Exception e) {System.out.println("Error!"+ e);}
		
	}
	
	public static ResultSet SelectPersonas(Connection con) {
		ResultSet rs = null;
		try {
			String Selectquery = "select * from persona" ;
			Statement st = con.createStatement(); 
			return  rs = st.executeQuery(Selectquery);
		} catch (SQLException e) {
			System.out.println("Error!, Metodo SelectTablas");
		}
		return rs;
		
		
	}
	
	public static void CalcularPuntaje(Connection con) {
		ResultSet rs = null;
		 String UpdatePuntaje="";
		try {
			String Selectquery = "select * from pronostico" ;
			Statement st = con.createStatement(); 
			 rs = st.executeQuery(Selectquery);
			 while (rs.next()) {
				 if(rs.getInt("IdResultadoPron")== 1)
				 { int TresPtos=3;
				 UpdatePuntaje = "UPDATE persona SET Puntos= Puntos + " + TresPtos  + " WHERE idPersona= " + rs.getInt("IdPersona") ;
			     }	
				 if(rs.getInt("IdResultadoPron")== 2)
				 { int CeroPtos=0;
				 UpdatePuntaje = "UPDATE persona SET Puntos= Puntos + " + CeroPtos  +  " WHERE idPersona= " + rs.getInt("IdPersona") ;
			     }	
				 if(rs.getInt("IdResultadoPron")== 3)
				 { int CincoPtos=5;
				  UpdatePuntaje = "UPDATE persona SET Puntos= Puntos + " + CincoPtos  +  " WHERE idPersona= " + rs.getInt("IdPersona") ;
			     }	
				 PreparedStatement sentencia = con.prepareStatement(UpdatePuntaje);
				 sentencia.executeUpdate();
				 }
		} catch (SQLException e) {
			System.out.println("Error!, no se actualizo");
		}
		
		
	}
	
	public static void main(String[] args) {
		// conexionBD(1);
		conexionBD(2);
		
		
		
	}

}
