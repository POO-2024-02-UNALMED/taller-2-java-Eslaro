package test;

public class Asiento {
    String color;
    int precio;
    int registro;
    public void cambiarColor(String nuevoColor) {
        String[] coloresPermitidos = {"azul", "Negro", "Rojo", "Blanco", "Gris"};	        
        for (String colorPermitido : coloresPermitidos) {
            if (colorPermitido.equalsIgnoreCase(nuevoColor)) {
                this.color = nuevoColor;
                return; 
            }
        }
    }
}