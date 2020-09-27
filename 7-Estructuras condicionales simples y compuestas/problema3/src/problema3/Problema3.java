
package problema3;

import java.util.Scanner;


public class Problema3 {

    
    public static void main(String[] args) {
        // Importar scanner
        Scanner teclado=new Scanner(System.in);
        
        //Declarar dos variables
        int num1,num2;
        
        System.out.println("Ingresa un numero :");
        
        num1=teclado.nextInt();
        
        System.out.println("Ingresa otro numero :");
        
        num2=teclado.nextInt();
        
        if(num1>num2){
         
            num1=num1+num2;
            
            System.out.println("La suma es " + num1 );
            
            num1=num1-num2;
            
            System.out.println(" Y su diferencia es  "  + num1);
               
         }else{
        
            num1=num1*num2;
            
            System.out.println("El Producto es  "  + num1);
            
            num1=num1/num2;
            
            System.out.println("La Division es  "  + num1);
        
        
        }
        
    }
    
}
