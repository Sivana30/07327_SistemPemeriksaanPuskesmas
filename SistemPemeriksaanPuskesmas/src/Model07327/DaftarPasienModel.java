package Model07327;
import Helper07327.koneksi;
import java.util.Date;

import javax.naming.ldap.PagedResultsControl;

import com.mysql.cj.x.protobuf.MysqlxCrud.Update;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import Entity07327.DaftarPasienEntity;
import Entity07327.pasienEntity;
import Model07327.PasienModel;

public class DaftarPasienModel implements ModelInterface{
 static koneksi koneksi = new koneksi();
 static PasienModel pasienModel = new PasienModel();
 static ArrayList<DaftarPasienEntity> daftarpasienArrayList = new ArrayList<>();
 public DaftarPasienModel(){
     koneksi.getconnection();
 }

 public void singkronkan(){
    String sql = "SELECT * FROM daftarpasien";
    daftarpasienArrayList.clear();

    try {
        koneksi.rs = koneksi.stmt.executeQuery(sql);

        while (koneksi.rs.next()) {
            int id = koneksi.rs.getInt("pasienid");
            int accdokter = koneksi.rs.getInt("accdokter");
            String dokterpenanganan = koneksi.rs.getString("dokterpenanganan");
            String keluhan = koneksi.rs.getString("keluhan");
            daftarpasienArrayList.add(new DaftarPasienEntity(pasienModel.getPasien().get(0),accdokter,dokterpenanganan,keluhan));
        }

    } catch (Exception e) {
        e.printStackTrace();
    }
    }

 public ArrayList<DaftarPasienEntity> getDaftarpasien(){
     singkronkan();
     return daftarpasienArrayList;
 }

 public void verif(int id){
     daftarpasienArrayList.get(id).setAccdokter(1);
 }

 public void Update(int id, DaftarPasienEntity pasien){
        try {
            String sql = "UPDATE daftarpasien SET dokterpenanganan='%s', keluhan='%s' WHERE pasienid=%d";
            sql = String.format(sql, pasien.getDokterpenangan(), pasien.getKeluhan());
            koneksi.stmt.execute(sql);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

 public int cekData(String nama, String password){
    return pasienModel.cekData(nama, password);
}   
}