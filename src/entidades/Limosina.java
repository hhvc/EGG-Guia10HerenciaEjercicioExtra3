package entidades;
public class Limosina {

    private boolean disponible = true;

    public Limosina() {
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Limosina{" + "disponible=" + disponible + '}';
    }
    
    
    
}
