import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Hotel hotel = new Hotel();
        for (int i = 101; i <= 106; i++) {
            hotel.agregarHabitación(new Habitación(i));
        }

        while (true) {
            System.out.print("Ingrese el nombre del cliente: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese la edad del cliente: ");
            int edad = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (edad <= 17) {
                System.out.println("El cliente debe ser mayor de 17 años para reservar una habitación.");
                continue;
            }

            Persona persona = new Persona(nombre, edad);
            persona.mostrarInfo();

            boolean reservaCreada = false;
            for (int i = 101; i <= 106; i++) {
                if (hotel.consultarDisponibilidad(i)) {
                    Reserva reserva = hotel.crearReserva(i, nombre);
                    if (reserva != null) {
                        System.out.println("Reserva creada para " + reserva.getCliente() + " en la habitación " + reserva.getHabitación().getNúmero());
                        reservaCreada = true;
                        break;
                    }
                }
            }

            if (!reservaCreada) {
                System.out.println("No se pudo crear la reserva. No quedan habitaciones disponibles.");
                break;
            }

            boolean hayDisponibles = false;
            for (int i = 101; i <= 106; i++) {
                if (hotel.consultarDisponibilidad(i)) {
                    hayDisponibles = true;
                    break;
                }
            }

            if (!hayDisponibles) {
                System.out.println("No quedan habitaciones disponibles.");
                break;
            }
        }

        scanner.close();
    }
}