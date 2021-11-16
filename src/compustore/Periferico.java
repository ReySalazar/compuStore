package compustore;

import java.io.Serializable;

public class Periferico extends CatEquipo implements Serializable{

    private String tipo;
    private String descripcion;

    public Periferico(String descripcion, double precio, String fecha_alta, String tipo, int cantidad) {
        super(precio, fecha_alta);
        this.tipo = tipo;
        this.descripcion = descripcion;
        setCantidad(cantidad);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Periferico: " + descripcion + " " + tipo + " precio: " + getPrecio();
    }
       
    public void mostrarDescripcion(){
        
    }
}
