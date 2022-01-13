package Entity07327;
import java.sql.Date;
public class pasienEntity extends DataAbstract {
    private String diagnosa;
    private int id;
    public pasienEntity(){

    }
    public pasienEntity(int id,String nama,String notelp,String password,String diagnosa,Date tgllahir){
        super(nama,notelp,password,tgllahir);
        this.diagnosa = diagnosa;
        this.id = id;
    }
    public String getDiagnosa() {
        return this.diagnosa;
    }
    public int getId() {
        return this.id;
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
    public void setDiagnosa(String diagnosa) {
        this.diagnosa = diagnosa;
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
