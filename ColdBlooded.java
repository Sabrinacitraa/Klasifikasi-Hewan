/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KalsifikasiHewan;

/**
 *
 * @author ACER
 */
public class ColdBlooded extends Clasification {

    public void fish(){
        String hewan [] = {"Salmon", "Goldfish", "Guppy"} ;
        System.out.println("\tGroup Fish are ");
         for (int i = 0; i < hewan.length; i++) {      
             System.out.println("Hewan ke " + (i+1) + " : " + hewan[i]);     
    }
    }
    
    public void reptiles(){
        String hewan [] = {"Turtle", "Crocodile", "Snake"} ;
        System.out.println("\tGroup Reptiles are ");
         for (int i = 0; i < hewan.length; i++) {             
             System.out.println("Hewan ke " + (i+1) + " : " + hewan[i]);  
    }
    }
    public void amphibians(){
         String hewan [] = {"Frog", "Toad", "Newt"} ;
         System.out.println("\tGroup Amphibians are ");
         for (int i = 0; i < hewan.length; i++) {
             System.out.println("Hewan ke " + (i+1) + " : " + hewan[i]);           
        }
    } 
    
}
    

