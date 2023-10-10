package Empleados;

import ENUMS.Departamento;
import ENUMS.Puesto;

public class Empleado{
    private int id_empleado;
    private String nombre_empleado;
    private int edad;
    private Puesto Puesto;
    private Departamento Departamento;
    private String Jornada_laboral;
    private String Gerente_responsable;
    private double salario;



    @Override
    public String toString() {
        return "Empleado{" +
                "id_empleado=" + id_empleado +
                ", nombre_empleado='" + nombre_empleado + '\'' +
                ", edad=" + edad +
                ", Puesto=" + Puesto +
                ", Departamento=" + Departamento +
                ", Jornada_laboral='" + Jornada_laboral + '\'' +
                ", Gerente_responsable='" + Gerente_responsable + '\'' +
                '}';
    }
    public int getIdEmpleado() {
        return id_empleado;
    }
}


