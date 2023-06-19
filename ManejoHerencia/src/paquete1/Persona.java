package paquete1;

public class Persona {
    //Atributos
    private String nombre;
    private String apellido;
    private String username;
    //Constructores
    public Persona() {
    }

    public Persona(String nombre, String apellido, String username) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.username = username;
    }
    //Metodos SET y GET
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getUsername() {
        return username;
    }
}
