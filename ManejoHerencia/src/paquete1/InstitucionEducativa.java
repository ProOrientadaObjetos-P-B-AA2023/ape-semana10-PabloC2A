package paquete1;

public class InstitucionEducativa {
    //Atributos
    private String nombre;
    private String siglas;
    //Constructores
    public InstitucionEducativa() {
    }

    public InstitucionEducativa(String nombre, String siglas) {
        this.nombre = nombre;
        this.siglas = siglas;
    }
    //Metodos SET y GET
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSiglas(String siglas) {
        this.siglas = siglas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSiglas() {
        return siglas;
    }
}
