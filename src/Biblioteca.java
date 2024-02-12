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

    public static void init() {
        login();
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

    public static void login() {
        ListaEspera listaEspera = new ListaEspera();
        ArrayList<LlibreAudiovisual> audiolibros = Generador.generateAudioBooks();

        LlistaLlibresPaper = Generador.generatePaperBooks();
        LlistaLlibresAudiovisuals = Generador.generateAudioBooks();
        LlistaVinilo = Generador.generateVinylRecords();

        List<Usuario> listaUsuarios = new ArrayList<>();
        listaUsuarios.add(new Administrador("admin", "admin", "Admin", "Root", "12345678X", "123456789", "Calle Admin 123"));
        listaUsuarios.add(new Treballador("usuario1", "pass123", "Usuario1", "Apellido1", "87654321Y", "987654321", "Calle Usuario 1"));
        listaUsuarios.add(new Treballador("usuario2", "pass456", "Usuario2", "Apellido2", "56789012Z", "987654321", "Calle Usuario 2"));

        List<Client> llistaClients = new ArrayList<>();
        //llistaClients.add(new ClientEscola("123", "Juan", "Pérez", "juan@gmail.com", "Premium"));
        llistaClients.add(new ClientPrivat("123", "Ana", "Gómez", "ana@gmail.com"));
        llistaClients.add(new ClientPrivat("56789012Z", "Carlos", "Martínez", "carlos@gmail.com"));

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
                c.menu();
                System.out.print("Escriba el ISBN del libro que desea reservar: ");
                String isbn = scanner.nextLine();
                Llibre libroSeleccionado = buscarLlibrePorISBN(audiolibros, isbn);
                if (libroSeleccionado != null) {
                    // Si se encuentra un libro con el ISBN dado
                    switch (isbn) {
                        case "Prestar":
                            // Opción 1: Prestar el libro
                            break;
                        case "Retornar":
                            // Opción 2: Retornar el libro
                            break;
                        case "Devolver":
                            // Opción 3: Devolver el libro
                            break;
                        case "Añadir a lista de Espera":
                            // Opción 4: Añadir a lista de espera
                            listaEspera.añadirCliente(c);
                            break;
                        default:
                            System.out.println("Opción no válida.");
                            break;
                    }
                } else {
                    // Si no se encuentra ningún libro con el ISBN dado
                    System.out.println("ISBN incorrecto. Inténtelo de nuevo.");
                }
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
