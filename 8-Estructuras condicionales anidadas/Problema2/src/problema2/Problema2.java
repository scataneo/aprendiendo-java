
package problema2;

import java.util.Scanner;

public class Problema2 {

    public static void main(String[] args) {
        
        Scanner teclado=new Scanner(System.in);
        
        int numero1,numero2,numero3;
        
        System.out.println("Ingresa un primer numero :");
        
        numero1=teclado.nextInt();
        
        System.out.println("Ingresa un segundo numero :");
        
        numero2=teclado.nextInt();
        
        System.out.println("Ingresa un tercer numero :");
        
        numero3=teclado.nextInt();
        
        
        if(numero1>numero2 && numero1>numero3){
        
            System.out.println("El numero " + numero1 + " es el mayor");
            
        }else if(numero2>numero3){
            
            System.out.println("El numero " + numero2 + " es el mayor");
        }else{
        
            System.out.println("El numero " + numero3 + " es el mayor");
        }
    }
    
}
