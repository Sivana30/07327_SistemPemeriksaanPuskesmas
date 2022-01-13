package Gui;

import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import Controller.AllObjectController;
import javax.swing.JOptionPane;
import java.awt.*;
public class LoginGui extends komponenGui{
    public LoginGui(){
        tampilkan();
    }

    void tampilkan(){
        setTitle("Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(235, 52, 219));
        setLayout(null);
        setVisible(true);


        lbljudul.setBounds(160,50,50,25);
        lbljudul.setForeground(new Color(13, 12, 13));
        lbljudul.setFont(new Font("Serif", Font.BOLD, 14));
        add(lbljudul);
        lblUser.setBounds(40,120,80,25);
        lblUser.setForeground(new Color(13, 12, 13));
        add(lblUser);
        lblPassword.setBounds(40,180,80,25);
        lblPassword.setForeground(new Color(13, 12, 13));
        add(lblPassword);

        Userf.setBounds(135,120,100,25);
        add(Userf);
        Passf.setBounds(135,180,100,25);
        add(Passf);


        submit.setBounds(135,240,100,25);
        submit.setFont(new Font("Serif", Font.BOLD, 14));
        add(submit);


        submit.addActionListener(new ActionListener(){
            @Override
           public void actionPerformed(ActionEvent e){
                String user = Userf.getText();
                String password = Passf.getText();
                int cek = AllObjectController.dokterController.Login(user, password);
                if(cek > 0){
                    dispose();
                new dokterGui();
                }else {
                    cek = AllObjectController.pasienController.Login(user, password);
                    if(cek > 0){
                        dispose();
                        new pasienGui();
                    } else {
                    JOptionPane.showMessageDialog(null, "GAGAL LOGIN");
                    }
                }
            }
        });
    }
            
}
