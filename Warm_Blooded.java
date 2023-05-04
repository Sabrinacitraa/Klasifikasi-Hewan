/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KalsifikasiHewan;

/**
 *
 * @author ACER
 */
public class Warm_Blooded extends Clasification {
    public void mamals(){
        String hewan [] = {"Bear", "Tiger", "Whale"} ;
        System.out.println("\tGroup Mamals are ");
        for (int i = 0; i < hewan.length; i++) {  
             System.out.println("Hewan ke " + (i + 1) + " : " + hewan[i]);     
    }
    }
    
    public void birds(){
        String hewan [] = {"Ostrich", "Peacock", "eagle"} ;
        System.out.println("\tGroup birds are ");
         for (int i = 0; i < hewan.length; i++) {   
             System.out.println("Hewan ke " + (i + 1) + " : " + hewan[i]);  
    }
    }
}


