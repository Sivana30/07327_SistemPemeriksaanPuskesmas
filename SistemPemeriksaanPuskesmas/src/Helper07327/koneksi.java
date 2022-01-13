package Helper07327;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class koneksi {
    public static Statement stmt = null;
    public static ResultSet rs;
    public static Connection conn = null;
    public static Connection getconnection(){
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/pendaftaranpuskesmas";
        String user = "root";
        String pass = "";
        try{
            Class.forName(driver);
            conn = DriverManager.getConnection(url,user,pass);
            stmt = conn.createStatement();
            System.out.println("Berhasil Koneksi Database");
        }catch(Exception e){
            System.out.println("Gagal Koneksi Database");
            e.printStackTrace();
        }
        return conn;
    }
}