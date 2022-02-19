package examen1p2_juanoliva_10741313;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Examen1P2_JuanOliva_10741313 {
    static ArrayList<Persona> personas = new ArrayList<Persona>();
    static Scanner lea = new Scanner(System.in);
    
    public static void main(String[] args) {
        boolean ciclo = true;
        while (ciclo) {            
            String opc = menu();
            switch (opc) {
                case "1" -> {
                    try {
                        administrarPersonas();
                    } catch (MiExcepcion ex) {
                        System.out.println(ex.toString());
                    }
                }

                case "2" -> {
                }
                case "3" -> {
                }
                    
                default -> throw new AssertionError();
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
    
    
    static void administrarPersonas() throws MiExcepcion{
        String opc = opcAdministraPersona();
        switch (opc) {
            case "1":
                crearPersona();
                break;
            case "2":
                modificarPersona();
                break;
            case "3":
                eliminarPersona();
                break;
            case "4":
                listarPersonas();
                break;
            default:
                System.out.println("Opcion invalida");
                break;
        }
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
    
    static void crearPersona() throws MiExcepcion{
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
        System.out.print("Ingrese la fuerza: ");
        String fuerzaCadena = lea.nextLine();
        while (!validacionStringNumeros(fuerzaCadena)) {
            System.out.print("Ingrese un valor entero positivo:  ");
            fuerzaCadena = lea.nextLine();
        }
        int fuerza = Integer.parseInt(fuerzaCadena);
        System.out.print("Ingrese la agilidad Fisica: ");
        String agilidadFisicaCadena = lea.nextLine();
        while (!validacionStringNumeros(agilidadFisicaCadena)) {
            System.out.print("Ingrese un valor entero positivo:  ");
            agilidadFisicaCadena = lea.nextLine();
        }
        int agilidadFisica = Integer.parseInt(agilidadFisicaCadena);
        System.out.print("Ingrese la agilidad Mental: ");
        String agilidadMentalCadena = lea.nextLine();
        while (!validacionStringNumeros(agilidadMentalCadena)) {
            System.out.print("Ingrese un valor entero positivo:  ");
            agilidadMentalCadena= lea.nextLine();
        }
        int agilidadMental = Integer.parseInt(agilidadMentalCadena);
        Persona p;
        try {
            p = new Persona(nombre, poder, debilidad, tipoPersona, fuerza, agilidadFisica, agilidadMental) {
                @Override
                public void ultimaOportunidad(Persona enemigo) {
                    return;
                }
            };
        } catch (Exception e) {
            System.out.print("No se pudo agregar la persona porque ");
            System.out.print(e.getMessage());
            System.out.println("");
            return;
        }
        System.out.print("Que clase de persona es: ");
        System.out.println("""
                           1. Normal
                           2. Mutante
                           3. Por Accidente
                           4. Super Humano
                           5. Deidad
                           6. Alien
                           """);
        System.out.print("Ingrese la opcion deseada ");
        String sel = lea.next();
        boolean condicion = true;
        Persona personaje;
        while (condicion) {
            switch (sel) {
                case "1":{
                    personaje = new Normal(p);
                    condicion = false;
                    break;
                }
                case "2":{
                    personaje = new Mutante(p);
                    System.out.print("Desea agregar los factores que lo definen S o N: ");
                    String desicion = lea.nextLine();
                    if (desicion.toLowerCase().charAt(0) != 's') {
                        break;
                    }
                    while (desicion.toLowerCase().charAt(0) == 's') {
                        System.out.print("Ingrese el factor: ");
                        ((Mutante)personaje).getFactoresMutantes().add(lea.nextLine());
                        System.out.print("Desea agregar otro factor S o N: ");
                        desicion = lea.nextLine();
                    }
                }
                case "3":
                case "4":
                case "5":
                case "6":
                    break;
                default:
                    System.out.print("Seleccion una opcion correcta entre 1 y 6");
                    sel = lea.nextLine();
                    break;
            }
        }
       
    }
    
    static void modificarPersona() {
    }
    
    static void eliminarPersona(){
        
    }
    
    static void listarPersonas(){
        
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
    
    static boolean validacionStringNumeros(String c){
        boolean condicion = true;
        for (int i = 0; i < c.length(); i++) {
            if (! Character.isDigit(c.charAt(i))) {
                condicion = false;
                break;
            }
        }
        return condicion;
    }
    
    static void crearUniverso(){
        Universo u = new Universo();
    }

    public void listar(){
        
        //Incompleto
        ArrayList<Persona> ordenado = new ArrayList();
        for (Persona persona : personas) {
            ordenado.add(persona);
        }
        
        
        int maxCaracteres = 0;
        int cantCaracteres;
        for (Persona p : personas) {
            cantCaracteres = p.getNombre().length();
            if (maxCaracteres < cantCaracteres) {
                maxCaracteres = cantCaracteres;
            }
        }
        
        
    }
    
    
    
}
