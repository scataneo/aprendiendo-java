
package problema1;

import java.util.Scanner;


public class Problema1 {

    
    public static void main(String[] args) {
        
        //Importamos la clase scanner para ingresar numeros por teclado
        Scanner teclado=new Scanner(System.in);
        // Declaracion de la variable sueldo e inicializada.
        int sueldo=0;
        
        System.out.println("Ingresa tu sueldo:");
        
        //Guardamos el dato ingresado en la variable suledo
        sueldo=teclado.nextInt();
        
        //Usamos el if para ver la condicion
        if(sueldo > 3000){
        
            System.out.println("Debes pagar impuestos");
        }else{
        
            System.out.println("Tu sueldo es  "  + sueldo  +  " y no debe pagar impuestos");
        }
        
    }
    
}
