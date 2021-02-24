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
public class UjiBus3 {
    private static void addPenumpang(int i) {
    }
    private int penumpang;
    private int maxpenumpang;
    private int penumpangBaru;

    //Konstruksi kelas bus
    public UjiBus3(int maxpenumpang) {
    this.maxpenumpang = maxpenumpang;
                  penumpang = 0;
}
    
    //Method Mutator untuk nambah penumpang
    public void addpenumpang(int penumpang){
    int temp;
    temp = this.penumpang+penumpang;
    if (temp> maxpenumpang)  {
    System . out. println(" Penumpang Melebihi Kuota");
    }else
    this.penumpang=temp;
    }

    //Minta Password
    private static int password;
    static void getpenumpang(int i) {
      if (password==24){
     System.out.print("Password Benar");
                addPenumpang(15);
    } else
     System.out.print("Password Salah");
    }

   
    public void cetak ( ){
    System.out.println(" Penumpang bus sekarang "+ penumpang);
    System.out.println(" Maksimum penumpang bus yang seharusnya adalah "+ maxpenumpang);
    }
}