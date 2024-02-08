import java.io.Console;
import java.util.ArrayList;
import java.util.Scanner;
class Biblioteca {
    private Usuario usuarioActual;
    private ArrayList<LlibreAudiovisual> LlistaLlibresAudiovisuals;
    private ArrayList<LlibrePaper> LlistaLlibresPaper;
    private ArrayList<Client> LlistaClients;
    private Web web;
    private Scanner scanner;

    public Biblioteca() {
        scanner = new Scanner(System.in);
    }

    public ArrayList<LlibreAudiovisual> getLlistaLlibresAudiovisuals() {
        return LlistaLlibresAudiovisuals;
    }

    public void setLlistaLlibresAudiovisuals(ArrayList<LlibreAudiovisual> llistaLlibresAudiovisuals) {
        LlistaLlibresAudiovisuals = llistaLlibresAudiovisuals;
    }

    public ArrayList<LlibrePaper> getLlistaLlibresPaper() {
        return LlistaLlibresPaper;
    }

    public void setLlistaLlibresPaper(ArrayList<LlibrePaper> llistaLlibresPaper) {
        LlistaLlibresPaper = llistaLlibresPaper;
    }

    public ArrayList<Client> getLlistaClients() {
        return LlistaClients;
    }

    public void setLlistaClients(ArrayList<Client> llistaClients) {
        LlistaClients = llistaClients;
    }

    public void login() {
        System.out.print("Introduce el usuario: ");
        String usuarioInput = scanner.nextLine();
        System.out.print("Introduce la contraseña: ");
        String contrasenyaInput = scanner.nextLine();

        if (usuarioInput.equals("admin") && contrasenyaInput.equals("admin")) {
            usuarioActual = new Admin("admin", "admin", "Cesc", "Riera", "12345678A", "644748764", "Calle Principal 123");
            menuAdmin();
        } else if (usuarioInput.equals("encarregat") && contrasenyaInput.equals("encarregat")) {
            usuarioActual = new Treballador("encarregat", "encarregat", "Didac", "Garcia", "98765432B", "784483559", "Avenida Secundaria 456");
            menuTreballador();
        } else {
            System.out.println("Usuario o contraseña incorrectos. Intenta de nuevo.");
            login();
        }
    }



    private void menuAdmin() {

        while (true){
            mostrarInformacionUsuario();
            System.out.println("Acceso total a las características de la biblioteca.");
            System.out.println("Escull un número: \n" +
                    "1. Prestar\n"+
                    "2. Retornar\n"+
                    "3. Sortir\n");
            int opcioEscollida = scanner.nextInt();
            if (opcioEscollida ==1){
                System.out.println("DNI: ");
                String dni = scanner.nextLine();
                dni = scanner.nextLine();
                System.out.println("Nom: ");
                String nom = scanner.nextLine();
                System.out.println("Cognom: ");
                String cognom = scanner.nextLine();
                System.out.println("Gmail: ");
                String gmail = scanner.nextLine();
                System.out.println("Tipus de client: ");
                String tipusClient = scanner.nextLine();
                Client client1 = new Client(dni,nom,cognom,gmail,tipusClient);
                usuarioActual.Prestar(client1, getLlistaLlibresPaper().get(1));

                // LA LINIA DE SOTA DONA ERROR DONA ERROR

                //LlistaClients.add(client1);

            }else if(opcioEscollida == 2){
                System.out.println("DNI: ");
                String dni = scanner.nextLine();
                dni = scanner.nextLine();
                System.out.println("ISBN: ");
                String isbn = scanner.nextLine();
                LlibrePaper llibreRetornar = null;
                for (int i = 0; i<getLlistaLlibresPaper().size();i++){
                    if(getLlistaLlibresPaper().get(i).getIsbn()==isbn){
                        llibreRetornar = getLlistaLlibresPaper().get(i);
                    }
                }
                for(int i = 0; i<getLlistaClients().size();i++){
                    if(getLlistaClients().get(i).getDni() == dni){

                        usuarioActual.Retornar(getLlistaClients().get(i),llibreRetornar);
                    }
                }
            } else if (opcioEscollida == 3) {
                break;
            }
        }
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