package Model07327;
import java.util.ArrayList;
import Helper07327.koneksi;
import java.sql.Date;
import Entity07327.dokterEntity;
import java.sql.PreparedStatement;
public class DokterModel implements ModelInterface{
    private koneksi koneksi = new koneksi();
    private ArrayList<dokterEntity> DokterEntityArrayList = new ArrayList<>();
    public DokterModel(){
        koneksi.getconnection();
        singkronkan();
    }

    public void singkronkan(){
        String sql = "SELECT * FROM dokter";
        DokterEntityArrayList.clear();

        try {
            koneksi.rs = koneksi.stmt.executeQuery(sql);

            while (koneksi.rs.next()) {
                String nama = koneksi.rs.getString("nama");
                String notelp = koneksi.rs.getString("notelp");
                String password = koneksi.rs.getString("password");
                String nip = koneksi.rs.getString("nip");
                Date tgllahir = koneksi.rs.getDate("tgllahir");
                DokterEntityArrayList.add(new dokterEntity(nama, notelp, password, nip, tgllahir));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insertDokter(dokterEntity Dokter){
        String sql = "insert into Dokter (nama , notelp, password, tgllahir, nip) values(?,?,?,?,?)";
        try {
            PreparedStatement ps = koneksi.conn.prepareStatement(sql);
            ps.setString(1, Dokter.getNama());
            ps.setString(2, Dokter.getNotelp());
            ps.setString(3, Dokter.getPassword());
            ps.setDate(4, Dokter.getTgllahir());
            ps.setString(5, Dokter.getnip());
            ps.executeUpdate();

        } catch (Exception e){
            System.out.println("Data Gagal di buat.\n");
            e.printStackTrace();
        }
        singkronkan();
    }

    public ArrayList<dokterEntity> getDokter(){
        singkronkan();
        return DokterEntityArrayList;
    }
    public void UpdatePassword(int id,String password){
        DokterEntityArrayList.get(id).setPassword(password);
    }
    
    public int cekData(String nip, String password){
        singkronkan();
            int cek =0;
            for(int i = 0; i <= DokterEntityArrayList.size()-1;i++){
            if (nip.equals(DokterEntityArrayList.get(i).getnip())&&password.equals(DokterEntityArrayList.get(i).getPassword())){
                cek = 1;
            }else{
                }
            }
            return cek;
    }

    public int size(){
        return DokterEntityArrayList.size();
    }

    

}
