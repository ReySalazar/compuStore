package compustore;

import java.io.Serializable;

public class Computadora extends CatEquipo implements Serializable{

    public Computadora(double precio, String fecha_alta) {
        super(precio, fecha_alta);
    }
    
    public void mostrarDescripcion(){
        
    }

}
