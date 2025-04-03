import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        /*
        *Una empresa desea registrar la información de cada empleado
        * Para ello n empleado debe ingresar con su usuario y contraseña
        * Una vez ingresado el empledo debe registrar la siguiente información
        * 1 - Nombre Completo
        * 2 - Documento de identidad
        * 3 - Valor de la hora
        * 4 - Cantidad de horas
        * 5 - Seeccionar un dia de descanso a la semana (L-V)
        * El sistema le debe mostrar al empleado:
        * Su salario neto, Salario Bruto, Deducción por pensión, Deducción
        * por salud, auxilio de transporte (si aplica) y bonificción del 10%
        * si no supera 2 SMLV (sin incluir auxilio de transporte)
        * Toda la información del empleado se debe mostrar en un mensaje descriptivo
        *  */
        Scanner sc = new Scanner(System.in);
        String nombreEmpleado="";
        String documentoIdentidad= "";
        double salarioBruto=0;
        double salarioNeto=0;
        double retencionSalud=0;
        double retencionPension=0;
        double valorHora=0;
        
    }
}
