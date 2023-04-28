package TrabajoIntegrador;

public class CalcularGoles {
	public String calculargoles(Equipo equipo1, int golEquipo1, int golEquipo2, Equipo equipo2) {
	 	   
		if (golEquipo1 > golEquipo2) {
	        return "Ganador equipo1" ;
	    } else if (golEquipo1 < golEquipo2) {
	        return "Ganador equipo2" ;
	    } else {
	        return "Empate";
	    }
	}
}
