public class Empleado{
    private String dni;
    private String nombre;
    private double salarioBase;
    private static int contadorEmpleados = 0;
    public Empleado(String dni,String nombre,double salarioBase){
        this.dni=dni;
        this.nombre=nombre;
        this.salarioBase=salarioBase;
        contadorEmpleados++;
    }
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        if (salarioBase > 0) {
            this.salarioBase = salarioBase;
        } else {
            this.salarioBase = 460;  
        }
    }

    public static int getContadorEmpleados() {
        return contadorEmpleados;
    }


}