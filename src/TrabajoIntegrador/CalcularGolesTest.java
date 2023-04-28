package TrabajoIntegrador;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalcularGolesTest {
	Equipo equipo1 = new Equipo();
	Equipo equipo2 = new Equipo();
	
	@Test
	public void testGanadorEquipo1() {
		CalcularGoles calcularGoles = new CalcularGoles();
		String resultado = calcularGoles.calculargoles(equipo1, 3, 1, equipo2);
		assertEquals("Ganador equipo1", resultado);
	}
	
	@Test
	public void testEmpate() {
		CalcularGoles calcularGoles = new CalcularGoles();
		String resultado = calcularGoles.calculargoles(equipo1, 2, 2, equipo2);
		assertEquals("Empate", resultado);
	}
}
