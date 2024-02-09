import java.util.ArrayList;

public class Web {
    public String empresaWeb;
    protected String identRegMercantil;
    protected String domicilioSocial;
    protected String telefon;

    public Web(String empresaWeb, String identRegMercantil, String domicilioSocial, String telefon) {
        this.empresaWeb = empresaWeb;
        this.identRegMercantil = identRegMercantil;
        this.domicilioSocial = domicilioSocial;
        this.telefon = telefon;
    }

    public ArrayList<LlibreAudiovisual> generateAudioBooks() {
        ArrayList<LlibreAudiovisual> llistaLlibresAudiovisuals = new ArrayList<>();

        LlibreAudiovisual libro1 = new LlibreAudiovisual(
                "El principito",
                "9788373191726",
                "Antoine de Saint-Exupéry",
                true,
                this // Pasando la instancia de la clase Web
        );
        llistaLlibresAudiovisuals.add(libro1);

        LlibreAudiovisual libro2 = new LlibreAudiovisual(
                "Cien años de soledad",
                "9786070720721",
                "Gabriel García Márquez",
                true,
                this
        );
        llistaLlibresAudiovisuals.add(libro2);

        return llistaLlibresAudiovisuals;
    }

}
