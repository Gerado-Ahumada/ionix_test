package clases;

import java.util.Scanner;

/**
 *
 * @author gahum
 */
public class Persona {
    private String nombre;
    private int edad;
    private String email;

//Contructor sin parámetros    
    public Persona() {
        nombre ="Gerardo";
        edad = 36;
        email = "g.ahumada.l@gmail.com";
    }
//Contructor con parámetros
    public Persona(String nombre, int edad, String email) {
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
    }

//Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
        public void ingresarNombre(){
        System.out.println("Desea Ingresar datos");
        Scanner entrada=new Scanner(System.in);
        Scanner nombre=new Scanner(System.in);
        String inputTeclado="";
        inputTeclado = entrada.nextLine ();
        
        if (inputTeclado == "S") {
            System.out.println("Ingrese nombre");
            
            
            System.out.println ("Entrada recibida por teclado es: "); 
            
            
        }
    }
    
       
    
}
