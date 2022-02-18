package examen1p2_juanoliva_10741313;

import java.util.ArrayList;
import java.util.Scanner;

public class Examen1P2_JuanOliva_10741313 {
    static ArrayList<Persona> personas = new ArrayList<Persona>();
    static Scanner lea = new Scanner(System.in);
    
    public static void main(String[] args) {
        boolean ciclo = true;
        while (ciclo) {            
            String opc = menu();
            switch (opc) {
                case "1":
                    String opcUniverso = opcAdministraUniversos();
                    break;
                case "2":
                    String opcPersonas = opcAdministraPersona();
                    break;
                case "3":
                    String opcEscuadrones = opcAdministraEscuadron();
                    break;
                    
                default:
                    throw new AssertionError();
            }
        }
        
    }
    
    static void encabezado(){
        System.out.println("-----------------------------------------------------");
        System.out.println(" Universidad Tecnologica Centroamericana UNITEC");
        System.out.println(" Asignatura: Laboratorio de Programacion II");
        System.out.println(" Alumno: Juan Rafael Oliva");
        System.out.println(" Cuenta: 10741313");
    }
    
    static String menu(){
        System.out.println("-----------------------------------------------------");
        System.out.println("""
                           1. Administrar Personas
                           2. Administrar Escuadrones
                           3. Administrar Universos
                           4. Ejecutar Peleas
                           """);
        System.out.println("-----------------------------------------------------");
        System.out.println("Ingrese la opcion que desea ejecutar");
        Scanner lea = new Scanner(System.in);
        return lea.next();
    }
    
    static String opcAdministraPersona(){
        System.out.println("-----------------------------------------------------");
        System.out.println("""
                           1. Crear un nuevo Heroe/Villano
                           2. Modificar uno existente
                           3. Eliminar una Heroe/Villano
                           4. Listar todos las Heroe/Villano
                           """);
        System.out.println("-----------------------------------------------------");
        System.out.println("Ingrese la opcion que desea ejecutar");
        Scanner lea = new Scanner(System.in);
        return lea.next();
    }
    
    static String opcAdministraUniversos(){
        System.out.println("-----------------------------------------------------");
        System.out.println("""
                           1. Crear un nuevo Universo
                           2. Modificar uno existente
                           3. Eliminar un universo
                           4. Listar todos los universos
                           """);
        System.out.println("-----------------------------------------------------");
        System.out.println("Ingrese la opcion que desea ejecutar");
        Scanner lea = new Scanner(System.in);
        return lea.next();
    }
    
    static String opcAdministraEscuadron(){
        System.out.println("-----------------------------------------------------");
        System.out.println("""
                           1. Crear un nuevo Escuadron
                           2. Modificar uno existente
                           3. Eliminar un Escuadron
                           4. Listar todos los Escuadrones
                           """);
        System.out.println("-----------------------------------------------------");
        System.out.println("Ingrese la opcion que desea ejecutar");
        Scanner lea = new Scanner(System.in);
        return lea.next();
    }
    
    static void crearUniverso(){
        Universo u = new Universo();
        u.set
    }
    
    static void crearPersona(){
        System.out.print("Ingrese el nombre de la persona: ");
        String nombre = lea.nextLine();
        System.out.print("Ingrese poder especial que tiene: ");
        String poder = lea.nextLine();
        System.out.print("Ingrese la debilidad");
        String debilidad = lea.nextLine();
        System.out.println("""
                           Que tipo de Persona es:
                           1. Heroe
                           2. Villano
                           """);
        System.out.print("Ingrese la opcion deseada: ");
        String tipo = lea.nextLine();
        while (tipo.equals("1")|| tipo.equals("2")) {
            System.out.print("Ingrese una opcion valida (1 o 2): ");
            tipo = lea.nextLine();
        }
        boolean tipoPersona = tipo.equals("1");
        
        
    }
}
