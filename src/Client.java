import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Client {
    private String dni;
    private String nom;
    private String cognom;
    private String email;
    private String tipusClient;
    private List<Llibre> llistaLlibres;
    private Llibre producteEnPrestec;
    private Date dataIniciPrestec;
    private Date dataDevolucio;

    public Client(String dni, String nom, String cognom, String email, String tipusClient) {
        this.dni = dni;
        this.nom = nom;
        this.cognom = cognom;
        this.email = email;
        this.tipusClient = tipusClient;

        this.llistaLlibres = Generador.generatePaperBooks();
    }

    public void imprimirLlibres(){
        int i = 1 ;
        for (Llibre l : llistaLlibres) {
            System.out.println("Llibre["+i+"]\tTitol :"+l.getTitol()+"\tISBN: "+l.getIsbn()); i++;
        }
    }

    public String imprimirInformacion() {
        return "";
    }
    public void setLlistaLlibres(List<Llibre> l){
        this.llistaLlibres = l;
    }
    public List<Llibre> getLlistaLlibres(){
        return this.llistaLlibres;
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

    public String getTipusClient() {
        return tipusClient;
    }

    public void setTipusClient(String tipusClient) {
        this.tipusClient = tipusClient;
    }

    public Llibre getProducteEnPrestec() {
        return producteEnPrestec;
    }

    public void setProducteEnPrestec(Llibre producteEnPrestec) {
        this.producteEnPrestec = producteEnPrestec;
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

}