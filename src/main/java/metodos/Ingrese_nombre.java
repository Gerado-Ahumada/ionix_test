package metodos;
import  clases.Persona;
import java.util.ArrayList;
import java.util.Scanner; 

public class Ingrese_nombre {
public ArrayList<Persona>ListadoPersona= new ArrayList<Persona>();  

public String consultaIngreso(){
        System.out.println ("*******************");
        System.out.println("¿Deseas Ingresar datos?");
        System.out.println ("*******************");
        System.out.println("------Ingresa--------");
        System.out.println("|   S(si)   N(no)   |");
        Scanner entrada = new Scanner(System.in);
        String inputTeclado = entrada.nextLine();
        
        return inputTeclado;    
}
   public void ingresarNombre(){    
        
        Persona persona = new Persona();
        String inputTeclado = consultaIngreso();
        
        if (inputTeclado.equalsIgnoreCase("s")) {
            System.out.println("Ingresa el nombre de la persona");
            Scanner ingresarNombre = new Scanner(System.in);
            String nombre = ingresarNombre.nextLine();
            persona.setNombre(nombre);
            
            System.out.println("Ingresa edad de la persona");
            Scanner ingresarEdad = new Scanner(System.in);
            String edad = ingresarEdad.nextLine();
            persona.setEdad(Integer.parseInt(edad));
            
            System.out.println("Ingresa email de la persona");
            Scanner ingresarEmail = new Scanner(System.in);
            String mail = ingresarEmail.nextLine();
            persona.setEmail(mail);
            
            ListadoPersona.add(persona);
            ingresarNombre();
        }
        
        else if (inputTeclado.equalsIgnoreCase("n")) {
            System.out.println("");
            System.out.println("***********Datos Registrados*************");
            System.out.println("");
            for(Persona lista : ListadoPersona) {                
                System.out.println("Nombre : "+lista.getNombre()+" Edad : " + lista.getEdad()+ " Email : " + lista.getEmail() );
                
            }
                      
       }       
        
        
        else {
            System.out.println("Entrada no válida, debes ingresar S(Si)ó N (No)");
        }
            
            
        
    }
 
}
