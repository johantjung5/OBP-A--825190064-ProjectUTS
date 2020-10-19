import java.util.Scanner;

public class Main{
    String username;
    String password;

    public static void main(String[] args){
        String user="username";
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Username anda :");
        String username = input.nextLine();
        System.out.println("Masukkan Password anda :");
        String password = input.nextLine();
        if (username.equals(user)){

            System.out.println("Silahkan pilih menu yang diinginkan : 1/2/3 ");
            System.out.println("1. Grepbaik");
            System.out.println("2. Grepsen");
            System.out.println("3. Greput");
            System.out.print("Yuk mau yang mana? : ");

            int pilih = input.nextInt();

            switch (pilih) {
                case 1:
                    System.out.println("Anda memilih menggunakan layanan Grepbaik, silahkan pilih lokasi dan tujuan anda");
                    System.out.println("1. Jakarta - Bandung, Jarak 50km");
                    System.out.println("2. Jakarta - Depok, Jarak 30km");
                    System.out.println("3. Jakarta - Tangerang, Jarak 20km");
                    System.out.print("Hayo mau kemanaa????? 1/2/3 : ");
                    int pilih1 = input.nextInt();

                    switch (pilih1) {
                        case 1:
                            grepbaik.Grepbaik a = new grepbaik.Grepbaik("Bandung", "Jakarta", 5000, 50);
                            a.tampilGrepbaik();
                            break;

                        case 2:
                            grepbaik.Grepbaik b = new grepbaik.Grepbaik("Depok", "Jakarta", 5000, 30);
                            b.tampilGrepbaik();
                            break;

                        case 3:
                            grepbaik.Grepbaik c = new grepbaik.Grepbaik("Tangerang", "Jakarta", 5000, 20);
                            c.tampilGrepbaik();
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Anda memilih menggunakan layanan Grepsen, Silahkan pilih barang apa yang akan dikirim :");
                    System.out.println("1. Perhiasan");
                    System.out.println("2. Makanan");
                    System.out.println("3. Handhpone");
                    System.out.print("Hayo mau kirim apaa???? 1/2/3 : ");
                    int pilih2 = input.nextInt();

                    switch (pilih2) {
                        case 1:
                            grepsen.Grepsen a = new grepsen.Grepsen("Perhiasan", 20, 1);
                            a.tampilGrepsen();
                            break;

                        case 2:
                            grepsen.Grepsen b = new grepsen.Grepsen("Makanan", 10, 1.5);
                            b.tampilGrepsen();
                            break;

                        case 3:
                            grepsen.Grepsen c = new grepsen.Grepsen("Handphone", 30, 1.2);
                            c.tampilGrepsen();
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Anda memilih menggunakan layanan Greput,Silahkan pilih makanan yang akan dipesan ");
                    System.out.println("1. Ayam bakar rilliiyyyyyy Rp.15000");
                    System.out.println("2. Nasi bakar tjinjjaaa Rp. 12000");
                    System.out.println("3. Cumi bakar tepung Rp.20000");
                    System.out.print("Hayo mau makan apaa?? 1/2/3 : ");
                    int pilih3 = input.nextInt();

                    switch (pilih3) {
                        case 1:
                            greput.Greput a = new greput.Greput("Ayam bakar rilliiyyyyyy", 15000);
                            a.tampilGreput();
                            break;

                        case 2:
                            greput.Greput b = new greput.Greput("Nasi bakar tjinjjaaa", 12000);
                            b.tampilGreput();
                            break;

                        case 3:
                            greput.Greput c = new greput.Greput("Cumi bakar tepung", 20000);
                            c.tampilGreput();
                            break;
                    }
                    break;
            }
            System.out.println("Nama : Johan Tjung");
            System.out.println("Nim  : 825190064");
            System.out.println("Project Uts");
            System.out.println("===================================");
        }
        else{
            System.out.println("Username yang anda masukkan salah, silahkan diulang!");
        }
    }
}
