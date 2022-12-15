
package servicios;

import entidades.Hotel;
import entidades.Hotel5;

public class Hotel5Service extends Hotel4Service{

    @Override
    public void precioHabitacion(Hotel h) {
        super.precioHabitacion(h);
        h.setPrecioHabitaciones(h.getPrecioHabitaciones()+((Hotel5)h).getLimosinas().size()*15d);
    }
    
    
}
