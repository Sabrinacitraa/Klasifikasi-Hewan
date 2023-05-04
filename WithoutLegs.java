/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KalsifikasiHewan;

/**
 *
 * @author ACER
 */
public class WithoutLegs extends Clasification{
    public void wormLike(){
        String hewan [] = {"Eartworm", "Leach"} ;
        System.out.println("\tGroup Worm - like are ");
        for (int i = 0; i < hewan.length; i++) {  
             System.out.println("Hewan ke " + (i + 1) + " : " + hewan[i]);     
    }
    }
    
    public void notwormlike(){
        String hewan [] = {"Fluke worm", "Tapeworm"} ;
        System.out.println("\tGroup not worm - like are ");
         for (int i = 0; i < hewan.length; i++) {   
             System.out.println("Hewan ke " + (i + 1) + " : " + hewan[i]);  
    }
    }
    
}
