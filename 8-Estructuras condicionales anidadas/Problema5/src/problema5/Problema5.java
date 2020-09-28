
package problema5;

import java.util.Scanner;


public class Problema5 {

    
    public static void main(String[] args) {
        
        Scanner teclado=new Scanner(System.in);
        
        int preguntasRealizadas,preguntasCorrectas,promedio;
        
        System.out.println("Ingresa la cantidad de preguntas a realizar :");
        
        preguntasRealizadas=teclado.nextInt();
        
        System.out.println("Ingresa la cantidad de preguntas contestadas correctamente :");
        
        preguntasCorrectas=teclado.nextInt();
        
       
        promedio=preguntasRealizadas*preguntasCorrectas;
        
        promedio=promedio/100;
        
        
        if(promedio>=90){
        
            System.out.println("Nivel Maximo");
            
        }else if(promedio>=75 && promedio<90){
        
            System.out.println("Nivel Medio");
            
        }else if(promedio>=50 && promedio<75){
        
            System.out.println("Nivel Regular");
        
        }else{
        
            System.out.println("Fuera de nivel");
        
        }
        
        
    }
    
}
