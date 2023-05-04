/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KalsifikasiHewan;

/**
 *
 * @author ACER
 */
public class JointedLegs extends Clasification{
    public void PasangKaki3(){
        String hewan [] = {"Ant", "Cockcroch", "Ladybug"} ;
        System.out.println("\tGroup with 3 pairs of legs are ");
        for (int i = 0; i < hewan.length; i++) {  
             System.out.println("Hewan ke " + (i + 1) + " : " + hewan[i]);     
    }
    }
    
    public void Kakilebih3(){
        String hewan [] = {"Scorpion", "Spider", "Millipede"} ;
        System.out.println("\tGroup with more tan 3 pairs of legs are ");
         for (int i = 0; i < hewan.length; i++) {   
             System.out.println("Hewan ke " + (i + 1) + " : " + hewan[i]);  
    }
    } 
    
}
