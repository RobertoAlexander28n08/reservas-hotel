import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<Habitación> habitaciones;
    private List<Reserva> reservas;

    public Hotel() {
        this.habitaciones = new ArrayList<>();
        this.reservas = new ArrayList<>();
    }

    public void agregarHabitación(Habitación habitación) {
        habitaciones.add(habitación);
    }

    public Reserva crearReserva(int numeroHabitación, String cliente) {
        for (Habitación habitación : habitaciones) {
            if (habitación.getNúmero() == numeroHabitación && habitación.isDisponible()) {
                Reserva reserva = new Reserva(habitación, cliente);
                reservas.add(reserva);
                return reserva;
            }
        }
        return null;
    }

    public boolean consultarDisponibilidad(int númeroHabitación) {
        for (Habitación habitación : habitaciones) {
            if (habitación.getNúmero() == númeroHabitación) {
                return habitación.isDisponible();
            }
        }
        return false;
    }
}