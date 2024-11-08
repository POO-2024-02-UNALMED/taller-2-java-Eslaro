package test;

public class Asiento {
    String color;
    int precio;
    int registro;
    public void cambiarColor(String nuevoColor) {
        String[] coloresPermitidos = {"Azul", "Negro", "Rojo", "Blanco", "Gris"};	        
        for (String colorPermitido : coloresPermitidos) {
            if (colorPermitido.equals(nuevoColor)) {
                this.color = nuevoColor;
                return; 
            }
        }
    }
}