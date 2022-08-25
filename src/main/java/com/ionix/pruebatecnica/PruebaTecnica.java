package com.ionix.pruebatecnica;

import java.util.Scanner;
import menuMain.MenuMain;
import metodos.InvertirCadena;
import metodos.Ordenar;
import metodos.Ingrese_nombre;

/**
 *
 * @author gahum
 */
public class PruebaTecnica {

    public static void main(String[] args) {

        MenuMain menuM = new MenuMain();
        String alternativa = menuM.menu();

        if (alternativa.equals("1")) {
            InvertirCadena in = new InvertirCadena();
            String cadena = "Esta frase debe darse vuelta";
            in.invertir(cadena);
            System.out.println("");
            System.out.println("");
            System.out.println("¿Desea realizar otra operación?");
            System.out.println("Ingresa 1 = Si ");
            System.out.println("Ingresa 2 = No ");
            Scanner entrada = new Scanner(System.in);
            String resp = entrada.nextLine();
            if (resp.equalsIgnoreCase("1")) {
                main(args);
            } else if (resp.equalsIgnoreCase("2")) {
                System.exit(0);
            } else {
                System.out.println("Entrada no válida");
                main(args);
            }

        } else if (alternativa.equals("2")) {
            String numero = "56783192415";
            Ordenar ord = new Ordenar();
            String salida = ord.orden(numero);
            System.out.println("");
            System.out.println("Cadena de entrada : " + numero);
            System.out.println("Cadena de Salida : " + salida);
            System.out.println("");
            System.out.println("");
            System.out.println("¿Desea realizar otra operación?");
            System.out.println("Ingresa 1 = Si ");
            System.out.println("Ingresa 2 = No ");
            Scanner entrada = new Scanner(System.in);
            String resp = entrada.nextLine();
            if (resp.equalsIgnoreCase("1")) {
                main(args);
            } else if (resp.equalsIgnoreCase("2")) {
                System.exit(0);
            } else {
                System.out.println("Entrada no válida");
                main(args);
            }

        } else if (alternativa.equals("3")) {
            Ingrese_nombre ingresar = new Ingrese_nombre();
            ingresar.ingresarNombre();
            System.out.println("");
            System.out.println("");
            System.out.println("¿Desea realizar otra operación?");
            System.out.println("Ingresa 1 = Si ");
            System.out.println("Ingresa 2 = No ");
            Scanner entrada = new Scanner(System.in);
            String resp = entrada.nextLine();
            if (resp.equalsIgnoreCase("1")) {
                main(args);
            } else if (resp.equalsIgnoreCase("2")) {
                System.exit(0);
            } else {
                System.out.println("Entrada no válida");
                main(args);
            }
        } else if (alternativa.equals("4")) {
            System.exit(0);
        } else {
            System.out.println("");
            System.out.println("");
            System.out.println("La alternativa ingresada no es válida, ingresa nuevamente");
            System.out.println("");
            System.out.println("");
            main(args);
        }

    }
}
