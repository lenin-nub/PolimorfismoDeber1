
package polimorfismo1deber;

class Fuerza_Friccion{
    public void Definir_tipo_friccion(){
        System.out.println("    Es comúnmente modelada como una combinación de la"
                + "    fricción estática, fricción de Coulomb, fricción viscosa y "
                + "    efecto Stribeck\n");
    }
}
class Friccion_estatica extends Fuerza_Friccion{
    public void Definir_tipo_friccion(){
        System.out.println("    Es la fuerza que se opone al inicio del deslizamientosobre un cuerpo\n"
                         + "    en reposo al que se aplica una fuerza horizontal F\n");
    }
}
class Friccion_stribeck extends Fuerza_Friccion{
    public void Definir_tipo_friccion(){
        System.out.println("    Es la característica no lineal fricción-velocidad que ocurre a bajas \n"
                          +"    velocidades.A causa de los efectos de fricción dinámicos la fricción  \n"
                          +"    no es simplemente función de la velocidad instantánea\n");
    }
}
class Friccion_viscosa extends Fuerza_Friccion{
    public void Definir_tipo_friccion(){
        System.out.println("    La fricción viscosa surge cuando un objeto sólido se mueve en medio\n"
                          +"    de un fluido -un gas o un líquido-. Puede modelarse como una fuerza\n"
                          +"    al negativo de la velocidad del objetoo al cuadrado de la misma\n");
    }
}
class Friccion_coulumb extends Fuerza_Friccion{
    public void Definir_tipo_friccion(){
        System.out.println("    Fuerza de magnitud constante que actúa en dirección opuesta al movimiento");
    }
}

public class Polimorfismo1Deber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fuerza_Friccion Objeto1 = new Friccion_estatica();
        Fuerza_Friccion Objeto2 = new Friccion_stribeck();
        Fuerza_Friccion Objeto3 = new Friccion_viscosa();
        Fuerza_Friccion Objeto4 = new Friccion_coulumb();
        System.out.println("      UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE-L");
        System.out.println("MATERIA: PROGRAMACION");
        System.out.println("DOCENTE: ING.GUERRA LUIS");
        System.out.println("NRC: 7450");
        System.out.println("NOMBRE:LENIN IÑACAZA \n");

        System.out.println("Fuerza de fricción que ni es disipada ni consecuente"
                + " del deslizamiento: Friccion_estatica ");
        Objeto1.Definir_tipo_friccion();

        System.out.println("Fuerza de fricción que cuando la velocidad es "
                + "constante se observa un nivel de fricción"
                +"constante: Friccion_stribeck");
        Objeto2.Definir_tipo_friccion();

        System.out.println("Fuerza de fricción que es proporcional a la velocidad en "
                + "sentido contrario : Friccion_viscosa");
        Objeto3.Definir_tipo_friccion();


        System.out.println("Fuerza de fricción que la fuerza de magnitud es "
                + "constante : Friccion_coulumb");
        Objeto4.Definir_tipo_friccion();
    }

}
