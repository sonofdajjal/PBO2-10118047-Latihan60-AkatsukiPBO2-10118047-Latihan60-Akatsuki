/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118047.latihan60.akatsuki;

/**
 *
 * @author 
 * Nama : Abdullah Margani
 * Nim : 10118047
 * Kelas: IF-2
 */
public class Akatsuki extends AnggotaDesa {
    
    public Akatsuki() {
        super();
    }
    
    public void tampilAnggotaDesa(int desa) {
        System.out.println("Anggota Dari "+getNamaDesa(desa)+" : ");
        
        if(desa <= 8) {
            System.out.println(getAnggotaDesa(desa));
        } else {
            super.tampilAnggotaDesa();
        }
    }    
}
