import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Web web = new Web("Llibres.Inc","34343","Carrer Almeria 34","678324590");
        ArrayList<LlibreAudiovisual> llistaLlibres = web.generateAudioBooks();
        for (LlibreAudiovisual libro : llistaLlibres) {
            System.out.println("Título: " + libro.getTitol());
            System.out.println("ISBN: " + libro.getIsbn());
            System.out.println("Autor: " + libro.getAutors());
            System.out.println("Disponible: " + (libro.isDisponibilitat() ? "Sí" : "No"));
            System.out.println("Empresa Web: " + libro.getWeb().empresaWeb);
            System.out.println("identRegMercantil: " + libro.getWeb().identRegMercantil);
            System.out.println("TelefonoEmpresa: " + libro.getWeb().telefon);
            System.out.println("Empresa Web: " + libro.getWeb().domicilioSocial);
            System.out.println("-------------------------------------");
        }

        System.out.println(biblioteca.getLlistaLlibresAudiovisuals());

        biblioteca.login();

        Biblioteca.login();
    }

    public static void generateBooks(Biblioteca biblioteca) {
        ArrayList<LlibrePaper> LlistaLlibresPaper = new ArrayList<>();


        for (int i = 0; i < 10; i++) {
            String titol = "Libro de papel " + (i + 1);
            String isbn = "ISBN papel " + (i + 1);
            String autors = "Autor Papel " + (i + 1);
            boolean disponibilitat = true;
            String dataImpressio = "Fecha papel " + (i + 1);
            int quantitatFulles = (i + 1) * 100;
            LlibrePaper libroPapel = new LlibrePaper(titol, isbn, autors, disponibilitat, dataImpressio, quantitatFulles);
            LlistaLlibresPaper.add(libroPapel);
        }
        biblioteca.setLlistaLlibresPaper(LlistaLlibresPaper);
    }

}