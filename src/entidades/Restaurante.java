
package entidades;
public class Restaurante {
    private String nombre;
    private Integer capacidad;

    public Restaurante() {
    }

    public Restaurante(String nombre, Integer capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Restaurante{" + "nombre=" + nombre + ", capacidad=" + capacidad + '}';
    }
    
    
}
