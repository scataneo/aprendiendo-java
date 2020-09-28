
package problema1;

import java.util.Scanner;

public class Problema1 {

    
    public static void main(String[] args) {
        
        Scanner teclado=new Scanner(System.in);
        
        int nota1,nota2,nota3,promedio;
        
        System.out.println("Ingresa una nota entre 1 y 10 :");
        
        nota1=teclado.nextInt();
        
        System.out.println("Ingresa una nota entre 1 y 10 :");
        
        nota2=teclado.nextInt();
        
        System.out.println("Ingresa una nota entre 1 y 10 :");
        
        nota3=teclado.nextInt();
        
        promedio=nota1+nota2+nota3;
        
        promedio=promedio/3;
        
        if(promedio>=7){
            
            System.out.println("Promocionado");
            
        }else if(promedio>=4 && promedio<7){
            
            System.out.println("Regular");
            
        }else{
            System.out.println("Reprobado");
        }
    }
    
}
