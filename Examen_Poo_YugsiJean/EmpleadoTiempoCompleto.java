public class EmpleadoTiempoCompleto extends Empleado {
    private double bonoAnual;
    public EmpleadoTiempoCompleto(double bonoAnual,String dni,String nombre,double salarioBase){
        super(dni, nombre, salarioBase);
        this.bonoAnual=bonoAnual;
    }
    public double getBonoAnual() {
        return bonoAnual;
    }

    public void setBonoAnual(double bonoAnual) {
        this.bonoAnual = bonoAnual;
    }
}
