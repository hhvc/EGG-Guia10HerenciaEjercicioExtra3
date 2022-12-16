package egg.guia10herenciaejercicioextra3;

import entidades.Gimnasio;
import entidades.Hotel5;
import entidades.Limosina;
import entidades.Restaurante;
import java.util.ArrayList;
import servicios.AlojamientoService;

public class EGGGuia10HerenciaEjercicioExtra3 {
    public static void main(String[] args) {
        AlojamientoService as = new AlojamientoService();
        ArrayList alojamientos = new ArrayList();
        ArrayList limosinas1 = new ArrayList();
        
        Limosina limo1 = new Limosina();
        Limosina limo2 = new Limosina();
        
        limosinas1.add(limo1);
        limosinas1.add(limo2);
        
        Gimnasio gimnasio1 = new Gimnasio('a');
        Restaurante resto1 = new Restaurante("La Nona", 45);
        
        Hotel5 hotel5a = new Hotel5(1, 1, limosinas1, gimnasio1, resto1, 10, 20, 4, 0d, "Todas las Estrellas", "Deán Funes 1194", "Córdoba", "Héctor");
        Hotel5 hotel5b = new Hotel5(0, 2, limosinas1, gimnasio1, resto1, 20, 20, 5, 0d, "Todas las Estrellas", "Paraguay 29", "Córdoba", "Héctor");
        
        
        alojamientos.add(hotel5a);
        alojamientos.add(hotel5b);
        
        as.menu(alojamientos);
        
    }
    
}
