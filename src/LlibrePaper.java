import java.util.ArrayList;
import java.util.Date;

public class LlibrePaper extends Llibre{
    private ArrayList<Llibre> llibresDisponibles;
    private Date dataImpressio;
    private int quantitatFulles;

    public LlibrePaper(String titol, String isbn, String autors, String editorial, Boolean disponible, Date dataImpressio, int quantitatFulles) {
        super(titol, isbn, autors, editorial, disponible);
        this.llibresDisponibles = new ArrayList<>();
        this.dataImpressio = dataImpressio;
        this.quantitatFulles = quantitatFulles;
    }

    // Mètodes per gestionar els llibres disponibles i ocupats
    public void afegirLlibreDisponible(Llibre llibre) {
        llibresDisponibles.add(llibre);
    }
}