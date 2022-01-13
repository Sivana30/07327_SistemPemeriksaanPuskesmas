import Entity07327.pasienEntity;
import Gui.LoginGui;
import Model07327.PasienModel;
import java.sql.Date;
public class App { 
    static PasienModel pasien = new PasienModel();
    public static void main(String[] args) throws Exception {
        // System.out.println(pasien.cekData("nama", "password"));
        // System.out.println(String.format("|Nama : '%s' \n|No Telp : '%s'\n|Password : '%s'", pasien.getPasien().get(0).getNama(),pasien.getPasien().get(0).getNotelp(),pasien.getPasien().get(0).getPassword()));
        // Date tgllahir = Date.valueOf("2001-09-22");
        // pasien.insertPasien(new pasienEntity(1, "danu", "089", "admin", "belom", tgllahir));

        new LoginGui();
}
}