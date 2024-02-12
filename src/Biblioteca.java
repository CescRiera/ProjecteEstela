import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biblioteca {
    private static ArrayList<LlibreAudiovisual> LlistaLlibresAudiovisuals;
    private static ArrayList<LlibrePaper> LlistaLlibresPaper;
    private static ArrayList<Vinilo> LlistaVinilo;
    private static ArrayList<Client> LlistaClients;
    private static Web web;
    private static Scanner scanner;

    public Biblioteca() {
        scanner = new Scanner(System.in);
    }

    public ArrayList<LlibreAudiovisual> getLlistaLlibresAudiovisuals() {
        return LlistaLlibresAudiovisuals;
    }


    public void setLlistaLlibresAudiovisuals(ArrayList<LlibreAudiovisual> llistaLlibresAudiovisuals) {
        LlistaLlibresAudiovisuals = llistaLlibresAudiovisuals;
    }

    public ArrayList<Vinilo> getLlistaVinilo() {
        return LlistaVinilo;
    }

    public void setLlistaVinilo(ArrayList<Vinilo> llistaVinilo) {
        LlistaVinilo = llistaVinilo;
    }

    public ArrayList<LlibrePaper> getLlistaLlibresPaper() {
        return LlistaLlibresPaper;
    }

    public void setLlistaLlibresPaper(ArrayList<LlibrePaper> llistaLlibresPaper) {
        LlistaLlibresPaper = llistaLlibresPaper;
    }

    public ArrayList<Client> getLlistaClients() {
        return LlistaClients;
    }

    public void setLlistaClients(ArrayList<Client> llistaClients) {
        LlistaClients = llistaClients;
    }


}
