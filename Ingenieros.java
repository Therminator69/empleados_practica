package Empleados;

public class Ingenieros extends Empleado implements CalculoSalario{
    public Ingenieros(int id_empleado, String nombre_empleado, int edad, ENUMS.Puesto puesto, ENUMS.Departamento departamento, String jornada_laboral, String gerente_responsable) {
        super(id_empleado, nombre_empleado, edad, puesto, departamento, jornada_laboral, gerente_responsable);
    }

    @Override
    public double calcularSalario() {
        return 0;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
