package compustore;

import java.io.Serializable;
import javax.swing.JOptionPane;

public class AltaStock implements Serializable {

    private StockComponentes sc;
    private StockComputadoras spc;
    private StockPerifericos spe;
    Ventas v = new Ventas();

    public AltaStock() {

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

    public void darDeAlta() {
        Fecha f = new Fecha();
        boolean cerrar = false;
        char cat, op;
        int cant;
        String fab, mod, frec_max, alta, typ, cap, marca, tec, uso, desc, tam;
        double pre;
        while (!cerrar) {
            do {
                cat = EntradaSalida.leerChar(
                        "CATEGORIAS\n\n"
                        + "[1] Alta - Componente\n"
                        + "[2] Alta - Computadora\n"
                        + "[3] Alta - Periférico\n"
                        + "[4] Volver\n");
            } while (cat < '1' || cat > '4');
            switch (cat) {
                case '1':

                    do {
                        op = EntradaSalida.leerChar(
                                "Componentes\n\n"
                                + "[1] Alta - Procesador\n"
                                + "[2] Alta - Disco Rígido\n"
                                + "[3] Alta - Memoria RAM\n"
                                + "[4] Alta - Placa de Video\n"
                                + "[5] Vover\n");
                    } while (op < '1' || op > '5');
                    switch (op) {
                        case '1':
                            fab = EntradaSalida.leerString("PROCESADOR\nIndique el fabricante: ");
                            mod = EntradaSalida.leerString("PROCESADOR\nIngrese el modelo: ");
                            frec_max = EntradaSalida.leerString("PROCESADOR\nIndique la frecuencia max (Gigahertz): ");
                            pre = Double.parseDouble(EntradaSalida.leerString("PROCESADOR\nIndique el precio: "));
                            alta = f.devuelveFecha();
                            uso = EntradaSalida.leerString("PROCESADOR\nIndique en que dispositivo se puede usar\nDesktop  (D) ");
                            cant = EntradaSalida.leerInt("PROCESADOR\nIngrese la cantidad de este componente que va dar de alta: ");
                            Procesador p = new Procesador(pre, alta, fab, mod, frec_max, uso, cant);
                            sc.agregar(p);
                            EntradaSalida.mostrarString("Agregado correctamente al stock.");
                            break;
                        case '2':
                            typ = JOptionPane.showInputDialog("DISCO DURO\nIndique el tipo:\nMagnético \nSólido");
                            cap = JOptionPane.showInputDialog("DISCO DURO\nIndique la capacidad (Gb): ");
                            pre = Double.parseDouble(JOptionPane.showInputDialog("DISCO DURO\nIndique el precio : "));
                            alta = f.devuelveFecha();
                            uso = EntradaSalida.leerString("DISCO DURO\nIndique en que dispositivo se puede usar\nDesktop (D)\nLaptop   (L)\nAmbos   (A) ");
                            cant = EntradaSalida.leerInt("DISCO DURO\nIngrese la cantidad de este componente que va dar de alta: ");
                            sc.agregar(new DiscoRigido(pre, alta, uso, typ, cap, cant));
                            EntradaSalida.mostrarString("Agregado correctamente al stock.");
                            break;
                        case '3':
                            marca = JOptionPane.showInputDialog("MEMORIA RAM\nIndique la marca : ");
                            pre = Double.parseDouble(JOptionPane.showInputDialog("MEMORIA RAM\nIndique el precio: "));
                            alta = f.devuelveFecha();
                            tec = JOptionPane.showInputDialog("MEMORIA RAM\nIndique la tecnología: ");
                            cap = JOptionPane.showInputDialog("MEMORIA RAM\nIndique capacidad (Gb): ");
                            uso = EntradaSalida.leerString("MEMORIA RAM\nIndique en que dispositivo se puede usar\nDesktop (D)\nLaptop   (L)\nAmbos   (A) ");
                            cant = EntradaSalida.leerInt("MEMMORIA RAM\nIngrese la cantidad de este componente que va dar de alta: ");
                            sc.agregar(new MemoriaRam(pre, alta, marca, tec, cap, uso, cant));
                            EntradaSalida.mostrarString("Agregado correctamente al stock.");
                            break;
                        case '4':
                            fab = JOptionPane.showInputDialog("PLACA DE VIDEO\nIndique el fabricante: ");
                            mod = JOptionPane.showInputDialog("PLACA DE VIDEO\nIngrese el modelo : ");
                            cap = JOptionPane.showInputDialog("PLACA DE VIDEO\nIndique la capacidad (Gb): ");
                            pre = Double.parseDouble(JOptionPane.showInputDialog("PLACA DE VIDEO\nIndique el precio : "));
                            alta = f.devuelveFecha();
                            uso = EntradaSalida.leerString("PLACA DE VIDEO\nIndique en que dispositivo se puede usar\nDesktop (D)\nLaptop   (L)\nAmbos   (A) ");
                            cant = EntradaSalida.leerInt("PLACA DE VIDEO\nIngrese la cantidad de este componente que va dar de alta: ");
                            sc.agregar(new PlacaVideo(pre, alta, fab, mod, cap, uso, cant));
                            EntradaSalida.mostrarString("Agregado correctamente al stock.");
                            break;
                        case '5':
                            EntradaSalida.mostrarString("Adiós");
                            cerrar = true;
                            break;
                    }
                    break;
                case '2':
                    do {
                        op = EntradaSalida.leerChar(
                                "Computadora\n\n"
                                + "[1] Alta - Desktop\n"
                                + "[2] Alta - Laptop\n"
                                + "[3] Volver\n");
                    } while (op < '1' || op > '3');
                    switch (op) {
                        case '1':
                            Procesador p = (Procesador) sc.obtenerComponente("Procesador");
                            DiscoRigido dr = (DiscoRigido) sc.obtenerComponente("Disco Rigido");
                            MemoriaRam mr = (MemoriaRam) sc.obtenerComponente("Memoria RAM");
                            PlacaVideo pv = (PlacaVideo) sc.obtenerComponente("Placa de video");
                            if (p == null || dr == null || mr == null || pv == null) {
                                sc.agregar(p);
                                sc.agregar(dr);
                                sc.agregar(mr);
                                sc.agregar(pv);
                               // EntradaSalida.mostrarString("" + v.calculaPrecioConDescuento());
                                EntradaSalida.mostrarString("No se puede armar una PC, Faltan componentes!!");
                            } else {
                                alta = f.devuelveFecha();
                                double preTotal = p.getPrecio() + dr.getPrecio() + mr.getPrecio() + pv.getPrecio();
                                Desktop d = new Desktop(preTotal, alta, spc.obtenerCantidadComputadoras() + 1);
                                d.setP(p);
                                d.setDr(dr);
                                d.setMr(mr);
                                d.setPv(pv);
                                spc.agregar(d);
                                EntradaSalida.mostrarString("Se ha agregado una Desktop al stock");
                            }
                            break;
                        case '2':
                            marca = EntradaSalida.leerString("LAPTOP\n\nIngrese marca de la laptop a ingresar");
                            mod = EntradaSalida.leerString("LAPTOP\n\nIngrese modelo");
                            tam = EntradaSalida.leerString("LAPTOP\n\nIngrese tamaño de pantalla");
                            uso = EntradaSalida.leerString("LAPTOP\n\nIngrese categoría\nGamer pro\nGama media\nHome office");
                            pre = Double.parseDouble(JOptionPane.showInputDialog("LAPTOP\nIndique el precio: "));
                            alta = f.devuelveFecha();
                            spc.agregar(new Laptop(pre, alta, marca, mod, tam, uso));
                            break;
                        case '3':
                            EntradaSalida.mostrarString("Adiós");
                            cerrar = true;
                            break;
                    }
                    break;
                case '3':
                    do {
                        op = EntradaSalida.leerChar(
                                "Periféricos\n\n"
                                + "[1] Alta - Teclado\n"
                                + "[2] Alta - Monitor\n"
                                + "[3] Alta - Mouse\n"
                                + "[4] Alta - Web cam\n"
                                + "[5] Volver\n");
                    } while (op < '1' || op > '5');
                    switch (op) {
                        case '1':
                            desc = "TECLADO";
                            pre = Double.parseDouble(JOptionPane.showInputDialog("Teclado\nIndique el precio : "));
                            alta = f.devuelveFecha();
                            typ = JOptionPane.showInputDialog("Teclado\nIndique el tipo : ");
                            cant = EntradaSalida.leerInt("Ingrese la cantidad de este componente que va dar de alta: ");
                            spe.agregar(new Periferico(desc, pre, alta, typ, cant));

                            break;
                        case '2':
                            desc = "MONITOR";
                            pre = Double.parseDouble(JOptionPane.showInputDialog("Monitor\nIndique el precio : "));
                            alta = f.devuelveFecha();
                            typ = JOptionPane.showInputDialog("Monitor\nIndique el tipo : ");
                            cant = EntradaSalida.leerInt("Ingrese la cantidad de este componente que va dar de alta: ");
                            spe.agregar(new Periferico(desc, pre, alta, typ, cant));
                            break;
                        case '3':
                            desc = "MOUSE";
                            pre = Double.parseDouble(JOptionPane.showInputDialog("Mouse\nIndique el precio : "));
                            alta = f.devuelveFecha();
                            typ = JOptionPane.showInputDialog("Mouse\nIndique el tipo : ");
                            cant = EntradaSalida.leerInt("Ingrese la cantidad de este componente que va dar de alta: ");
                            spe.agregar(new Periferico(desc, pre, alta, typ, cant));
                            break;
                        case '4':
                            desc = "WEB CAM";
                            pre = Double.parseDouble(JOptionPane.showInputDialog("WebCam\nIndique el precio : "));
                            alta = f.devuelveFecha();
                            typ = JOptionPane.showInputDialog("WebCam\nIndique el tipo : ");
                            cant = EntradaSalida.leerInt("Ingrese la cantidad de este componente que va dar de alta: ");
                            spe.agregar(new Periferico(desc, pre, alta, typ, cant));
                            break;
                        case '5':
                            EntradaSalida.mostrarString("Adiós");
                            cerrar = true;
                            break;
                    }
                case '4':
                    cerrar = true;
                    break;
            }
        }
    }
}
