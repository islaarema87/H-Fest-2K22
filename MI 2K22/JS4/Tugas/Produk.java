package JS4.Tugas;

import java.util.ArrayList;
public class Produk {
    private String idProduk;
    private String namaProduk;
    private ArrayList<Bahan_Baku> daftarBahanBaku;

    public Produk(String idProduk, String namaProduk) {
        this.idProduk = idProduk;
        this.namaProduk = namaProduk;
        this.daftarBahanBaku = new ArrayList<>();
    }

    public String getIdProduk() {
        return idProduk;
    }

    public void setIdProduk(String idProduk) {
        this.idProduk = idProduk;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public void tambahDaftarBahanBaku(Bahan_Baku bahanBaku){
        daftarBahanBaku.add(bahanBaku);
    }

    public String getInfo(){
        String info = "";

        info += "Id Produk      : " + this.idProduk + "\n";
        info += "Nama Produk    : " + this.namaProduk + "\n";

        if (!daftarBahanBaku.isEmpty()){
            info += "==================\n";
            info += "Daftar Bahan-Baku \n";
            info += "==================\n";

            for (Bahan_Baku baku : daftarBahanBaku){
                info += baku.getInfo();
            }
        }else {
            info += "Data Kosong";
        }
        info +="\n";

        /*info += "================================\n";
        info += "Daftar Bahan-Baku \n";
        info += "================================\n";
        for (Bahan_Baku baku : daftarBahanBaku){
            info += baku.getInfo();
        }*/
        return info;
    }
}
