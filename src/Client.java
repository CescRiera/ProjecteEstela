import java.beans.JavaBean;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

abstract class Client {
    private String dni;
    private String nom;
    private String cognom;
    private String email;
    private Date dataIniciPrestec;
    private Date dataDevolucio;
    private  LlibrePaper llibrePaperEnPrestec;
    private  LlibreAudiovisual llibreAudiovisualEnPrestec;
    private Vinilo viniloEnPrestec;
    private String llibreesperat;

    //private Date dataIniciPrestec;
    //private Date dataDevolucio;
    public abstract void menu();

    public Client(String dni, String nom, String cognom, String email) {
        this.dni = dni;
        this.nom = nom;
        this.cognom = cognom;
        this.email = email;
        //this.dataIniciPrestec = dataIniciPrestec;
        //this.dataDevolucio = dataDevolucio;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognom() {
        return cognom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDataIniciPrestec() {
        return dataIniciPrestec;
    }

    public void setDataIniciPrestec(Date dataIniciPrestec) {
        this.dataIniciPrestec = dataIniciPrestec;
    }

    public Date getDataDevolucio() {
        return dataDevolucio;
    }

    public void setDataDevolucio(Date dataDevolucio) {
        this.dataDevolucio = dataDevolucio;
    }

    public LlibrePaper getLlibrePaperEnPrestec() {
        return llibrePaperEnPrestec;
    }

    public void setLlibrePaperEnPrestec(LlibrePaper llibrePaperEnPrestec) {
        this.llibrePaperEnPrestec = llibrePaperEnPrestec;
    }

    public LlibreAudiovisual getLlibreAudiovisualEnPrestec() {
        return llibreAudiovisualEnPrestec;
    }

    public void setLlibreAudiovisualEnPrestec(LlibreAudiovisual llibreAudiovisualEnPrestec) {
        this.llibreAudiovisualEnPrestec = llibreAudiovisualEnPrestec;
    }

    public Vinilo getViniloEnPrestec() {
        return viniloEnPrestec;
    }

    public void setViniloEnPrestec(Vinilo viniloEnPrestec) {
        this.viniloEnPrestec = viniloEnPrestec;
    }

    public String getLlibreesperat() {
        return llibreesperat;
    }

    public void setLlibreesperat(String llibreesperat) {
        this.llibreesperat = llibreesperat;
    }
}