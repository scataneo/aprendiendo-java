
package problema3;

import java.util.Scanner;

public class Problema3 {

   
    public static void main(String[] args) {
        
        Scanner teclado=new Scanner(System.in);
        
        int numero;
        
        System.out.println("Ingresa un numero :");
        
        numero=teclado.nextInt();
        
        if(numero>0){
         
            System.out.println("Es positivo");
            
        }else if(numero<0){
        
            System.out.println("Es negativo");
        }else{
        
            System.out.println("Es nulo");
        }
        
    }
    
}
