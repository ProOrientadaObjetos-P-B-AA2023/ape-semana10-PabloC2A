package paquete3;

import paquete1.Persona;
import paquete2.Prestamo;

public class PrestamoAutomovil extends Prestamo {
    //Atributos
    private String tipoAutomovil;
    private String marcaAutomovil;
    private Persona garante1;
    private double valorAutomovil;
    private double valorMensualPagoPrestamo;
    //Constructores
    public PrestamoAutomovil() {
    }

    public PrestamoAutomovil(Persona beneficiario, double tiempoMeses, String ciudad, String tipoAutomovil, String marcaAutomovil, Persona garante1, double valorAutomovil) {
        super(beneficiario, tiempoMeses, ciudad);
        this.tipoAutomovil = tipoAutomovil;
        this.marcaAutomovil = marcaAutomovil;
        this.garante1 = garante1;
        this.valorAutomovil = valorAutomovil;
    }
    //Metodos SET y GET
    public void setTipoAutomovil(String tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
    }

    public void setMarcaAutomovil(String marcaAutomovil) {
        this.marcaAutomovil = marcaAutomovil;
    }

    public void setGarante1(Persona garante1) {
        this.garante1 = garante1;
    }

    public void setValorAutomovil(double valorAutomovil) {
        this.valorAutomovil = valorAutomovil;
    }

    public void calcularValorMensualPagoPrestamo() {
        this.valorMensualPagoPrestamo = this.valorAutomovil / super.getTiempoMeses();
    }

    public String getTipoAutomovil() {
        return tipoAutomovil;
    }

    public String getMarcaAutomovil() {
        return marcaAutomovil;
    }

    public Persona getGarante1() {
        return garante1;
    }

    public double getValorAutomovil() {
        return valorAutomovil;
    }

    public double getValorMensualPagoPrestamo() {
        return valorMensualPagoPrestamo;
    }

    @Override
    public String toString() {
        return String.format("""
                DATOS DEL PRESTAMO AUTOMOVIL
                -Nombre Beneficiario: %s %s
                Usarname: %s
                -Nombre Garante: %s %s
                Usarname: %s
                Meses: %s
                Ciudad: %s
                
                Tipo automovil: %s
                Marca automovil: %s
                Valor automovil: %.2f
                
                Valor Mensual a Pagar: %.2f
                """,super.getBeneficiario().getNombre(),super.getBeneficiario().getApellido(), super.getBeneficiario().getUsername(),
                    this.garante1.getNombre(), this.garante1.getApellido(),this.garante1.getUsername(),
                    super.getTiempoMeses(),super.getCiudad(),
                    this.getTipoAutomovil(),this.getMarcaAutomovil(),this.getValorAutomovil(),
                    this.getValorMensualPagoPrestamo());
    }
}
