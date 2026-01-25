package module5.awt;
 import java.awt.*;

public class SimpleForm {

    public static void main(String args[]){
        Frame f = new Frame("Login Form");
        f.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        Label l1, l2;
        TextField t1, t2;
        Button b;
        Checkbox c1;
        Choice ch;
        l1 = new Label("Username:");
        t1= new TextField(20);
        l2= new Label("Password:");
        t2 = new TextField(20);
        t2.setEchoChar('*');
        ch = new Choice();
        ch.add("Admin");
        ch.add("User");
        ch.add("Guest");
        c1 = new Checkbox("Remember Me");
        b = new Button("Login");
        // row 0
        gbc.gridx= 0;
        gbc.gridy= 0;
        f.add(l1,gbc);
        gbc.gridx= 1;
        gbc.gridy= 0;
        f.add(t1,gbc);
        //row 1
        gbc.gridx =0;
        gbc.gridy=1;

        f.add(l2,gbc);
        gbc.gridx= 1;
        gbc.gridy= 1;
        f.add(t2,gbc);
        //row2
        gbc.gridx=1;
        gbc.gridy=2;
        f.add(ch,gbc);
        gbc.gridx=1;
        gbc.gridy=3;
        f.add(c1,gbc);
        gbc.gridx=1;
        gbc.gridy=4;
        f.add(b,gbc);
        f.setSize(300,300);
        f.setVisible(true);
        
        
        
    }
    
}
