
package TrabajoOrnitorrinco;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        
              Scanner scan=new Scanner(System.in);
              System.out.println("Datos necesarios para el orni verde!");
              System.out.print("Ingrese la longitud de la cola: ");
              double longitud =scan.nextDouble();
              System.out.print("Ingrese la velocidad: ");
              double velocidad=scan.nextDouble();
              scan.nextLine();
              
              OrnitorrincoVerde cristian=new OrnitorrincoVerde("cristian",longitud,velocidad);
              System.out.println(cristian);
              System.out.println("habilidades de orni verde:");
              cristian.tocarGuitarra();
              cristian.tocarGuitorgan();
              cristian.tocarOrgano();
              
              System.out.println("");
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
              System.out.println("habilidades de blue:");
              blue.tocarGuitarra();
              blue.nadar();  

              System.out.println("");
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
              System.out.println("habilidades de blui:");
              System.out.println("");
              blui.tocarGuitarra();
              blui.nadar();
            
            scan.close();
            
              Castor [] ornitohermanos = new Castor [3];
           try {
              ornitohermanos [0] = blui;
              ornitohermanos [1] = cristian;
              ornitohermanos [2] = blue;
              
         } catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("El indice esta fuera del rango!");
        }   finally {
            System.out.println("");
            System.out.println("Los ornitohermanos juntos al fin !!!");
        }
          List<OrnitorrincoBlue> nadadores = new ArrayList<>();
            for (int i = 0; i < ornitohermanos.length; i++) {
            if (ornitohermanos[i] instanceof OrnitorrincoBlue) {
            OrnitorrincoBlue nadador = (OrnitorrincoBlue) ornitohermanos[i];
            nadadores.add(nadador); 
      }
    }
            for (int i = 0; i < nadadores.size() - 1; i++) {
            for (int j = i + 1; j < nadadores.size(); j++) {
            if (nadadores.get(i).getPropulsion() > nadadores.get(j).getPropulsion()) {
            
            OrnitorrincoBlue temp = nadadores.get(i);
            nadadores.set(i, nadadores.get(j));
            nadadores.set(j, temp);
        }
    }
}
            Iterator<OrnitorrincoBlue> it = nadadores.iterator();
            System.out.println("");
            System.out.println("Nadadores ordenados por propulsión:");
            while (it.hasNext()) {
            OrnitorrincoBlue o = it.next();
            System.out.println("propusion: " + o.getPropulsion() + " km/s");
        }
    }
}