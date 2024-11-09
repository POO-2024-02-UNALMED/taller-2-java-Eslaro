package test;

public class Asiento {
    String color;
    int precio;
    int registro;

    public boolean cambiarColor(String nuevoColor) {
        String[] coloresPermitidos = {"rojo", "verde", "amarillo", "negro", "blanco"};	        
        for (String colorPermitido : coloresPermitidos) {
            if (nuevoColor == colorPermitido) {
                this.color = nuevoColor;
                return true;  
            }
        }
        return false;  
    }
}
