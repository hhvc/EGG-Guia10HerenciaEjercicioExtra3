package servicios;

import entidades.Camping;
import entidades.Hotel;
import entidades.Hotel4;
import entidades.Hotel5;
import entidades.Residencia;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class AlojamientoService {

    Scanner leer = new Scanner(System.in);

    public void menu(ArrayList alojamientos) {

        boolean salir = false;

        do {

            System.out.println("******************************************");
            System.out.println("*****************   MENÚ    **************");
            System.out.println("******************************************");
            System.out.println("*                                        *");
            System.out.println("* 1) Listado de alojamientos disponibles *");
            System.out.println("* 2) Listado de hoteles disponibles      *");
            System.out.println("* 3) Listado de campings con restaurantes*");
            System.out.println("* 4) Residencias con destuentos          *");
            System.out.println("* 5) Salir del menú                      *");
            System.out.println("******************************************\n");

            switch (leer.nextInt()) {
                case 1:
                    for (Object object : alojamientos) {
                        if (object instanceof Hotel5) {
                            System.out.println((Hotel5) object);
                        } else if (object instanceof Hotel4) {
                            System.out.println((Hotel4) object);
                        } else if (object instanceof Camping) {
                            System.out.println((Camping) object);
                        } else {
                            System.out.println((Residencia) object);
                        }
                    }
                    break;
                    
                case 2:
                    ArrayList<Hotel> hotelesOrdenadosPorPrecio = new ArrayList();

                    for (Object alojamiento : alojamientos) {
                        if (alojamiento instanceof Hotel) {
                            hotelesOrdenadosPorPrecio.add((Hotel) alojamiento);
                        }
                    }

                    Collections.sort(hotelesOrdenadosPorPrecio, new Comparator<Hotel>() {
                        @Override
                        public int compare(Hotel h1, Hotel h2) {
                            // Aqui esta el truco, ahora comparamos h2 con h1 y no al reves para que nos devuelva el Array ordenado de mayora a menor
                            return Double.valueOf(h2.getPrecioHabitaciones()).compareTo(Double.valueOf(h1.getPrecioHabitaciones()));
                        }
                    });

                    for (Object hotel : hotelesOrdenadosPorPrecio) {
                        if (hotel instanceof Hotel5) {
                            System.out.println((Hotel5) hotel);
                        } else {
                            System.out.println((Hotel4) hotel);
                        }
                    }
                    break;

                case 3:
                    for (Object alojamiento : alojamientos) {
                        if (alojamiento instanceof Camping) {
                            if (((Camping) alojamiento).getResto()) {
                                System.out.println((Camping) alojamiento);
                            }
                        }
                    }
                    break;

                case 4:
                    for (Object alojamiento : alojamientos) {
                        if (alojamiento instanceof Residencia) {
                            if (((Residencia) alojamiento).getDescuento()) {
                                System.out.println((Residencia) alojamiento);
                            }
                        }
                    }
                    break;

                case 5:
                    System.out.println("Hasta Luego");
                    salir = true;
                    break;

                default:
                    System.out.println("Metiste mal un dedo. Elegí la opción correcta");

            }
        } while (salir);

    }

}
