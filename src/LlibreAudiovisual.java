public class LlibreAudiovisual extends Llibre{
    private Web web;

    public Web getWeb() {
        return web;
    }

    public void setWeb(Web web) {
        this.web = web;
    }

    public LlibreAudiovisual(String titol, String isbn, String autors, boolean disponibilitat, Web web){
        super(titol, isbn, autors, disponibilitat);
        this.web = web;
    }

    // Implementa los métodos de la interfaz WebInfo

}
