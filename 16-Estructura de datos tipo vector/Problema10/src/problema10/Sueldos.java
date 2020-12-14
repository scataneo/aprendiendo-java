/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema10;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Sueldos {
    Scanner teclado=new Scanner(System.in);
    int [] vector;

    public Sueldos() { //Metodo constructor 
        vector=new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese valor :");
            vector[i]=teclado.nextInt();
        }
    }
    
    public void imprimir(){
        for (int j = 0; j < 5; j++) {
            System.out.println(vector[j]);
        }
    }
}
