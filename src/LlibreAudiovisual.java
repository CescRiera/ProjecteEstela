public class LlibreAudiovisual extends Llibre {
    private String webSubministradora;
    private String empresaPropietariaWeb;
    private String identificadorWebRegistreMercantil;
    private String domiciliSocial;
    private String telefonContacte;
    private boolean disponibilitat;

    public LlibreAudiovisual(String titol, String isbn, String[] autors, boolean disponibilitat, String webSubministradora, String empresaPropietariaWeb, String identificadorWebRegistreMercantil, String domiciliSocial, String telefonContacte, boolean disponibilitat1) {
        super(titol, isbn, autors, disponibilitat);
        this.webSubministradora = webSubministradora;
        this.empresaPropietariaWeb = empresaPropietariaWeb;
        this.identificadorWebRegistreMercantil = identificadorWebRegistreMercantil;
        this.domiciliSocial = domiciliSocial;
        this.telefonContacte = telefonContacte;
        this.disponibilitat = disponibilitat1;
    }

    public String getWebSubministradora() {
        return webSubministradora;
    }

    public void setWebSubministradora(String webSubministradora) {
        this.webSubministradora = webSubministradora;
    }

    public String getEmpresaPropietariaWeb() {
        return empresaPropietariaWeb;
    }

    public void setEmpresaPropietariaWeb(String empresaPropietariaWeb) {
        this.empresaPropietariaWeb = empresaPropietariaWeb;
    }

    public String getIdentificadorWebRegistreMercantil() {
        return identificadorWebRegistreMercantil;
    }

    public void setIdentificadorWebRegistreMercantil(String identificadorWebRegistreMercantil) {
        this.identificadorWebRegistreMercantil = identificadorWebRegistreMercantil;
    }

    public String getDomiciliSocial() {
        return domiciliSocial;
    }

    public void setDomiciliSocial(String domiciliSocial) {
        this.domiciliSocial = domiciliSocial;
    }

    public String getTelefonContacte() {
        return telefonContacte;
    }

    public void setTelefonContacte(String telefonContacte) {
        this.telefonContacte = telefonContacte;
    }

    public boolean isDisponibilitat() {
        return disponibilitat;
    }

    public void setDisponibilitat(boolean disponibilitat) {
        this.disponibilitat = disponibilitat;
    }


}