
package problema4;

import java.util.Scanner;

public class Problema4 {

  
    public static void main(String[] args) {
        
        Scanner teclado=new Scanner(System.in);
        
        int numero;
        
        System.out.println("Ingresa un numero del 1 al 900");
        
        numero=teclado.nextInt();
        
        if(numero>100 && numero<1000){
        
            System.out.println("Tiene 3 cifras");
            
        }else if(numero<100 && numero>=10){
        
            System.out.println("Tiene 2 cifras");
            
        }else if(numero<10){
        
             System.out.println("Tiene 1 cifra");
             
        }else {
        
             System.out.println("error tiene 4 cifras");
        }
        
    }
    
}
