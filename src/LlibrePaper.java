import java.util.ArrayList;
import java.util.Date;

public class LlibrePaper extends Llibre{
    private ArrayList<Llibre> llibresDisponiblesPaper;
    private Date dataImpressio;
    private int quantitatFulles;

    public LlibrePaper(String titol, String isbn, String autors, String editorial, Boolean disponible, Date dataImpressio, int quantitatFulles) {
        super(titol, isbn, autors, editorial, disponible);
        this.llibresDisponiblesPaper = new ArrayList<>();
        this.dataImpressio = dataImpressio;
        this.quantitatFulles = quantitatFulles;
    }

    public void afegirLlibreDisponible(Llibre llibre) {
        llibresDisponiblesPaper.add(llibre);
    }
}