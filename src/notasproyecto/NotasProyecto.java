/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notasproyecto;

import java.util.Scanner;

/**
 *
 * @author Alumno Mañana
 */
public class NotasProyecto {

    /**
     * @param args the command line arguments
     */
    static Scanner ent = new Scanner(System.in);
    
    public static void main(String[] args) {
        // TODO code application logic here
        /*En funcion de una dota, decir si el alumno esta suspenso
           Suspenso -> 0 a 5  Aprobado -> 5 a 6
        */
        
        System.out.println("Introduce una nota: ");
        float nota = ent.nextInt();
        
        if(nota >= 0 && nota < 5){
            System.out.println("\nEstas SUSPENSO");
        }else if(nota >= 5 && nota <= 6){
            System.out.println("Tienes un BIEN");
        }else if(nota >= 7 && nota <= 8){
            System.out.println("Tienes un NOTABLE");
        }else if(nota >= 9 && nota <= 10){
            System.out.println("Tienes un SOBRESALIENTE");
        }else if(nota < 0 || nota > 10){
            System.out.println("La nota introducida es INCORRECTA");
        }
        
        
        
    }
    
}
