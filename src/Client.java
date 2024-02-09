import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Client {
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

        Llibre llibre1 = new Llibre("El señor de los anillos", "978-84-450-7709-6", new String[]{"J.R.R. Tolkien"}, true);
        Llibre llibre2 = new Llibre("Cien años de soledad", "978-84-376-0154-5", new String[]{"Gabriel García Márquez"}, true);
        Llibre llibre3 = new Llibre("1984", "978-84-9759-563-5", new String[]{"George Orwell"}, false);
        Llibre llibre4 = new Llibre("Harry Potter y la piedra filosofal", "978-84-9838-518-5", new String[]{"J.K. Rowling"}, true);
        Llibre llibre5 = new Llibre("Don Quijote de la Mancha", "978-84-7908-406-3", new String[]{"Miguel de Cervantes"}, true);

        ArrayList<Llibre> listaLlibres = new ArrayList<>();
        listaLlibres.add(llibre1);
        listaLlibres.add(llibre2);
        listaLlibres.add(llibre3);
        listaLlibres.add(llibre4);
        listaLlibres.add(llibre5);
        this.llistaLlibres = listaLlibres;
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