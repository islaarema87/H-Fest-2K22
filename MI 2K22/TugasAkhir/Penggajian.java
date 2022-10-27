package src.TugasAkhir;

public class Penggajian {
    public static String[] nama;
    public static String[] jabatan;
    public static int[] gajiPokok;
    public static int[] tunjangan;
    public static int[] lemburan;
    public static int[] gajiBersih;

    static java.util.Scanner scanner = new java.util.Scanner(System.in);
    static java.util.Scanner scanner2 = new java.util.Scanner(System.in);
    static java.util.Scanner scanner3 = new java.util.Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Panjang Indeks Array : ");
        int arrayLength = scanner.nextInt();
        nama = new String[arrayLength];
        jabatan = new String[arrayLength];
        gajiPokok = new int[arrayLength];
        tunjangan = new int[arrayLength];
        lemburan = new int[arrayLength];
        gajiBersih = new int[arrayLength];

        viewMenuPenggajian();
    }

    /*Menampilkan menu penggajian*/
    static void viewMenuPenggajian(){

        while (true){

            System.out.println("===============================");
            System.out.println("||        MENU UTAMA         ||");
            System.out.println("===============================");
            System.out.println("1. Data Pegawai");
            System.out.println("2. Perhitungan Gaji");
            System.out.println("3. Cetak Slip Gaji Pegawai");
            System.out.println("4. Pencarian Pegawai");
            System.out.println("5. Pelaporan");
            System.out.println("6. Total Yang Dikeluarkan Perusahaan");
            System.out.println("7. Pegawai Yang Tidak Lembur");
            System.out.println("x. Keluar");

            System.out.print("Pilih : ");
            String input = scanner2.nextLine();

            if (input.equals("1")){
                dataPegawai();
            }else if (input.equals("2")){
                perhitunganGaji();
            }else if (input.equals("3")){
                slipGaji();
            }else if (input.equals("4")){
                pencarianPegawai();
            }else if (input.equals("5")){
                pelaporan();
            }else if (input.equals("6")){
                perusahaan();
            }else if (input.equals("7")){
                pegawai();
            }else if (input.equals("x")){
                break;
            }else {
                System.out.println("Input Yang Anda Masukkan Tidak Valid");
            }
        }
    }

    static void addDataList() {
        System.out.println("====================================");
        System.out.println("||   MENAMBAH DATA NAMA PEGAWAI   ||");
        System.out.println("====================================");

        int a = 0;
        while (a < nama.length){
            System.out.print("Nama : ");
            String input = scanner3.nextLine();

            nama[a] = input;
            a++;
        }
    }

    static void addDataList2() {
        System.out.println("=======================================");
        System.out.println("||   MENAMBAH DATA JABATAN PEGAWAI   ||");
        System.out.println("=======================================");

        int a = 0;
        while (a < jabatan.length){
            System.out.print("Jabatan : ");
            String input = scanner3.nextLine();

            jabatan[a] = input;
            a++;

        }
        viewMenuPenggajian();
    }

    //Method Input Data Pegawai
    static void dataPegawai(){
        System.out.println("1. Tambah Data Pegawai");
        System.out.println("2. Kembali Ke Menu Utama");

        System.out.print("Pilih : ");
        String input = scanner3.nextLine();

        if (input.equals("1")){
            addDataList();
            addDataList2();
        }else if (input.equals("2")){
            viewMenuPenggajian();
        }else {
            System.out.println("Input Yang Anda Masukkan Tidak Valid");
            dataPegawai();
        }
    }

    static void addGajiPokok(){
        System.out.println("==================================");
        System.out.println("||   INPUT GAJI POKOK PEGAWAI   ||");
        System.out.println("==================================");

        int b = 0;
        while (b < gajiPokok.length){
            System.out.print("Gaji Pokok : ");
            int input = scanner.nextInt();

            gajiPokok[b] = input;
            b++;

        }
        perhitunganGaji();
    }

    static void addTunjangan(){
        System.out.println("===================================");
        System.out.println("||    INPUT TUNJANGAN PEGAWAI    ||");
        System.out.println("===================================");

        int c = 0;
        while (c < tunjangan.length){
            System.out.print("Tunjangan : ");
            int input = scanner.nextInt();

            tunjangan[c] = input;
            c++;
        }
        perhitunganGaji();
    }

    static void addLemburan(){
        System.out.println("==================================");
        System.out.println("||    INPUT LEMBURAN PEGAWAI    ||");
        System.out.println("==================================");

        int d = 0;
        while (d < lemburan.length){
            System.out.print("Total Jam Lembur : ");
            int inputJam = scanner.nextInt();
            System.out.print("Harga Per Jam : ");
            int inputHarga = scanner.nextInt();

            lemburan[d] = inputJam * inputHarga;

            gajiBersih[d] = gajiPokok[d] + lemburan[d] + tunjangan[d];

            d++;
        }
        perhitunganGaji();
    }

    //Method Perhitungan Gaji Pegawai
    static void perhitunganGaji(){
        System.out.println("1. Input Gaji Pokok");
        System.out.println("2. Input Tunjangan");
        System.out.println("3. Input Lemburan");
        System.out.println("0. Kembali Ke Menu Utama");

        System.out.print("Pilih : ");
        int input = scanner.nextInt();

        if (input == 1){
            addGajiPokok();
        }else if (input == 2){
            addTunjangan();
        }else if (input == 3){
            addLemburan();
        }else if (input == 0){
            viewMenuPenggajian();
        } else{
            System.out.println("Input Yang Anda Masukkan Tidak Valid");
            perhitunganGaji();
        }
    }

    //Method Cetak Slip Pegawai
    static void slipGaji(){
        System.out.print("Input Nama Pegawai : ");
        String input = scanner2.nextLine();

        System.out.println("________________________________________________________________________________________________________________________________________________________________");
        System.out.println("|\t          Nama Pegawai              |\t      Jabatan        |\t    Gaji Pokok     |\t   Tunjangan       |\t    Lemburan       |\t   Gaji Bersih     |");
        System.out.println("‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");

        for (int i = 0; i < nama.length; i++){
            if (nama[i].equalsIgnoreCase(input)){
                System.out.printf("|\t%-35s ",nama[i]);
                System.out.printf("|\t%-20s ",jabatan[i]);
                System.out.printf("|\tRp.%-10d,00   ",gajiPokok[i]);
                System.out.printf("|\tRp.%-10d,00   ",tunjangan[i]);
                System.out.printf("|\tRp.%-10d,00   ",lemburan[i]);
                System.out.printf("|\tRp.%-10d,00   |",gajiBersih[i]);
                System.out.println();
            }
        }
        System.out.println("‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");

        System.out.println("1. Cetak Slip Gaji Lagi");
        System.out.println("2. Kembali Ke Menu Utama");

        System.out.print("Pilih : ");
        String input2 = scanner2.nextLine();

        if (input2.equals("1")){
            slipGaji();
        }else if (input2.equals("2")){
            viewMenuPenggajian();
        }else {
            System.out.println("Input Yang Anda Masukkan Tidak Valid");
        }
    }


    //Method Pencarian Pegawai
    static void pencarianPegawai(){
        System.out.print("Input Nama Pegawai : ");
        String input = scanner2.nextLine();

        System.out.println("__________________________________________________________________");
        System.out.println("|\t          Nama Pegawai              |\t       Jabatan       |");
        System.out.println("‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");


        for (int i = 0; i < nama.length; i++){
            if (nama[i].equalsIgnoreCase(input)){
                System.out.printf("|\t%-35s ",nama[i]);
                System.out.printf("|\t%-20s |",jabatan[i]);
                System.out.println();
            }
        }
        System.out.println("‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");

        System.out.println("1. Mencari Pegawai Lagi");
        System.out.println("2. Kembali Ke Menu Utama");

        System.out.print("Pilih : ");
        String input2 = scanner2.nextLine();

        if (input2.equals("1")){
            pencarianPegawai();
        }else if (input2.equals("2")){
            viewMenuPenggajian();
        }else {
            System.out.println("Input Yang Anda Masukkan Tidak Valid");
        }
    }

    //Method Pelaporan Gaji Pegawai
    static void pelaporan(){

        System.out.println("________________________________________________________________________________________________________________________________________________________________");
        System.out.println("|\t          Nama Pegawai              |\t      Jabatan        |\t    Gaji Pokok     |\t   Tunjangan       |\t    Lemburan       |\t   Gaji Bersih     |");
        System.out.println("‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");

        for (int i = 0; i < nama.length; i++){

            System.out.printf("|\t%-35s ",nama[i]);
            System.out.printf("|\t%-20s ",jabatan[i]);
            System.out.printf("|\tRp.%-10d,00   ",gajiPokok[i]);
            System.out.printf("|\tRp.%-10d,00   ",tunjangan[i]);
            System.out.printf("|\tRp.%-10d,00   ",lemburan[i]);
            System.out.printf("|\tRp.%-10d,00   |",gajiBersih[i]);
            System.out.println();
        }
        System.out.println("‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");

    }

    static void perusahaan(){
        int totalGajiPokok = 0;
        int totalTunjangan = 0;
        int totalLemburan = 0;

        for (int i = 0; i < gajiPokok.length; i++){
            totalGajiPokok += gajiPokok[i];
            totalTunjangan += tunjangan[i];
            totalLemburan += lemburan[i];
        }

        System.out.println("Total Perusahaan Untuk Membayar Gaji Pokok : Rp." + totalGajiPokok);
        System.out.println("Total Perusahaan Untuk Membayar Tunjangan : Rp." + totalTunjangan);
        System.out.println("Total Perusahaan Untuk Membayar Lemburan : Rp." + totalLemburan);
    }

    static void pegawai(){
        System.out.println("________________________________________________________________________________________________________________________________________________________________");
        System.out.println("|\t          Nama Pegawai              |\t      Jabatan        |\t    Gaji Pokok     |\t   Tunjangan       |\t    Lemburan       |\t   Gaji Bersih     |");
        System.out.println("‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");

        for (int i = 0; i < lemburan.length; i++){
            if (lemburan[i] == 0){
                System.out.printf("|\t%-35s ",nama[i]);
                System.out.printf("|\t%-20s ",jabatan[i]);
                System.out.printf("|\tRp.%-10d,00   ",gajiPokok[i]);
                System.out.printf("|\tRp.%-10d,00   ",tunjangan[i]);
                System.out.printf("|\tRp.%-10d,00   ",lemburan[i]);
                System.out.printf("|\tRp.%-10d,00   |",gajiBersih[i]);
                System.out.println();
            }
        }
        System.out.println("‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");
    }

}