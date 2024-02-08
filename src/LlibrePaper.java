import java.util.ArrayList;
import java.util.Date;

public class LlibrePaper extends Llibre{
    private String dataImpressio;
    private int quantitatFulles;

    public LlibrePaper(String titol, String isbn, String autors, boolean disponibilitat, String dataImpressio, int quantitatFulles) {
        super(titol, isbn, autors, disponibilitat);
        this.dataImpressio = dataImpressio;
        this.quantitatFulles = quantitatFulles;
    }

    public String getDataImpressio() {
        return dataImpressio;
    }

    public void setDataImpressio(String dataImpressio) {
        this.dataImpressio = dataImpressio;
    }

    public int getQuantitatFulles() {
        return quantitatFulles;
    }

    public void setQuantitatFulles(int quantitatFulles) {
        this.quantitatFulles = quantitatFulles;
    }
}