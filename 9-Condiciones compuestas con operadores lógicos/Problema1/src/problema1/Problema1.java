
package problema1;

import java.util.Scanner;


public class Problema1 {

    
    public static void main(String[] args) {
        
        //Arranca el programa
        
        Scanner teclado=new Scanner(System.in);
        
        int num1,num2,num3;
        
        System.out.println("Introduce un numero : ");
        
        num1=teclado.nextInt();
        
        System.out.println("Introduce un numero : ");
        
        num2=teclado.nextInt();
        
        System.out.println("Introduce un numero : ");
        
        num3=teclado.nextInt();
        
        if(num1>num2 && num1>num3){
        
            System.out.println("El numero " + num1 + " es el mayor");
            
        }else if(num2>num3){
        
            System.out.println("\"El numero " + num2 + " es el mayor");
        
        }else{
        
            System.out.println("El numero " + num3 + " es el mayor");
        
        }
        
    }
    
}
