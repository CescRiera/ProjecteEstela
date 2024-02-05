import java.util.ArrayList;
import java.util.Scanner;
class Biblioteca {
    private Usuarios usuarioActual;
    private ArrayList<LlibreAudiovisual> LlistaAudiosOcupats;
    private ArrayList<LlibreAudiovisual> LlistaAudiosDisponibles;
    private Web web;
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
        System.out.println("Acceso total a las características de la biblioteca.");
    }

    private void menuTreballador() {
        // Implementar menú para el usuario treballador aquí
        System.out.println("Acceso a la gestión de préstamos de la biblioteca.");
    }
}