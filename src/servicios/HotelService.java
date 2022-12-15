package servicios;

import entidades.Hotel;

public class HotelService {
 
    public void precioHabitacion(Hotel h){
        h.setPrecioHabitaciones(50d+h.getCantidadCamas());
    }
    
}
