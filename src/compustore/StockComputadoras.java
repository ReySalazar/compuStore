package compustore;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class StockComputadoras implements Serializable{

    private List<Computadora> computadoras;
    
    public StockComputadoras(){
        computadoras = new ArrayList();
    }

    public List<Computadora> getComputadoras() {
        return computadoras;
    }

    public void setComputadoras(List<Computadora> computadoras) {
        this.computadoras = computadoras;
    }

    public void agregar(Computadora c) {
        if (c != null) {
            computadoras.add(c);
        }
    }

    public String obtenerListaComputadoras() {
        String lista = "";
        for (int i = 0; i < computadoras.size(); i++) {
            lista += "[" + (i + 1) + "] " + computadoras.get(i) + "\n";
        }
        return lista;
    }
    
    public int obtenerCantidadComputadoras(){
        return computadoras.size();
    }
}
