package A05_Fechas;

import A04_SeresVivos.Persona;

public class Main {
    public static void main(String[] args) {
        Fecha fechaPrueba = new Fecha();
        System.out.println("Fecha Larga: " + fechaPrueba.Largo());
        System.out.println("Fecha Corta: " + fechaPrueba.corto());
        fechaPrueba.anterior();
        System.out.println("Fecha anterior: ");
        System.out.println("Fecha Larga: " + fechaPrueba.Largo());
        System.out.println("Fecha Corta: " + fechaPrueba.corto());

    }

}
