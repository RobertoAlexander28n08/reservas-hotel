public class Reserva {
    private Habitación habitación;
    private String cliente;

    public Reserva(Habitación habitación, String cliente) {
        this.habitación = habitación;
        this.cliente = cliente;
        this.habitación.setDisponible(false);
    }

    public Habitación getHabitación() {
        return habitación;
    }

    public String getCliente() {
        return cliente;
    }

    public void setHabitación(Habitación habitación) {
        this.habitación = habitación;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
}