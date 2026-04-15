package A10_CohetePrueba;

import A05_Fechas.Fecha;

public class Main {
    public static  void  main(String[] args){
        Cohete cuete1 = new Cohete("cuete epico",999999999,19999999,39);
        Cohete cuete2 = new Cohete("cuete normal",999,19999999,2);
        Cohete cuete3 = new Cohete("cuete malo",999,12,2);

        Tecnico tecnico1 = new Tecnico("pepe","rodriguez",new Fecha(),"Navegacion",cuete1);
        Tecnico tecnico2 = new Tecnico("pato","de hule",new Fecha(),"Propulsion",cuete2);

        cuete3.activarPropulsores(5);
        cuete3.activarPropulsores(999999);

        System.out.println("Tiempo para 999km : " + cuete3.calcularTiempo(999));
        System.out.println("Tiempo para -999km : " + cuete3.calcularTiempo(-999));

<<<<<<< HEAD
        System.out.println("Cambiar cuete : " + tecnico1.cambiarCohete(cuete3));
        System.out.println("Cambiar cuete : " + tecnico1.cambiarCohete(cuete1));

=======
        System.out.println("Cambiar cuete de tecnico 1 a cuete 3 : " + tecnico1.cambiarCohete(cuete3));
        System.out.println("Cambiar cuete de tecnico 1 a cuete 1 : " + tecnico1.cambiarCohete(cuete1));
>>>>>>> 6431f52ccd1b75f0bf9b40a5067e9a038099c7f0
    }
}
