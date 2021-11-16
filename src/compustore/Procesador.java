package compustore;

import java.io.Serializable;

public class Procesador extends Componente implements Serializable{

    private String fabricante;
    private String modelo;
    private String frecuencia_max;

    public Procesador(double precio, String fecha_alta, String fabricante, String modelo, String frecuencia_max, String uso, int cantidad) {
        super(precio, fecha_alta, uso);
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.frecuencia_max = frecuencia_max;
        setDescripcion("Procesador");
        setCantidad(cantidad);
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFrecuencia_max() {
        return frecuencia_max;
    }

    public void setFrecuencia_max(String frecuencia_max) {
        this.frecuencia_max = frecuencia_max;
    }

    @Override
    public String toString() {
        return "Procesador "+ fabricante + " " + modelo + ", frecuencia máxima: " + frecuencia_max + ", precio: " + getPrecio();
    }

}
