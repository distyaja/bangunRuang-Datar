/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author asus
 */
public class Main {
    public static void main (String[] args){
       
        BangunDatar bangunDatar = new BangunDatar();
       
        persegii persegi = new persegii();
        persegi.sisi = 2;
    
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.r = 22;
      
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.panjang = 8;
        persegiPanjang.lebar = 4;
       
        Segitiga segitiga = new Segitiga();
        segitiga.alas = 12;
        segitiga.tinggi = 8;
       
        bangunDatar.luas();
        bangunDatar.keliling();
        
        persegi.luas();
        persegi.keliling();
        
        lingkaran.luas();
        lingkaran.keliling();
        
        persegiPanjang.luas();
        persegiPanjang.keliling();
        
        segitiga.luas();
        segitiga.keliling();
    }
}
