package grepbaik;

public class Grepbaik {
    String tujuan;
    String lokasi;
    int biaya;
    int total, jarak;
    int ongkos= 5000;

    public Grepbaik (String tujuann, String lokasii, int biayaa, int jarakk){
        this.tujuan = tujuann;
        this.lokasi = lokasii;
        this.biaya = biayaa;
        this.jarak = jarakk;
        total = (biaya*jarak)+ongkos;
    }

    public void tampilGrepbaik(){
        System.out.println("===================================");
        System.out.println("Lokasi anda  :"+lokasi);
        System.out.println("Tujuan anda  :"+tujuan);
        System.out.println("Total ongkos : Rp."+total);
        System.out.println("===================================");
    }
}
