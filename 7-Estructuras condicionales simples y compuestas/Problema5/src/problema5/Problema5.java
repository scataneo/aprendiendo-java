
package problema5;

import java.util.Scanner;

public class Problema5 {

    public static void main(String[] args) {
        
        Scanner teclado=new Scanner(System.in);
        
        int numero;
        
        System.out.println("Ingresa un numero entre 1 y 99:");
        
        numero=teclado.nextInt();
        
        if(numero>=10){
         
            System.out.println("EL valor  " + numero + " tiene dos digitos");
        
        }else{
        
            System.out.println("EL valor  " + numero + " tiene un digito");
        }
    }
    
}
