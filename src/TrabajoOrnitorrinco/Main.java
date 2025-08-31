
package TrabajoOrnitorrinco;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        try {
        Scanner scan=new Scanner(System.in);
        System.out.println("Datos necesarios para el orni verde!");
        System.out.print("Ingrese la longitud de la cola: ");
        double longitud =scan.nextDouble();
        System.out.print("Ingrese la velocidad: ");
        double velocidad=scan.nextDouble();
        scan.nextLine();
        
        OrnitorrincoVerde cristian=new OrnitorrincoVerde("cristian",longitud,velocidad);
        System.out.println(cristian);
        cristian.tocarGuitarra();
        cristian.tocarGuitorgan();
        cristian.tocarOrgano();
        
        System.out.println("Datos para el primer orni azul!");
        System.out.print("Ingrese la longitud de la cola:");
        longitud =scan.nextDouble();
        System.out.print("Ingrese la velocidad:");
        velocidad=scan.nextDouble();
        System.out.print("Ingrese la propulsion:");
        double propulsion=scan.nextDouble();
        scan.nextLine();
        
        OrnitorrincoBlue blue = new OrnitorrincoBlue("blue",longitud,velocidad,propulsion);
        System.out.println(blue);
        blue.tocarGuitarra();
        blue.nadar();
         scan.close ();      

        System.out.println("Datos para el segundo orni azul!");
        System.out.print("Ingrese la longitud de la cola: ");
        longitud = scan.nextDouble();
        System.out.print("Ingrese la velocidad: ");
        velocidad=scan.nextDouble();
        System.out.print("Ingrese la propulsion: ");
        propulsion=scan.nextDouble();
        scan.nextLine();
        
        OrnitorrincoBlue blui=new OrnitorrincoBlue("blui",longitud, velocidad, propulsion);
        System.out.println(blui);
        blui.tocarGuitarra();
        blui.nadar();
    
        scan.close();
        
        Castor [] ornitohermanos = new Castor [3];
        ornitohermanos [0] = blui;
        ornitohermanos [1] = cristian;
        ornitohermanos [2] = blue;
        
        } catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("El indice esta fuera del rango!");
        } finally {
            System.out.println("Los ornitohermanos juntos al fin !!!");
        }
        List<OrnitorrincoBlue> nadadores = new ArrayList<>();
        for (Castor c : nadadores) {
            if (c instanceof OrnitorrincoBlue) {
                nadadores.add((OrnitorrincoBlue) c);
            }
        }

        nadadores.sort(Comparator.comparingDouble(OrnitorrincoBlue::getPropulsion));

        Iterator<OrnitorrincoBlue> it = nadadores.iterator();
        System.out.println(" Nadadores ordenados por propulsión:");
        while (it.hasNext()) {
            OrnitorrincoBlue o = it.next();
            System.out.println("Propulsión: " + o.getPropulsion() + " km/s");
    }
}
    
}