package compustore;

import java.io.Serializable;

public class Ventas implements Serializable{

    private StockComponentes sc;
    private StockComputadoras spc;
    private StockPerifericos spe;
//    private Ventas v;

    public Ventas() {

    }

    public void vender() {
        char op;
        int opV = 0;
        do {
            op = EntradaSalida.leerChar(
                    "VENTAS\n\n"
                    + "[1] Componente\n"
                    + "[2] Computadora\n"
                    + "[3] Periferico\n"
                    + "[4] Volver\n");
        } while (op < '1' || op > '4');
        switch (op) {
            case '1':
                if (sc.getComponentes().size() > 0) {
                    opV = EntradaSalida.leerInt(
                            "Listado de componentes\n\n"
                            + "Indique el código numérico del componente a vender:\n"
                            + sc.obtenerListaComponentes());
                    if (sc.getComponentes().get(opV - 1).getCantidad() == 1) {
                        EntradaSalida.mostrarString("Operación exitosa!!");
                        sc.getComponentes().remove(opV - 1);
                    } else {
                        EntradaSalida.mostrarString("Operación exitosa!!");
                        sc.getComponentes().get(opV - 1).setCantidad(sc.getComponentes().get(opV - 1).getCantidad() - 1);
                    }
                } else {
                    EntradaSalida.mostrarString("Disculpe, no quedan componentes para vender");
                }
                break;
            case '2':
                if (spc.getComputadoras().size() > 0) {
                    opV = EntradaSalida.leerInt(
                            "Listado de Desktops\n\n"
                            + "Indique el código numérico de la Pc a vender:\n"
                            + spc.obtenerListaComputadoras());
                    if (spc.getComputadoras().get(opV - 1).getCantidad() == 1) {
                        EntradaSalida.mostrarString("Operación exitosa!!");
                        EntradaSalida.mostrarString("Se ha aplicado un descuento del 20%\n precio final : " + calculaPrecioConDescuento(spc.getComputadoras().get(opV - 1).getPrecio()));
                        spc.getComputadoras().remove(opV - 1);
                    } else {
                        EntradaSalida.mostrarString("Operación exitosa!!");
                        EntradaSalida.mostrarString("Se ha aplicado un descuento del 20%\n precio final : " + calculaPrecioConDescuento(spc.getComputadoras().get(opV - 1).getPrecio()));
                        spc.getComputadoras().get(opV - 1).setCantidad(spc.getComputadoras().get(opV - 1).getCantidad() - 1);
                    }
                } else {
                    EntradaSalida.mostrarString("Disculpe, no quedan computadoras para vender");
                }
                break;
            case '3':
                if (spe.getPerifericos().size() > 0) {
                    opV = EntradaSalida.leerInt(
                            "Listado de Periféricos\n\n"
                            + "Indique el código numérico del periferico a vender\n\n"
                            + spe.obtenerListaPerifericos());
                    if (spe.getPerifericos().get(opV - 1).getCantidad() == 1) {
                        EntradaSalida.mostrarString("Operación exitosa!!");
                        spe.getPerifericos().remove(opV - 1);
                    } else {
                        EntradaSalida.mostrarString("Operación exitosa!!");
                        spe.getPerifericos().get(opV - 1).setCantidad(spe.getPerifericos().get(opV - 1).getCantidad() - 1);
                    }
                } else {
                    EntradaSalida.mostrarString("Disculpe, no quedan periféricos para vender");
                }
                break;
        }
    }

    public double calculaPrecioConDescuento(double pre) {
        double precioConDescuento;
        precioConDescuento = pre - ((pre * 15) / 100);
        return precioConDescuento;
    }

    public void setSc(StockComponentes sc) {
        this.sc = sc;
    }

    public void setSpc(StockComputadoras spc) {
        this.spc = spc;
    }

    public void setSpe(StockPerifericos spe) {
        this.spe = spe;
    }

//    public Ventas getV() {
//        return v;
//    }
//
//    public void setV(Ventas v) {
//        this.v = v;
//    }
    
}
