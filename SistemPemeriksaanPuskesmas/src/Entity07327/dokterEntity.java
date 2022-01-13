package Entity07327;
import java.sql.Date;
public class dokterEntity extends DataAbstract{
    private String nip;
    public dokterEntity(String nama,String notelp,String password,String nip,Date tgllahir){
        super(nama,notelp,password,tgllahir);
        this.nip = nip;
    }
    public String getnip() {
        return this.nip;
    }
    @Override
    public String getNama() {
        return super.getNama();
    }
    @Override
    public String getNotelp() {
        return super.getNotelp();
    }
    @Override
    public String getPassword() {
        return super.getPassword();
    }
    @Override
    public Date getTgllahir() {
        return super.getTgllahir();
    }
    public void setnip(String nip) {
        this.nip = nip;
    }
    @Override
    public void setNama(String nama) {
        super.setNama(nama);
    }
    @Override
    public void setNotelp(String notelp) {
        super.setNotelp(notelp);
    }
    @Override
    public void setPassword(String password) {
        super.setPassword(password);
    }
    @Override
    public void setTgllahir(Date tgllahir) {
        super.setTgllahir(tgllahir);
    }
}
