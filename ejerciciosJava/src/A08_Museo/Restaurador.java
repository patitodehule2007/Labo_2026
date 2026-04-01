package A08_Museo;

import A05_Fechas.Fecha;

import java.time.LocalDate;

public class Restaurador {
    private  String nombre;
    private  String apellido;
    private  int dni;
    private Fecha fechaNacimiento;
    private  int aniosExperiencia;

    public Restaurador(String nombre, String apellido, int dni, Fecha fechaNacimiento, int aniosExperiencia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.aniosExperiencia = aniosExperiencia;
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

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public  void  restaurarObra(Cuadro cuadro){
        System.out.println("Antes de la restuaracion el cuadro estaba asi: " + cuadro.estado + "/ 10");
        if (cuadro.getFechaCreacion().getAnio() -25 > LocalDate.now().getYear()){
            cuadro.setEstado(cuadro.getEstado() + 2 > 10 ? 10 : cuadro.getEstado() + 2);
        }else {
            cuadro.setEstado(cuadro.getEstado() + 3 > 10 ? 10 : cuadro.getEstado() + 3);

        }
        System.out.println("Ahora el cuadro esta asi: " + cuadro.estado + "/ 10");


    }
}
