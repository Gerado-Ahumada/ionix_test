package menuMain;

import java.util.Scanner;

/**
 *
 * @author gahum
 */
public class MenuMain {

    public String menu() {
        System.out.println("************************");
        System.out.println("Resultado prueba técnica");
        System.out.println("************************");
        System.out.println("Ingrese el número del método que desea visualizar");
        System.out.println("");
        System.out.println("1. Método Invertir Cadena");
        System.out.println("2. Método Ordenar Cadena");
        System.out.println("3. Método Ingreso de Datos");
        System.out.println("4. Salir");
        Scanner entrada = new Scanner(System.in);
        String alternativa = entrada.nextLine();

        return alternativa;
    }
}
