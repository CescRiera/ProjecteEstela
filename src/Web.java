import java.util.ArrayList;

public class Web {
    public String empresaWeb;
    private String identRegMercantil;
    private String domicilioSocial;
    private String telefon;

    public Web(String empresaWeb, String identRegMercantil, String domicilioSocial, String telefon) {
        this.empresaWeb = empresaWeb;
        this.identRegMercantil = identRegMercantil;
        this.domicilioSocial = domicilioSocial;
        this.telefon = telefon;
    }

    public ArrayList<LlibreAudiovisual> generarLibrosAudiovisuales() {
        ArrayList<LlibreAudiovisual> librosAudiovisuales = new ArrayList<>();

        // Crear 5 libros audiovisuales manualmente y añadir a la lista
        LlibreAudiovisual libro1 = new LlibreAudiovisual("Título1", "ISBN1", "Autor1", "Editorial1", true, "Web1");
        LlibreAudiovisual libro2 = new LlibreAudiovisual("Título2", "ISBN2", "Autor2", "Editorial2", true, "Web2");
        LlibreAudiovisual libro3 = new LlibreAudiovisual("Título3", "ISBN3", "Autor3", "Editorial3", true, "Web3");
        LlibreAudiovisual libro4 = new LlibreAudiovisual("Título4", "ISBN4", "Autor4", "Editorial4", true, "Web4");
        LlibreAudiovisual libro5 = new LlibreAudiovisual("Título5", "ISBN5", "Autor5", "Editorial5", true, "Web5");

        librosAudiovisuales.add(libro1);
        librosAudiovisuales.add(libro2);
        librosAudiovisuales.add(libro3);
        librosAudiovisuales.add(libro4);
        librosAudiovisuales.add(libro5);

        return librosAudiovisuales;
    }
}
