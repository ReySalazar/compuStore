package compustore;

import java.io.IOException;

public class CompuStore {

    public static void main(String[] args) throws IOException {
        Sistema s = new Sistema();
        try {
            s = s.deSerializar("compustore.txt");
            EntradaSalida.mostrarString("BIENVENDO AL SISTEMA COMPUSTORE");
        } catch (IOException | ClassNotFoundException e) {
            EntradaSalida.mostrarString("CARGANDO SISTEMA 1ra VEZ");
        }
        s.start();   
        s.serializar("compuStore.txt");
    }
}
