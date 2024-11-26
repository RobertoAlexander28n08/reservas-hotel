public class Habitación {
    private int número;
    private boolean disponible;

    public Habitación(int número) {
        this.número = número;
        this.disponible = true;
    }

    public int getNúmero() {
        return número;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}