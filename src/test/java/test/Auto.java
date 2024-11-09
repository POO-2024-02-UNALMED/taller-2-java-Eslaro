package test;

public class Auto {
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	String cantidadCreados;
	
	public int cantidadAsientos(){
	    int contador = 0;
	    for (Asiento asiento : asientos) {
	        if (asiento != null) {
	            contador++;
	        }
	    }
	    return contador;
	}
	public String verificarIntegridad(){
		if(Asiento.registro == Motor.registro) {
			return "Auto original";
			
		}
		return "Las piezas no son originales";
	}
}
