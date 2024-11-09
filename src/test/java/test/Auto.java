package test;

public class Auto {
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;	
	static String cantidadCreados;
	
	public int cantidadAsientos() {
        int contador = 0;
        if (asientos != null) {  
            for (Asiento asiento : asientos) {
                if (asiento != null) {
                    contador++;
                }
            }
        }
        return contador;
    }

    public String verificarIntegridad() {
        if (motor == null || asientos == null) {
            return "Las piezas no son originales";
        }
        
        for (Asiento asiento : asientos) {
            if (asiento != null && (asiento.registro != registro || motor.registro != registro)) {
                return "Las piezas no son originales";
            }
        }
        
        return "Auto original";
    }
}