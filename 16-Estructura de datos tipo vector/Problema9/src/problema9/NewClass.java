/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema9;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class NewClass {
    Scanner teclado=new Scanner(System.in);
    int [][] matriz=new int [3][4];
    
    public void cargarDatos(){
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                System.out.println("Ingresa datos: ");
                matriz[fila][columna]=teclado.nextInt();
            }
        }
    }
    public void primerFila(){
        System.out.println("Primer fila de la matriz :");
        for (int i = 0; i < 4; i++) {
            System.out.println(matriz[0][i]);//vector 0 porque es el primer indice
        }
    }
    public void ultimaFila(){
        System.out.println("Ultima fila de la matriz");
        for (int i = 0; i < 4; i++) {
            System.out.println(matriz[2][i]);//vector 2 porque es el indice 3
        }
    }
    public void primerColumna(){
        System.out.println("Primer columna");
        for (int i = 0; i < 4; i++) {
            System.out.println(matriz[i][0]);
        }
    }
}
