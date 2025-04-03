import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        /*
        *Una empresa desea registrar la información de cada empleado
        * Para ello n empleado debe ingresar con su usuario y contraseña
        * Una vez ingresado el empledo debe registrar la siguiente información
        * 1 - Nombre Completo
        * 2 - Documento de identidad
        * 3 - Valor de la hora
        * 4 - Cantidad de horas
        * 5 - Seleccionar un dia de descanso a la semana (L-V)
        * El sistema le debe mostrar al empleado:
        * Su salario neto, Salario Bruto, Deducción por pensión, Deducción
        * por salud, auxilio de transporte (si aplica) y bonificción del 10%
        * si no supera 2 SMLV (sin incluir auxilio de transporte)
        * Toda la información del empleado se debe mostrar en un mensaje descriptivo
        *  */
        /* Definición y signación de variables */
        Scanner sc = new Scanner(System.in);
        String nombreEmpleado = "";
        String documentoIdentidad = "";
        String diaDescanso ="";
        String usuarioEmpleado = "";
        String contraseñaUsuario = "";
        double salarioBruto = 0;
        double salarioNeto = 0;
        double retencionSalud = 0;
        double retencionPension =0;
        double valorHora = 0;
        double bonificacionEmpleado = 0;
        int auxilioTransporte = 200000;


        System.out.println("Ingrese su usuario: ");
        usuarioEmpleado = sc.nextLine();
        System.out.println("Ingrese su contraseña");
        contraseñaUsuario = sc.nextLine();
        if(usuarioEmpleado.equals ("Admin") && contraseñaUsuario.equals("admin23")) {
            System.out.println ("Ha ingresado de forma correcta");
        } else {
            System.out.println ("Error de credenciales");
            sc.close();

            /*OTRA FORMA DE HACERLO*/
            /* if(usuarioEmpleado.equals ("Admin")
            if (contraseñaUsuario.equals("admin23")) {
            System.out.println ("Bienvenido al sistema");*/


        }

    }
}