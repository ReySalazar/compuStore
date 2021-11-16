package compustore;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import javax.swing.JOptionPane;

public class Sistema implements Serializable{

    private DueñoAdministrador da;
    private StockComponentes sc;
    private StockComputadoras spc;
    private StockPerifericos spe;
    private AltaStock as;
    private Ventas v;

    public Sistema() {
        da = new DueñoAdministrador();
        sc = new StockComponentes();
        spc = new StockComputadoras();
        spe = new StockPerifericos();
        as = new AltaStock();
        v = new Ventas();
        da.setSc(sc);
        da.setSpc(spc);
        da.setSpe(spe);
        da.setAs(as);
        as.setSc(sc);
        as.setSpc(spc);
        as.setSpe(spe);
        da.setV(v);
        v.setSc(sc);
        v.setSpc(spc);
        v.setSpe(spe);
    }
    
    public Sistema deSerializar(String a) throws IOException, ClassNotFoundException {
        FileInputStream f = new FileInputStream(a);
        ObjectInputStream o = new ObjectInputStream(f);
        Sistema s = (Sistema) o.readObject();
        o.close();
        f.close();
        return s;
    }

    public void serializar(String a) throws IOException {
        FileOutputStream f = new FileOutputStream(a);
        ObjectOutputStream o = new ObjectOutputStream(f);
        o.writeObject(this);
        o.close();
        f.close();
    }

    public Ventas getV() {
        return v;
    }

    public void setV(Ventas v) {
        this.v = v;
    }

    public AltaStock getAs() {
        return as;
    }

    public void setAs(AltaStock as) {
        this.as = as;
    }

    public DueñoAdministrador getDa() {
        return da;
    }

    public void setDa(DueñoAdministrador da) {
        this.da = da;
    }

    public StockComponentes getSc() {
        return sc;
    }

    public void setSc(StockComponentes sc) {
        this.sc = sc;
    }

    public StockComputadoras getSpc() {
        return spc;
    }

    public void setSpc(StockComputadoras spc) {
        this.spc = spc;
    }

    public StockPerifericos getSpe() {
        return spe;
    }

    public void setSpe(StockPerifericos spe) {
        this.spe = spe;
    }

    void start() {
        boolean corriendo = true;
        while (corriendo){
            corriendo = da.proceder();
        }
        JOptionPane.showMessageDialog(null, "Adiós");
    }
  
}
