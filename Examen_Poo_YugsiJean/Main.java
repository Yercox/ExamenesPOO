
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("EMPRESAS WAYNE");
        EmpleadoMedioTiempo empleadoMedioTiempo=new EmpleadoMedioTiempo(0, 0, "", "", 0.0f);
        System.out.println("Registro de empleados");
        try { 
   System.out.println("Nombre:");
   empleadoMedioTiempo.setNombre(sc.nextLine());
   System.out.println("Dni:");
   empleadoMedioTiempo.setDni(sc.nextLine());
    System.out.println("Salario del empleado:");
    empleadoMedioTiempo.setSalarioBase(sc.nextDouble());
    sc.nextLine();
   System.out.println("Pago por horas:");
   empleadoMedioTiempo.setPagoPorHora(sc.nextDouble());
   sc.nextLine();
   System.out.println("Horas trabajadas en el mes:");
   empleadoMedioTiempo.setHorasTrabajadasMes(sc.nextInt());
   sc.nextLine();
   System.out.println("exito empleado creado");
        System.out.println("Numero de empleados creados"+empleadoMedioTiempo.getContadorEmpleados());
        System.out.println("Nombre:"+empleadoMedioTiempo.getNombre());
        System.out.println("Dni: "+empleadoMedioTiempo.getDni());
        System.out.println("Salario empleado: "+empleadoMedioTiempo.getSalarioBase());
        System.out.println("Pago por horas: "+empleadoMedioTiempo.getPagoPorHora());
        System.out.println("horas trabajadas en el mes: "+empleadoMedioTiempo.getHorasTrabajadasMes());
        } catch (InputMismatchException e) {
           System.out.println("Error debe ingresar un numero valido"); 
           sc.nextLine();
        }
    }



}
