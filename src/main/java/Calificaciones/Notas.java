package Calificaciones;

import java.util.Scanner;

public class Notas extends Promedio{

    public static void main(String[] args) {
        
        Scanner capturar = new Scanner(System.in);
        Promedio calif = new Promedio();
        
        System.out.println("Capturar nombre:");
        String nombre = capturar.nextLine();
        
        System.out.println("Insertar calificaciones: ");
        float calif1 = capturar.nextFloat();
        float calif2 = capturar.nextFloat();
        float calif3 = capturar.nextFloat();
        float calif4 = capturar.nextFloat();
        float calif5 = capturar.nextFloat();
        
        calif.promedio(calif1, calif2, calif3, calif4, calif5);
   
        System.out.println("\nResultados Finales\n");
        System.out.println("Nombre: " + nombre);
        System.out.println("Español: " +calif1);
        System.out.println("Matemáticas: " +calif2);
        System.out.println("Inglés: " +calif3);
        System.out.println("Geografía: " +calif4);
        System.out.println("Programación: " +calif5);
        calif.notas();
        calif.mostrar();
        
    }
    
}
