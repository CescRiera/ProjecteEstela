import java.util.*;

abstract class Usuario {
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
    public Usuario(String usuario, String contrasenya){
        this.usuario = usuario;
        this.contrasenya = contrasenya;
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

    public void Prestar(Client client,Biblioteca biblioteca,String isbn){
        try{
            for(int i = 0; i<biblioteca.getLlistaLlibresPaper().size();i++){
                if(Objects.equals(biblioteca.getLlistaLlibresPaper().get(i).getIsbn(), isbn)){
                    if(client.getLlibrePaperEnPrestec() == null && biblioteca.getLlistaLlibresPaper().get(i).isDisponibilitat()){
                        biblioteca.getLlistaLlibresPaper().get(i).setDisponibilitat(false);
                        client.setLlibrePaperEnPrestec(biblioteca.getLlistaLlibresPaper().get(i));
                        client.setDataIniciPrestec(new Date());
                        Calendar calendar = Calendar.getInstance();
                        calendar.setTime(client.getDataIniciPrestec());
                        calendar.add(Calendar.MONTH,1);
                        client.setDataDevolucio(calendar.getTime());
                        System.out.println("El client te fins el "+client.getDataDevolucio()+" per retornar el llibre");
                    } else if (!biblioteca.getLlistaLlibresPaper().get(i).isDisponibilitat()) {
                        System.out.println("El llibre no es troba disponible");
                    } else if (client.getLlibrePaperEnPrestec()!=null) {
                        System.out.println("El client ja te un producte prestat");
                    }
                }
            }

            for(int i = 0; i<biblioteca.getLlistaLlibresAudiovisuals().size();i++){
                if(Objects.equals(biblioteca.getLlistaLlibresAudiovisuals().get(i).getIsbn(), isbn)){
                    if(client.getLlibreAudiovisualEnPrestec() == null && biblioteca.getLlistaLlibresAudiovisuals().get(i).isDisponibilitat()){
                        biblioteca.getLlistaLlibresAudiovisuals().get(i).setDisponibilitat(false);
                        client.setLlibreAudiovisualEnPrestec(biblioteca.getLlistaLlibresAudiovisuals().get(i));
                        client.setDataIniciPrestec(new Date());
                        Calendar calendar = Calendar.getInstance();
                        calendar.setTime(client.getDataIniciPrestec());
                        calendar.add(Calendar.MONTH,1);
                        client.setDataDevolucio(calendar.getTime());
                        System.out.println("El client te fins el "+client.getDataDevolucio()+" per retornar el llibre");
                    } else if (!biblioteca.getLlistaLlibresPaper().get(i).isDisponibilitat()) {
                        System.out.println("El llibre no es troba disponible");
                    } else if (client.getLlibrePaperEnPrestec()!=null) {
                        System.out.println("El client ja te un producte prestat");
                    }
                }
            }
        }catch (Exception e){
            System.out.println(e);
        }

    }
    public void Retornar(Client client,Biblioteca biblioteca, String isbn){
        for(int i = 0;i<biblioteca.getLlistaLlibresPaper().size();i++){
            if(Objects.equals(biblioteca.getLlistaLlibresPaper().get(i).getIsbn(), isbn)){
                if(client.getLlibrePaperEnPrestec()!=null){
                    biblioteca.getLlistaLlibresPaper().get(i).setDisponibilitat(true);
                    client.setLlibrePaperEnPrestec(null);
                    client.setDataIniciPrestec(null);
                    client.setDataDevolucio(null);
                    System.out.println("El llibre ha sigut retornat");
                }
                else{
                    System.out.println("error paper");
                    System.out.println(biblioteca.getLlistaLlibresPaper().get(i).getIsbn());
                    break;
                }
            }
        }
        for(int i = 0;i<biblioteca.getLlistaLlibresAudiovisuals().size();i++){
            if(Objects.equals(biblioteca.getLlistaLlibresAudiovisuals().get(i).getIsbn(), isbn)){
                if(client.getLlibreAudiovisualEnPrestec()!=null){
                    biblioteca.getLlistaLlibresAudiovisuals().get(i).setDisponibilitat(true);
                    client.setLlibreAudiovisualEnPrestec(null);
                    client.setDataIniciPrestec(null);
                    client.setDataDevolucio(null);
                    System.out.println("El llibre ha sigut retornat");
                }
                else{
                    System.out.println("error audio");
                    System.out.println(biblioteca.getLlistaLlibresAudiovisuals().get(i).getIsbn());
                    break;
                }
            }
        }



    }

    public String getContrasena() {
        return this.contrasenya;
    }


    public void login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca ID Usuario:");
        String idU  = scanner.nextLine();

    }
    public void menu(Client c) {

    }
}