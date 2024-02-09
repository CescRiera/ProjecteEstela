import java.util.ArrayList;
import java.util.Date;

public class Llibre {
    private String titol;
    private String isbn;
    private String[] autors;
    private boolean disponibilitat;
    private Date dataIniciPrestec;
    private Date dataDevolucio;

    public Llibre(String titol, String isbn, String autors, boolean disponibilitat) {
        this.titol = titol;
        this.isbn = isbn;
        this.autors = autors;
        this.disponibilitat = disponibilitat;
    }

    public String getTitol() {
        return titol;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutors() {
        return autors;
    }

    public void setAutors(String autors) {
        this.autors = autors;
    }

    public boolean isDisponibilitat() {
        return disponibilitat;
    }

    public void setDisponibilitat(boolean disponibilitat) {
        this.disponibilitat = disponibilitat;
    }


}