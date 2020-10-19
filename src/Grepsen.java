package grepsen;

public class Grepsen {
    String nama;
    double jarak, berat, biaya;

    public Grepsen (String namaa, double jarakk,double beratt ){
        this.nama = namaa;
        this.jarak = jarakk;
        this.berat = beratt;
        biaya= (berat*5000)+(jarak*2000)+5000;
    }

    public void tampilGrepsen(){
        System.out.println("===================================");
        System.out.println("Nama barang kiriman  :"+nama);
        System.out.println("Berat barang :"+berat + " kg");
        System.out.println("Jarak pengiriman :"+ jarak + " km");
        System.out.println("Biaya Total pesanan  Rp.:"+biaya);
        System.out.println("===================================");
    }
}
