package compustore;

import java.io.Serializable;

public class DiscoRigido extends Componente implements Serializable{

    private String tipo;
    private String capacidad;

    public DiscoRigido(double precio, String fecha_alta, String uso, String tipo, String capacidad, int cantidad) {
        super(precio, fecha_alta, uso);
        this.tipo = tipo;
        this.capacidad = capacidad;
        setDescripcion("Disco Rigido");
        setCantidad(cantidad);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Disco Rigido " + tipo + ", capacidad: " + capacidad + " Gb, precio: " + getPrecio();
    }

}
