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
		return asientos.length;
	}
	public String verificarIntegridad(){
		if(Asiento.registro == Motor.registro) {
			return "Auto original";
			
		}
		return "Las piezas no son originales";
	}
}
