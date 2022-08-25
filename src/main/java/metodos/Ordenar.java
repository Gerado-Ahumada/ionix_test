package metodos;

import java.util.Arrays;

/**
 *
 * @author gahum
 */
public class Ordenar {
    
    
    public String orden(String numero){
        char Arreglo[] = numero.toCharArray();
        
        // Ordenar el arreglo usando Array.sort
        Arrays.sort(Arreglo);
 
        // Retornamos la nueva cadena ordenada
        return new String(Arreglo);
    }
}

