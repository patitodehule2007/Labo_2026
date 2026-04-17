package A12_deporte;

import java.time.LocalDate;

public class Partido {
    private Equipo equipo1;
    private Equipo equipo2;
    private int fechaPartido;
    private String horario;

    public Partido(Equipo equipo1, Equipo equipo2) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
    }


}
