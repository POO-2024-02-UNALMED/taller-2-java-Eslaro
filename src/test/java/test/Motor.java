package test;

public class Motor {
	int numeroCilindros;
	String tipo;
	static int registro;
	public void cambiarRegistro(int Nuevoregistro) {
		registro = Nuevoregistro;
	}
	public void asignarTipo(String tipo) {
		if(tipo == "gasolina" || tipo == "electrico") {
			this.tipo = tipo;		
		}
	}
}
