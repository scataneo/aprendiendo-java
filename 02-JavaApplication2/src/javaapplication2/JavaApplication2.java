
package javaapplication2;

import java.util.Scanner;

public class JavaApplication2 {

    public static void main(String[] args) {
        
        //Aca importamos la clase scanner para ingresar datos por comando
        Scanner teclado=new Scanner(System.in);
        
        //Declaramos las variables a utilizar
        int n,x;
        
        //Aca inicializacion x
        x=1;
        
        //Usuario ingresa un numero
        System.out.println("Ingresa un numero");
        
        //En la variable n guardamos el numero que ingresamos por consola
        n=teclado.nextInt();
        
        //Mientas sea verdad que la x es menor que el numero que ingresamos se ejecuta el codigo
        while(x<=n){
          
            System.out.println(x);
            
            x=x+1;
        
        }
        
    }
    
}
