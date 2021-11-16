package compustore;

import java.io.Serializable;

public class Componente extends CatEquipo implements Serializable{
    
    private String uso;
    
    public Componente(double precio, String fecha_alta, String uso) {
        super(precio, fecha_alta);
        this.uso = uso;
    }
    
    @Override
    public void mostrarDescripcion(){
        
    }
}
