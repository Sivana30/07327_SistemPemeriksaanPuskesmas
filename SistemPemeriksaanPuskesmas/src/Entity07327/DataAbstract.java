package Entity07327;
import java.sql.Date;

public abstract class DataAbstract{
private String nama,notelp,password;
private Date tgllahir;
public DataAbstract(){
}
public DataAbstract(String nama,String notelp,String password,Date tgllahir){
this.nama = nama;
this.notelp = notelp;
this.password = password;
this.tgllahir = tgllahir;
}
public String getNama() {
    return this.nama;
}
public String getNotelp() {
    return this.notelp;
}
public String getPassword() {
    return this.password;
}
public Date getTgllahir() {
    return this.tgllahir;
}

public void setNama(String nama) {
    this.nama = nama;
}
public void setNotelp(String notelp) {
    this.notelp = notelp;
}
public void setPassword(String password) {
    this.password = password;
}
public void setTgllahir(Date tgllahir) {
    this.tgllahir = tgllahir;
}
}