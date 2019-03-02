/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author AdityamaulanaS
 */
class Mobil_2{
    String warna;
    int  Gigi;int tahunproduksi;
            
            void hidupkanMobil(String warna){
            this.warna=warna;
                System.out.println("mobil hidupkan"+warna);
            }
            void matikanMobil(){
                System.out.println("mobil dimatikan"+warna);
            }
            void ubahGigi(int Gigi){
                this.Gigi=Gigi;
                System.out.println("ubah gigi "+this.Gigi);
            }
}
class Mobil{
    String warna;
    int tahunproduksi;
}
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mobil mobilku= new Mobil();
         Mobil_2 mobilmu= new Mobil_2();
         
                 mobilku.warna ="hitam";
                 mobilku.tahunproduksi=2016;
                 mobilmu.warna="firaun";
                 mobilmu.tahunproduksi=2013;
                 
              /* System.out.println("warna: "+mobilku.warna);
               System.out.println("tahunproduksi :"+mobilku.tahunproduksi);
               System.out.println("warna: "+mobilmu.warna);
               System.out.println("tahunproduksi :"+mobilmu.tahunproduksi);
               mobilmu.ubahGigi(3);  */
              mobilmu.warna="hitam";
              mobilmu.tahunproduksi=2017;
              mobilmu.hidupkanMobil();
              mobilmu.matikanMobil();
              mobilmu.ubahGigi();
              
                         
         
    }
    
}
