public class ClientPrivat extends Client{
    public ClientPrivat(String dni, String nom, String cognom, String email, String tipusClient) {
        super(dni, nom, cognom, email, tipusClient);
    }


    @Override
    public String imprimirInformacion() {
        return "Sector Privat";
    }
}
