package compustore;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class StockComponentes implements Serializable{

    private List<Componente> componentes;

    public StockComponentes() {
       componentes = new ArrayList<>();
    }
    
    public List<Componente> getComponentes() {
        return componentes;
    }

    public void setComponentes(List <Componente> componentes) {
        this.componentes = componentes;
    }

    public void agregar(Componente c) {
        if (c != null) {
            componentes.add(c);
        }
    }

    public String obtenerListaComponentes() {
        String lista = "";
        for (int i = 0; i < componentes.size(); i++) {
            lista += "[" + (i + 1) + "] " + componentes.get(i) + "\n";
        }
        return lista;
    }
    public int obtenerCantidadComponentes(){
        return componentes.size();
    }
    
    public Componente obtenerComponente(String descripcion) {
        Componente componenteEncontrado = null;
        for (Componente c : componentes) {
            if(c.getDescripcion().equals(descripcion)){
                componenteEncontrado = c;
                if(componenteEncontrado.getCantidad() > 0){
                    componenteEncontrado.setCantidad(componenteEncontrado.getCantidad() - 1);
                }else{
                    componentes.remove(c);
                }
                break;
            }
        }
        return componenteEncontrado;
    }
}
