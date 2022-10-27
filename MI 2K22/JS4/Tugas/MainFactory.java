package JS4.Tugas;

public class MainFactory {
    public static void main(String[] args) {
        Supplier sp1 = new Supplier("1","Abu Janda");
        Supplier sp2 = new Supplier("2","Samsudin Bin Sus");

        Produk p1 = new Produk("1","Kue");
        Produk p2 = new Produk("2","Es Krim");

        Bahan_Baku b1 = new Bahan_Baku("1", "Gandum",10);
        Bahan_Baku b2 = new Bahan_Baku("12", "Krimmer",100);

        sp1.tambahDataProduk(p1);
        sp1.tambahDataProduk(p2);
        p1.tambahDaftarBahanBaku(b1);
        p2.tambahDaftarBahanBaku(b2);
        System.out.println(sp1.getInfo());


        sp2.tambahDataProduk(p1);
        p2.tambahDaftarBahanBaku(b1);
        System.out.println(sp2.getInfo());
    }
}
