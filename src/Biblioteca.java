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
            usuarioActual = new Usuarios("admin", "admin");
            menuAdmin();
        } else if (usuarioInput.equals("encarregat") && contrasenyaInput.equals("encarregat")) {
            usuarioActual = new Usuarios("encarregat", "encarregat");
            menuTreballador();
        } else {
            System.out.println("Usuario o contraseña incorrectos. Intenta de nuevo.");
            login();
        }
    }

    private void menuAdmin() {
        // Implementar menú para el usuario admin aquí
        System.out.println("Acceso total a las características de la biblioteca.");
    }

    private void menuTreballador() {
        // Implementar menú para el usuario treballador aquí
        System.out.println("Acceso a la gestión de préstamos de la biblioteca.");
    }
}