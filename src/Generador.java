import java.util.ArrayList;

public class Generador {
    public static ArrayList<Llibre> generatePaperBooks() {
        ArrayList<Llibre> LlistaLlibres = new ArrayList<>();

        // Crear manualmente 5 libros de papel adicionales
        Llibre libro1 = new LlibrePaper(
                "El principito",
                "9788373191726",
                "Antoine de Saint-Exupéry",
                true,
                "01/01/1943",
                96
        );
        LlistaLlibres.add(libro1);

        Llibre libro2 = new LlibrePaper(
                "Cien años de soledad",
                "9786070720721",
                "Gabriel García Márquez",
                true,
                "05/30/1967",
                432
        );
        LlistaLlibres.add(libro2);

        Llibre libro3 = new LlibrePaper(
                "Harry Potter y la piedra filosofal",
                "9788478884451",
                "J.K. Rowling",
                true,
                "06/26/1997",
                223
        );
        LlistaLlibres.add(libro3);

        Llibre libro4 = new LlibrePaper(
                "El alquimista",
                "9780062511409",
                "Paulo Coelho",
                true,
                "1988",
                197
        );
        LlistaLlibres.add(libro4);

        Llibre libro5 = new LlibrePaper(
                "Don Quijote de la Mancha",
                "9788424116933",
                "Miguel de Cervantes",
                true,
                "1605",
                863
        );
        LlistaLlibres.add(libro5);
        return LlistaLlibres;
    }

    public static ArrayList<Vinilo> generateVinylRecords() {
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

        return llistaVinilos;
    }
    public static ArrayList<Client> generarClients(){
        ArrayList<Client> clientes = new ArrayList<>();

        for (int i = 0; i < 7; i++) {
            clientes.add(new ClientPrivat("DNI" + i, "Nom" + i, "Cognom" + i, "email" + i + "@example.com"));
        }

        // Crear 5 instancias de ClientEscola
        for (int i = 0; i < 7; i++) {
            clientes.add(new ClientEscola("DNI-Escola" + i, "NomEscola" + i, "CognomEscola" + i, "escola" + i + "@example.com"));
        }

        clientes.add(new ClientPrivat("123","Didac","Gay","tonto@lol.lol"));

        return clientes;
    }

    public static ArrayList<LlibreAudiovisual> generateAudioBooks() {
        ArrayList<LlibreAudiovisual> llistaLlibresAudiovisuals = new ArrayList<>();

        Web web = new Web("Peliculones.com", "3752524", "Gran de Sagrera 777", "35725837");

        LlibreAudiovisual libro1 = new LlibreAudiovisual(
                "El principito",
                "9788373191726",
                "Antoine de Saint-Exupéry",
                true,
                web // Pasando la instancia de la clase Web
        );
        llistaLlibresAudiovisuals.add(libro1);

        LlibreAudiovisual libro2 = new LlibreAudiovisual(
                "Cien años de soledad",
                "9786070720721",
                "Gabriel García Márquez",
                true,
                web
        );
        llistaLlibresAudiovisuals.add(libro2);

        return llistaLlibresAudiovisuals;
    }


}
