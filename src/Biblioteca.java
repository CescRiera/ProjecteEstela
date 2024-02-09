import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Biblioteca {
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

    public static ArrayList<LlibreAudiovisual> getLlistaLlibresAudiovisuals() {
        return LlistaLlibresAudiovisuals;
    }

    public static void init() {
        login();
    }

    public static void setLlistaLlibresAudiovisuals(ArrayList<LlibreAudiovisual> llistaLlibresAudiovisuals) {
        LlistaLlibresAudiovisuals = llistaLlibresAudiovisuals;
    }

    public static ArrayList<Vinilo> getLlistaVinilo() {
        return LlistaVinilo;
    }

    public static void setLlistaVinilo(ArrayList<Vinilo> llistaVinilo) {
        LlistaVinilo = llistaVinilo;
    }

    public static ArrayList<LlibrePaper> getLlistaLlibresPaper() {
        return LlistaLlibresPaper;
    }

    public static void setLlistaLlibresPaper(ArrayList<LlibrePaper> llistaLlibresPaper) {
        LlistaLlibresPaper = llistaLlibresPaper;
    }

    public static ArrayList<Client> getLlistaClients() {
        return LlistaClients;
    }

    public static void setLlistaClients(ArrayList<Client> llistaClients) {
        LlistaClients = llistaClients;
    }

    public static void login() {
        List<Usuario> listaUsuarios = new ArrayList<>();
        listaUsuarios.add(new Administrador("admin", "admin", "Admin", "Root", "12345678X", "123456789", "Calle Admin 123"));
        listaUsuarios.add(new Treballador("usuario1", "pass123", "Usuario1", "Apellido1", "87654321Y", "987654321", "Calle Usuario 1"));
        listaUsuarios.add(new Treballador("usuario2", "pass456", "Usuario2", "Apellido2", "56789012Z", "987654321", "Calle Usuario 2"));

        List<Client> llistaClients = new ArrayList<>();
        llistaClients.add(new ClientEscola("123", "Juan", "Pérez", "juan@gmail.com", "Premium"));
        llistaClients.add(new ClientPrivat("87654321Y", "Ana", "Gómez", "ana@gmail.com", "Básico"));
        llistaClients.add(new ClientPrivat("56789012Z", "Carlos", "Martínez", "carlos@gmail.com", "Premium"));

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese su contraseña: ");
        String contrasena = scanner.nextLine();

        Usuario usuarioAutenticado = autenticarUsuario(listaUsuarios, nombre, contrasena);

        if (usuarioAutenticado != null) {

            System.out.print("Introduzca DNI Cliente:");
            String idU = scanner.nextLine();
            Client c = buscarClientDni(llistaClients, idU);

            if (c != null) {
                System.out.println("Cliente ID: " + c.getDni() + "\tNombre: " + c.getNom() + "\nEmail: " + c.getEmail() +
                        "\tTipo de Cliente: " + c.imprimirInformacion() + "\n\nLibros en posesión:");
                c.imprimirLlibres();
            } else {
                // ¿Qué deberías hacer en caso de que el cliente no sea encontrado?
                // Puedes agregar un mensaje aquí o realizar alguna acción adicional.
                System.out.println("Cliente no encontrado.");
            }

        } else {
            System.out.println("Autenticación fallida. Usuario no encontrado.");
        }
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
