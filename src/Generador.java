import java.util.ArrayList;

public class Generador {
    public static ArrayList<LlibrePaper> generatePaperBooks() {
        ArrayList<LlibrePaper> LlistaLlibres = new ArrayList<>();

        // Crear manualmente 5 libros de papel adicionales
        LlibrePaper libro1 = new LlibrePaper(
                "El principito",
                "9788373191726",
                "Antoine de Saint-Exupéry",
                true,
                "01/01/1943",
                96
        );
        LlistaLlibres.add(libro1);

        LlibrePaper libro2 = new LlibrePaper(
                "Cien años de soledad",
                "9786070720721",
                "Gabriel García Márquez",
                true,
                "05/30/1967",
                432
        );
        LlistaLlibres.add(libro2);

        LlibrePaper libro3 = new LlibrePaper(
                "Harry Potter y la piedra filosofal",
                "9788478884451",
                "J.K. Rowling",
                true,
                "06/26/1997",
                223
        );
        LlistaLlibres.add(libro3);

        LlibrePaper libro4 = new LlibrePaper(
                "El alquimista",
                "9780062511409",
                "Paulo Coelho",
                true,
                "1988",
                197
        );
        LlistaLlibres.add(libro4);

        LlibrePaper libro5 = new LlibrePaper(
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
                1969,
                "9786070720722"
        );
        llistaVinilos.add(vinilo1);

        Vinilo vinilo2 = new Vinilo(
                "Pink Floyd",
                42,
                "The Dark Side of the Moon",
                1973,
                "9786070720723"
        );
        llistaVinilos.add(vinilo2);

        Vinilo vinilo3 = new Vinilo(
                "Led Zeppelin",
                40,
                "Led Zeppelin IV",
                1971,
                "9786070720724"
        );
        llistaVinilos.add(vinilo3);

        Vinilo vinilo4 = new Vinilo(
                "Bob Dylan",
                36,
                "Highway 61 Revisited",
                1965,
                "9786070720725"
        );
        llistaVinilos.add(vinilo4);

        Vinilo vinilo5 = new Vinilo(
                "The Rolling Stones",
                38,
                "Exile on Main St.",
                1972,
                "9786070720726"
        );
        llistaVinilos.add(vinilo5);

        return llistaVinilos;
    }
    public static ArrayList<Client> generarClients(){
        ArrayList<Client> clientes = new ArrayList<>();

        clientes.add(new ClientEscola("123456", "María", "López", "maria@example.com"));
        clientes.add(new ClientEscola("ABC123456Z", "Pedro", "García", "pedro@example.com"));
        clientes.add(new ClientEscola("XYZ789012B", "Laura", "Fernández", "laura@example.com"));
        clientes.add(new ClientEscola("DEF456789C", "Daniel", "Rodríguez", "daniel@example.com"));
        clientes.add(new ClientPrivat("GHI012345D", "Sara", "Martínez", "sara@example.com"));
        clientes.add(new ClientPrivat("JKL678901E", "Javier", "Sánchez", "javier@example.com"));
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
