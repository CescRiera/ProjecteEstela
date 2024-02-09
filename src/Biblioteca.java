import java.io.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Biblioteca {
    private static Usuario usuarioActual;
    private static ArrayList<LlibreAudiovisual> LlistaLlibresAudiovisuals;
    private static ArrayList<LlibrePaper> LlistaLlibresPaper;
    private static ArrayList<Usuario> LlistaUsuarios;
    private static ArrayList<Client> LlistaClients;
    private static Web web;
    private static Scanner scanner;

    public Biblioteca() {
        scanner = new Scanner(System.in);
    }

    public ArrayList<LlibreAudiovisual> getLlistaLlibresAudiovisuals() {
        return LlistaLlibresAudiovisuals;
    }

    public static void init(){
        login();

    }
    public void setLlistaLlibresAudiovisuals(ArrayList<LlibreAudiovisual> llistaLlibresAudiovisuals) {
        LlistaLlibresAudiovisuals = llistaLlibresAudiovisuals;
    }

    public static ArrayList<LlibrePaper> getLlistaLlibresPaper() {
        return LlistaLlibresPaper;
    }

    public void setLlistaLlibresPaper(ArrayList<LlibrePaper> llistaLlibresPaper) {
        LlistaLlibresPaper = llistaLlibresPaper;
    }

    public static ArrayList<Client> getLlistaClients() {
        return LlistaClients;
    }

    public void setLlistaClients(ArrayList<Client> llistaClients) {
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

            System.out.print("Introduzca Dni Cliente:");
            String idU  = scanner.nextLine();
            Client c = buscarClientDni(llistaClients,idU); // Cambiar por el generador

            if (c!=null){

                System.out.println("Client ID: "+c.getDni()+"\tNom: "+c.getNom()+"\nEmail: "+c.getEmail()+"\tTipus de Client: "+c.imprimirInformacion()+"\n\nLlibres en posesió:");
                c.imprimirLlibres();
                //usuarioAutenticado.menu();

            }else{

            }

        } else {
            System.out.println("Autenticación fallida. Usuario no encontrado.");
        }
    }

    private static Client buscarClientDni(List<Client> llistaclient, String nombre) {
        for (Client client : llistaclient) {
            if (client.getDni().equals(nombre)) {
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

        while (true){
            mostrarInformacionUsuario();
            System.out.println("BIENVEBENIDO A LA BIBLIOTECA NACIONONAL DE LA COCAAcceso total a las características de la biblioteca.");
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

    private static void menuTreballador() {
        // Implementar menú para el usuario treballador aquí
        mostrarInformacionUsuario();
        System.out.println("Acceso a la gestión de préstamos de la biblioteca.");

    }

    private static void mostrarInformacionUsuario() {
        System.out.println("Nombre: " + usuarioActual.getNombre());
        System.out.println("Apellido: " + usuarioActual.getApellido());
        System.out.println("DNI: " + usuarioActual.getDni());
        System.out.println("Teléfono: " + usuarioActual.getTelefono());
        System.out.println("Dirección: " + usuarioActual.getDireccion());
    }
}