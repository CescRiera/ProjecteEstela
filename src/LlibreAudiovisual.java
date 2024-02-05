import java.util.ArrayList;

public class LlibreAudiovisual extends Llibre {

    private ArrayList<Llibre> llibresDisponibleAudio;
    private String webSubministradora;

    public LlibreAudiovisual(String titol, String isbn, String autors, String editorial, Boolean disponible, String webSubministradora) {
        super(titol, isbn, autors, editorial, disponible);
        this.llibresDisponibleAudio = new ArrayList<>();
        this.webSubministradora = webSubministradora;

    }

    public void afegirLlibreDisponible(Llibre llibre) {
        llibresDisponibleAudio.add(llibre);
    }

}