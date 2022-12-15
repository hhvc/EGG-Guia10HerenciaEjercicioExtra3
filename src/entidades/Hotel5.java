package entidades;

import java.util.ArrayList;

public class Hotel5 extends Hotel4{
     
    private Integer cantidadSalones;
    private Integer cantidadSuites;
    private ArrayList<Limosina> limosinas;

    public Hotel5() {
    }
    
    public Hotel5(Integer cantidadSalones, Integer cantidadSuites, ArrayList<Limosina> limosinas) {
        this.cantidadSalones = cantidadSalones;
        this.cantidadSuites = cantidadSuites;
        this.limosinas = limosinas;
    }

    public Hotel5(Integer cantidadSalones, Integer cantidadSuites, ArrayList<Limosina> limosinas, Gimnasio gimnacio, Restaurante restaurante) {
        super(gimnacio, restaurante);
        this.cantidadSalones = cantidadSalones;
        this.cantidadSuites = cantidadSuites;
        this.limosinas = limosinas;
    }

    public Hotel5(Integer cantidadSalones, Integer cantidadSuites, ArrayList<Limosina> limosinas, Gimnasio gimnacio, Restaurante restaurante, Integer cantidadHabitaciones, Integer cantidadCamas, Integer cantidadPisos, Double precioHabitaciones) {
        super(gimnacio, restaurante, cantidadHabitaciones, cantidadCamas, cantidadPisos, precioHabitaciones);
        this.cantidadSalones = cantidadSalones;
        this.cantidadSuites = cantidadSuites;
        this.limosinas = limosinas;
    }

    public Hotel5(Integer cantidadSalones, Integer cantidadSuites, ArrayList<Limosina> limosinas, Gimnasio gimnacio, Restaurante restaurante, Integer cantidadHabitaciones, Integer cantidadCamas, Integer cantidadPisos, Double precioHabitaciones, String nombre, String direccion, String localidad, String gerente) {
        super(gimnacio, restaurante, cantidadHabitaciones, cantidadCamas, cantidadPisos, precioHabitaciones, nombre, direccion, localidad, gerente);
        this.cantidadSalones = cantidadSalones;
        this.cantidadSuites = cantidadSuites;
        this.limosinas = limosinas;
    }

    public Integer getCantidadSalones() {
        return cantidadSalones;
    }

    public void setCantidadSalones(Integer cantidadSalones) {
        this.cantidadSalones = cantidadSalones;
    }

    public Integer getCantidadSuites() {
        return cantidadSuites;
    }

    public void setCantidadSuites(Integer cantidadSuites) {
        this.cantidadSuites = cantidadSuites;
    }

    public ArrayList<Limosina> getLimosinas() {
        return limosinas;
    }

    public void setLimosinas(ArrayList<Limosina> limosinas) {
        this.limosinas = limosinas;
    }

    @Override
    public String toString() {
        return "Hotel5{" + "cantidadSalones=" + cantidadSalones + ", cantidadSuites=" + cantidadSuites + ", limosinas=" + limosinas + '}';
    }

    
    
}
