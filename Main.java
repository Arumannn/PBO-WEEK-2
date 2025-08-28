
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        System.out.println("Selamat Datang di Kantin Pujasera");
        try (Scanner input = new Scanner(System.in)) {
            boolean isLooping = true;
            Makanan[] daftarMakanan = {
                new Makanan("Nasi Goreng", 15000),
                new Makanan("Mie Ayam", 12000),
                new Makanan("Bakso", 13000),
                new Makanan("Ayam Geprek", 18000),
                new Makanan("Sate Ayam", 20000)
            };
            Minuman[] daftarMinuman = {
                new Minuman("Es Teh", 5000),
                new Minuman("Es Jeruk", 7000),
                new Minuman("Kopi", 8000),
                new Minuman("Es Campur", 10000),
                new Minuman("Jus Mangga", 12000)
            };
            Kantin kantin = new Kantin(daftarMakanan, daftarMinuman);
            while (isLooping) {
                System.out.println("================================================================================");
                System.out.println("1. Beli Makanan ");
                System.out.println("2. Beli Minuman ");
                System.out.println("3. Lihat Menu ");
                System.out.println("4. Keluar ");
                System.out.println("Pilih menu: ");
                if (!input.hasNextInt()) { input.next(); System.out.println("Masukkan angka!"); continue; }
                int menu = input.nextInt();
                switch (menu) {
                    case 1:
                        kantin.beliMakanan();
                        break;
                    case 2:
                        kantin.beliMinuman();
                        break;
                    case 3:
                        kantin.displayMenu();
                        break;
                    case 4:
                        System.out.println("Terima kasih telah mengunjungi Kantin Pujasera");
                        isLooping = false; 
                        break;
                    default:
                        System.out.println("Pilihan tidak valid");
                        break;
                }
            }
        } 
    }
}

class Makanan{
    private String nama;
    private double harga;

    public Makanan(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}

class Minuman{
    private String nama;
    private double harga;

    public Minuman(String nama, double harga){
        this.nama = nama;
        this.harga = harga;
    }
    public String getNama(){
        return nama;
    }
    public double getHarga(){
        return harga;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setHarga(double harga){
        this.harga = harga;
    }
}

class Kantin{
    private Makanan[] makanan;
    private Minuman[] minuman;

    public Kantin(Makanan makanan[], Minuman minuman[]) {
        this.makanan = makanan;
        this.minuman = minuman;
    }

    public Makanan[] getMakanan() {
        return makanan;
    }

    public Minuman[] getMinuman() {
        return minuman;
    }

    public void setMakanan(Makanan[] makanan) {
        this.makanan = makanan;
    }

    public void setMinuman(Minuman[] minuman) {
        this.minuman = minuman;
    }

    public Makanan getMakanan(int index){
        if (index >= 0 && index < makanan.length){
            return makanan[index];
        }
        return null;
    }

    public Minuman getMinuman(int index){
        if (index >= 0 && index < minuman.length){
            return minuman[index];
        }
        return null;
    }

    public void setMakanan(int index, Makanan makanan){
        if (index >= 0 && index < this.makanan.length){
            this.makanan[index] = makanan;
        }
    }

    public void setMinuman(int index, Minuman minuman){
        if (index >= 0 && index < this.minuman.length){
            this.minuman[index] = minuman;
            }
        }
    
    public void beliMakanan(){
            Scanner input = new Scanner(System.in);
            System.out.println("================================================================================");
            System.out.println("Daftar Makanan:");
            for (int i = 0; i < makanan.length; i++){
                System.out.println((i + 1) + ". " + makanan[i].getNama() + " - Rp" + makanan[i].getHarga());
            }
            System.out.println("Pilih nomor makanan: ");
            int nomorMakanan = input.nextInt();
            System.out.println("Beli berapa banyak :");
            int totalMakanan = input.nextInt();
            System.out.println("Makanan yang dipesan: " + makanan[nomorMakanan - 1].getNama() + " " + totalMakanan +"x");
            System.out.println("Harga: " + makanan[nomorMakanan - 1].getHarga() * totalMakanan);
        }
    public void beliMinuman(){
            Scanner input = new Scanner(System.in);
            System.out.println("================================================================================");
            System.out.println("Daftar Minuman:");
            for (int i = 0; i < minuman.length; i++){
                System.out.println((i + 1) + ". " + minuman[i].getNama() + " - Rp" + minuman[i].getHarga());
        }
            System.out.println("Pilih nomor minuman: ");
            int nomorMinuman = input.nextInt();
            System.out.println("Beli Berapa Banyak : ");
            int totalMinuman = input.nextInt();
            System.out.println("Minuman yang dipesan :" + makanan[nomorMinuman - 1].getNama() + " " + totalMinuman + "x");
            System.out.println("Harga " + minuman[nomorMinuman - 1].getHarga() * totalMinuman);
    }
    public void displayMenu(){
        System.out.println("================================================================================");
        for (int i = 0; i < makanan.length; i++){
            System.out.println((i + 1) + ". " + makanan[i].getNama() + " - Rp" + makanan[i].getHarga());
        }
        System.out.println("================================================================================");
        for (int i = 0; i < minuman.length; i++){
            System.out.println((i + 1) + ". " + minuman[i].getNama() + " - Rp" + minuman[i].getHarga());
        }
    }
}



