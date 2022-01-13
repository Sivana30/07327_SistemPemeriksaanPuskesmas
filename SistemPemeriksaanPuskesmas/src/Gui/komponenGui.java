package Gui;
import javax.swing.*;
public class komponenGui extends JFrame{

    protected JLabel lblUser = new JLabel("Username : ");
    protected JLabel lblPassword = new JLabel("Password : ");
    protected JLabel lbljudul = new JLabel("LOGIN");
    protected JLabel lblNotelp = new JLabel("No Telp : ");
    protected JLabel lblTgllahir = new JLabel("Tgl Lahir : ");


    protected JTextField Userf = new JTextField();
    protected JPasswordField Passf = new JPasswordField();
    protected JTextField Notelpf = new JTextField();
    protected JTextField Tgllahirf = new JTextField();


    protected JButton submit = new JButton("Submit");
    protected JButton edit = new JButton("Edit");
    protected JButton hapus = new JButton("Hapus");
    protected JButton btnBack = new JButton("Back");

    public void success(java.awt.event.MouseEvent evt,String kata) {
        JOptionPane.showMessageDialog(null, "Sukses "+kata+" Data !!");
    }
    public void failed(java.awt.event.MouseEvent evt,String kata) {
        JOptionPane.showMessageDialog(null, "Gagal "+kata+" Data !!");
    }
    public void error(java.awt.event.MouseEvent evt) {
        JOptionPane.showMessageDialog(null, "Error !!");
    }
}
