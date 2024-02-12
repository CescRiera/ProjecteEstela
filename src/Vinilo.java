public class Vinilo {
    private String autor;
    private int durada;
    private String album;
    private int año;

    private String isbn;

    public Vinilo(String autor, int durada, String album, int año, String isbn) {
        this.autor = autor;
        this.durada = durada;
        this.album = album;
        this.año = año;
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getDurada() {
        return durada;
    }

    public void setDurada(int durada) {
        this.durada = durada;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getIsbn() {
        return isbn;
    }
}
