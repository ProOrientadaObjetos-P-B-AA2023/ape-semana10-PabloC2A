package paquete2;

import paquete1.Persona;

public class Prestamo {
    //Atributos
    private Persona beneficiario;
    private double tiempoMeses;
    private String ciudad;
    //Constructores
    public Prestamo() {
    }

    public Prestamo(Persona beneficiario, double tiempoMeses, String ciudad) {
        this.beneficiario = beneficiario;
        this.tiempoMeses = tiempoMeses;
        this.ciudad = ciudad;
    }
    //Metodos SET y GET
    public void setBeneficiario(Persona beneficiario) {
        this.beneficiario = beneficiario;
    }

    public void setTiempoMeses(double tiempoMeses) {
        this.tiempoMeses = tiempoMeses;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Persona getBeneficiario() {
        return beneficiario;
    }

    public double getTiempoMeses() {
        return tiempoMeses;
    }

    public String getCiudad() {
        return ciudad;
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "beneficiario=" + beneficiario +
                ", tiempoMeses=" + tiempoMeses +
                ", ciudad='" + ciudad + '\'' +
                '}';
    }
}
