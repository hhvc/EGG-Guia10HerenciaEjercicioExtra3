package entidades;
public abstract class ExtraHotelero extends Alojamiento{
    protected Boolean privado;
    protected Integer m2;

    public ExtraHotelero() {
    }

    public ExtraHotelero(Boolean privado, Integer m2) {
        this.privado = privado;
        this.m2 = m2;
    }

    public ExtraHotelero(Boolean privado, Integer m2, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.m2 = m2;
    }

    public Boolean getPrivado() {
        return privado;
    }

    public void setPrivado(Boolean privado) {
        this.privado = privado;
    }

    public Integer getM2() {
        return m2;
    }

    public void setM2(Integer m2) {
        this.m2 = m2;
    }

    @Override
    public String toString() {
        return "ExtraHotelero{" + "privado=" + privado + ", m2=" + m2 + '}';
    }
    
    
}
