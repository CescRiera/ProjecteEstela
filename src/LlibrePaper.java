import java.util.ArrayList;
import java.util.Date;

public class LlibrePaper {
    private ArrayList<Llibre> llibresDisponibles;
    private ArrayList<Llibre> llibresOcupats;
    private Date dataImpressio;
    private int quantitatFulles;

    public LlibrePaper(Date dataImpressio, int quantitatFulles) {
        this.llibresDisponibles = new ArrayList<>();
        this.llibresOcupats = new ArrayList<>();
        this.dataImpressio = dataImpressio;
        this.quantitatFulles = quantitatFulles;
    }

    // Mètodes per gestionar els llibres disponibles i ocupats
    public void afegirLlibreDisponible(Llibre llibre) {
        llibresDisponibles.add(llibre);
    }
}