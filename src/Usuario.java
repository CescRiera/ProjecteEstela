
class Usuarios {
    private String usuario;
    private String contrasenya;
    private String nombre;
    private String apellido;
    private String dni;
    private String telefono;
    private String direccion;

    public Usuarios(String usuario, String contrasenya, String nombre, String apellido, String dni, String telefono, String direccion) {
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
}