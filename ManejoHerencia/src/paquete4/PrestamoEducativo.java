package paquete4;

import paquete1.InstitucionEducativa;
import paquete1.Persona;
import paquete2.Prestamo;

public class PrestamoEducativo extends Prestamo {
    //Atributos
    private String nivelEstudio;
    private InstitucionEducativa centroEducativo;
    private double valorCarrera;
    private double valorMensualPagoPrestamo;
    //Constructores
    public PrestamoEducativo() {
    }

    public PrestamoEducativo(Persona beneficiario, double tiempoMeses, String ciudad, String nivelEstudio, InstitucionEducativa centroEducativo, double valorCarrera) {
        super(beneficiario, tiempoMeses, ciudad);
        this.nivelEstudio = nivelEstudio;
        this.centroEducativo = centroEducativo;
        this.valorCarrera = valorCarrera;
    }
    //Metodos SET y GET
    public void setNivelEstudio(String nivelEstudio) {
        this.nivelEstudio = nivelEstudio;
    }

    public void setCentroEducativo(InstitucionEducativa centroEducativo) {
        this.centroEducativo = centroEducativo;
    }

    public void setValorCarrera(double valorCarrera) {
        this.valorCarrera = valorCarrera;
    }

    public void calcularValorMensualPagoPrestamo() {
        double valor1;
        valor1 = this.valorCarrera / super.getTiempoMeses();
        this.valorMensualPagoPrestamo = (valor1 - (valor1 * (double) 10 / (double) 100));
    }

    public String getNivelEstudio() {
        return nivelEstudio;
    }

    public InstitucionEducativa getCentroEducativo() {
        return centroEducativo;
    }

    public double getValorCarrera() {
        return valorCarrera;
    }

    public double getValorMensualPagoPrestamo() {
        return valorMensualPagoPrestamo;
    }

    @Override
    public String toString() {
        return String.format("""
                DATOS DEL PRESTAMO EDUCATIVO
                -Nombre Beneficiario: %s %s
                Usarname: %s
                -Nombre Centro Educativo: %s
                Siglas: %s
                Meses: %s
                Ciudad: %s
                 
                Valor carrera: %.2f
                
                Valor Mensual a Pagar: %.2f
                """,super.getBeneficiario().getNombre(),super.getBeneficiario().getApellido(), super.getBeneficiario().getUsername(),
                this.getCentroEducativo().getNombre(), this.getCentroEducativo().getSiglas(),
                super.getTiempoMeses(),super.getCiudad(),
                this.getValorCarrera(),
                this.getValorMensualPagoPrestamo());
    }
}
