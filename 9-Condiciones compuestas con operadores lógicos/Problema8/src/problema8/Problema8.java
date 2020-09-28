
package problema8;

import java.util.Scanner;


public class Problema8 {

   
    public static void main(String[] args) {
        
        Scanner teclado=new Scanner(System.in);
        
        int sueldo,antiguedad,aumento;
        
        System.out.println("Ingresa tu sueldo :");
        
        sueldo=teclado.nextInt();

        System.out.println("Ingresa la antiguedad en el trabajo :");
        
        antiguedad=teclado.nextInt();
        
        if(sueldo<500 && antiguedad>=10){
        
           aumento=(sueldo*20)/100;
           
           aumento=aumento+sueldo;
           
            System.out.println("Haz recibido un aumento del 20% vas a pasar a ganar " + aumento + " ");
        
        }else if(sueldo<500 && antiguedad<10){
        
           aumento=(sueldo*5)/100;
           
           aumento=aumento+sueldo;
           
            System.out.println("Haz recibido un aumento de un 5% vas a pasar a ganar " + aumento + " ");
            
        }else{
        
            System.out.println(sueldo);
        }

    }
    
}
