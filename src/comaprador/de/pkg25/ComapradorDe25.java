/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comaprador.de.pkg25;

import java.util.Scanner; //importa la libreria Scanner para hacer uso de la sentencia

/**
 *22
 * @author Ivan Ramirez
 */
public class ComapradorDe25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Scanner leer = new Scanner(System.in); //Scanner lee los datos que ingresa el usuario por teclado
        
        System.out.println("Ingresar dos numeros (Usar Enter despues de ingresar cada numero)");
        int n1,n2,n3;  //se declaran tres variables de tipo entero
        n1=leer.nextInt(); //lee los datos  y los almacena en cada variable
        n2=leer.nextInt();
      
        if (n1>25 && n2>25) {
            System.out.println("los dos numeros son mayores a 25");
        }
            else if (n1>25) {
                    System.out.println("el primer numero es mayor a 25");
                    
            }
            else if (n2>25) {
                System.out.println("El segundo numero es mayor a 25");
            }
                else {
                        System.out.println("Ninguno de los numeros es mayor a 25");
                        }
            }
    }

        
        
       
        
    
 
    

