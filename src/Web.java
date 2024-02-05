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

    public void prestarLlibreAudiovisual(LlibreAudiovisual llibre,Biblioteca biblioteca){
        if(biblioteca.getLlistaAudiosDisponibles().contains(llibre)){
            biblioteca.getLlistaAudiosOcupats().add(llibre);
        }else{
            System.out.println("El llibre no està disponible");
        }

    }
}
