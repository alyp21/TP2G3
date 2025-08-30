
package TrabajoOrnitorrinco;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
        
//<<<<<<< HEAD
//        scan.close ();      
//=======
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
         List<Castor> nadadores = new ArrayList<>();
        nadadores.add(blue);
        nadadores.add(blui);
        nadadores.add(otro);

        // Lista para los mejores nadadores (solo OrniAzul)
        List<OrnitorrincoBlue> mejoresNadadores = new ArrayList<>();

        for (Castor c : nadadores) {
            if (c instanceof OrnitorrincoBlue) {
                mejoresNadadores.add((OrnitorrincoBlue) c);
            }
        }
         Collections.sort(mejoresNadadores, new Comparator<OrnitorrincoBlue>() {
            @Override
            public int compare(OrnitorrincoBlue o1, OrnitorrincoBlue o2) {
                return Double.compare(o1.getPropulsion(), o2.getPropulsion());
            }
        });

        // Mostrar con Iterator
        Iterator<OrnitorrincoBlue> it = mejoresNadadores.iterator();
        System.out.println("Mejores nadadores (ordenados por propulsión):");
        while (it.hasNext()) {
            OrnitorrincoBlue o = it.next();
            System.out.println("Propulsión: " + o.getPropulsion());
            o.nadar();
        }
    }
      
//>>>>>> 8fd3e949f99b3c46fb3e858c222bce6d2da0a4a6
    }
}       
}

