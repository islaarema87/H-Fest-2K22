package JS4.Tugas;

import JS4.Konsultasi;

import java.util.ArrayList;

public class Supplier {
    private String idSupplier;
    private String namaSupplier;
    private ArrayList<Produk> dataProduk;

    public Supplier(String idSupplier, String namaSupplier) {
        this.idSupplier = idSupplier;
        this.namaSupplier = namaSupplier;
        this.dataProduk = new ArrayList<>();
    }

    public String getIdSupplier() {
        return idSupplier;
    }

    public void setIdSupplier(String idSupplier) {
        this.idSupplier = idSupplier;
    }

    public String getNamaSupplier() {
        return namaSupplier;
    }

    public void setNamaSupplier(String namaSupplier) {
        this.namaSupplier = namaSupplier;
    }

    public void tambahDataProduk(Produk produk){
        dataProduk.add(produk);
    }

    public String getInfo(){
        String info = "";

        info += "Id Supplier      : " + this.idSupplier + "\n";
        info += "Nama Supplier    : " + this.namaSupplier + "\n";

        if (!dataProduk.isEmpty()){
            for (Produk produk : dataProduk){
                info += "==============\n";
                info += "Daftar Produk \n";
                info += "==============\n";
                info += produk.getInfo();
            }
        }else {
            info += "Data Kosong";
        }
        info +="\n";

        return info;
    }
}