import java.util.Calendar;
import java.util.Date;

class Usuario {
    private String usuario;
    private String contrasenya;
    private String nombre;
    private String apellido;
    private String dni;
    private String telefono;
    private String direccion;

    public Usuario(String usuario, String contrasenya, String nombre, String apellido, String dni, String telefono, String direccion) {
        this.usuario = usuario;
        this.contrasenya = contrasenya;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContrasenya() {
        return contrasenya;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void Prestar(Client client,LlibrePaper llibre){
        if(client.getProducteEnPrestec() == null && llibre.isDisponibilitat()){
            llibre.setDisponibilitat(false);
            client.setProducteEnPrestec(llibre);
            client.setDataIniciPrestec(new Date());
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(client.getDataIniciPrestec());
            calendar.add(Calendar.MONTH,1);
            client.setDataDevolucio(calendar.getTime());
            System.out.println("El client te fins el "+client.getDataDevolucio()+" per retornar el llibre");
        } else if (!llibre.isDisponibilitat()) {
            System.out.println("El llibre no es troba disponible");
        } else if (client.getProducteEnPrestec()!=null) {
            System.out.println("El client ja te un producte prestat");
        }
    }
    public void Retornar(Client client, LlibrePaper llibre){
        if(client.getProducteEnPrestec()!=null){
            llibre.setDisponibilitat(true);
            client.setProducteEnPrestec(null);
            client.setDataIniciPrestec(null);
            client.setDataDevolucio(null);
            System.out.println("El llibre ha sigut retornat");
        }
    }

}