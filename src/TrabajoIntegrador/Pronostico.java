package TrabajoIntegrador;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class Pronostico {
	
	int puntos = 0;
	Partido partido_equipo = new Partido();
	Equipo equipo_nombre = new Equipo("", "");
	ResultadoEnum resultado_equipo;
	public String ronda;
	public String Persona;
	 
	
	
	ArrayList<Partido> pronosticos = new ArrayList<>();
	
	public ArrayList<Partido> leerArchivo_equipo(String archivo) {
		
		String equipo1, equipo2;
		File file = new File(archivo);
		
		try (Scanner fileScn = new Scanner(file, StandardCharsets.UTF_8)) {
			while (fileScn.hasNextLine()) {

				String[] vector = (fileScn.nextLine()).split(";");
				equipo1 = vector[0];
				equipo2 = vector[4];
			
				if (vector[1] != "") {
					resultado_equipo = ResultadoEnum.GANA;
				} else if (vector[2] != "") {
					resultado_equipo = ResultadoEnum.PIERDE;
				} else if (vector[3] != "") {
					resultado_equipo = ResultadoEnum.EMPATA;
				}
					
				Equipo Equipo11 = new Equipo (equipo1,equipo1);
				Equipo Equipo22 = new Equipo (equipo2,equipo2);
				
				Partido pronostico = new Partido();
				pronostico.equipo1 = Equipo11;
				pronostico.equipo2 = Equipo22;
				pronostico.resultado = resultado_equipo;
				pronosticos.add(pronostico);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return pronosticos;
	}
	
		
public Equipo getEquipo_nombre() {
		return equipo_nombre;
	}

	public void setEquipo_nombre(Equipo equipo_nombre) {
		this.equipo_nombre = equipo_nombre;
	}
	 public String getRonda() {
			return ronda;
		}


		public void setRonda(String ronda) {
			this.ronda = ronda;
		}


		public String getPersona() {
			return Persona;
		}


		public void setPersona(String persona) {
			Persona = persona;
		}

public int puntos(boolean verdad) {
	if (verdad == true) {
		puntos++;
	}
	return puntos;
}

}