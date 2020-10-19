package greput;

public class Greput {
    String nama;
    int harga,total;
    int ongkos = 5000;

    public Greput(String namaa,int hargaa){
        this.nama = namaa;
        this.harga = hargaa;
        total = harga+ongkos;
    }

    public void tampilGreput(){
        System.out.println("===================================");
        System.out.println("Anda memilih "+nama);
        System.out.println("Total Harga Pemesanan: Rp." +total);
        System.out.println("===================================");
    }
}
