/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema13;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Operaciones {
    private Scanner teclado=new Scanner(System.in);
    private int valor1;
    private int valor2;
    
    public Operaciones(){
        System.out.println("Ingresa un valor");
        valor1=teclado.nextInt();
        System.out.println("Ingresa un valor");
        valor2=teclado.nextInt();
    }
    
    public void suma(){
        int suma=0;
        suma=valor1+valor2;
        System.out.println("La suma de los valores  es " + suma);
    }
    
    
    
}
