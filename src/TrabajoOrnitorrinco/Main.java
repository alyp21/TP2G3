
package TrabajoOrnitorrinco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Ingrese la longitud de la cola:");
        double longitud =scan.nextDouble();
        System.out.println("Ingrese la velocidad:");
        double velocidad=scan.nextDouble();
        
        
        OrnitorrincoVerde cristian=new OrnitorrincoVerde("cristian",longitud,velocidad);
        System.out.println(cristian);
        cristian.tocarGuitarra();
        cristian.tocarGuitorgan();
        cristian.tocarOrgano();

//        OrnitorrincoBlue  azul=new OrnitorrincoBlue("azul",4,3,5);
//        OrnitorrincoBlue  azul2=new OrnitorrincoBlue("azul2",4,3,5);
//        System.out.println("Ingrese la longitud de la cola:");
//        double longitud =scan.nextDouble();
//        System.out.println("Ingrese la velocidad:");
        
        

//        
//        azul.nadar();
//        azul.tocarGuitarra();
//        
//        azul2.nadar();
//        azul2.tocarGuitarra();
        scan.close();
        
        
    }
}
