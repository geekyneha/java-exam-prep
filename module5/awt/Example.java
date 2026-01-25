package module5.awt;
import java.awt.*;




public class Example {

    public static void main(String args[]){
        Frame f= new Frame("AWT Example");
        
        f.setLayout(new FlowLayout());
        Button b= new Button("Clike Me");
        
        Choice c = new Choice();
        Label l = new Label ("Name");
        TextField tf = new TextField(20);
        tf.setBounds(50,150, 150,20);
        c.add("java");
        c.add("python");
        c.add("c++");
        Checkbox cb = new Checkbox ("Accept Terms");

        l.setBounds(50,50,100,30);
        b.setCursor(new Cursor (Cursor.HAND_CURSOR));
        
        f.add(b);
        f.add(l);
        f.add(c);
        f.add(cb);
        f.add(tf);
        b.setBounds(50,100,80,30);
        f.setSize(400,400);
        f.setVisible(true);
       }
    
}
