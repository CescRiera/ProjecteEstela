public class Llibre {
    private String titol;
    private String isbn;
    private String autors;
    private String editorial;
    private Boolean disponible;

    public Llibre(String titol, String isbn, String autors, String editorial, Boolean disponible) {
        this.disponible = disponible;
        this.titol = titol;
        this.isbn = isbn;
        this.autors = autors;
        this.editorial = editorial;
    }

}