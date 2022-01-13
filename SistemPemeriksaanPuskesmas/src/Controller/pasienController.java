package Controller;
import java.util.ArrayList;
import java.sql.Date;
import Entity07327.DaftarPasienEntity;
import Entity07327.pasienEntity;
import Model07327.DaftarPasienModel;
import Model07327.PasienModel;
public class pasienController implements ControllerInterface {
    private DaftarPasienModel DaftarPasienModel = new DaftarPasienModel();
    private PasienModel pasien = new PasienModel();

    public pasienController(){

    }
    public void insert(int id,String nama,String notelp,String password,String diagnosa,Date tgllahir){
        pasien.insertPasien(new pasienEntity(id, nama, notelp, password, diagnosa, tgllahir));
    }
    public int Login(String nama,String password){
        return DaftarPasienModel.cekData(nama, password);
    }
    public ArrayList<DaftarPasienEntity> getDaftarpasien(){
        return DaftarPasienModel.getDaftarpasien();
    }
    public void Update(int id,String nama,String notelp,String password,String diagnosa,Date tgllahir,int accdokter,String dokterpenangan,String keluhan){
        DaftarPasienModel.Update(id, new DaftarPasienEntity(new pasienEntity(id, nama, notelp, password, diagnosa, tgllahir), accdokter, dokterpenangan, keluhan));
    }
    public void verif(int id){
        DaftarPasienModel.verif(id);
    }
}
