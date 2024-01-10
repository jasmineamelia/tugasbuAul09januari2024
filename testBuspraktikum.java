/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author zalfa jasmine amelia
 */
public class testBuspraktikum {
    public static void main(String[] args) {
        // TODO code aplication lagic here 
        busPraktikum busMini = new busPraktikum(10);
        busMini.addPenumpang(5);
        busMini.addPenumpang(6);
        busMini.getPenumpang(10);
        busMini.getPenumpang(15);
        busMini.cetak();
        
        busMini.getAverage();
        busMini.cetak();
    }
    
}
