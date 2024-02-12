import java.util.ArrayList;
import java.util.Date;

public class ClientEscola extends Client {
    public ClientEscola(String dni, String nom, String cognom, String email) {
        super(dni, nom, cognom, email);
    }

    public void menu() {
        // Imprimir información del cliente
        System.out.println("Información del cliente:");
        System.out.println("DNI: " + this.getDni());
        System.out.println("Nombre: " + this.getNom());
        System.out.println("Apellido: " + this.getCognom());
        System.out.println("Email: " + this.getEmail());

        System.out.println("\nVinilos:");
        ArrayList<Vinilo> vinil = Generador.generateVinylRecords();
        for (Vinilo vinilo : vinil) {
            System.out.println("Album: " + vinilo.getAlbum());
            System.out.println("Autor: " + vinilo.getAutor());
            System.out.println("Año: " + vinilo.getAño());
            System.out.println("Durada del vinilo: " + vinilo.getDurada());
            System.out.println("ISBN: " + vinilo.getIsbn());


            System.out.println();
        }
    }


}


