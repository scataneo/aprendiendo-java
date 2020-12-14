
package problema6;

import java.util.Scanner;


public class Matrices {
    private Scanner teclado=new Scanner(System.in);
    private int [] [] matriz=new int [3] [5];
    
    
    public void cargarElementos(){
        
        for (int i = 0; i < 3; i++) { //Primero va el arrgelo de 3
            for (int j = 0; j < 5; j++) {
                System.out.println("Ingrese numeros");
                matriz[i][j]=teclado.nextInt();
            }
        }
    
    }
    
    public void imprimirElementos(){
    
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println(matriz[i][j]);
            }
        }
    
    }
    
}