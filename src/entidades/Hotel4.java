
package entidades;

public class Hotel4 extends Hotel {

    protected Gimnasio gimnacio;
    protected Restaurante restaurante;

    public Hotel4() {
    }

    public Hotel4(Gimnasio gimnacio, Restaurante restaurante) {
        this.gimnacio = gimnacio;
        this.restaurante = restaurante;
    }

    public Hotel4(Gimnasio gimnacio, Restaurante restaurante, Integer cantidadHabitaciones, Integer cantidadCamas, Integer cantidadPisos, Double precioHabitaciones) {
        super(cantidadHabitaciones, cantidadCamas, cantidadPisos, precioHabitaciones);
        this.gimnacio = gimnacio;
        this.restaurante = restaurante;
    }

    public Hotel4(Gimnasio gimnacio, Restaurante restaurante, Integer cantidadHabitaciones, Integer cantidadCamas, Integer cantidadPisos, Double precioHabitaciones, String nombre, String direccion, String localidad, String gerente) {
        super(cantidadHabitaciones, cantidadCamas, cantidadPisos, precioHabitaciones, nombre, direccion, localidad, gerente);
        this.gimnacio = gimnacio;
        this.restaurante = restaurante;
    }

    public Gimnasio getGimnacio() {
        return gimnacio;
    }

    public void setGimnacio(Gimnasio gimnacio) {
        this.gimnacio = gimnacio;
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }

    @Override
    public String toString() {
        return "Hotel4{" + "gimnacio=" + gimnacio + ", restaurante=" + restaurante + '}';
    }
    
    
}
