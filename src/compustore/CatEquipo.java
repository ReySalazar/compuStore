package compustore;

import java.io.Serializable;

public abstract class CatEquipo implements Serializable{

    private String descripcion;
    private double precio;
    private String fecha_alta;
    private int cantidad = 0;

    public CatEquipo(double precio, String fecha_alta) {
        this.precio = precio;
        this.fecha_alta = fecha_alta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getFecha_alta() {
        return fecha_alta;
    }

    public void setFecha_alta(String fecha_alta) {
        this.fecha_alta = fecha_alta;
    }
    
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public abstract void mostrarDescripcion();

}
