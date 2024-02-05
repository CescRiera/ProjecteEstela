import java.util.Scanner;

class Usuarios {
    private String usuario;
    private String contrasenya;

    public Usuarios(String usuario, String contrasenya) {
        this.usuario = usuario;
        this.contrasenya = contrasenya;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContrasenya() {
        return contrasenya;
    }
}