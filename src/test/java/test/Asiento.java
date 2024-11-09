package test;

public class Asiento {
    String color;
    int precio;
    static int registro;
    public void cambiarColor(String nuevoColor) {
        String[] coloresPermitidos = {"azul", "negro", "rojo", "blanco", "gris"};	        
        for (String colorPermitido : coloresPermitidos) {
            if (colorPermitido.equalsIgnoreCase(nuevoColor)) {
                this.color = nuevoColor;
                return; 
            }
        }
    }
}