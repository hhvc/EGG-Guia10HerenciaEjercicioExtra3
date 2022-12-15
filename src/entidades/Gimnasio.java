package entidades;

public class Gimnasio {
    private Character tipo;

    public Gimnasio() {
    }

    public Gimnasio(Character tipo) {
        this.tipo = tipo;
    }

    public Character getTipo() {
        return tipo;
    }

    public void setTipo(Character tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Gimnasio{" + "tipo=" + tipo + '}';
    }
    
    
}
