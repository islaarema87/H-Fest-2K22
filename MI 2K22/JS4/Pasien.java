package JS4;
import java.util.ArrayList;
import java.time.LocalDate;
public class Pasien {
    private String noRekamMedis;
    private String nama;
    private LocalDate tanggal;
    private ArrayList<Konsultasi> riwayatKonsultasi;

    public String getNoRekamMedis() {
        return noRekamMedis;
    }

    public void setNoRekamMedis(String noRekamMedis) {
        this.noRekamMedis = noRekamMedis;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Pasien(String nama, String noRekamMedis) {
        this.nama = nama;
        this.noRekamMedis = noRekamMedis;
        this.riwayatKonsultasi = new ArrayList<>();
    }

    public void tambahKonsultasi(LocalDate tanggal,Pegawai dokter, Pegawai Perawat){
        Konsultasi konsultasi = new Konsultasi();
        konsultasi.setTanggal(tanggal);
        konsultasi.setDokter(dokter);
        konsultasi.setPerawat(Perawat);
        riwayatKonsultasi.add(konsultasi);
    }

    public String getInfo(){
        String info = "";
        info += "Nama               : " + this.nama + "\n";
        info += "No Rekam Medis     : " + this.noRekamMedis + "\n";

        if (!riwayatKonsultasi.isEmpty()){
            info += "Riwayat Konsultasi :\n";

            for (Konsultasi konsultasi : riwayatKonsultasi){
                info += konsultasi.getInfo();
            }
        }else {
            info += "Belum ada riwayat konsultasi";
        }
        info +="\n";

        return info;
    }
}
