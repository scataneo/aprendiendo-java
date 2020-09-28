
package problema4;

import java.util.Scanner;


public class Problema4 {

    
    public static void main(String[] args) {
        
        Scanner teclado=new Scanner(System.in);
        
        int valor,valor2,valor3,suma;
        
        System.out.println("Escribe un numero del 1 al 100 :");
        
        valor=teclado.nextInt();
        
        System.out.println("Escribe un numero del 1 al 100 :");
        
        valor2=teclado.nextInt();
        
        System.out.println("Escribe un numero del 1 al 100 :");
        
        valor3=teclado.nextInt();
        
        if(valor==valor2 && valor==valor3 && valor2==valor3){
        
            suma=valor+valor2;
            
            System.out.println("La suma es  " + suma + "");
            
            suma=suma*valor3;
            
            System.out.println("Y su multiplicacion con el  " + valor3 + " es " + suma + " ");
        
        }
    }
    
}
