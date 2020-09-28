
package problema3;

import java.util.Scanner;


public class Problema3 {

    
    public static void main(String[] args) {
        
        Scanner teclado=new Scanner(System.in);
        
        int dia,mes,anio;
        
        System.out.println("Introduce un dia del mes :");
        
        dia=teclado.nextInt();
        
        System.out.println("Introduce un mes :");
        
        mes=teclado.nextInt();
        
        System.out.println("Introduce un anio :");
        
        anio=teclado.nextInt();
        
        if(dia==24 && mes==12){
        
            System.out.println("Corresponde a la llegada de la navidad");
        
        }
        
            System.out.println("La fecha ingresada es  "  + dia + "/ "  + mes + " /" + anio + "");
    
    }
    
}
