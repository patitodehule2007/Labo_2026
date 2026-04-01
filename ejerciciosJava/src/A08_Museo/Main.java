package A08_Museo;

import A04_SeresVivos.Persona;
import A05_Fechas.Fecha;

public class Main {
    public static  void  main(String[] args){
        Cuadro cuadro = new Cuadro("feuh",new Persona("pepe","feho",39),2,new Fecha(),new Persona("pepe","feho",39));
        Restaurador restaurador = new Restaurador("pepe","rodriquez",39023,new Fecha(10,20,2000),87);

        restaurador.restaurarObra(cuadro);
    }
}
