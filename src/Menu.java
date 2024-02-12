import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    public static Scanner scanner = new Scanner(System.in);
    private Usuario usuarioAutenticado;

    public Menu() {
    }

    public Usuario getUsuarioAutenticado() {
        return usuarioAutenticado;
    }

    public void setUsuarioAutenticado(Usuario usuarioAutenticado) {
        this.usuarioAutenticado = usuarioAutenticado;
    }

    public void login(Biblioteca b,List<Client> llistaClients) {
        ListaEspera listaEspera = new ListaEspera();;

        List<Usuario> listaUsuarios = new ArrayList<>();
        listaUsuarios.add(new Administrador("admin", "admin", "Admin", "Root", "12345678X", "123456789", "Calle Admin 123"));
        listaUsuarios.add(new Treballador("usuario1", "pass123", "Usuario1", "Apellido1", "87654321Y", "987654321", "Calle Usuario 1"));
        listaUsuarios.add(new Treballador("usuario2", "pass456", "Usuario2", "Apellido2", "56789012Z", "987654321", "Calle Usuario 2"));

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
                System.out.print("Escriu l'ISBN del llibro que desitja reservar: ");
                String isbn = scanner.nextLine();
                System.out.println("Operació:\n" +
                        "1. Prestar\t" +
                        "2. Retornar\t" +
                        "3. Afegir a llista d'espera");
                int opcio = scanner.nextInt();
                Llibre libroSeleccionado = buscarLlibrePorISBN(b.getLlistaLlibresAudiovisuals(), isbn);
                if (libroSeleccionado != null) {
                    // Si se encuentra un libro con el ISBN dado
                    switch (opcio) {
                        case 1:
                            usuarioAutenticado.Prestar(c,b,isbn);
                            break;
                        case 2:
                            usuarioAutenticado.Retornar(c,b,isbn);
                            break;
                        case 3:
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

    private void menuAdmin() {
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

    private void menuTreballador() {
        mostrarInformacionUsuario();
        System.out.println("Acceso a la gestión de préstamos de la biblioteca.");
        // Implementar menú para el usuario treballador aquí
    }

    private void mostrarInformacionUsuario() {
        System.out.println("Nombre: " + this.getUsuarioAutenticado().getNombre());
        System.out.println("Apellido: " + this.getUsuarioAutenticado().getApellido());
        System.out.println("DNI: " + this.getUsuarioAutenticado().getDni());
        System.out.println("Teléfono: " + this.getUsuarioAutenticado().getTelefono());
        System.out.println("Dirección: " + this.getUsuarioAutenticado().getDireccion());
    }
}
