public class ClientEscola extends Client {
    public ClientEscola(String dni, String nom, String cognom, String email, String tipusClient) {
        super(dni, nom, cognom, email, tipusClient);
    }

    @Override
    public String imprimirInformacion() {
        return "Escola";
    }
}
