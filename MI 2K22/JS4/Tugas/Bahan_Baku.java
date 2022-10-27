package JS4.Tugas;

public class Bahan_Baku {
    private String kode;
    private String namaBahan;
    private int stock;


    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNamaBahan() {
        return namaBahan;
    }

    public void setNamaBahan(String namaBahan) {
        this.namaBahan = namaBahan;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Bahan_Baku(String kode, String namaBahan, int stock) {
        this.kode = kode;
        this.namaBahan = namaBahan;
        this.stock = stock;
    }

    public String getInfo(){
        String info = "";

        info += "Kode Bahan_Baku     : " + this.kode + "\n";
        info += "Nama Bahan_Baku     : " + this.namaBahan + "\n";
        info += "Stock Bahan_Baku    : " + this.stock + "\n";

        return info;
    }
}
