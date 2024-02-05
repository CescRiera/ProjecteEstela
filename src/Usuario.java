import java.util.Scanner;

public class Usuario {
    private static final String USUARIO_ADMIN = "admin";
    private static final String CONTRASENA_ADMIN = "admin";
    private static final String USUARIO_NORMAL = "normal";
    private static final String CONTRASENA_NORMAL = "normal";

    public void iniciarSesion() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre de usuario: ");
        String usuario = scanner.nextLine();

        System.out.print("Ingrese la contraseña: ");
        String contrasena = scanner.nextLine();

        if (usuario.equals(USUARIO_ADMIN) && contrasena.equals(CONTRASENA_ADMIN)) {
            System.out.println("¡Bienvenido, admin!");
            // Aquí puedes llamar a un método para mostrar el menú de admin
        } else if (usuario.equals(USUARIO_NORMAL) && contrasena.equals(CONTRASENA_NORMAL)) {
            System.out.println("¡Bienvenido, normal!");
            // Aquí puedes llamar a un método para mostrar el menú normal
        } else {
            System.out.println("Credenciales incorrectas. Inicio de sesión fallido.");
        }

        scanner.close();
    }
}