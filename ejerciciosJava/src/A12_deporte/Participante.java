package A12_deporte;

import java.time.LocalDate;

public class Participante {
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private  int numeroCamiseta;

    public Participante(int numeroCamiseta, LocalDate fechaNacimiento, String apellido, String nombre) {
        this.numeroCamiseta = numeroCamiseta;
        this.fechaNacimiento = fechaNacimiento;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public void setNumeroCamiseta(int numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }
}
