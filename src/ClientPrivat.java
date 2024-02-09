import java.util.ArrayList;
import java.util.Date;

public class ClientPrivat extends Client {


    public ClientPrivat(String dni, String nom, String cognom, String email) {
        super(dni, nom, cognom, email);
    }

    public void menu() {
        // Imprimir información del cliente
        System.out.println("Información del cliente:");
        System.out.println("DNI: " + this.getDni());
        System.out.println("Nombre: " + this.getNom());
        System.out.println("Apellido: " + this.getCognom());
        System.out.println("Email: " + this.getEmail());

        // Imprimir información de todos los libros
        System.out.println("\nLibros de Papel :");
        ArrayList<Llibre> librospapel = Generador.generatePaperBooks();
        for (Llibre libro : librospapel) {
            System.out.println("Título: " + libro.getTitol());
            System.out.println("Autor: " + libro.getAutors());
            System.out.println("ISBN: " + libro.getIsbn());
            if (libro instanceof LlibrePaper) {
                LlibrePaper libroPaper = (LlibrePaper) libro;
                System.out.println("Fecha de publicación: " + ((LlibrePaper) libro).getDataImpressio());
                System.out.println("Número de páginas: " + libroPaper.getQuantitatFulles());
            }
            System.out.println(); // Salto de línea entre libros
        }
        System.out.println("\nAudioLibros :");
        ArrayList<LlibreAudiovisual> audiolibros = Generador.generateAudioBooks();
        for (Llibre libro : audiolibros) {
            System.out.println("Título: " + libro.getTitol());
            System.out.println("Autor: " + libro.getAutors());
            System.out.println("ISBN: " + libro.getIsbn());
            if (libro instanceof LlibreAudiovisual) {
                LlibreAudiovisual llibreAudiovisual = (LlibreAudiovisual) libro;
                System.out.println("Pagina Web: " + llibreAudiovisual.getWeb().empresaWeb);
                System.out.println("Telefon Web: " + llibreAudiovisual.getWeb().telefon);
                System.out.println("Domicilio Social de la Web: " + llibreAudiovisual.getWeb().domicilioSocial);
                System.out.println("Identidad Mercantil de la Web: " + llibreAudiovisual.getWeb().identRegMercantil);

            }
            System.out.println(); // Salto de línea entre libros
        }

    }}
