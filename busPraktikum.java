/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author zalfa jasmine amelia
 */
public class busPraktikum {

    private double penumpang, maxPenumpang, counter, penumpangBaru;

    //COnstructor 
    public busPraktikum(double penumpang) {
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
        counter = 0;
        penumpangBaru = 0;
    }

    // method mutator 
    public void addPenumpang(double penumpang) {
        double temp;
        temp = this.penumpang + penumpang;
        if (temp > +maxPenumpang) {
            System.out.println("Over load penumpang");
        } else {
            this.penumpang = temp;
            counter++;
            penumpangBaru += penumpang;
        }
    }

    public void getPenumpang(double penumpang) {
        double temp;
        temp = (double) this.penumpang - penumpang;
        if (temp < 0) {
            System.out.println(" Jumlah penumpang tidak bisa kurang dari 0");
        } else {
            this.penumpang = temp;
            counter--;
            penumpangBaru -= penumpang;
        }
    }

    public double getAverage() {
        if (counter == 0) {
            return 0;
        } else {
            return penumpangBaru / counter;

        }
    }

    public void cetak() {
        System.out.println("Penumpang sekarang = " + penumpang);
        System.out.println("penumpang deharusnya adalah = " + maxPenumpang);
        System.out.println("Rata-rata berat penmpang = " + getAverage());
    }
}
