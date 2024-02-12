import java.util.ArrayList;
import java.util.List;

public class ListaEspera {
    public List<Client> clientes;

    public ListaEspera() {
        this.clientes = new ArrayList<>();
    }

    public void añadirCliente(Client cliente) {
        this.clientes.add(cliente);
        System.out.println("Cliente " + cliente.getNom() + " añadido a la lista de espera.");
    }
}