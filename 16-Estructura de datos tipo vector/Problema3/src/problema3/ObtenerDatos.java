
package problema3;

import java.util.Scanner;


public class ObtenerDatos {
    private Scanner teclado=new Scanner(System.in);
    private int [] turnoMañ=new int[4];
    private int [] turnoTar=new int[4];
    
    
    
    public void almacenarSueldos(){
        System.out.println("Empleados turno mañana");
        for (int i = 0; i < turnoMañ.length; i++) {
            System.out.println("Ingresa un sueldo");
            turnoMañ[i]=teclado.nextInt();
            
        }
        System.out.println("Empleados turno tarde");
        for (int i = 0; i < turnoTar.length; i++) {
            System.out.println("Ingrese un sueldo");
            turnoTar[i]=teclado.nextInt();
        } 
    }
    public void calcularGastos(){
       int mañ=0;
       int tar=0;
        for (int i = 0; i < 4; i++) {
            mañ=mañ+turnoMañ[i];
            tar=tar+turnoTar[i];
        }
        
        System.out.println("El gasto que se obtubo a la mañana fue  " + mañ);
        System.out.println("El gasto que se obtubo a la tarde fue  " + tar);
    }
}
