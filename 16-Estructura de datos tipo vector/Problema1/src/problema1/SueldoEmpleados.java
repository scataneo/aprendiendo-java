
package problema1;

import java.util.Scanner;


public class SueldoEmpleados {
    private Scanner teclado=new Scanner(System.in);
    private int [] sueldo=new int[5];
    
    
    public void ingresarSueldos(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese un sueldo");
            sueldo[i]=teclado.nextInt();
        }
    }
    public void imprimirSueldo(){
        for (int i = 0; i < 5; i++) {
            System.out.println(sueldo[i]);
        }
    }
}
