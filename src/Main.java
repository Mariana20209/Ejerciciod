import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* Definición y asignación de variables */
        Scanner sc = new Scanner(System.in);
        String nombreEmpleado = "";
        String documentoIdentidad = "";
        String diaDescanso = "";
        String usuarioEmpleado = "";
        String contraseñaUsuario = "";
        double salarioBruto = 0;
        double salarioNeto = 0;
        double retencionSalud = 0;
        double retencionPension = 0;
        double valorHora = 0;
        double cantidadHora = 0;
        double bonificacionEmpleado = 0;
        double valorSalarioMinimo = 0;
        int auxilioTransporte = 200000;

        // Ingreso de usuario y contraseña
        System.out.println("Ingrese su usuario: ");
        usuarioEmpleado = sc.nextLine();
        System.out.println("Ingrese su contraseña: ");
        contraseñaUsuario = sc.nextLine();

        // Verificación de credenciales
        if (usuarioEmpleado.equals("Admin") && contraseñaUsuario.equals("admin23")) {
            System.out.println("Ha ingresado de forma correcta");

            // Ingreso de datos del empleado
            System.out.println("Ingrese el nombre del empleado: ");
            nombreEmpleado = sc.nextLine();
            System.out.println("Ingrese su documento de identidad: ");
            documentoIdentidad = sc.nextLine();
            System.out.println("Ingrese día de descanso (Lunes a Viernes): ");
            diaDescanso = sc.nextLine();
            System.out.println("Ingrese el valor de la hora: ");
            valorHora = sc.nextDouble();
            System.out.println("Ingrese la cantidad de horas trabajadas: ");
            cantidadHora = sc.nextDouble();

            // Cálculo del salario bruto
            salarioBruto = valorHora * cantidadHora;

            // Ingreso del valor del salario mínimo
            System.out.println("Ingrese el valor del salario mínimo para este año: ");
            valorSalarioMinimo = sc.nextDouble();

            // Determinación de bonificación y auxilio de transporte
            if (salarioBruto > (valorSalarioMinimo * 2)) {
                bonificacionEmpleado = 0;
                auxilioTransporte = 0;
            } else {
                bonificacionEmpleado = salarioBruto * 0.1;
                auxilioTransporte = 200000;
            }

            // Cálculo de deducciones
            retencionSalud = salarioBruto * 0.04;
            retencionPension = salarioBruto * 0.04;

            // Cálculo del salario neto
            salarioNeto = salarioBruto - retencionPension - retencionSalud + bonificacionEmpleado + auxilioTransporte;

            // Mostrar detalles
            System.out.println("Detalle de nómina del empleado:");
            System.out.println("El empleado " + nombreEmpleado + " con documento de identidad " + documentoIdentidad
                    + " tiene el siguiente detalle: ");
            System.out.printf("Salario Bruto: %.2f\n", salarioBruto);
            System.out.printf("Salario Neto: %.2f\n", salarioNeto);
            System.out.printf("Deducción por salud: %.2f\n", retencionSalud);
            System.out.printf("Deducción por pensión: %.2f\n", retencionPension);
            System.out.printf("Auxilio de transporte: %.2f\n", auxilioTransporte);
            System.out.printf("Bonificación: %.2f\n", bonificacionEmpleado);

        } else {
            System.out.println("Error de credenciales");
        }

        sc.close();
    }
}
