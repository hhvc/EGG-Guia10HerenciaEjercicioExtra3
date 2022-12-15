package entidades;
public abstract class Hotel extends Alojamiento {
    // antidad de Pisos, Precio de Habitaciones.
    protected Integer cantidadHabitaciones; // este valor es para todo el hotel y no por piso.
    protected Integer cantidadCamas; // este valor para todo el hotel y no por habitación.
    protected Integer cantidadPisos;
    protected Double precioHabitaciones;

    public Hotel() {
    }

    public Hotel(Integer cantidadHabitaciones, Integer cantidadCamas, Integer cantidadPisos, Double precioHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.cantidadCamas = cantidadCamas;
        this.cantidadPisos = cantidadPisos;
        this.precioHabitaciones = precioHabitaciones;
    }

    public Hotel(Integer cantidadHabitaciones, Integer cantidadCamas, Integer cantidadPisos, Double precioHabitaciones, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.cantidadCamas = cantidadCamas;
        this.cantidadPisos = cantidadPisos;
        this.precioHabitaciones = precioHabitaciones;
    }

    public Integer getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(Integer cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public Integer getCantidadCamas() {
        return cantidadCamas;
    }

    public void setCantidadCamas(Integer cantidadCamas) {
        this.cantidadCamas = cantidadCamas;
    }

    public Integer getCantidadPisos() {
        return cantidadPisos;
    }

    public void setCantidadPisos(Integer cantidadPisos) {
        this.cantidadPisos = cantidadPisos;
    }

    public Double getPrecioHabitaciones() {
        return precioHabitaciones;
    }

    public void setPrecioHabitaciones(Double precioHabitaciones) {
        this.precioHabitaciones = precioHabitaciones;
    }

    @Override
    public String toString() {
        return "Hotel{" + "cantidadHabitaciones=" + cantidadHabitaciones + ", cantidadCamas=" + cantidadCamas + ", cantidadPisos=" + cantidadPisos + ", precioHabitaciones=" + precioHabitaciones + '}';
    }

    
    
    
}
