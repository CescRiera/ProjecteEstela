import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biblioteca {
    private static Usuario usuarioActual;
    private static ArrayList<LlibreAudiovisual> LlistaLlibresAudiovisuals;
    private static ArrayList<LlibrePaper> LlistaLlibresPaper;
    private static ArrayList<Vinilo> LlistaVinilo;
    private static ArrayList<Client> LlistaClients;
    private static Web web;
    private static Scanner scanner;

    public Biblioteca() {
        scanner = new Scanner(System.in);
    }

    public ArrayList<LlibreAudiovisual> getLlistaLlibresAudiovisuals() {
        return LlistaLlibresAudiovisuals;
    }

    public void setLlistaLlibresAudiovisuals(ArrayList<LlibreAudiovisual> llistaLlibresAudiovisuals) {
        LlistaLlibresAudiovisuals = llistaLlibresAudiovisuals;
    }

    public ArrayList<Vinilo> getLlistaVinilo() {
        return LlistaVinilo;
    }

    public static void setLlistaVinilo(ArrayList<Vinilo> llistaVinilo) {
        LlistaVinilo = llistaVinilo;
    }

    public ArrayList<LlibrePaper> getLlistaLlibresPaper() {
        return LlistaLlibresPaper;
    }

    public static void setLlistaLlibresPaper(ArrayList<LlibrePaper> llistaLlibresPaper) {
        LlistaLlibresPaper = llistaLlibresPaper;
    }

    public ArrayList<Client> getLlistaClients() {
        return LlistaClients;
    }

    public static void setLlistaClients(ArrayList<Client> llistaClients) {
        LlistaClients = llistaClients;
    }
    private static Client buscarClientDni(List<Client> llistaclient, String dni) {
        for (Client client : llistaclient) {
            if (client.getDni().equals(dni)) {
                return client;
            }
        }
        return null;
    }

    private static Usuario autenticarUsuario(List<Usuario> listaUsuarios, String nombre, String contrasena) {
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getUsuario().equals(nombre) && usuario.getContrasena().equals(contrasena)) {
                return usuario; // Usuario autenticado
            }
        }
        return null; // Usuario no encontrado
    }

    public static Llibre buscarLlibrePorISBN(ArrayList<LlibreAudiovisual> audiolibros, String isbn) {
        for (LlibreAudiovisual libro : audiolibros) {
            if (libro.getIsbn().trim().equals(isbn.trim())) {
                return libro;
            }
        }
        return null; // Si no se encuentra ningún libro con el ISBN dado
    }

    private static void menuAdmin() {
        while (true) {
            mostrarInformacionUsuario();
            System.out.println("BIENVENIDO A LA BIBLIOTECA NACIONAL DE LA COCA - Acceso total a las características de la biblioteca.");
            System.out.println("Escoge un número: \n" +
                    "1. Prestar\n" +
                    "2. Retornar\n" +
                    "3. Salir\n");

            int opcioEscollida = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea después de nextInt()

            if (opcioEscollida == 1) {
                // Implementar la lógica para prestar libros
            } else if (opcioEscollida == 2) {
                // Implementar la lógica para retornar libros
            } else if (opcioEscollida == 3) {
                break;
            }
        }
    }

    private static void menuTreballador() {
        mostrarInformacionUsuario();
        System.out.println("Acceso a la gestión de préstamos de la biblioteca.");
        // Implementar menú para el usuario treballador aquí
    }

    private static void mostrarInformacionUsuario() {
        System.out.println("Nombre: " + usuarioActual.getNombre());
        System.out.println("Apellido: " + usuarioActual.getApellido());
        System.out.println("DNI: " + usuarioActual.getDni());
        System.out.println("Teléfono: " + usuarioActual.getTelefono());
        System.out.println("Dirección: " + usuarioActual.getDireccion());
    }
}
