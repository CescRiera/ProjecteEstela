import java.util.Scanner;
class Biblioteca {
    private Usuarios usuarioActual;
    private Scanner scanner;

    public Biblioteca() {
        scanner = new Scanner(System.in);
    }

    public void login() {
        System.out.print("Introduce el usuario: ");
        String usuarioInput = scanner.nextLine();
        System.out.print("Introduce la contraseña: ");
        String contrasenyaInput = scanner.nextLine();

        if (usuarioInput.equals("admin") && contrasenyaInput.equals("admin")) {
            usuarioActual = new Usuarios("admin", "admin", "Cesc", "Riera", "12345678A", "644748764", "Calle Principal 123");
            menuAdmin();
        } else if (usuarioInput.equals("encarregat") && contrasenyaInput.equals("encarregat")) {
            usuarioActual = new Usuarios("encarregat", "encarregat", "Didac", "Garcia", "98765432B", "784483559", "Avenida Secundaria 456");
            menuTreballador();
        } else {
            System.out.println("Usuario o contraseña incorrectos. Intenta de nuevo.");
            login();
        }
    }

    private void menuAdmin() {
        // Implementar menú para el usuario admin aquí
        mostrarInformacionUsuario();
        System.out.println("Acceso total a las características de la biblioteca.");

    }

    private void menuTreballador() {
        // Implementar menú para el usuario treballador aquí
        mostrarInformacionUsuario();
        System.out.println("Acceso a la gestión de préstamos de la biblioteca.");

    }

    private void mostrarInformacionUsuario() {
        System.out.println("Nombre: " + usuarioActual.getNombre());
        System.out.println("Apellido: " + usuarioActual.getApellido());
        System.out.println("DNI: " + usuarioActual.getDni());
        System.out.println("Teléfono: " + usuarioActual.getTelefono());
        System.out.println("Dirección: " + usuarioActual.getDireccion());
    }
}