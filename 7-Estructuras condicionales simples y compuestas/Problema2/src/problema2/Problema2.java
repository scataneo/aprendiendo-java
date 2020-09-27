
package problema2;

import java.util.Scanner;

public class Problema2 {

    
    public static void main(String[] args) {
        //Importamos la clase scanner
        Scanner teclado=new Scanner(System.in);
        
        //Declaracion de 2 variables
        int num,num1;
        
        System.out.println("Ingresa un numero :");
        
        num=teclado.nextInt();
        
        System.out.println("Ingresa otro numero :");
        
        num1=teclado.nextInt();
        
        if(num>num1){
         
            System.out.println("El " + num +  " es el numero mayor");
        
        }else{
            
            System.out.println("El " + num1 + " es el numero mayor");
        
        }
        
    }
    
}
