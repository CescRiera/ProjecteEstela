public class Administrador extends Usuario{
    public Administrador(String usuario, String contrasenya, String nombre, String apellido, String dni, String telefono, String direccion) {
        super(usuario, contrasenya, nombre, apellido, dni, telefono, direccion);
    }

    public Administrador(String usuario, String contrasenya){
        super(usuario,contrasenya);
    }

}
