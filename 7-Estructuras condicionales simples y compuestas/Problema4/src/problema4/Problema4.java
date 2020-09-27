
package problema4;

import java.util.Scanner;

public class Problema4 {

   
    public static void main(String[] args) {
        // importr scanner
        Scanner teclado=new Scanner(System.in);
        
        //Variables 
        int nota1,nota2,nota3,promedio;
        
        System.out.println("Ingresa una nota:");
        
        nota1=teclado.nextInt();
        
        System.out.println("Ingresa una nota:");
        
        nota2=teclado.nextInt();
        
        System.out.println("Ingresa una nota:");
        
        nota3=teclado.nextInt();
        
        promedio=nota1+nota2+nota3;
        
        promedio=promedio/3;
        
        if(promedio>=7){
        
            System.out.println("Promocionado");
        }
        
    }
    
}
