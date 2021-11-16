package compustore;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class StockPerifericos implements Serializable{

    private List<Periferico> perifericos;
    
    public StockPerifericos(){
        perifericos = new ArrayList<>();
    }

    public List<Periferico> getPerifericos() {
        return perifericos;
    }

    public void setPerifericos(List <Periferico> perifericos) {
        this.perifericos = perifericos;
    }

    public void agregar(Periferico p) {
        if (p != null) {
            perifericos.add(p);
        }
    }

    public String obtenerListaPerifericos() {
        String lista = "";
        for (int i = 0; i < perifericos.size(); i++) {
            lista += "[" + (i + 1) + "] " + perifericos.get(i) + "\n";
        }
        return lista;
    }
}
