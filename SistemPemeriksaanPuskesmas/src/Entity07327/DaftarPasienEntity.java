package Entity07327;

public class DaftarPasienEntity{
    private pasienEntity pasien = new pasienEntity();
    int accdokter;
    String dokterpenangan,keluhan;
    public DaftarPasienEntity(){}
    public DaftarPasienEntity(pasienEntity pasien,int accdokter,String dokterpenangan,String keluhan){
        this.pasien = pasien;
        this.accdokter = accdokter;
        this.dokterpenangan = dokterpenangan;
        this.keluhan = keluhan;
    }
    
    public pasienEntity getPasien() {
        return this.pasien;
    }
    public int getAccdokter() {
        return this.accdokter;
    }
    public String getDokterpenangan() {
        return this.dokterpenangan;
    }
    public String getKeluhan() {
        return this.keluhan;
    }
    public void setAccdokter(int accdokter) {
        this.accdokter = accdokter;
    }
    public void setDokterpenangan(String dokterpenangan) {
        this.dokterpenangan = dokterpenangan;
    }
    public void setKeluhan(String keluhan) {
    
        this.keluhan = keluhan;
    }
    public void setPasien(pasienEntity pasien) {
        this.pasien = pasien;
    }
}