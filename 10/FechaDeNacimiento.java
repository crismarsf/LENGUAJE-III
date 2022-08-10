
package fechadenacimiento;
import java.util.Scanner;
/**
 *
 * @author cristhian
 */
public class FechaDeNacimiento {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);  //Se crea un objeto Scanner
                   String nombre;
                   int edad;
                   String pais=null;

        System.out.print("Introduzca su nombre: ");       
        nombre = sc.nextLine();  //leer un String de nombre
        
        System.out.print("Introduzca su edad actual: ");
        edad = sc.nextInt(); //leer un int de edad
                      
        System.out.print("Introduzca su pais: ");
        pais = sc.next(); //leer un String de pais
        
        System.out.println("Hola " + nombre);
        System.out.println("Su fecha de nacimiento es: " + Math.abs(2020-edad));  
        System.out.println("Su pais es: " + pais);
        
    }
    
}
