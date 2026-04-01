package A03_Vehiculos;

public class Submarino {
    private  String nombre;
    private double profundidadActual;
    private double profundidadMaxima;

    public Submarino(String nombre,double profundidadMaxima){
        this.nombre = nombre;
        this.profundidadActual = 0;
        this.profundidadMaxima = profundidadMaxima;
    }
    public void sumergir(double distancia){
        if(profundidadActual - distancia < profundidadMaxima){
            System.out.println("Supera la profuncidad maxima del sumariono");
        }
        else {
            profundidadActual -= distancia;
        }
    }
    public void emerger(double distancia){
        if(this.profundidadActual + distancia > 0){
            System.out.println("El submarino no vuela");
        }
        else {
            profundidadActual += distancia;
        }
    }
}
