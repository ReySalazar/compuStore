package compustore;

import java.io.Serializable;

public class MemoriaRam extends Componente implements Serializable{

    private String marca;
    private String tecnologia;
    private String capacidad;

    public MemoriaRam(double precio, String fecha_alta, String marca, String tecnologia, String capacidad, String uso, int cantidad) {
        super(precio, fecha_alta, uso);
        this.marca = marca;
        this.tecnologia = tecnologia;
        this.capacidad = capacidad;
        setDescripcion("Memoria RAM");
        setCantidad(cantidad);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "MemoriaRam " + marca + " " + tecnologia + ", capacidad: " + capacidad + " Gb, precio" + getPrecio();
    }

}
