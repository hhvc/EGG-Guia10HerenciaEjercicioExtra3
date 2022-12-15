package entidades;
public class Residencia extends ExtraHotelero{
    private Integer cantHab;
    private Boolean descuento;
    private Boolean campoDepor;

    public Residencia() {
    }

    public Residencia(Integer cantHab, Boolean descuento, Boolean campoDepor) {
        this.cantHab = cantHab;
        this.descuento = descuento;
        this.campoDepor = campoDepor;
    }

    public Residencia(Integer cantHab, Boolean descuento, Boolean campoDepor, Boolean privado, Integer m2) {
        super(privado, m2);
        this.cantHab = cantHab;
        this.descuento = descuento;
        this.campoDepor = campoDepor;
    }

    public Residencia(Integer cantHab, Boolean descuento, Boolean campoDepor, Boolean privado, Integer m2, String nombre, String direccion, String localidad, String gerente) {
        super(privado, m2, nombre, direccion, localidad, gerente);
        this.cantHab = cantHab;
        this.descuento = descuento;
        this.campoDepor = campoDepor;
    }

    public Integer getCantHab() {
        return cantHab;
    }

    public void setCantHab(Integer cantHab) {
        this.cantHab = cantHab;
    }

    public Boolean getDescuento() {
        return descuento;
    }

    public void setDescuento(Boolean descuento) {
        this.descuento = descuento;
    }

    public Boolean getCampoDepor() {
        return campoDepor;
    }

    public void setCampoDepor(Boolean campoDepor) {
        this.campoDepor = campoDepor;
    }

    @Override
    public String toString() {
        return "Residencia{" + "cantHab=" + cantHab + ", descuento=" + descuento + ", campoDepor=" + campoDepor + '}';
    }

    
    
}
