
package TrabajoOrnitorrinco;

import java.util.Scanner;

public class OrnitorrincoVerde extends Castor implements MamaPata {
    private final double PICO = 6.8;
    private final double PATAS = 7.5;
    private String nombre;

    public OrnitorrincoVerde(String nombre, double cola, double velocidad) {
        super(cola, velocidad);
        this.nombre = nombre;
    }

   @Override
   public void tocarOrgano (){
   Scanner scanner = new Scanner(System.in);
       System.out.println("Do-Re-Mi (Presiona una tecla para continuar)");
       scanner.nextLine();
       System.out.println("Fa-Sol-La-Si");
}
   public void tocarGuitorgan(){
   super.tocarGuitarra();
   tocarOrgano();
       System.out.println(" cuac...cuaac...!");
 
   }
   @Override 
   public void tocarGuitarra(){
   super.tocarGuitarra();
   }

    @Override
    public String toString() {
        return "OrnitorrincoVerde{" + "PICO=" + PICO + ", PATAS=" + PATAS + ", nombre=" + nombre + '}';
    }
   
   
 }
