import java.util.ArrayList;

public class Generador {


    public void generatePaperBooks(Biblioteca biblioteca) {
        ArrayList<LlibrePaper> LlistaLlibresPaper = new ArrayList<>();

        // Crear manualmente 5 libros de papel adicionales
        LlibrePaper libro1 = new LlibrePaper(
                "El principito",
                "9788373191726",
                "Antoine de Saint-Exupéry",
                true,
                "01/01/1943",
                96
        );
        LlistaLlibresPaper.add(libro1);

        LlibrePaper libro2 = new LlibrePaper(
                "Cien años de soledad",
                "9786070720721",
                "Gabriel García Márquez",
                true,
                "05/30/1967",
                432
        );
        LlistaLlibresPaper.add(libro2);

        LlibrePaper libro3 = new LlibrePaper(
                "Harry Potter y la piedra filosofal",
                "9788478884451",
                "J.K. Rowling",
                true,
                "06/26/1997",
                223
        );
        LlistaLlibresPaper.add(libro3);

        LlibrePaper libro4 = new LlibrePaper(
                "El alquimista",
                "9780062511409",
                "Paulo Coelho",
                true,
                "1988",
                197
        );
        LlistaLlibresPaper.add(libro4);

        LlibrePaper libro5 = new LlibrePaper(
                "Don Quijote de la Mancha",
                "9788424116933",
                "Miguel de Cervantes",
                true,
                "1605",
                863
        );
        LlistaLlibresPaper.add(libro5);

        biblioteca.setLlistaLlibresPaper(LlistaLlibresPaper);
    }

    public void generateVinylRecords(Biblioteca biblioteca) {
        ArrayList<Vinilo> llistaVinilos = new ArrayList<>();

        // Crear manualmente 5 vinilos adicionales
        Vinilo vinilo1 = new Vinilo(
                "The Beatles",
                45,
                "Abbey Road",
                1969
        );
        llistaVinilos.add(vinilo1);

        Vinilo vinilo2 = new Vinilo(
                "Pink Floyd",
                42,
                "The Dark Side of the Moon",
                1973
        );
        llistaVinilos.add(vinilo2);

        Vinilo vinilo3 = new Vinilo(
                "Led Zeppelin",
                40,
                "Led Zeppelin IV",
                1971
        );
        llistaVinilos.add(vinilo3);

        Vinilo vinilo4 = new Vinilo(
                "Bob Dylan",
                36,
                "Highway 61 Revisited",
                1965
        );
        llistaVinilos.add(vinilo4);

        Vinilo vinilo5 = new Vinilo(
                "The Rolling Stones",
                38,
                "Exile on Main St.",
                1972
        );
        llistaVinilos.add(vinilo5);

        biblioteca.setLlistaVinilo(llistaVinilos);
    }
}
