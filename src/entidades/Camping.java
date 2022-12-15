package entidades;
public class Camping extends ExtraHotelero{
    private Integer cantidadCarpas;
    private Integer cantidadBanios;
    private Boolean resto;

    public Camping() {
    }

    public Camping(Integer cantidadCarpas, Integer cantidadBanios, Boolean resto) {
        this.cantidadCarpas = cantidadCarpas;
        this.cantidadBanios = cantidadBanios;
        this.resto = resto;
    }

    public Camping(Integer cantidadCarpas, Integer cantidadBanios, Boolean resto, Boolean privado, Integer m2) {
        super(privado, m2);
        this.cantidadCarpas = cantidadCarpas;
        this.cantidadBanios = cantidadBanios;
        this.resto = resto;
    }

    public Camping(Integer cantidadCarpas, Integer cantidadBanios, Boolean resto, Boolean privado, Integer m2, String nombre, String direccion, String localidad, String gerente) {
        super(privado, m2, nombre, direccion, localidad, gerente);
        this.cantidadCarpas = cantidadCarpas;
        this.cantidadBanios = cantidadBanios;
        this.resto = resto;
    }

    @Override
    public String toString() {
        return "Camping{" + "cantidadCarpas=" + cantidadCarpas + ", cantidadBanios=" + cantidadBanios + ", resto=" + resto + '}';
    }
    
    
}
