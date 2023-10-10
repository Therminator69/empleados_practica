package UI_General;

import ENUMS.Departamento;
import ENUMS.Puesto;
import Empleados.Empleado;

import java.util.ArrayList;
import java.util.Scanner;

public class UI_Menu{

    static ArrayList<Empleado> empleadoArrayList = new ArrayList<>();

    static Scanner teclado = new Scanner(System.in);

    public static void desplegar_menu() {
        boolean salir=false;
        String opcion_escogida;
        do {
            System.out.println("=================================================");
            System.out.println("Bienvenido, favor de escoger una opcion del menu");
            System.out.println("-Gerentes");
            System.out.println("-Practicantes");
            System.out.println("-Oficinistas");
            System.out.println("-Limpieza");
            System.out.println("-Seguridad");
            System.out.println("Recursos Humanos");
            System.out.println("Contadores");
            System.out.println("Ingenieros");
            System.out.println("-Salir");
            System.out.println("=================================================");

            opcion_escogida = teclado.nextLine().toUpperCase();

            switch (opcion_escogida) {
                case "GERENTES"-> Opciones_Gerentes();
                case "PRACTICANTES"-> opciones_practicantes();
                case "SALIR"-> System.exit(0);
                default -> System.out.println("\nFavor de ingresar una opcion valida del menu");

            }
        } while (!salir);
    }
    public static void Opciones_Gerentes(){
        int opcion_escogida2;
        do {
            System.out.println("======================================");
            System.out.println("Favor de escoger una opcion del menu");
            System.out.println("[1] Agregar Gerente");
            System.out.println("[2] Borrar Gerente");
            System.out.println("[3] Modificar Gerente");
            System.out.println("[4] Buscar Gerente");
            System.out.println("[5] Salir al menú principal");
            System.out.println("======================================");
            opcion_escogida2=teclado.nextInt();
            switch (opcion_escogida2){
                case 1 -> agregar_gerente();
                case 2 -> borrar_gerente();
                case 3 -> modificar_gerente();
                case 4 -> buscar_gerente();
                case 5 ->desplegar_menu();
                default -> System.out.println("Opcion no válida, favor de escoger otra opcion del menú");
            }
        } while (opcion_escogida2!=5);
    }
    public static void opciones_practicantes(){
        int opcion_escogida3;
        do {
            System.out.println("======================================");
            System.out.println("Favor de escoger una opcion del menu");
            System.out.println("[1] Agregar Practicante");
            System.out.println("[2] Borrar Practicante");
            System.out.println("[3] Modificar Practicante");
            System.out.println("[4] Buscar Practicante");
            System.out.println("[5] Salir al menú principal");
            System.out.println("======================================");
            opcion_escogida3=teclado.nextInt();
            switch (opcion_escogida3){
                case 1 -> agregar_gerente();
                case 2 -> borrar_gerente();
                case 3 -> modificar_gerente();
                case 4 -> buscar_gerente();
                case 5 ->desplegar_menu();
                default -> System.out.println("Opcion no válida, favor de escoger otra opcion del menú");
            }
        } while (opcion_escogida3!=5);

    }

    public static void agregar_gerente(){
        Empleado Gerente = leerDatos();
        empleadoArrayList.add(Gerente);
        Opciones_Gerentes();
    }
    public static void borrar_gerente(){
        System.out.println("Favor de ingresar el ID del gerente a borrar");
        int id= teclado.nextInt();
        for (Empleado gerente : empleadoArrayList){
            if (gerente.getIdEmpleado()==id){
                empleadoArrayList.remove(gerente);
            }
            else {
                System.out.println("No se encontró al gerente");
            }
        }
    }
    public static void modificar_gerente(){

    }
    public static void buscar_gerente(){
        System.out.println("Favor de ingresar el ID del gerente buscar");
        int id = teclado.nextInt();
        for (Empleado gerente: empleadoArrayList){
            if (gerente.getIdEmpleado()==id){
                System.out.println(gerente);
                System.out.println(gerente.get);
            }
            else{
                System.out.println("No se encontró al Gerente");
            }
        }
    }





    private static Empleado leerDatos() {
        System.out.println("Favor de ingresar el nombre");
        String nombre_empleado = teclado.next();
        System.out.println("Favor de ingresar la edad");
        int edad = teclado.nextInt();
        System.out.println("\nFavor de ingresar el ID asignado");
        int id_empledado = teclado.nextInt();
        System.out.println("\nFavor de ingresar el departamento asignado");
        Departamento departamento = Departamento.valueOf(teclado.next().toUpperCase());
        System.out.println("Favor de ingresar la jornada que le fue asignada");
        String jornada_laboral = teclado.next();
        System.out.println("Favor de ingresar el gerente encargado del departamento asignado");
        String Gerente_responsable = teclado.next();
        return new Empleado(id_empledado, nombre_empleado, edad, Puesto.GERENTE, departamento,
                jornada_laboral, Gerente_responsable);
    }


}
