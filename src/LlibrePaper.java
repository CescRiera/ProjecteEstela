import java.util.ArrayList;

public class LlibrePaper {
    private ArrayList<Llibre> llibresDisponibles;
    private ArrayList<Llibre> llibresOcupats;
    private String dataImpressio;
    private int quantitatFulles;

    public LlibrePaper(String dataImpressio, int quantitatFulles) {
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