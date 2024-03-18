/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author ArnauGarcia-AlumnoCE
 */
public class Principal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        // ------------------- Instanciamos los objetos ------------------ //
        
        Tapa obj1 = new Tapa();
        
        obj1.leer();
        System.out.println("Introduce el nuevo ingrediente de la tapa: ");
        obj1.añadirIngrediente(sc.next());
        System.out.println("Introduce el nuevo ingrediente de la tapa: ");
        obj1.añadirIngrediente(sc.next());
        
        obj1.mostrarTapa();
                        
    }        
}
