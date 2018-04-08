/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

/**
 *
 * @author MUHAMMAD MAHFUDZ
 */
public class tvaksi {
    public static void main(String[] args) {
        tv toshiba = new tv();
        
        toshiba.type="toshiba 001";
        toshiba.ukuran="30 inch";
        toshiba.jenis="LCD";
        toshiba.harga="3.0000.000";
        toshiba.warna="hitam";
        
        toshiba.CetakInfo();
    }
}
