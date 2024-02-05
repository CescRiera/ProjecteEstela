import java.util.Date;

public class Generador {
    public static void generarLibrosPapel() {
        LlibrePaper llibrePaper1 = new LlibrePaper("El Señor de los Anillos", "978-84-450-7669-3", "J.R.R. Tolkien", "Minotauro", true ,new Date(), 300);
        LlibrePaper llibrePaper2 = new LlibrePaper("Cien años de soledad", "978-84-376-0494-7", "Gabriel García Márquez", "Cien años de soledad", true, new Date(), 250);
        LlibrePaper llibrePaper3 = new LlibrePaper("1984", "978-0-452-28423-4", "George Orwell", "Harcourt, Brace & World", true, new Date(), 400);
        LlibrePaper llibrePaper4 = new LlibrePaper("Orgullo y prejuicio", "978-84-249-3524-4", "Jane Austen", "Alba Editorial", true, new Date(), 200);
        LlibrePaper llibrePaper5 = new LlibrePaper("Crónica de una muerte anunciada", "978-84-253-0892-6", "Gabriel García Márquez", "Sudamericana", true,new Date(), 350);

        llibrePaper1.afegirLlibreDisponible(llibrePaper1);
        llibrePaper2.afegirLlibreDisponible(llibrePaper2);
        llibrePaper3.afegirLlibreDisponible(llibrePaper3);
        llibrePaper4.afegirLlibreDisponible(llibrePaper4);
        llibrePaper5.afegirLlibreDisponible(llibrePaper5);
    }
}