
package problema4;

import java.util.Scanner;


public class ValorEmpleados {
    private Scanner teclado=new Scanner(System.in);
    private int [] vector=new int [8];
    
    public void valorAcumulado(){
        int suma=0;
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese un valor");
            vector[i]=teclado.nextInt();
            suma=suma+vector[i];
        }
            System.out.println("La suma de todos los valores es "  + suma);
    }
    
    public void valorAcumulado36(){
        for (int i = 0; i < vector.length; i++) {
            if(vector[i]>36){
                System.out.println("Los numeros mayores son  " + vector[i]);
            }
        }
    }
    
    
    
}
