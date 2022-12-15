package servicios;

import entidades.Hotel;
import entidades.Hotel4;

public class Hotel4Service extends HotelService{

    @Override
    public void precioHabitacion(Hotel h) {
        super.precioHabitacion(h);
        
        if (((Hotel4)h).getRestaurante().getCapacidad() <30) {
            h.setPrecioHabitaciones(h.getPrecioHabitaciones()+10d); 
        }
        else {
            if (((Hotel4)h).getRestaurante().getCapacidad() <50) {
                h.setPrecioHabitaciones(h.getPrecioHabitaciones()+30d); 
            }
            else {
                h.setPrecioHabitaciones(h.getPrecioHabitaciones()+50d); 
            }
        }
        
        if (((Hotel4)h).getGimnacio().getTipo().equals("a")) {
            h.setPrecioHabitaciones(h.getPrecioHabitaciones()+50d);            
        } else h.setPrecioHabitaciones(h.getPrecioHabitaciones()+30d);
    
    }

}