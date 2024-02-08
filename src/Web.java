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

    public void generateAudioBooks(Biblioteca biblioteca){
        ArrayList<LlibreAudiovisual> LlistaLlibresAudiovisuals = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String titol = "Libro audiovisual " + (i + 1);
            String isbn = "ISBN audiovisual " + (i + 1);
            String[] autors = {"Autor Audiovisual " + (i + 1)};
            boolean disponibilitat = true;
            String webSubministradora = "Web Subministradora " + (i + 1);
            String empresaPropietariaWeb = "Empresa Propietaria Web " + (i + 1);
            String identificadorWebRegistreMercantil = "Identificador Web Registre Mercantil " + (i + 1);
            String domiciliSocial = "Domicili Social " + (i + 1);
            String telefonContacte = "Telèfon Contacte " + (i + 1);

            LlibreAudiovisual libroAudiovisual = new LlibreAudiovisual(titol, isbn, autors, disponibilitat, webSubministradora, empresaPropietariaWeb, identificadorWebRegistreMercantil, domiciliSocial, telefonContacte, disponibilitat);
            LlistaLlibresAudiovisuals.add(libroAudiovisual);
        }
        biblioteca.setLlistaLlibresAudiovisuals(LlistaLlibresAudiovisuals);
    }
}
