/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus3;

/**
 *
 * @author MOKLET-2
 */
public class Bus3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int password;
        
        //Membuat objek busBesar dari class bus
        UjiBus3 busBesar = new UjiBus3 (40);
        busBesar.cetak ();
        
        // penambahan penumpang
        busBesar.addpenumpang (2); //tambah 2 penumpang
        busBesar.cetak () ;

        // penambahan penumpang
       busBesar.addpenumpang (1); //tambah 1 penumpang
       busBesar .cetak () ;

       // penambahan penumpang
       busBesar.addpenumpang (2); //tambah 2 penumpang
       busBesar .cetak () ;

      //penambahan penumpang
       busBesar.addpenumpang (2); //tambah 2 penumpang
       busBesar .cetak () ;
    }
    
}
