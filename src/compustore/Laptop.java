package compustore;

import java.io.Serializable;

public class Laptop extends Computadora implements Serializable{

    private String marca;
    private String modelo;
    private String tam_pantalla;
    private String uso;

    public Laptop(double precio, String fecha_alta, String marca, String modelo, String tam_pantalla, String uso) {
        super(precio, fecha_alta);
        this.marca = marca;
        this.modelo = modelo;
        this.tam_pantalla = tam_pantalla;
        this.uso = uso;
        setDescripcion("Laptop");
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTam_pantalla() {
        return tam_pantalla;
    }

    public void setTam_pantalla(String tam_pantalla) {
        this.tam_pantalla = tam_pantalla;
    }

    @Override
    public String toString() {
        return "Laptop " + marca + " " + modelo + ", tamaño pantalla: " + tam_pantalla + ", precio" + getPrecio();
    }
}
