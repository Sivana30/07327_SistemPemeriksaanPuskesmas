package Model07327;
import java.util.ArrayList;
import Helper07327.koneksi;
import java.sql.Date;
import Entity07327.pasienEntity;
import java.sql.PreparedStatement;
public class PasienModel{
    private koneksi koneksi = new koneksi();
    private ArrayList<pasienEntity> pasienEntityArrayList = new ArrayList<>();
    public PasienModel(){
        koneksi.getconnection();
        singkronkan();
    }

    public void singkronkan(){
        String sql = "SELECT * FROM pasien";
        pasienEntityArrayList.clear();

        try {
            koneksi.rs = koneksi.stmt.executeQuery(sql);

            while (koneksi.rs.next()) {
                int id = koneksi.rs.getInt("id");
                String nama = koneksi.rs.getString("nama");
                String notelp = koneksi.rs.getString("notelp");
                String password = koneksi.rs.getString("password");
                String diagnosa = koneksi.rs.getString("diagnosa");
                Date tgllahir = koneksi.rs.getDate("tgllahir");
                pasienEntityArrayList.add(new pasienEntity(id,nama,notelp,password,diagnosa,tgllahir));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    void insertdaftarPasien(int idpasien){
        String sql = "insert into daftarpasien (pasienid, accdokter, dokterpenangan, keluhan) values(?,?,?,?)";
        try {
            PreparedStatement ps = koneksi.conn.prepareStatement(sql);
            ps.setInt(1, idpasien);
            ps.setInt(2, 0);
            ps.setString(3, "belum di tangani");
            ps.setString(4, "tidak ada");
            ps.executeUpdate();

        } catch (Exception e){
            System.out.println("Data Gagal di buat.\n");
            e.printStackTrace();
        }
    }

    public void insertPasien(pasienEntity pasien){
        String sql = "insert into pasien (nama , notelp, password, tgllahir, diagnosa) values(?,?,?,?,?)";
        try {
            PreparedStatement ps = koneksi.conn.prepareStatement(sql);
            ps.setString(1, pasien.getNama());
            ps.setString(2, pasien.getNotelp());
            ps.setString(3, pasien.getPassword());
            ps.setDate(4, pasien.getTgllahir());
            ps.setString(5, pasien.getDiagnosa());
            ps.executeUpdate();
            insertdaftarPasien(pasien.getId());
        } catch (Exception e){
            System.out.println("Data Gagal di buat.\n");
            e.printStackTrace();
        }
        singkronkan();
    }

    public ArrayList<pasienEntity> getPasien(){
        singkronkan();
        return pasienEntityArrayList;
    }



    public int size(){
        return pasienEntityArrayList.size();
    }

    public int cekData(String nama, String password){
        singkronkan();
            int cek =0;
            for(int i = 0; i < pasienEntityArrayList.size();i++){
            if (nama.equals(pasienEntityArrayList.get(i).getNama())&&password.equals(pasienEntityArrayList.get(i).getPassword())){
                cek = 1;
            }else{
                }
            }
            return cek;
    } 

}
