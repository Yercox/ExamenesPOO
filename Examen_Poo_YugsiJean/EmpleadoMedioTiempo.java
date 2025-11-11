public class EmpleadoMedioTiempo extends Empleado{
    private double pagoPorHora;
    private int horasTrabajadasMes;
    public EmpleadoMedioTiempo(double pagoPorHora,int horasTrabajadasMes,String dni,String nombre,double salarioBase){
        super(dni, nombre, salarioBase);
        this.pagoPorHora=pagoPorHora;
        this.horasTrabajadasMes=horasTrabajadasMes;
    }
    public double getPagoPorHora() {
        return pagoPorHora;
    }

    public void setPagoPorHora(double pagoPorHora) {
        this.pagoPorHora = pagoPorHora;
    }

    public int getHorasTrabajadasMes() {
        return horasTrabajadasMes;
    }

    public void setHorasTrabajadasMes(int horasTrabajadasMes) {
        this.horasTrabajadasMes = horasTrabajadasMes;
    }
}
