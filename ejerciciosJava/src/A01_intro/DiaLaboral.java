
package A01_intro;
import java.util.List;

public class DiaLaboral {
    public static void main(String[] args) {
        List<String>DiasLaboral = List.of("Lunes","Martes","Miercoles","Jueves","Viernes");
        String diaSemana = "Domingo";

        if(DiasLaboral.contains(diaSemana)){
            System.out.println("Es un dia laboral");
        }
        else {
            System.out.println("No es un dia laboral");
        }
    }
}
