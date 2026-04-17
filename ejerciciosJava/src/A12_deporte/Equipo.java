package A12_deporte;

import java.util.ArrayList;

public class Equipo {
    private ArrayList<Participante> jugadores;
    private ArrayList<String> horariosJuego;
    private Participante capitan;

    public Equipo(Participante capitan, ArrayList<String> horarioJuego, ArrayList<Participante> jugadores) {
        int found = 0;
        // checkeamos si no se repiten cuando se agregan
        for (Participante p: jugadores) {
            if(this.estaEnUso(p.getNumeroCamiseta())){
                found+=1;
            }
        }
        if(found == 11 && jugadores.size() == 11){
            this.jugadores = jugadores;
            // checkeamos capitan usando el metodo que filtra
            this.setCapitan(capitan);
        }
        if(this.esHorarioValido(horarioJuego)) {
            this.horariosJuego = horarioJuego;
        }
    }

    public ArrayList<Participante> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Participante> jugadores) {
        this.jugadores = jugadores;
    }

    public ArrayList<String> getHorarioJuego() {
        return horariosJuego;
    }

    public void setHorarioJuego(ArrayList<String> horarioJuego) {
        this.horariosJuego = horarioJuego;
    }

    public Participante getCapitan() {
        return capitan;
    }

    public void setCapitan(Participante capitan) {
        if(this.jugadores.contains(capitan)) {
            this.capitan = capitan;
        }
    }

    public  boolean estaEnUso(int numCamisa){
        boolean found = false;
        for(Participante p: this.jugadores) {
            found = p.getNumeroCamiseta() == numCamisa;
            if(found){
                return  found;
            }
        }
        return  found;
    }
    public boolean hasHorarioJuego(String horario){
        return  this.horariosJuego.contains(horario);
    }

    private boolean esHorarioValido(ArrayList<String> horarios){
        ArrayList<String> Disphorarios = new ArrayList<>();
        Disphorarios.add("mañana");
        Disphorarios.add("tarde");
        Disphorarios.add("noche");
        for(String hora:horarios){
            if(!(Disphorarios.contains(hora.toLowerCase()))){
                return  false;
            }
        }
        return  true;
    }
}
