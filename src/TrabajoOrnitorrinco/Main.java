
package TrabajoOrnitorrinco;

public class Main {
    public static void main(String[] args){
        OrnitorrincoVerde cristian=new OrnitorrincoVerde("cristian",3,6);
        OrnitorrincoBlue  azul=new OrnitorrincoBlue("azul",4,3,5);
        OrnitorrincoBlue  azul2=new OrnitorrincoBlue("azul2",4,3,5);
        
        cristian.tocarGuitarra();
        cristian.tocarGuitorgan();
        cristian.tocarOrgano();
        
        azul.nadar();
        azul.tocarGuitarra();
        
        azul2.nadar();
        azul2.tocarGuitarra();
        
        
    }
}
