/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema8;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class CrearDiagonal {
    Scanner teclado=new Scanner(System.in);
    int [] [] matriz=new int [4][4];
    
    public void cargarMatriz(){
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                System.out.println("Ingrese componente: ");
                matriz[fila][columna]=teclado.nextInt();
            }
        }
    }
    
    public void imprimirDiagonal(){
        for (int i = 0; i < 4; i++) {
            System.out.println(matriz[i][i] + "");
        }
    }
    
}
