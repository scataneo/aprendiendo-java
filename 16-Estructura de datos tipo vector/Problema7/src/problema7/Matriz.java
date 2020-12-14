
package problema7;

import java.util.Scanner;

/**
 *
 * @author scataneo
 */
public class Matriz {
    
    Scanner teclado=new Scanner(System.in);
    int [] [] matriz=new int [3] [5];
    
    //Primero se ejecuta un vector y sus 5 matrices ... Ejemplo vector(0,1,2)
    public void crearMatriz(){
        for (int filas = 0; filas < matriz.length; filas++) {
            for (int columna = 0; columna < matriz[filas].length; columna++) {
                System.out.println("Ingrese una fila  "  + filas );
                matriz[filas][columna]=teclado.nextInt();
                System.out.println(matriz[filas][columna]);
            }
        }
    }
    
}
