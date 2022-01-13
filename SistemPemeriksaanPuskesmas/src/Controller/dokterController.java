package Controller;

import java.util.ArrayList;

import Entity07327.dokterEntity;
import Model07327.DokterModel;

public class dokterController implements ControllerInterface{
    DokterModel dokterModel = new DokterModel();

    public dokterController(){

    }

    public ArrayList<dokterEntity> getData(){
        return dokterModel.getDokter();
    }

    public void updatepassword(int id, String password){
        dokterModel.UpdatePassword(id, password);
    }

    public int Login(String user,String password){
        return dokterModel.cekData(user, password);
    }
}
