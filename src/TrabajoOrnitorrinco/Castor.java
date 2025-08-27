
package TrabajoOrnitorrinco;

import java.util.Random;

public class Castor {
    protected double cola;
    protected double velocidad;

    public Castor(double cola, double velocidad) {
        this.cola = cola;
        this.velocidad = velocidad;
    }
    
    public void tocarGuitarra(){
        Random numRandom=new Random();
        int numero=numRandom.nextInt(6)+1;
        System.out.println("Toca cuerda"+numero);
    }
    
    public void nadar(){
        System.out.println("Nada a la velocidad de "+velocidad+"km/h");
    }
}
