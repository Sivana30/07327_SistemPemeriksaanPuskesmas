package Gui;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import Controller.AllObjectController;
import javax.swing.JOptionPane;
import java.awt.*;
public class pasienGui extends komponenGui {
    public pasienGui(){
        tampilkan();
    }

    void tampilkan(){
        setTitle("Pasien");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(235, 52, 219));
        setLayout(null);
        setVisible(true);
        btnBack.setBounds(200,200,100,30);
        btnBack.setText("LOGOUT");
        add(btnBack);

        btnBack.addActionListener(new ActionListener(){
            @Override
           public void actionPerformed(ActionEvent e){
            dispose();
            new LoginGui();
           }
        });


    }
}
