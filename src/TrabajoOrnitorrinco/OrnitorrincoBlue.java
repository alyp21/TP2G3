
package TrabajoOrnitorrinco;

public class OrnitorrincoBlue extends Castor{
    private String nombre;
    private double propulsion;

    public OrnitorrincoBlue(String nombre, double propulsion, double cola, double velocidad) {
        super(cola, velocidad);
        this.nombre = nombre;
        this.propulsion = propulsion;
    }

    public double getPropulsion() {
        return propulsion;
    }

    @Override
    public void nadar() {
        double velocidadFinal = velocidad + propulsion; 
        System.out.println(nombre + "nada con velocidad " + velocidadFinal+ "km/h");
    }
    @Override
    public void tocarGuitarra(){
        System.out.println(nombre + "toca la guitarra");
        super.tocarGuitarra();
    } 

}
