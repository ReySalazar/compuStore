package compustore;

import java.io.Serializable;

public class PlacaVideo extends Componente implements Serializable{

    private String fabricante;
    private String modelo;
    private String cap_memoria;

    public PlacaVideo(double precio, String fecha_alta, String fabricante, String modelo, String cap_memoria, String uso, int cantidad) {
        super(precio, fecha_alta, uso);
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cap_memoria = cap_memoria;
        setDescripcion("Placa de video");
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

    public String getCap_memoria() {
        return cap_memoria;
    }

    public void setCap_memoria(String cap_memoria) {
        this.cap_memoria = cap_memoria;
    }

    @Override
    public String toString() {
        return "Placa de video " + fabricante + " " + modelo + ", memoria: " + cap_memoria + " Gb, precio" + getPrecio();
    }

}
