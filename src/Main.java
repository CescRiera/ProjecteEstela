import java.io.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Biblioteca biblioteca = new Biblioteca();
        ListaEspera listaEspera = new ListaEspera();
        Biblioteca.setLlistaLlibresPaper(Generador.generatePaperBooks());
        biblioteca.setLlistaLlibresAudiovisuals(Generador.generateAudioBooks());
        Biblioteca.setLlistaVinilo(Generador.generateVinylRecords());
        List<Client> llistaClients = new ArrayList<>();
        llistaClients.add(new ClientPrivat("123", "Ana", "Gómez", "ana@gmail.com"));
        llistaClients.add(new ClientPrivat("56789012Z", "Carlos", "Martínez", "carlos@gmail.com"));
        Scanner scanner = new Scanner(System.in);
        while (true){
            menu.login(biblioteca,llistaClients);
            System.out.println("Desitja fer una altre consulta?\n" +
                    "1. Si\n" +
                    "2. No\n");
            int opcio = scanner.nextInt();
            if(opcio == 1){
                menu.login(biblioteca,llistaClients);
            } else if (opcio == 2) {
                break;
            }else {
                System.out.println("Opció no vàlida");
            }
        }
    }

}