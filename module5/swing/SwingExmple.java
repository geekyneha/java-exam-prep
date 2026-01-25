package module5.swing;
import java.awt.*;
import javax.swing.*;



public class SwingExmple {
    public static void main(String args[]){

        JFrame f = new JFrame("Login Form");
        f.setLayout(new FlowLayout());

        JLabel l1, l2;
        JTextField t1;
        JPasswordField t2;
        JButton b;
        JCheckBox c1;

        l1= new JLabel("Username:");
        t1 = new JTextField(20);
        l2= new JLabel("Password:");
        t2 = new JPasswordField(20);
       
        c1 = new JCheckBox("Remember Me");  
         b = new JButton("Login");

        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(c1);      
        f.add(b);

        f.setSize(300,300);
        f.setVisible(true);
        
    }
    
}
