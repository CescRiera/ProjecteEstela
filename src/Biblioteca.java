import java.util.ArrayList;
import java.util.Scanner;
class Biblioteca {
<<<<<<< HEAD
    private Usuarios usuarioActual;
    private ArrayList<LlibreAudiovisual> LlistaAudiosOcupats;
    private ArrayList<LlibreAudiovisual> LlistaAudiosDisponibles;
    private Web web;
=======
    private Usuario usuarioActual;
>>>>>>> 06b6fd7a18e92413af133cea89e633a313b6b24f
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
            usuarioActual = new Usuario("admin", "admin", "Cesc", "Riera", "12345678A", "644748764", "Calle Principal 123");
            menuAdmin();
        } else if (usuarioInput.equals("encarregat") && contrasenyaInput.equals("encarregat")) {
            usuarioActual = new Usuario("encarregat", "encarregat", "Didac", "Garcia", "98765432B", "784483559", "Avenida Secundaria 456");
            menuTreballador();
        } else {
            System.out.println("Usuario o contraseña incorrectos. Intenta de nuevo.");
            login();
        }
    }

    public ArrayList<LlibreAudiovisual> getLlistaAudiosOcupats() {
        return LlistaAudiosOcupats;
    }

    public void setLlistaAudiosOcupats(ArrayList<LlibreAudiovisual> llistaAudiosOcupats) {
        LlistaAudiosOcupats = llistaAudiosOcupats;
    }

    public ArrayList<LlibreAudiovisual> getLlistaAudiosDisponibles() {
        return LlistaAudiosDisponibles;
    }

    public void setLlistaAudiosDisponibles(ArrayList<LlibreAudiovisual> llistaAudiosDisponibles) {
        LlistaAudiosDisponibles = llistaAudiosDisponibles;
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