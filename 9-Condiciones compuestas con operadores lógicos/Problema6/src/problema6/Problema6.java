
package problema6;

import java.util.Scanner;


public class Problema6 {

    
    public static void main(String[] args) {
        
        Scanner teclado=new Scanner(System.in);
        
        int valor,valor2,valor3,suma;
        
        System.out.println("Escribe un numero del 1 al 100 :");
        
        valor=teclado.nextInt();
        
        System.out.println("Escribe un numero del 1 al 100 :");
        
        valor2=teclado.nextInt();
        
        System.out.println("Escribe un numero del 1 al 100 :");
        
        valor3=teclado.nextInt();
        
        if(valor<10 || valor2<10 || valor3<10){
        
           System.out.println("Alguno de los números es menor a diez");
        
        }
    }
    
}
