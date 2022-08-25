package metodos;

/**
 *
 * @author gahum
 */
public class InvertirCadena {

    
    public void invertir(String cadena){
    StringBuilder stringBuilder = new StringBuilder(cadena);
    String invertida = stringBuilder.reverse().toString();

    System.out.println ("Cadena original: " + cadena);
    System.out.println ("Cadena invertida: " + invertida);
        
        
    } 
    
    
}
