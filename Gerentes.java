package Empleados;

public class Gerentes extends Empleado implements CalculoSalario {
    public Gerentes(int id_empleado, String nombre_empleado, int edad, ENUMS.Puesto puesto, ENUMS.Departamento departamento, String jornada_laboral, String gerente_responsable) {
        super(id_empleado, nombre_empleado, edad, puesto, departamento, jornada_laboral, gerente_responsable);
        this.salario=calcularSalario();
    }



    @Override
    public double calcularSalario() {
        double salario;
        salario=12000*2;
        System.out.println("El salario del Gerentes es de" + "$");
        return salario;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}







