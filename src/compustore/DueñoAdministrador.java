package compustore;

import java.io.Serializable;

public class DueñoAdministrador implements Serializable{

    private StockComponentes sc;
    private StockComputadoras spc;
    private StockPerifericos spe;
    private AltaStock as;
    private Ventas v;
    
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

    public DueñoAdministrador() {
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
    
    boolean proceder() {
        
       boolean corriendo = true;
        char op;
        do{
            op = EntradaSalida.leerChar(
                "BIENVENIDO - SISTEMA COMPUSTORE\n\n"
                + "[1] Ventas\n"
                + "[2] Dar de alta Items\n"
                + "[3] SALIR del Sistema\n");
        }while(op < '1' || op > '3');
        switch(op){
            case '1':               
                v.vender();
                break;              
            case '2':           
                as.darDeAlta();
                break;
            case '3':
                corriendo = false;                       
        }

        return corriendo;
    }
    
}
