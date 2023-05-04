/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KalsifikasiHewan;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("1.Vertebrata \n2.Invertebrata \nMasukkan pilihan : ");
        int pilih = input.nextInt();
        
        if(pilih == 1){
        Clasification c = new Clasification();
        c.Vertebrates();
        c.Warm_Blooded();
        
        System.out.print("1.Group Mamals \n2.Group Birds \nPilih Golongan : ");
        Warm_Blooded w = new Warm_Blooded();
        int pilihan = input.nextInt();
        switch(pilihan){
            case 1:
                w.mamals();
                break;
            case 2:
                w.birds();
                break;                 
        }
        System.out.println("");
        c.ColdBlooded();
        System.out.print("1.Group fish \n2.Group reptiles \n3.amphibians \nPilih Golongan : ");
        ColdBlooded cl = new ColdBlooded();
        int plhn = input.nextInt();
        switch(plhn){
            case 1:
                cl.fish();
                break;
            case 2:
                cl.reptiles();
                break;
            case 3:
                cl.amphibians();       
        }
        }
        if(pilih == 2){
        Clasification c = new Clasification();
        c.Invertebrates();
        c.JointedLegs();
        
        
        System.out.print("1.Group with 3 pairs of legs \n2.Group with more than 3 pairs of legs \nPilih Golongan : ");
        JointedLegs j = new JointedLegs();
        int pilihan = input.nextInt();
        System.out.println("");
        switch(pilihan){
            case 1:
                j.PasangKaki3();
                break;
            case 2:
                j.Kakilebih3();
                break;                 
        }
        System.out.println("");
        c.WithoutLegs();
        System.out.print("1.Group worm like \n2.Group not worm like\nPilih Golongan : ");
        WithoutLegs wt = new WithoutLegs();
        int plhn = input.nextInt();
        System.out.println("");
        switch(plhn){
            case 1:
                wt.wormLike();
                break;
            case 2:
                wt.notwormlike();
                break;         
        }
        }
    }
}
    

