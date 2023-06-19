package paquete1;

import paquete2.Prestamo;
import paquete3.PrestamoAutomovil;
import paquete4.PrestamoEducativo;

import java.util.Scanner;

public class Ejecutor {
    public static void main(String[] args) {
        //Variables y Objetos usados
        Scanner entrada = new Scanner(System.in);
        Prestamo prestamo = new Prestamo();
        boolean opcionMenu;
        int opcion;

        opcionMenu = false;
        do {
            System.out.println("------------- MENU -------------");
            System.out.println("1) Prestamo Automovil");
            System.out.println("2) Prestamo Educativo");
            System.out.println("3) Salir");
            System.out.println();
            System.out.print("-Ingrese una opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine();

            if (opcion == 1 | opcion == 2) {
                System.out.println("---- DATOS DEL BENEFICIARIO Y PRESTAMO ----");
                Persona beneficiario = new Persona();
                System.out.print("Ingrese nombre del beneficiario: ");
                beneficiario.setNombre(entrada.nextLine());
                System.out.print("Ingrese apellido del beneficiario: ");
                beneficiario.setApellido(entrada.nextLine());
                System.out.print("Ingrese el username del beneficiario: ");
                beneficiario.setUsername(entrada.nextLine());
                System.out.print("Ingrese tiempo de pago del prestamo (meses): ");
                prestamo.setTiempoMeses(entrada.nextDouble());
                entrada.nextLine();
                System.out.print("Ingrese la ciudad: ");
                if (opcion == 1){
                    prestamo.setCiudad(entrada.nextLine().toLowerCase()); //siempre en minuscula la ciudad
                } else {
                    prestamo.setCiudad(entrada.nextLine().toUpperCase()); //siempre en mayuscula la ciudad
                }
                prestamo.setBeneficiario(beneficiario);
                System.out.println();
            }

            switch (opcion) {
                case 1 -> {
                    PrestamoAutomovil prestamoAutomovil = new PrestamoAutomovil();

                    System.out.println("---- DATOS DEL GARANTE ----");
                    Persona garante1 = new Persona();
                    System.out.print("-Ingrese nombre del garante: ");
                    garante1.setNombre(entrada.nextLine());
                    System.out.print("-Ingrese apellido del garante: ");
                    garante1.setApellido(entrada.nextLine());
                    System.out.print("-Ingrese username del garante: ");
                    garante1.setUsername(entrada.nextLine());
                    System.out.println();
                    System.out.println("---- DATOS DEL AUTOMOVIL ----");
                    System.out.print("-Ingrese el tipo del automovil: ");
                    prestamoAutomovil.setTipoAutomovil(entrada.nextLine());
                    System.out.print("-Ingrese el marca del automovil: ");
                    prestamoAutomovil.setMarcaAutomovil(entrada.nextLine());
                    System.out.print("-Ingrese el valor del automovil: ");
                    prestamoAutomovil.setValorAutomovil(entrada.nextDouble());
                    entrada.nextLine();
                    System.out.println();

                    prestamoAutomovil.setBeneficiario(prestamo.getBeneficiario());
                    prestamoAutomovil.setTiempoMeses(prestamo.getTiempoMeses());
                    prestamoAutomovil.setCiudad(prestamo.getCiudad());
                    prestamoAutomovil.setGarante1(garante1);
                    prestamoAutomovil.calcularValorMensualPagoPrestamo();
                    //Presentacion
                    System.out.println(prestamoAutomovil);
                    System.out.println();
                }
                case 2 -> {
                    PrestamoEducativo prestamoEducativo = new PrestamoEducativo();

                    System.out.println("---- DATOS CENTRO EDUCATIVO ----");
                    InstitucionEducativa centroEdu = new InstitucionEducativa();
                    System.out.print("-Ingrese el nombre del centro educativo: ");
                    centroEdu.setNombre(entrada.nextLine());
                    System.out.print("-Ingrese las siglas del centro educativo: ");
                    centroEdu.setSiglas(entrada.nextLine());
                    System.out.println();

                    System.out.println("---- DATOS EDUCATIVOS ----");
                    System.out.print("-Ingrese el nivel de estudio: ");
                    prestamoEducativo.setNivelEstudio(entrada.nextLine());
                    System.out.print("-Ingrese el valor de la carrera: ");
                    prestamoEducativo.setValorCarrera(entrada.nextDouble());
                    entrada.nextLine();


                    prestamoEducativo.setBeneficiario(prestamo.getBeneficiario());
                    prestamoEducativo.setTiempoMeses(prestamo.getTiempoMeses());
                    prestamoEducativo.setCiudad(prestamo.getCiudad());
                    prestamoEducativo.setCentroEducativo(centroEdu);
                    prestamoEducativo.calcularValorMensualPagoPrestamo();
                    System.out.println(prestamoEducativo);
                    System.out.println();
                }
                case 3 -> {
                    opcionMenu = true;
                    System.out.println("Saliendo del Programa");
                }
                default -> {
                    System.out.println("MSJ (Opcion Invalida)");
                    System.out.println();
                }
            }
        }while (!opcionMenu);
    }
}
