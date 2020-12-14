
package problema5;

import java.util.Scanner;


public class CargaNombreYEdad {
    private Scanner teclado=new Scanner(System.in);
    private int [] nombre=new int[5];
    private int [] edad=new int[5];
    
    
    public void almacenarDatos(){
        for (int i = 0; i < nombre.length ; i++) {
            System.out.println("Ingresa tu nombre");
            nombre[i]=teclado.nextInt();
        }
        for (int i = 0; i < edad.length; i++) {
            System.out.println("Ingresa tu edad");
            edad[i]=teclado.nextInt();
        }
    
    }
}
