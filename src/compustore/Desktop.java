package compustore;

import java.io.Serializable;

public class Desktop extends Computadora implements Serializable{
    private Procesador p;
    private MemoriaRam mr;
    private DiscoRigido dr;
    private PlacaVideo pv;

    public Desktop(double precio, String fecha_alta, int cantidad) {
        super(precio, fecha_alta);
        setDescripcion("Desktop"); 
        setCantidad(cantidad);
    }

    public Procesador getP() {
        return p;
    }

    public void setP(Procesador p) {
        this.p = p;
    }

    public MemoriaRam getMr() {
        return mr;
    }

    public void setMr(MemoriaRam mr) {
        this.mr = mr;
    }

    public DiscoRigido getDr() {
        return dr;
    }

    public void setDr(DiscoRigido dr) {
        this.dr = dr;
    }

    public PlacaVideo getPv() {
        return pv;
    }

    public void setPv(PlacaVideo pv) {
        this.pv = pv;
    }
    
    @Override
    public String toString() {
        return "Desktop " + ", precio" + getPrecio();
    }

}
