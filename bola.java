/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author zalfa jasmine amelia
 */
public class bola {
    private double jarijari;
    
    public bola (){
        this.jarijari = 0.0;
        
    }
    public void setjarijari(double jarijari){
        if (jarijari > 0){
            this.jarijari = jarijari;
        } else {
            System.out.println("jari jari harus lebih dari 0.");
        }
    }
   public double showDiameter (){
       return 2 * jarijari;
       
   }
   public double showLuasPermukaan (){
       return 4* Math.PI * Math.pow(jarijari,2);
       
       
   }
   public double showVolume(){
       return (4/3) * Math.PI * Math.pow(jarijari, 3);
       
       
   }
    public static void main(String[] args) {
        // langkah 1 : Membuat variabel jarijari
        double jarijariVariabel = 5.0;
        
        // langkah 2: Menciptakan abjek bola
        bola bolaobjek = new bola ();
        
        // langkah 3: Manggil method showDiameter(), showLuasPermukaan(), dan showVolume ()
        System.out.println("Diameter: " +bolaobjek.showDiameter());
        System.out.println("Luas permukaan:" + bolaobjek.showLuasPermukaan());
        System.out.println("Volume: " + bolaobjek.showVolume());
        
        // langkah 4: Memanipulasi objek dengan memanggil method setjarijari()
        bolaobjek.setjarijari(jarijariVariabel);
        
        // langkah 5: Menampilkan hasil setelah manipulasi
        System.out.println("|nsetelah msnipulasi: ");
        System.out.println("Diameter: " + bolaobjek.showDiameter());
        System.out.println("Luas permukaan: "+ bolaobjek.showLuasPermukaan());
        System.out.println("Volume: " + bolaobjek.showVolume());
        
        
        
    }
   }