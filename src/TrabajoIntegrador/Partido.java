package TrabajoIntegrador;

public class Partido {
	 Equipo equipo1;
	    Equipo equipo2;
	    int golesEquipo1;
	    int golesEquipo2;
	    
	  

		public ResultadoEnum resultado;
	    
		public Partido () { }
	    public Partido(Equipo equipo1, Equipo equipo2,int  golesEquipo1 , int  golesEquipo2) {
	        this.equipo1 = equipo1;
	        this.equipo2 = equipo2;
	        this.golesEquipo1 = golesEquipo1;
	        this.golesEquipo2 = golesEquipo2;
	    }

	    public Equipo getEquipo1() {
	        return equipo1;
	    }

	    public Equipo getEquipo2() {
	        return equipo2;
	    }
	    public void setEquipo1(Equipo equipo1) {
	        this.equipo1 = equipo1;
	    }
	    public void setEquipo2(Equipo equipo2) {
	        this.equipo2 = equipo2;
	    }
	    public int getGolesEquipo1() {
	        return golesEquipo1;
	    }

	    public int getGolesEquipo2() {
	        return golesEquipo2;
	    }
	  
	    public void setGolesEquipo1(int golesEquipo1) {
	        this.golesEquipo1 = golesEquipo1;
	    }

	    public void setGolesEquipo2(int golesEquipo2) {
	        this.golesEquipo2 = golesEquipo2;
	    }
	    
	   /*public ResultadoEnum resultado(Equipo equipo){
	        if (equipo.getNombre().equals(equipo1.getNombre())){
	            if (golesEquipo1 > golesEquipo2){
	                return ResultadoEnum.GANA;
	            }
	            if (golesEquipo1<golesEquipo2){
	                return ResultadoEnum.PIERDE;
	            } else return ResultadoEnum.EMPATA;
	        }
	        if (equipo.getNombre().equals(equipo2.getNombre())){
	            if (golesEquipo2>golesEquipo1){
	                return ResultadoEnum.GANA;
	            }
	            if (golesEquipo2<golesEquipo1){
	                return ResultadoEnum.PIERDE;
	            } else return ResultadoEnum.EMPATA;
	        }        
	        return null;
	    }*/
}
