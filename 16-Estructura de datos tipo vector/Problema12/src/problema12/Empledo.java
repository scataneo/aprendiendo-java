/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema12;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Empledo {
    private Scanner teclado=new Scanner(System.in);
    private String nombre;
    private int sueldo;
    
    public Empledo(){
        System.out.println("Ingresa tu nombre");
        nombre=teclado.next();
        System.out.println("Ingres tu sueldo");
        sueldo=teclado.nextInt();
    }
    
    public void imprimir(){
        System.out.println("Tu nombre es "  + nombre);
        System.out.println("Tu sueldo es de  " + sueldo);
    }
    
    public void debePagar(){
        if(sueldo>3000){
            System.out.println("Debe pagar impuestos");
        }
    
    }
    
}
