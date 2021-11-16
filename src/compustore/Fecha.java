package compustore;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Fecha {

    private int mes; // 1-12
    private int dia; // 1-31 con base en el mes
    private int anio; // cualquier año

    private static final int[] diasPorMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    
    public Fecha(){
        
    }

    // constructor: confirma el valor apropiado para el mes y el día, dado el año;
    public Fecha(int mes, int dia, int anio) {
        // revisa si el mes está en el rango
        if (mes <= 0 || mes > 12) {
            throw new IllegalArgumentException("mes(" + mes + ") debe ser 1-12");
        }
        // revisa si dia está en el rango para mes
        if (dia <= 0 || (dia > diasPorMes[mes] && !(mes == 2 && dia == 29))) {
            throw new IllegalArgumentException("dia (" + dia + ") fuera de rango para el mes y anio especificados");
        }
        // revisa si es año bisiesto cuando mes es 2 y dia es 29
        if (mes == 2 && dia == 29 && !(anio % 400 == 0 || (anio % 4 == 0 && anio % 100 != 0))) {
            throw new IllegalArgumentException("ia (" + dia + ") fuera de rango para el mes y anio especificados");
        }

        this.mes = mes;

        this.dia = dia;

        this.anio = anio;

        System.out.printf("Constructor de objeto Fecha para la fecha %s%n", this);
    }

    // devuelve un objeto String de la forma dia/mes/anio
    @Override
    public String toString() {
        return String.format("%d/%d/%d", dia, mes, anio);
    }

    public String devuelveFecha() {
        Date objDate = new Date(); // Sistema actual La fecha y la hora se asignan a objDate 
        String strDateFormat = "dd-MMMM-yyyy"; // El formato de fecha está especificado 
        SimpleDateFormat objSDF = new SimpleDateFormat(strDateFormat); // La cadena de formato de fecha se pasa como un argumento al objeto de formato de fecha
        String strFecha = objSDF.format(objDate);  // El formato de fecha se aplica a la fecha actual
        return strFecha;
    }
} // fin de la clase Fecha
